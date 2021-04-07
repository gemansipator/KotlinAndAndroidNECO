package app.fandroid.kotlinandandroidneco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.fandroid.kotlinandandroidneco.databinding.ActivityTest1Binding

class SignInUpAct : AppCompatActivity() {
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
        intent.putExtra("key2", bindingClass.edName.text.toString())
        setResult(RESULT_OK, intent) //RESULT_OK  или 111 или RESULT_CANSELED - это просто число.
        finish()
    }




}