package net.oelement.simpleapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import net.oelement.simpleapp.databinding.FragmentFirstBinding
import java.io.File
import android.net.Uri
import java.io.IOException
import java.nio.charset.StandardCharsets
import android.util.Log
import okhttp3.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val client = OkHttpClient()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.textviewFirst.setText("12312312")

//        val request = Request.Builder()
//            .url(https://hdhomeroom.net/638f9e0918d16f5f5a27509a/HDMIDeviceList.json)
//            .build()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}