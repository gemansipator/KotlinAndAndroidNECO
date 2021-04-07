package app.fandroid.kotlinandandroidneco

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding  //название может  быть любое. Не только bindingClass. Binding превратил activity_main
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) // Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          //  ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на

        val message = intent.getStringExtra("key") //создали переменную и через интент пишем ключ,
        //по которому будет передаваться значение через функцию intent.getStringExtra  (может быть .getIntExtra и т п)
        bindingClass.tvMessageMain.text = message
    }
    fun onClickTest1(view:View){
        val i = Intent(this, TestActivity1::class.java)
        i.putExtra("key", "Как тебя зовут?")
        startActivity(i)


    }




}