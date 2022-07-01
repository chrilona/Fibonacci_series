package com.lonainnovs.fibonacci_series_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class Fibonacci_recycler( var numbersList:List<Int>):RecyclerView.Adapter<Fibonacci_recycler.NumbersViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Fibonacci_recycler.NumbersViewHolder {

        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.fibonacciii_recyclerviewing,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Fibonacci_recycler.NumbersViewHolder, position: Int) {
        holder.tvNumbers.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}
}