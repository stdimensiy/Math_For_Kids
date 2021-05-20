package ru.vdv.myapp.mathforkids.ui.multiplication.testing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vdv.myapp.mathforkids.databinding.TestingMultiplicationFragmentBinding

class TestingMultiplicationFragment : Fragment() {
    private lateinit var testingMultiplicationViewModel: TestingMultiplicationViewModel
    private var _binding: TestingMultiplicationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        testingMultiplicationViewModel =
            ViewModelProvider(this).get(TestingMultiplicationViewModel::class.java)

        _binding = TestingMultiplicationFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTestingMultiplication
        testingMultiplicationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}