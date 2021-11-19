package com.example.calculator18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //1 : Khai báo các view sẽ tương tác
    TextInputEditText mTxtInputEdtNumber1, mTxtInputEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus, mBtnSub, mBtnMul, mBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Ánh xạ
        mTxtInputEdtNumber1 = findViewById(R.id.textInputNumber1);
        mTxtInputEdtNumber2 = findViewById(R.id.textInputNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnSub = findViewById(R.id.buttonSub);
        mBtnMul = findViewById(R.id.buttonMul);
        mBtnDiv = findViewById(R.id.buttonDiv);


        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Thông báo
//                Toast.makeText(MainActivity.this,"Click button công",Toast.LENGTH_SHORT).show();
                // Kiểm tra giá trị trong system => System.out
//                Log.d("BBB","hello");

                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();

                //Kiểm tra giá trị
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 + number2;
                mTvResult.setText("Result = " + result);

            }
        });

        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();
                if(textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
                float number1 = Integer.parseInt(textNumber1);
                float number2 = Integer.parseInt(textNumber2);
                if(number2==0){
                    Toast.makeText(MainActivity.this, "Invaild values", Toast.LENGTH_SHORT).show();
                    return;
                }
                float resultDiv = (number1/number2);
                String result= String.format("%.2f",resultDiv);
                mTvResult.setText("Result = " + result);
            }
        });


    }
}