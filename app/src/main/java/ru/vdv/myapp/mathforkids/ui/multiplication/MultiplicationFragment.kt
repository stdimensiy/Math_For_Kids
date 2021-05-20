package ru.vdv.myapp.mathforkids.ui.multiplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vdv.myapp.mathforkids.databinding.FragmentMultiplicationBinding

class MultiplicationFragment : Fragment() {

    private lateinit var multiplicationViewModel: MultiplicationViewModel
    private var _binding: FragmentMultiplicationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        multiplicationViewModel =
            ViewModelProvider(this).get(MultiplicationViewModel::class.java)

        _binding = FragmentMultiplicationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMultiplication
        multiplicationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}