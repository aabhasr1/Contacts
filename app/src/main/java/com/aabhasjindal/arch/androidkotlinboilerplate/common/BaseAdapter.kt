package com.aabhasjindal.arch.androidkotlinboilerplate.common

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

abstract class BaseAdapter<X, Y : BaseHolder<X>> (val context: Context) : RecyclerView.Adapter<Y>() {
    val dataList = MutableLiveData<ArrayList<X>>()
    protected val inflater: LayoutInflater by lazy { LayoutInflater.from(context) }
    var itemClickListener: ItemClickListener<X>? = null

    fun getDataList(): LiveData<ArrayList<X>> = dataList

    fun addData(list: ArrayList<X>) = dataList.postValue(list)

    fun addData(data: X) = dataList.value!!.add(data)

    fun clearData() = dataList.value!!.clear()

    fun refreshData() = notifyDataSetChanged()

    override fun getItemCount(): Int = dataList.value!!.size
}