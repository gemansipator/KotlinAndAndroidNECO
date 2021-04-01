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


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          //ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        // в ConstrainLayout

        bindingClass.b1.setOnClickListener {

            bindingClass.tvResult.text = when(currentPerson){

                in 0..maxPerson ->  "Okey!!!"
                else ->  "Bag....."

                //НАОБОРОТ:
                //   !in 0..maxPerson -> "Bag....."
                //           else ->  "Okey!!!"

                //ПЕРЕЧИСЛЕНИЕ
                // 90,91,92 -> "Предел превышен"
                //  else -> "Все впорядке"


                //также можно проверять (уже без when) число например 90 -> bindingClass.tvResult.text = "Okey!!!"
            }


        }


        bindingClass.b2.setOnClickListener {



        }
        bindingClass.b3.setOnClickListener {


        }


    }


}