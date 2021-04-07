package app.fandroid.kotlinandandroidneco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.fandroid.kotlinandandroidneco.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var bindingClass: ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key") //создали переменную и через интент пишем ключ,
        //по которому будет передаваться значение через функцию intent.getStringExtra  (может быть .getIntExtra и т п)
        bindingClass.tvMessage.text = message

    }

    fun onClickBack(view:View){
        val i = Intent(this, MainActivity::class.java)
        i.putExtra("key", "Sergey?")
        startActivity(i)
    }




}