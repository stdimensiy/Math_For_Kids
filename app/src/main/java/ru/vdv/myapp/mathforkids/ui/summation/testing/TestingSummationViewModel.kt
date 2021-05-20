package ru.vdv.myapp.mathforkids.ui.summation.testing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestingSummationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент программы проверки знаний модуля \"Сложение\""
    }
    val text: LiveData<String> = _text
}