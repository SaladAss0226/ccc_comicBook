package com.example.ccc_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_slidecard.view.*

class HorizontalAdapter:RecyclerView.Adapter<HorizontalAdapter.mViewHolder>() {

    var localList = arrayListOf<ItemHoriz>()

    inner class mViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.imgv_slidecard
        val title = itemView.tv_title_slidecard

        fun bind(item:ItemHoriz){
            img.setImageResource(item.img)
            title.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_slidecard,parent,false)
                return mViewHolder(itemView)
    }

    override fun getItemCount() = localList.size

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        holder.bind(localList[position])

    }

    //更新資料用
    fun updateList(list:ArrayList<ItemHoriz>){
        localList = list
    }


}