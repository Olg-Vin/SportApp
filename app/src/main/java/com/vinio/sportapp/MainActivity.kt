package com.vinio.sportapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vinio.sportapp.databinding.TestActivityMainBinding
import com.vinio.sportapp.db.MainDB
import com.vinio.sportapp.db.entity.ActionEntity


class MainActivity : AppCompatActivity() {
    private lateinit var binding: TestActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestActivityMainBinding.inflate(layoutInflater)

//        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        deleteDatabase("test.db")
        val db = MainDB.getDB(this)

        binding.Button.setOnClickListener {
            val action = ActionEntity(
                null,
                binding.editName.text.toString(),
                binding.editSurname.text.toString(),
            )
            Thread {
                db.getActionDao().insertAction(action)
            }.start()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "Main activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "Main activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "Main activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "Main activity onDestroy")
    }
}