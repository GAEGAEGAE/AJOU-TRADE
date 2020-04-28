package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private AFragment fragmentA;
    private BFragment fragmentB;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_home = findViewById(R.id.iv_home);

        iv_home.setColorFilter(Color.parseColor("#AE80FF"));

        LinearLayout nav_view = (LinearLayout) findViewById(R.id.nav_view);
        nav_view.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event;
                // None Acting
            }
        });

        ImageView iv_sell = (ImageView) findViewById(R.id.iv_sell);
        TextView tv_sell = (TextView) findViewById(R.id.tv_sell);

        iv_sell.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event

                // Toast.makeText(getApplicationContext(),"이것은 Toast 메시지입니다.", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), SaleActivity.class);
                getApplicationContext().startActivity(intent);

            }
        });

        tv_sell.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event

                // Toast.makeText(getApplicationContext(),"이것은 Toast 메시지입니다.", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), SaleActivity.class);
                getApplicationContext().startActivity(intent);

            }
        });

        fragmentManager = getSupportFragmentManager();

        fragmentA = new AFragment();
        fragmentB = new BFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commit();


    }


    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            // [*] Fragment1
            case R.id.iv_home:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;

            case R.id.tv_home:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;

            // [*] Fragment3
            case R.id.iv_frag3:
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;

            case R.id.tv_frag3:
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }


}
