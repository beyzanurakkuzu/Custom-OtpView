package com.tortoise.otpdeneme.helpers

import android.content.Context
import androidx.core.content.ContextCompat

fun Context.fetchColor(id : Int) : Int = ContextCompat.getColor(this,id)