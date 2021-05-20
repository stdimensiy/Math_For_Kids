package ru.vdv.myapp.mathforkids.ui.multiplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MultiplicationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент модуля \"Умножение\""
    }
    val text: LiveData<String> = _text
}