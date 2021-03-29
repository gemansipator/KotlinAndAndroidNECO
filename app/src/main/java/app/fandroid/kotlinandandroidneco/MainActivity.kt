package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bt : Button // вне функций, то в функции можно указать слушатель следующим образом:
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        var tv : TextView = findViewById(R.id.vTest)
        tv.text = "ПРИВЕДДДДДД"
        bt = findViewById(R.id.bTest)              //Сначала находим кнопку
        bt.setOnClickListener {                    //СЛУШАТЕЛЬ   setOnClickListener
            tv.text = "Hello!!!!!!!!!"
        }
    }
}