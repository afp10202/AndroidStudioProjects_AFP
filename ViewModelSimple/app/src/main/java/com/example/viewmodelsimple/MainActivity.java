package com.example.viewmodelsimple;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rootView;
    private Button btnChangeColor;

    // Tambahkan ViewModel
    private ColorViewModel colorViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi view
        rootView = findViewById(R.id.rootView);
        btnChangeColor = findViewById(R.id.btnChangeColor);

        // Inisialisasi ViewModel
        colorViewModel = new ViewModelProvider(this).get(ColorViewModel.class);

        // Set background dengan warna yang disimpan dalam ViewModel
        rootView.setBackgroundColor(colorViewModel.getColor());

        // Menambahkan event click pada tombol
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mendapatkan warna acak
                int color = generateRandomColor();

                // Mengubah background dengan warna yang baru
                rootView.setBackgroundColor(color);

                // Menyimpan warna dalam ViewModel
                colorViewModel.setColor(color);
            }
        });
    }

    // Metode untuk menghasilkan warna acak RGB
    private int generateRandomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        return 0xFF000000 | (red << 16) | (green << 8) | blue;
    }
}
