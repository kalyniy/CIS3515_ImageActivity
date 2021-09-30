package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (val images: ArrayList<ImageObject> ) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context)
            .inflate(R.layout.default_item, null)

        val viewHolder = ViewHolder(itemLayoutView)
        return viewHolder
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, index: Int) {
        viewHolder.imageView.setImageResource(images.get(index).id)
        viewHolder.imageView.setOnClickListener {
            it.rootView.findViewById<ImageView>(R.id.default_item)
                .setImageResource(images.get(index).id)
            it.rootView.findViewById<TextView>(R.id.textView).text = images.get(index).name
        }
    }

    class ViewHolder(itemLayoutView: View) :
        RecyclerView.ViewHolder(itemLayoutView) {
        val imageView = itemLayoutView.findViewById<ImageView>(R.id.image)
    }


    override fun getItemCount(): Int {
        return images.size
    }
    private lateinit var mListener:onItemCickListener

    //create an Interface to recieve the adapter position of the item clicked
    interface onItemCickListener{
        fun onItemClick(position:Int)
    }

    //set local listener to the given provided listener
    fun setOnItemClickListener(listener:onItemCickListener){
        mListener = listener
    }

}