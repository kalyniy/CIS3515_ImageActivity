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
        viewHolder.imageView.setImageResource(images.get(index)._id)
        viewHolder.imageView.setOnClickListener {
            it.rootView.findViewById<ImageView>(R.id.item)
                .setImageResource(images.get(index)._id)
            it.rootView.findViewById<TextView>(R.id.textView).text = images.get(index)._name
        }
    }

    class ViewHolder(itemLayoutView: View) :
        RecyclerView.ViewHolder(itemLayoutView) {
        val imageView = itemLayoutView.findViewById<ImageView>(R.id.image)
    }


    override fun getItemCount(): Int {
        return images.size
    }

}