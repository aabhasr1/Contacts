package com.aabhasjindal.arch.androidkotlinboilerplate.views.main.fragments.contacts

import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2.CompositeDisposableProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories.ToastyTestRepository
import javax.inject.Inject

class ContactsFragmentViewModel @Inject constructor(compositeDisposableProvider: CompositeDisposableProvider
                                                    , private val toastyTestRepository: ToastyTestRepository) : BaseViewModel(compositeDisposableProvider) {
}