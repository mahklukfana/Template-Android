package com.mhyne.template.util

import java.text.NumberFormat
import java.util.*

class MyHelper {
    fun gantiRupiah(string: String) : String{
        return  NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(Integer.valueOf(string))
    }

    fun gantiRupiah(value: Int) : String{
        return  NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(value)
    }

    fun gantiRupiah(value: Double) : String {
        return NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(value)
    }
}