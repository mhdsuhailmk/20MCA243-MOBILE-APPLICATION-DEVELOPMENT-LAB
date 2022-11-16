package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    String result;
    int firstNum;
    int secondNum;
    EditText num1,num2;
    TextView resultTx;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    num1 = findViewById(R.id.etnum1);
    num2 = findViewById(R.id.etnum2);
    resultTx = findViewById(R.id.txtResult);
    btnAdd = findViewById(R.id.btnAdd);
    btnSub = findViewById(R.id.btnMinus);
    btnMul = findViewById(R.id.btnMul);
    btnDiv = findViewById(R.id.btnDiv);

    btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            numFinder();
            result = String.valueOf(firstNum+secondNum);
            resultTx.setText("Result is: " +result);
        }
    });

    btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                numFinder();
                result = String.valueOf(firstNum-secondNum);

                resultTx.setText("Result is: " +result);
            }
    });


    btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                numFinder();
                result = String.valueOf(firstNum*secondNum);

                resultTx.setText("Result is: " +result);
            }
    });


    btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                numFinder();
                result = String.valueOf(firstNum/secondNum);
                resultTx.setText("Result is: " +result);
            }
    });


    }

    protected void numFinder()
    {
        firstNum = Integer.parseInt(num1.getText().toString());
        secondNum = Integer.parseInt(num2.getText().toString());
    }
}