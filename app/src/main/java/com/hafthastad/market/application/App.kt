package com.hafthastad.market.application

import android.app.Application
import com.hafthastad.market.BuildConfig
import com.hafthastad.market.di.adapterModule
import com.hafthastad.market.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // Plant Timber logger in
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        /**
         * all injection modules should be added here as a koin module.
         */
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                listOf(
                    viewModelModule,
                    adapterModule
                )
            )
        }

    }
}