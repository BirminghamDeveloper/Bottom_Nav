package com.hashinology.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Arrays


class HomeFragment : Fragment(), MyInterface {
    lateinit var recyclerView: RecyclerView
    lateinit var bookList:ArrayList<Books>
    lateinit var booksAdapter: BooksAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.rvBooks)
        bookList = ArrayList()

        bookList!!.add(0, Books("Hashi", "Science"))
        bookList!!.add(1, Books("Mustafa", "Math"))
        bookList!!.add(2, Books("Noor", "Physics"))
        bookList!!.add(3, Books("Sharif", "Geographic"))
        bookList!!.add(4, Books("Noor", "History"))
        bookList!!.add(5, Books("Ismail", "C++"))
        bookList!!.add(6, Books("Zamzam", "Python"))
        bookList!!.add(7, Books("Ali", "Java"))
        bookList!!.add(8, Books("Omar", "Kotlin"))
        bookList!!.add(9, Books("Khalid", "C#"))
        bookList!!.add(10, Books("Sharif", "Geographic"))

        // why problem in recyclerview??
        booksAdapter = BooksAdapter(bookList!!, requireActivity(), this )
        recyclerView.setLayoutManager(LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false))
        recyclerView.setAdapter(booksAdapter)


    }

    override fun clickedItem(view: View, position: Int) {
        Toast.makeText(this, "You have Clickeed on: " +position, Toast.LENGTH_SHORT).show()
    }
}