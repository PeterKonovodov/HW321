package com.example.hw31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayDeque;
import java.util.Deque;

public class MainActivity extends AppCompatActivity {

    TextView calcScreen;
    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonDot;

    final Deque<Character> screenData = new ArrayDeque<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {
        calcScreen = findViewById(R.id.calcScreen);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);

        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonDot.setOnClickListener(onClickListener);
        calcScreen.setText("0");
    }

    final Button.OnClickListener onClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonDot:
                    if(!screenData.contains('.')) screenData.add('.');
                    break;
                case R.id.button0:
                    screenData.add('0');
                    break;
                case R.id.button1:
                    screenData.add('1');
                    break;
                case R.id.button2:
                    screenData.add('2');
                    break;
                case R.id.button3:
                    screenData.add('3');
                    break;
                case R.id.button4:
                    screenData.add('4');
                    break;
                case R.id.button5:
                    screenData.add('5');
                    break;
                case R.id.button6:
                    screenData.add('6');
                    break;
                case R.id.button7:
                    screenData.add('7');
                    break;
                case R.id.button8:
                    screenData.add('8');
                    break;
                case R.id.button9:
                    screenData.add('9');
                    break;
                default:
            }
            if(screenData.size() > 9) screenData.removeFirst();

            calcScreen.setText(dequeToString(screenData));

        }
    };

    public String dequeToString(Deque deque) {
        StringBuilder sb = new StringBuilder(deque.size());
        deque.forEach(sb::append);
        return sb.toString();
    }


}