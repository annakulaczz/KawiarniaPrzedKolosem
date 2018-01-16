package com.example.ania.kawiarniaprzedkolosem;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @OnClick(R.id.order_btn)
    void OnClick()
    {
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence text = "Zamówienie przyjęte, dziękujemy! ♥♥♥♥♥♥♥♥♥♥♥♥";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @BindView(R.id.recycler)
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        ArrayList<Coffee> Coffees = new ArrayList<>();
        Coffees.add(new Coffee("Latte", "5,00 zł"));
        Coffees.add(new Coffee("Espresso", "5,50 zł"));
        Coffees.add(new Coffee("Cappuchino", "6,00 zł"));
        Coffees.add(new Coffee("Americano", "6,50 zł"));

        CoffeeAdapter coffeeAdapter = new CoffeeAdapter(Coffees);
        recycler.setAdapter(coffeeAdapter);


    }
}
