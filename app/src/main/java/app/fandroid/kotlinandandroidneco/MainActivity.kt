package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding  //название может быть любое. Не только bindingClass. Binding превратил activity_main
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) // Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          // ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на
        //class MainActivity чтобы соединить с class MainActivity. Теперь это работает в class MainActivity. Пишем .root чтобы охватывало всЁ что есть
        //  в ConstrainLayout
        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString()
            when(resultValue){
                "Andrey" -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите Ваши ${Constance.ANDREY_SUELDO}"
                    bindingClass.tvResult.text = tempText
                }
                "Sergey" -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText2 = "Получите Ваши ${Constance.SEREY_SUELDO}"
                    bindingClass.tvResult.text = tempText2
                }
                else ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Такого сотрудника нет"
                }
            }
        }
    }
    object Constance{
        const val ANDREY_SUELDO = 10000
        const val SEREY_SUELDO = 10000
    }
}