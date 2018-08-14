package com.aabhasjindal.arch.androidkotlinboilerplate.common

import android.support.v7.widget.RecyclerView
import android.view.View
import javax.inject.Inject

abstract class BaseHolder<in T> @Inject constructor(val view: View) : RecyclerView.ViewHolder(view) {
    abstract fun onBind(data: T, position: Int)
}