package edu.temple.imageactivity

import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


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


    }
}