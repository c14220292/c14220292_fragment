package nit2x.paba.c14220292_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fDua.newInstance] factory method to
 * create an instance of this fragment.
 */
class fDua : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val _btnfSatu = view.findViewById<Button>(R.id.btnfSatu)
        _btnfSatu.setOnClickListener {
            val _tv2 = view.findViewById<TextView>(R.id.tv2)
            var _angka = (_tv2.text.toString()).toLong()

            val mBundle = Bundle()
            mBundle.putLong("DATA",_angka-1)

            val mfSatu = fSatu()
            mfSatu.arguments = mBundle

            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                commit()
            }
        }

        val _btnfDua = view.findViewById<Button>(R.id.btnfDua)
        _btnfDua.setOnClickListener {
            val _tv2 = view.findViewById<TextView>(R.id.tv2)
            var _angka = (_tv2.text.toString()).toLong()

            val mBundle = Bundle()
            mBundle.putLong("DATA",_angka-2)

            val mfDua = fDua()
            mfDua.arguments = mBundle

            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                commit()
            }
        }

        val _btnfTiga = view.findViewById<Button>(R.id.btnfTiga)
        _btnfTiga.setOnClickListener {
            val _tv2 = view.findViewById<TextView>(R.id.tv2)
            var _angka = (_tv2.text.toString()).toLong()

            val mBundle = Bundle()
            mBundle.putLong("DATA",_angka-3)

            val mfTiga = fTiga()
            mfTiga.arguments = mBundle

            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                commit()
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fDua.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fDua().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}