package net.idevcorp.daggerimplementation.app.di

import android.databinding.DataBindingComponent
import dagger.BindsInstance
import dagger.Component
import net.idevcorp.daggerimplementation.app.App
import javax.inject.Singleton

@Singleton
@Component
interface AppDataBindingComponent : DataBindingComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppDataBindingComponent
        @BindsInstance
        fun application(app: App): Builder
    }
}