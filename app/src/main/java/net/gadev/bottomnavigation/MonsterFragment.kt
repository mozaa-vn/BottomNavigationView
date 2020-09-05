package net.gadev.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pandora.bottomnavigator.BottomNavigator
import kotlinx.android.synthetic.main.fragment_monster.*

/**
 * A simple [Fragment] subclass.
 * Use the [MonsterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MonsterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_monster, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        navigateToMonkey?.setOnClickListener {
            val navigator = BottomNavigator.provide(activity!!)
            navigator.addFragment(MonkeyFragment())
        }
    }

}