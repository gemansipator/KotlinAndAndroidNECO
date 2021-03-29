package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var tv : TextView? = null

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.vTest)
        tv?.text = "ПРИВЕДДДДДД"



    }
}