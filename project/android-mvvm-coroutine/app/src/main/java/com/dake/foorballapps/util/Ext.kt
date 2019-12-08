package com.dake.foorballapps.util

import android.content.Context
import com.dake.foorballapps.R


 
fun Context.getLeaguesName(position: Int) : String {
    return resources.getStringArray(R.array.leagues)[position]
}

fun Context.getLeaguesId(position: Int) : String {
    return resources.getStringArray(R.array.leagues_id)[position]
}