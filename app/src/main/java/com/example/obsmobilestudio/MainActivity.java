package com.example.obsmobilestudio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvStatus = findViewById(R.id.tvStatus);
        Button btnAction = findViewById(R.id.btnAction);

        btnAction.setOnClickListener(v -> {
            isRunning = !isRunning;
            if (isRunning) {
                btnAction.setText("HENTIKAN STUDIO");
                tvStatus.setText("Status: Studio Sedang Berjalan...");
                Toast.makeText(this, "Studio Berhasil Dimulai!", Toast.LENGTH_SHORT).show();
            } else {
                btnAction.setText("MULAI STUDIO");
                tvStatus.setText("Status: Studio Siap Digunakan");
                Toast.makeText(this, "Studio Dihentikan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
