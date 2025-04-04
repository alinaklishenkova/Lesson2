package ru.mirea.klishenkovaai.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button buttonCount = findViewById(R.id.buttonCount);

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCharacterCount();
            }
        });
    }

    private void showCharacterCount() {
        String inputText = editText.getText().toString();
        int charCount = inputText.length();

        String message = "СТУДЕНТ № 14 ГРУППА БСБО-06-23 Количество символов - " + charCount;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}