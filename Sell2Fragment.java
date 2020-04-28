package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Sell2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sell2, container, false);

        //TextView tv_desc1 = v.findViewById(R.id.tv_desc1);
        //tv_desc1.setText("아주대 각 건물에 설치된 보관함을 이용하여 거래시\n보다 편리하며 안전하게 거래할 수 있습니다.");

        return v;
    }
}
