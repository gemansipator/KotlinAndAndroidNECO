package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var bidingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bidingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bidingClass.root)
        bidingClass.vTest.text = "PPPPPPPPPp"
    }


}