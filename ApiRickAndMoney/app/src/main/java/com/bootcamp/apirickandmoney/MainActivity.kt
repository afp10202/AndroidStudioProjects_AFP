package com.bootcamp.apirickandmoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.bootcamp.apirickandmoney.adapter.MortyAdapter
import com.bootcamp.apirickandmoney.api.ApiConfig
import com.bootcamp.apirickandmoney.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ApiConfig.getService().getMorty().enqueue(object : Callback<ResponseMorty>{
            override fun onResponse(call: Call<ResponseMorty>, response: Response<ResponseMorty>) {
                if (response.isSuccessful){
                    val responseMorty = response.body()
                    val dataMorty = responseMorty?.results
                    val mortyAdapter = MortyAdapter()
                    mortyAdapter.setData(dataMorty as List<ResultsItem>)
                    binding.rvMorty.apply {
                        layoutManager = LinearLayoutManager (this@MainActivity)
                        setHasFixedSize(true)
                        adapter = mortyAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseMorty>, t: Throwable) {
               Log.d("gagal", "onFailure : " + t.localizedMessage)
            }


        })

    }
}