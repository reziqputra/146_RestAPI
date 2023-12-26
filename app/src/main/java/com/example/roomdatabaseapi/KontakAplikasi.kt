package com.example.roomdatabaseapi

import android.app.Application
import com.example.roomdatabaseapi.repository.AppContainer
import com.example.roomdatabaseapi.repository.KontakContainer

class KontakAplikasi : Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}