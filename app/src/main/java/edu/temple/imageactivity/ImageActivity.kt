package edu.temple.imageactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ImageActivity : AppCompatActivity()
{
    var s1: Array<String?>? = null
    var s2: Array<String?>? = null
    val images: IntArray = intArrayOf(  R.drawable.australian,
                                        R.drawable.blackretriever,
                                        R.drawable.chow,
                                        R.drawable.corgi,
                                        R.drawable.eskimo,
                                        R.drawable.goldenretriever,
                                        R.drawable.husky,
                                        R.drawable.saluki,
                                        R.drawable.samoyed,
                                        R.drawable.shiba)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        s1 = resources.getStringArray(R.array.breeds);
        s2 = resources.getStringArray(R.array.description);
    }
}