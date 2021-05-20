package ru.vdv.myapp.mathforkids.ui.multiplication.training

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrainingMultiplicationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент изучения / повторения материала модуля \"Умножение\""
    }
    val text: LiveData<String> = _text
}