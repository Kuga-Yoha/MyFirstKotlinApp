package com.example.myfirstkotlinapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var ageTxt: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

   @SuppressLint("SetTextI18n")
   fun onSubmit(view: View){
       progressBar.progress= View.VISIBLE
       var context :Context =applicationContext
       val thread: SimpleThread = SimpleThread(editTextYear, textViewAge, progressBar)
       thread.start()





   }



}

class SimpleThread(year:EditText, txtAge: TextView, bar: ProgressBar): Thread(){
    var calcAge =Age()
    var inputyear= year.text.toString()
    var age: Int=0;
    var txtAge1= txtAge
    var bar1=bar
    public  override fun run() {
        age=  calcAge.calcAge(inputyear)
        txtAge1.text= "Age :" + age.toString()
        bar1.progress=View.GONE
    }


}