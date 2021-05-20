package ru.vdv.myapp.mathforkids.ui.multiplication.testing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestingMultiplicationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент программы проверки знаний модуля \"Умножение\""
    }
    val text: LiveData<String> = _text
}