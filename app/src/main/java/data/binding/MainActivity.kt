package data.binding

import android.databinding.DataBindingUtil
import android.databinding.ObservableBoolean
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

import data.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val empty = ObservableBoolean(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ActivityMainBinding is auto generated after project build and takes the name from the layout file
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            if (empty.get()) empty.set(false)
            else empty.set(true)
        }
    }
}
