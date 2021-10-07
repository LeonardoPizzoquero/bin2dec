package com.example.bin2dec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText binaryNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleTransform(View view) {
        result = findViewById(R.id.result);
        binaryNumber = findViewById(R.id.binaryNumber);

        String currentValue = binaryNumber.getText().toString();

        String regex = "[01][01]+";

        if (currentValue == null || currentValue.equals("") || !currentValue.matches(regex)) {
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um numero binario valido!",
                    Toast.LENGTH_LONG
            ).show();
        } else {
            int number = Integer.parseInt(currentValue,2);

            result.setText(Integer.toString(number));
        }
    }

}