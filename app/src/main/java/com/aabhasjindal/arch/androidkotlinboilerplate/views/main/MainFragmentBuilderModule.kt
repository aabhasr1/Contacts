package com.aabhasjindal.arch.androidkotlinboilerplate.views.main

import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.fragments.callLogs.CallLogsFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.fragments.contacts.ContactsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainFragmentBuilderModule {

    @ContributesAndroidInjector(modules = [CallLogsFragment::class])
    abstract fun bindCallLogsFragment() : CallLogsFragment

    @ContributesAndroidInjector(modules = [ContactsFragment::class])
    abstract fun bindContactsFragment() : ContactsFragment

}