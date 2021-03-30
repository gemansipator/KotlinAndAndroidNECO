package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bidingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bidingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bidingClass.root)
        bidingClass.vTest.text = "Binding Works"
    }
}