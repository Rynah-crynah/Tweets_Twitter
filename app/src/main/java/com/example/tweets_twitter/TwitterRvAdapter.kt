package com.example.tweets_twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter (var tweetsList: List<Tweets>): RecyclerView.Adapter<tweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.twitter_list_item,parent,false)
        return tweetsViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: tweetsViewHolder, position: Int) {
        var currentTweets = tweetsList.get(position)
        holder.tvName .text= currentTweets.Name
        holder.tvHandler .text= currentTweets.handler
        holder.tvTweets .text= currentTweets.twitter
//        holder.imgAvatar .text= currentTweets.avatar
//        holder.imgLikes .text= currentTweets.Likes
//        holder.imgLoop .text= currentTweets.Loop
//        holder.tvNum .text= currentTweets.Num
//        holder.tvNum1 .text= currentTweets.Num1
//        holder.tvNum2 .text= currentTweets.Num2
//        holder.imgComment .text= currentTweets.Comments




    }

    override fun getItemCount(): Int {
        return tweetsList.size

    }

}

class tweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgAvatar = itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgLoop = itemView.findViewById<ImageView>(R.id.imgLoop)
    var imgLikes = itemView.findViewById<ImageView>(R.id.imgLikes)
    var tvNum = itemView.findViewById<TextView>(R.id.tvNum)
    var tvNum1 = itemView.findViewById<TextView>(R.id.tvNum1)
    var tvNum2 = itemView.findViewById<TextView>(R.id.tvNum2)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandler = itemView.findViewById<TextView>(R.id.tvHandler)
    var tvTweets = itemView.findViewById<TextView>(R.id.tvTweets)
    var imgComment = itemView.findViewById<ImageView>(R.id.imgComment)

}




