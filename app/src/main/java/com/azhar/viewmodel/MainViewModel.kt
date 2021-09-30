package com.azhar.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var i=1
    fun increment() {
        i++
    }
}