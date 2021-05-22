package ru.vdv.myapp.mathforkids.ui.summation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import ru.vdv.myapp.mathforkids.R
import ru.vdv.myapp.mathforkids.databinding.FragmentSummationBinding

class SummationFragment : Fragment() {

    private lateinit var summationViewModel: SummationViewModel
    private var _binding: FragmentSummationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = NavHostFragment.findNavController(this)
        summationViewModel =
            ViewModelProvider(this).get(SummationViewModel::class.java)

        _binding = FragmentSummationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSummation
        summationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        //слушатели
        binding.buttonTesting.setOnClickListener {navController.navigate(R.id.testingSummationFragment)}
        binding.buttonTraining.setOnClickListener {navController.navigate(R.id.trainingSummationFragment)}
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}