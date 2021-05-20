package ru.vdv.myapp.mathforkids.ui.summation.testing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vdv.myapp.mathforkids.databinding.TestingSummationFragmentBinding

class TestingSummationFragment : Fragment() {
    private lateinit var testingSummationViewModel: TestingSummationViewModel
    private var _binding: TestingSummationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        testingSummationViewModel =
            ViewModelProvider(this).get(TestingSummationViewModel::class.java)

        _binding = TestingSummationFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTestingSummation
        testingSummationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}