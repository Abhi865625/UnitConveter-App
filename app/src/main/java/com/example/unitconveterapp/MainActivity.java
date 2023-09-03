package com.example.unitconveterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  editText;
    TextView result_text, textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_text = findViewById(R.id.result_text);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double height_entered = Double.parseDouble(editText.getText().toString());
                double final_ans = convertInCM(height_entered);
                String formattedResult = String.format("%.2f cm", final_ans);
                result_text.setText(formattedResult);

            }
        });
    }

    public double convertInCM(double height_entered){
        Double final_ans = height_entered*30.48;
        return (final_ans);
    }
}