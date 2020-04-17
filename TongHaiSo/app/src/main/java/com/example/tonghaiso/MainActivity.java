package com.example.tonghaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSum, btnClear;
    EditText edtNumA, edtNumB;
    TextView txtResult;

    private void setControl() {
        btnSum = this.findViewById(R.id.btnSum);
        btnClear = this.findViewById(R.id.btnClear);
        edtNumA = this.findViewById(R.id.edtNumA);
        edtNumB = this.findViewById(R.id.edtNumB);
        txtResult = this.findViewById(R.id.txtResult);
    }

    private void setEvent() {
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a = Float.parseFloat(edtNumA.getText().toString());
                b = Float.parseFloat(edtNumB.getText().toString());
                c = a + b;
                txtResult.setText("Tổng hai số là :"+c);
                txtResult.setBackgroundColor(Color.GREEN);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                edtNumA.setText("");
                edtNumB.setText("");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
}
