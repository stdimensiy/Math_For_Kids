package ru.vdv.myapp.mathforkids.ui.summation.training

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
import ru.vdv.myapp.mathforkids.databinding.TrainingSummationFragmentBinding

class TrainingSummationFragment : Fragment() {
    private lateinit var trainingSummationViewModel: TrainingSummationViewModel
    private var _binding: TrainingSummationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = NavHostFragment.findNavController(this)
        trainingSummationViewModel =
            ViewModelProvider(this).get(TrainingSummationViewModel::class.java)

        _binding = TrainingSummationFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTrainingSummation
        trainingSummationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        binding.buttonTesting.setOnClickListener { navController.navigate(R.id.testingSummationFragment) }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}