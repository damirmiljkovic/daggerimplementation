package net.idevcorp.daggerimplementation.extensions

import android.app.Activity
import net.idevcorp.daggerimplementation.app.App

fun Activity.app(): App {
    return application as App
}