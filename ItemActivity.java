package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        ImageView iv_select = (ImageView)findViewById(R.id.iv_select);
        iv_select.setColorFilter(Color.parseColor("#F44346"));

        ImageView iv_back = (ImageView)findViewById(R.id.iv_back);

        iv_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event

                finish();

            }
        });

        TextView tv_contents = (TextView) findViewById(R.id.tv_contents);

        tv_contents.setText("한번도 사용하지 않은\n\n컴퓨터 프로그래밍\n컴퓨터 프로그래밍 설계\n\n참고서적 판매합니다.\n\n" +
                "책 구매해두고 공부하려다가\n개인사정으로 인해서 한번도 사용하지 않은\n새 제품입니다.\n\n" +
                "시간 맞지 않을 경우\n\n" +
                "말씀해주시는 건물 보관함에\n보관해두겠습니다.");

        ImageView iv_like = (ImageView)findViewById(R.id.iv_like_tag);
        iv_like.setColorFilter(Color.parseColor("#F44346"));

        TextView tv_position = (TextView) findViewById(R.id.tv_position);

        SpannableString content = new SpannableString(tv_position.getText().toString());
        // 저는이미 TextView 에 String 을 넣었기 때문에 위와 같이 TextView.getText().toString() 했음
        content.setSpan(new UnderlineSpan(), 0, content.length(),0);
        tv_position.setText(content);


    }
}
