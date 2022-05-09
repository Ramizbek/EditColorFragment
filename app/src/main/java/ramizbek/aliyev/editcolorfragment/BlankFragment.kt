package ramizbek.aliyev.editcolorfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ramizbek.aliyev.editcolorfragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.btnEdtColor.setOnClickListener {
            val blankFragmentBlank2 = BlankFragment2()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.replace(R.id.myContainer, blankFragmentBlank2)
            transaction.commit()
        }
        binding.nono.background = User.color
        return binding.root
    }
}