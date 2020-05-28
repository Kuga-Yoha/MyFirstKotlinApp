package com.example.myfirstkotlinapp

import android.content.Context
import android.widget.EditText
import java.util.*

class Age {
    var age:Int=0

    constructor()


    fun calcAge(inputYear: String) : Int{

        var currentYear= Calendar.getInstance().get(Calendar.YEAR)
        age=(currentYear - inputYear.toInt())

        return age
    }


}