package com.example.listalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listalumnos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Vinculacion de las vistas con MainActivity
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Alumno>()
        // This will pass the ArrayList to our Adapter
        val adapter : AlumnoAdapter

        //Add elements to data array
        data.add(Alumno("ERIK MANUEL", "20186443","amanuel7@ucol.mx","https://imagenpng.com/wp-content/uploads/2017/02/pokemon-hulu-pikach.jpg"))
        data.add(Alumno("NECK MANUEL", "20184543","emanuel4@ucol.mx","https://i.pinimg.com/236x/e0/b8/3e/e0b83e84afe193922892917ddea28109.jpg"))
        data.add(Alumno("CERNAS ANGEL", "2018683","cangel3@ucol.mx","https://i.pinimg.com/736x/9f/6e/fa/9f6efa277ddcc1e8cfd059f2c560ee53--clipart-gratis-vector-clipart.jpg"))
        // This will pass the ArrayList to our Adapter
        adapter = AlumnoAdapter(this, data)

        // Setting the Adapter with the recyclerview
        binding.recyclerview.adapter = adapter

        binding.faButton.setOnClickListener {

        }

    }
}