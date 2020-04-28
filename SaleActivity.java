package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SaleActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    Fragment fragmentSell1;
    Fragment fragmentSell2;

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        ImageView iv_back = findViewById(R.id.iv_back);

        iv_back.setColorFilter(Color.parseColor("#101010"));
        iv_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                finish();
            }
        });


        fragmentManager = getSupportFragmentManager();

        fragmentSell1 = new Sell1Fragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fLayout, fragmentSell1).commit();



        final TextView tv_next = findViewById(R.id.tv_next);

        tv_next.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                fragmentManager = getSupportFragmentManager();

                fragmentSell2 = new Sell2Fragment();

                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fLayout, fragmentSell2).commit();

                tv_next.setVisibility(View.INVISIBLE);
            }
        });


    }
}
