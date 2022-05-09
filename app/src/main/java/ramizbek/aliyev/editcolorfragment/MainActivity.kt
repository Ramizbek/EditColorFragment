package ramizbek.aliyev.editcolorfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ramizbek.aliyev.editcolorfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val fragmentManager  = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        transaction.add(R.id.myContainer, blankFragment)
        transaction.commit()
    }
}