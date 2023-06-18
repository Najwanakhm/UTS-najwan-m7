package com.example.uts_najwan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_Najwan.DetailmobilActivity
import com.example.uts_Najwan.MainActivity
import com.example.uts_Najwan.MobilAdapter
import com.example.uts_Najwan.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private var adapter: RecyclerView.Adapter<MobilAdapter.mobilViewHolder>? = null

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var adapter: MobilAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var mobilList: List<mobil>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
//        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_anime)
//
//        adapter = Adapter ()
//        recyclerView.layoutManager = LinearLayoutManager(context)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = MobilAdapter(this,mobilList){
//            val intent = Intent (this, DetailmobilActivity::class.java)
//            intent.putExtra(MainActivity.INTENT_PARCELABLE, it)
//            startActivity(intent)
//        }
        return view
    }

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_anime)
        recyclerView.setHasFixedSize(true)
        adapter = MobilAdapter(requireContext(), mobilList) { movie ->
            val intent = Intent(requireContext(), DetailmobilActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, movie)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

    }

    private fun dataInitialize() {

        mobilList = listOf<mobil>(
            mobil(
                R.drawable.mobil1,
                namemobil = "Xenia",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil2,
                namemobil = "Avanza",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil3,
                namemobil = "Ayla",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil4,
                namemobil = "Brio",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil5,
                namemobil = "Brio",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil6,
                namemobil = "Civic",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil7,
                namemobil = "Fortuner",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil8,
                namemobil = "HRV",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil9,
                namemobil = "CHR",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil10,
                namemobil = "Inova",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil12,
                namemobil = "Jazz",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil13,
                namemobil = "Raize",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil14,
                namemobil = "Doraemon Movie 3",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil15,
                namemobil = "Doraemon Movie 4",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            )
        )
    }
}
