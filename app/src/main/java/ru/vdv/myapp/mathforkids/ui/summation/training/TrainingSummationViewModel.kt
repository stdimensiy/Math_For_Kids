package ru.vdv.myapp.mathforkids.ui.summation.training

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrainingSummationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент изучения / повторения материала модуля \"Сложение\""
    }
    val text: LiveData<String> = _text
}