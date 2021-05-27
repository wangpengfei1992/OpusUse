package com.wpf.opususetest.utils

import android.content.Context
import android.content.Intent
/**
 *  Author: feipeng.wang
 *  Time:   2021/5/27
 *  Description : This is description.
 */



inline fun <reified T>  startAct(context: Context){
    var intent: Intent = Intent(context,T::class.java)
    context.startActivity(intent)
}