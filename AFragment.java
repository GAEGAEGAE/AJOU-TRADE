package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class AFragment extends Fragment {
    private ExpandableHeightGridView mGridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);

        mGridView = (ExpandableHeightGridView) v.findViewById(R.id.gridView);
        //mGridView.setVerticalScrollBarEnabled(false);
        mGridView.setExpanded(true);

        dataSetting();





        return v;
    }

    private void dataSetting(){
        GridAdapter gAdapter = new GridAdapter();

        for(int i=0; i<10; i++){

            gAdapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sample_good_1), "컴프) C언어 기본서 판매", "20,000원");
        }

        mGridView.setAdapter(gAdapter);
    }
}
