package com.ssasit.miniproject;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    Button restartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.resultText);
        restartBtn = findViewById(R.id.restartBtn);

        int score = getIntent().getIntExtra("score", 0);
        int total = getIntent().getIntExtra("total", 0);

        resultText.setText("Your Score: " + score + " / " + total);

        restartBtn.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
