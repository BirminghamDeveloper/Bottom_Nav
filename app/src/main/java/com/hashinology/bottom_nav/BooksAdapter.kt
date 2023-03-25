package com.hashinology.bottom_nav

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(
    val books: List<Books>,
    val context: Context,
     val myInterface: MyInterface
): RecyclerView.Adapter<BooksAdapter.ViewsHolder>() {
//    val mFlater: LayoutInflater? = null
//    lateinit var myInterface: MyInterface

    inner class ViewsHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        val tvDescs: TextView = itemView.findViewById(R.id.tvDesc)

//        itemView.setOnClickListerner()

        override fun onClick(v: View?) {
            if(myInterface != null){
                myInterface.clickedItem(v!!, adapterPosition)
            }
        }
    }

   /* fun getAdapterInterface(myInterface: MyInterface){
        this.myInterface = myInterface
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksAdapter.ViewsHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.books_list, parent, false)
        return ViewsHolder(view)
    }

    override fun onBindViewHolder(holder: BooksAdapter.ViewsHolder, position: Int) {
        val data = books.get(position)
        holder.tvAuthor.setText(data.autohr)
        holder.tvDescs.text = data.description
    }

    override fun getItemCount(): Int {
        return books.size
    }
}