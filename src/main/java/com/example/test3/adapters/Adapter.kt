package com.example.test3.adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test3.R
import com.example.test3.models.News
import kotlinx.android.synthetic.main.row_adatper.view.*

class Adapter(var mContext:Context, val mList: ArrayList<News>): RecyclerView.Adapter<Adapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(mContext).inflate(R.layout.row_adatper, parent, false)
        var myViewHolder = MyViewHolder(view)
        return myViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var news = mList[position]

        if(position %2 == 1)
        {
          holder.
            //  holder.imageView.setBackgroundColor(Color.parseColor("#FFFFFF"));

        }
        else {

            holder.bind(news)
        }//  holder.imageView.setBackgroundColor(Color.parseColor("#FFFAF8FD"));


    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(news: News){
            itemView.text_view_description.text = news.description

        }

    }

}