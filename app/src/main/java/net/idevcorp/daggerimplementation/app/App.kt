package net.idevcorp.daggerimplementation.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import net.idevcorp.daggerimplementation.app.di.DaggerAppComponent

import net.idevcorp.daggerimplementation.app.di.DaggerAppDataBindingComponent
import net.idevcorp.daggerimplementation.app.di.SessionSubComponent

class App : DaggerApplication() {

    private val daggerAppComponent by lazy {
        DaggerAppComponent.builder().application(this).build()
    }

    private var sessionSubComponent: SessionSubComponent? = null

    override fun onCreate() {
        super.onCreate()
        DaggerAppDataBindingComponent.builder().application(this).build()
    }

    public fun buildSessionSubCompoent() {
        sessionSubComponent = daggerAppComponent.sessionSubComponentBuilder().build()
    }

    public fun clearSessionSubComppnent() {
        sessionSubComponent = null
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return daggerAppComponent
    }
}