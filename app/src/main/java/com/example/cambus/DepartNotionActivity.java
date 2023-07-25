package com.example.cambus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DepartNotionActivity extends AppCompatActivity {
    private ImageButton iv_dv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departnotion);
        iv_dv3 = findViewById(R.id.iv_dv3);
        iv_dv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DepartNotionActivity.this, FirstBuyPActivity.class);
                startActivity(intent);//화면 전환을 위한 임의 연결임22 연결 화면만 바꾸면 됨
            }
        });
    }
}
