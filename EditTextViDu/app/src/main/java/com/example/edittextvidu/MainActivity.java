package com.example.edittextvidu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtTK,edtMK,edtNS,edtE;
    Button btnDK;
    TextView result ;
    private void control()
    {
        edtTK = this.findViewById(R.id.edtTK);
        edtMK = this.findViewById(R.id.edtMK);
        edtNS = this.findViewById(R.id.edtNS);
        edtE = this.findViewById(R.id.edtE);
        btnDK = this.findViewById(R.id.btnDK);
        result = this.findViewById(R.id.edtRe);
    }
    private void Event()
    {
    btnDK.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String c = "Thông tin tài khoản \n"+"Tài Khoản :"+edtTK.getText().toString()+"\n Mật khẩu :"+ edtMK.getText().toString() +"\n Ngày sinh :"
                    +edtNS.getText().toString()+"\n Email :"+edtE.getText().toString();
            result.setText(c);
            result.setBackgroundColor(Color.GREEN);
        }
    });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control();
        Event();
    }
}
