package com.aabhasjindal.arch.androidkotlinboilerplate.common

import android.view.View

interface ItemClickListener<in T> {
    fun onItemClick(view: View?, item: T, position: Int)
}