package com.bootcamp.latihan_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_KELAS = "extra_kelas"; //2
    public static final String EXTRA_KULIAH = "extra_kuliah"; //2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data); //1

        TextView tvDataReceived = findViewById(R.id.tv_data_received); //1

        String kuliah = getIntent().getStringExtra(EXTRA_KULIAH); //2
        int kelas = getIntent().getIntExtra(EXTRA_KELAS, 0);
        String text = "Mata kuliah : " + kuliah + "\nKelas : " + kelas;
        tvDataReceived.setText(text);

    }
}