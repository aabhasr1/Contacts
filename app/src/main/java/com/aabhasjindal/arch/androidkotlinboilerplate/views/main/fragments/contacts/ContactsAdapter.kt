package com.aabhasjindal.arch.androidkotlinboilerplate.views.main.fragments.contacts

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.aabhasjindal.arch.androidkotlinboilerplate.R
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseAdapter
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseHolder
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.Contact
import kotlinx.android.synthetic.main.item_contact_layout.view.*
import javax.inject.Inject

class ContactsAdapter @Inject constructor(context: Context) : BaseAdapter<Contact,
        ContactsAdapter.BaseViewHolder>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ContactViewHolder(inflater.inflate(R.layout.item_contact_layout,
                parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(dataList.value!![position],position)
    }

    abstract inner class BaseViewHolder(baseView: View) : BaseHolder<Contact>(baseView) {
        abstract override fun onBind(data: Contact, position: Int)
    }

    inner class ContactViewHolder(private val baseview: View) : BaseViewHolder(baseview) {
        override fun onBind(data: Contact, position: Int) {
            baseview.item_contact_picture
            baseview.item_contact_name.text= "Aabhas"
        }
    }
}