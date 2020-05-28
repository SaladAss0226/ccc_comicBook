package com.example.ccc_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.container_grid.view.*
import kotlinx.android.synthetic.main.container_horiz.view.*
import kotlinx.android.synthetic.main.item_bannercard.view.*
import kotlinx.android.synthetic.main.item_bigcard.view.*
import kotlinx.android.synthetic.main.item_smallcard.view.*
import kotlinx.android.synthetic.main.item_title.view.*

class MainAdapter(val context:Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var emptyList = arrayListOf<Item>()

    inner class HorizontalViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val rView = itemView.r_view_horizantal

    }
    inner class GridViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val rView = itemView.r_view_grid

    }

    inner class titleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title = itemView.tv_title_main
        fun bind(item:Item){
            title.text = item.title
        }
    }

    inner class bigCardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.imgv_bigcard
        val title = itemView.tv_title_bigcard
        val content = itemView.tv_content_bigcard

        fun bind(item:Item){
            img.setImageResource(item.img)
            title.text = item.title
            content.text = item.content

            //項目點擊事件
        }
    }
    inner class bannerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.imgv_work_bannercard

        fun bind(item:Item){
            img.setImageResource(item.img)
        }
    }


    override fun getItemViewType(position: Int): Int {
        return emptyList[position].viewType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            0->{
                //這裡把container載入進來，做出巢狀recyclerview
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.container_horiz,parent,false)
                HorizontalViewHolder(itemView)
            }
            1->{
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.container_grid,parent,false)
                GridViewHolder(itemView)
            }
            2->{
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_bigcard,parent,false)
                bigCardViewHolder(itemView)
            }
            3->{
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_bannercard,parent,false)
                bannerViewHolder(itemView)
            }
            else->{
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_title,parent,false)
                titleViewHolder(itemView)
            }

        }
    }

    override fun getItemCount() = emptyList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder ){
            is HorizontalViewHolder->setHorizRView(holder,position,context)
            is GridViewHolder-> setGridRView(holder,position,context)
            is bigCardViewHolder -> holder.bind(emptyList[position])
            is bannerViewHolder -> holder.bind(emptyList[position])
            is titleViewHolder -> holder.bind(emptyList[position])
        }
    }

    //更新資料用
    fun updateList(list:ArrayList<Item>){
        emptyList = list
    }


    //設定水平滑動的recyclerview
    fun setHorizRView(holder: HorizontalViewHolder, position: Int, context: Context){

            val adapter = HorizontalAdapter()
            adapter.updateList(horizList)
            val linearlayout = LinearLayoutManager(context)
            linearlayout.orientation = RecyclerView.HORIZONTAL
            holder.rView.layoutManager = linearlayout
            holder.rView.adapter = adapter
    }

    //設定網格狀的recyclerview
    fun setGridRView(holder: GridViewHolder, position: Int, context: Context){

        val adapter = GridAdapter()
        adapter.updateList(gridList)
        holder.rView.layoutManager = GridLayoutManager(context,2)
        holder.rView.adapter = adapter
    }


}