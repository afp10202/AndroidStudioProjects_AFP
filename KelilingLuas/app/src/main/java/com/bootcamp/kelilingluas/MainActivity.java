package com.bootcamp.kelilingluas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText lengthEditText, widthEditText;
    TextView resultTextView;
    RadioGroup operationRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lengthEditText = findViewById(R.id.lengthEditText);
        widthEditText = findViewById(R.id.widthEditText);
        resultTextView = findViewById(R.id.resultTextView);
        operationRadioGroup = findViewById(R.id.operationRadioGroup);
    }

    public void calculate(View view) {
        double length = Double.parseDouble(lengthEditText.getText().toString());
        double width = Double.parseDouble(widthEditText.getText().toString());

        int selectedRadioButtonId = operationRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

        if (selectedRadioButton != null) {
            String operation = selectedRadioButton.getText().toString();
            double result = 0;

            if (operation.equals("Luas")) {
                result = length * width;
            } else if (operation.equals("Keliling")) {
                result = 2 * (length + width);
            }

            String resultText = "Hasil " + operation + ": " + result;
            resultTextView.setText(resultText);
        }
    }
}
