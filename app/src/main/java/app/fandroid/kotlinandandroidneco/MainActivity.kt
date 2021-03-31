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

    val a = 324
    val b = 34


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bidingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bidingClass.root)                          //ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        // в ConstrainLayout

        bidingClass.b1.setOnClickListener {
            val result = a + b

            bidingClass.tvResult.text = "Результат сложения равен : $result" //если пришем resuilt без шаблона $ и вне стринга "..." тогда
            //приводим реультат result  к стрингу   -       =result.toString()

        }
        bidingClass.b2.setOnClickListener {
            val result = a - b

            bidingClass.tvResult.text = "Результат вычитания равен : $result"

        }
        bidingClass.b3.setOnClickListener {
            val result = a * b

            bidingClass.tvResult.text = "Результат умножения равен : $result"

        }
        // АНАЛОГ:
        //  bidingClass.b3.setOnClickListener {
        //            val result = (a * b).toString()
        //
        //            bidingClass.tvResult.text = result

    }


}