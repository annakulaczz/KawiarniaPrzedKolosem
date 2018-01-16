package com.example.ania.kawiarniaprzedkolosem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ania on 2018-01-16.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder>{

    ArrayList<Coffee> Coffees = new ArrayList<>();
    CoffeeAdapter (ArrayList<Coffee> Coffees)
    {
        this.Coffees = Coffees;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,null);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(Coffees.get(position).getName());
    //    holder.setPrice(Coffees.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return Coffees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name_tv)
        TextView name_tv;

        // @BindView(R.id.price_tv)
        // TextView price_tv;



        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

       private void setName(String name) {name_tv.setText(name);}
      // private void setPrice(String price) { price_tv.setText(price); }
    }
}
