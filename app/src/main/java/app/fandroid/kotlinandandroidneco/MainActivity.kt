package app.fandroid.kotlinandandroidneco

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding  //название может быть любое. Не только bindingClass. Binding превратил activity_main
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) //Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          // ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        //  в ConstrainLayout
        bindingClass.btResult.setOnClickListener {
            val ivan = "Ivan"
            val egor = "Egor"
            val resultValue = bindingClass.edValue.text.toString()
            when(resultValue){
                ivan -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "1000000"
                }
                egor -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "3453453453435"
                }
                else ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Такого сотрудника нет"
                }
            }
        }
    }
}