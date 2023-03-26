package ru.startandroid.develop.alertdialogsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(v:View) {
        val dialog = CustomDialogFragment()
        dialog.show(supportFragmentManager, "custom")
    }

}