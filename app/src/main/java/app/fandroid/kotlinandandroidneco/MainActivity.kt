package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bidingClass : ActivityMainBinding  //название может быть любое. Не только bindingClass. Binding превратил activity_main
    //в класс ActivityMain который заносится в переменную bindingClass

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bidingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bidingClass.root)                          //ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        // в ConstrainLayout
        bidingClass.bTest.setOnClickListener {
            bidingClass.vTest.visibility = View.GONE
        }
        bidingClass.bTest2.setOnClickListener {
            bidingClass.vTest.visibility = View.VISIBLE
        }                                                     //Ставим слушатель нажатий bidingClass.bTest2.setOnClickListener
                                                             //через bidingClass находим .vTest ставим параметр .visibility
                                                             //и через общий класс вьюшек View ставим параметр GONE (свернуть)
                                                             // или VISIBLE (показать) или INVISIBLE (невидимый но активный)


    }

    override fun onPause() {
        super.onPause()
        bidingClass.vTest.text = "НА ПАУЗЕ!!!!!!"
    }
}