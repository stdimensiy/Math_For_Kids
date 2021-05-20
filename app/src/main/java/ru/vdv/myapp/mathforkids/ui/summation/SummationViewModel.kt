package ru.vdv.myapp.mathforkids.ui.summation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SummationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент модуля \"Сложение\""
    }
    val text: LiveData<String> = _text
}