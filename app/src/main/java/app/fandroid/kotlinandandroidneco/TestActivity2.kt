package app.fandroid.kotlinandandroidneco

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TestActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test_2)
    }

    fun onClickClose(view: View){

        finish()

    }
}