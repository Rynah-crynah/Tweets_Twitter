package com.example.tweets_twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tweets_twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = Tweets("","Rose","@Rosesandalotus","Kotlin","","","","","","",)
        var tweet2 = Tweets("","Ninah","@Ryna_Crynah","JavaScript","","","","","","",)
        var tweet3 = Tweets("","Hakan","@Its_Hakan","Iot","","","","","","",)
        var tweet4 = Tweets("","Iptisam","@Ipt_Some","Python","","","","","","",)
        var tweetList =
            listOf(tweet1,tweet2,tweet3,tweet4)
        var tweetAdapter = TwitterRvAdapter(tweetList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetAdapter

    }
}

