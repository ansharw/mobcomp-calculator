package com.hendro.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hendro.calculator.model.Calculator;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.txt_hasil)
    TextView txtHasil;
    @Bind(R.id.btn_0)
    Button btn0;
    @Bind(R.id.btn_1)
    Button btn1;
    @Bind(R.id.btn_2)
    Button btn2;
    @Bind(R.id.btn_3)
    Button btn3;
    @Bind(R.id.btn_4)
    Button btn4;
    @Bind(R.id.btn_5)
    Button btn5;
    @Bind(R.id.btn_6)
    Button btn6;
    @Bind(R.id.btn_7)
    Button btn7;
    @Bind(R.id.btn_8)
    Button btn8;
    @Bind(R.id.btn_9)
    Button btn9;
    @Bind(R.id.btn_clear)
    Button btnClear;
    @Bind(R.id.btn_div)
    Button btnDiv;
    @Bind(R.id.btn_multiply)
    Button btnMultiply;
    @Bind(R.id.btn_minus)
    Button btnMinus;
    @Bind(R.id.btn_plus)
    Button btnPlus;
    @Bind(R.id.btn_equal)
    Button btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final Calculator myCalculator = new Calculator();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalculator.setA(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalculator.setA(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalculator.setB(2);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalculator.setOperator("+");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myCalculator.getOperator().equals("+")){
                    txtHasil.setText(String.valueOf(myCalculator.penjumlahan(myCalculator.getA(), myCalculator.getB())));
                }
            }
        });
    }
}
