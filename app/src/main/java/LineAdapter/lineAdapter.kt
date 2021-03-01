package LineAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import dataclasses.Place

 class LineAdapter (val list:ArrayList<Place>) : RecyclerView.Adapter<LineAdapter.LineViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineAdapter.LineViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerline, parent, false);
        return LineViewHolder

    }


    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: LineAdapter.LineViewHolder, position: Int) {
        val currentPlace = list[position]

        holder.city.text = currentPlace.city
        holder.capital.text = currentPlace.capital
        holder.nhabitantes.text = currentPlace.habitantes.toString()
    }

     class LineViewHolder (itemView: View)  : RecyclerView.ViewHolder(itemView) {
         val city = itemView.city
         val capital = itemView.capital
         val nhabitantes = itemView.habitantes

     }


 }