package com.example.ccc_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_slidecard.view.*
import kotlinx.android.synthetic.main.item_smallcard.view.*

class GridAdapter:RecyclerView.Adapter<GridAdapter.mViewHolder>() {

    var localList = arrayListOf<ItemGrid>()

    inner class mViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.imgv_smallcard
        val title = itemView.tv_title_smallcard
        val content = itemView.tv_content_smallcard

        fun bind(item:ItemGrid){
            img.setImageResource(item.img)
            title.text = item.title
            content.text = item.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_smallcard,parent,false)
                return mViewHolder(itemView)
    }

    override fun getItemCount() = localList.size

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        holder.bind(localList[position])

    }

    //更新資料用
    fun updateList(list:ArrayList<ItemGrid>){
        localList = list
    }


}