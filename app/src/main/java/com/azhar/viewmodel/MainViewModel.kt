package com.azhar.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var count=1
    fun increment() {
        count++
    }
}