package com.haruhi.lex.brokencamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "서버 정책에 의해 카메라를 사용할 수 없습니다.",
                Toast.LENGTH_SHORT);

        toast.show();

        finish();
    }
}