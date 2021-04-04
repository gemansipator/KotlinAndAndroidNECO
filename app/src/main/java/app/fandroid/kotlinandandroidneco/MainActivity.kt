package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.fandroid.kotlinandandroidneco.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding  //название может  быть любое. Не только bindingClass. Binding превратил activity_main
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) // Надувает класс/ делает активным и готовым для рисования , иннициализирует, заносит в память
        setContentView(bindingClass.root)                          //  ПЕРЕДАЕТСЯ ИЗ bidingClass в класс MainActivity через ее функцию setContentView на

    }
}