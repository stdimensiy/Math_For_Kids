package ru.vdv.myapp.mathforkids.ui.multiplication.training

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
import ru.vdv.myapp.mathforkids.databinding.TrainingMultiplicationFragmentBinding

class TrainingMultiplicationFragment : Fragment() {
    private lateinit var trainingMultiplicationViewModel: TrainingMultiplicationViewModel
    private var _binding: TrainingMultiplicationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = NavHostFragment.findNavController(this)
        trainingMultiplicationViewModel =
            ViewModelProvider(this).get(TrainingMultiplicationViewModel::class.java)

        _binding = TrainingMultiplicationFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTrainingMultiplication
        trainingMultiplicationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        binding.buttonTesting.setOnClickListener { navController.navigate(R.id.testingMultiplicationFragment) }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}