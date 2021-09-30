package edu.temple.imageactivity

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ImageActivity : AppCompatActivity()
{
    val ids: IntArray = intArrayOf(  R.drawable.australian,
                                        R.drawable.blackretriever,
                                        R.drawable.chow,
                                        R.drawable.corgi,
                                        R.drawable.eskimo,
                                        R.drawable.goldenretriever,
                                        R.drawable.husky,
                                        R.drawable.saluki,
                                        R.drawable.samoyed,
                                        R.drawable.shiba)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var names = resources.getStringArray(R.array.breeds);
        var descriptions = resources.getStringArray(R.array.description);
        var images: ArrayList<ImageObject> = ArrayList()
        for (i in ids.indices)
        {
            var image = ImageObject(ids[i], names[i], descriptions[i])
            images.add(image);
        }
        val adapter = ImageAdapter(images)
        val gridLayout = GridLayoutManager(this,3)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = gridLayout

        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object:ImageAdapter.onItemCickListener{
            override fun onItemClick(index: Int) {
                val textView = findViewById<TextView>(R.id.textView)
                val imageView = findViewById<ImageView>(R.id.imageView)
                textView.text = images.get(index).description
                imageView.setImageResource(images.get(index).id)
            }

        })


    }
}