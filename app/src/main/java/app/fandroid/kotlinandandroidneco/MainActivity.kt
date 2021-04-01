package app.fandroid.kotlinandandroidneco

import android.graphics.Color
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

    val maxPerson = 95
    val currentPerson = 35


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bidingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bidingClass.root)                          //ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        // в ConstrainLayout

        bidingClass.b1.setOnClickListener {
            if (maxPerson > currentPerson) {
                bidingClass.tvResult.text = "Всё в порядке"
                bidingClass.tvResult.setBackgroundColor(Color.GREEN)
            }                                                     //если несколько строк в уcловии то ставим {}
            else {bidingClass.tvResult.text = "превышает максимальное количество персон"

              "Превышено максимальное количество посетителей"
            bidingClass.tvResult.setBackgroundColor(Color.RED)
            }
        }


        bidingClass.b2.setOnClickListener {



        }
        bidingClass.b3.setOnClickListener {


        }


    }


}