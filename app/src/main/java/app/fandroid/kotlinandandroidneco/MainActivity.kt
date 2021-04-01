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
    lateinit var bindingClass : ActivityMainBinding  //название может быть любое. Не только bindingClass. Binding превратил activity_main
    //в класс ActivityMain который заносится в переменную bindingClass

    val maxPerson = 90
    val currentPerson = 35
    val text = "опасность"
    val text2 = "не опасность"


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          //ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        // в ConstrainLayout

        bindingClass.b1.setOnClickListener {


            when(text){

                text -> bindingClass.tvResult.text ="Предел превышен"
                text2 -> bindingClass.tvResult.text = "Все впорядке"



            }


        }


        bindingClass.b2.setOnClickListener {



        }
        bindingClass.b3.setOnClickListener {


        }


    }


}