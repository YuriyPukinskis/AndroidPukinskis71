package ru.netology.androidpukinskis51;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static double number = 0;
    static double value1=0;
    boolean computing = false;
    static boolean point=false;
    static boolean type = true;
    static double digit=1;
    Operation operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnZero = findViewById(R.id.btnZero);
        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnComa = findViewById(R.id.btnPoint);
        Button btnC = findViewById(R.id.btnC);
        Button btnChange = findViewById(R.id.btnSign);
        final Button btnPercent = findViewById(R.id.btnPercent);
        final Button btnDiv = findViewById(R.id.btnDiv);
        final Button btnMul = findViewById(R.id.btnMul);
        final Button btnSub = findViewById(R.id.btnSub);
        final Button btnAdd = findViewById(R.id.btnAdd);
        final LinearLayout strLay = findViewById(R.id.strangeLayout);
        final LinearLayout eng = findViewById(R.id.engineer);
        Button btnRes = findViewById(R.id.btnRes);
        Button btnCh = findViewById(R.id.btnChange);
        eng.setVisibility(View.GONE);

        final TextView textView = findViewById(R.id.textView);

        btnCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type=!type;
                if(type){
                    strLay.setVisibility(View.VISIBLE);
                    eng.setVisibility(View.GONE);
                }
                else{
                    strLay.setVisibility(View.GONE);
                    eng.setVisibility(View.VISIBLE);
                }
            }
        });

        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point = true;
            }
        });
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=0-number;
                textView.setText(Double.toString(number));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = Operation.ADD;
                btnAdd.setBackgroundColor(Color.GREEN);
                value1=number;
                NumberCreate.reset();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = Operation.SUB;
                btnSub.setBackgroundColor(Color.GREEN);
                value1=number;
                NumberCreate.reset();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = Operation.MUL;
                btnMul.setBackgroundColor(Color.GREEN);
                value1=number;
                NumberCreate.reset();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = Operation.DIV;
                btnDiv.setBackgroundColor(Color.GREEN);
                value1=number;
                NumberCreate.reset();
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = Operation.PER;
                btnPercent.setBackgroundColor(Color.GREEN);
                value1=number;
                NumberCreate.reset();
            }
        });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=NumberCreate.execute(value1,number,operation);
                NumberCreate.reset();
                textView.setText(Double.toString(value1));
                btnAdd.setBackgroundColor(Color.LTGRAY);
                btnSub.setBackgroundColor(Color.LTGRAY);
                btnDiv.setBackgroundColor(Color.LTGRAY);
                btnMul.setBackgroundColor(Color.LTGRAY);
                btnPercent.setBackgroundColor(Color.LTGRAY);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumberCreate.reset();
                textView.setText(Double.toString(number));
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,1);
                textView.setText(Double.toString(number));
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,9);
                textView.setText(Double.toString(number));
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,0);
                textView.setText(Double.toString(number));
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,2);
                textView.setText(Double.toString(number));
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,3);
                textView.setText(Double.toString(number));
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,4);
                textView.setText(Double.toString(number));
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,5);
                textView.setText(Double.toString(number));
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,6);
                textView.setText(Double.toString(number));
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,7);
                textView.setText(Double.toString(number));
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,8);
                textView.setText(Double.toString(number));
            }
        });
    }
}
