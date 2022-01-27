package com.gb.base_1919_lesson_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int counterOne = 0;
    private int counterTwo = 0;
    private int counterThree = 0;
    Button btnCounterOne;
    Button btnCounterTwo;
    Button btnCounterThree;
    TextView tvCounterOne;
    TextView tvCounterTwo;
    TextView tvCounterThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListeners();
        btnCounterTwo.setOnClickListener(listener);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.btnCounterOne): {
                counterOne = counterOne + 1;
                tvCounterOne.setText(String.format("%d", counterOne));
                break;
            }
            case (R.id.btnCounterTwo): {
                counterTwo = counterTwo + 1;
                tvCounterTwo.setText(String.format("%d", counterTwo));
                break;
            }
            case (R.id.btnCounterThree): {
                counterThree = counterThree + 1;
                tvCounterThree.setText(String.format("%d", counterThree));
                break;
            }
            default: {

            }
        }
    }

    private void setListeners() {
        btnCounterOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterOne = counterOne + 1;
                tvCounterOne.setText(String.format("%d", counterOne));
            }
        });
        btnCounterTwo.setOnClickListener(listener);
        btnCounterThree.setOnClickListener(this);
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case (R.id.btnCounterOne): {
                    counterOne = counterOne + 1;
                    tvCounterOne.setText(String.format("%d", counterOne));
                    break;
                }
                case (R.id.btnCounterTwo): {
                    counterTwo = counterTwo + 1;
                    tvCounterTwo.setText(String.format("%d", counterTwo));
                    break;
                }
                default: {

                }
            }
        }
    };


    private void initView() {
        btnCounterOne = findViewById(R.id.btnCounterOne);
        tvCounterOne = findViewById(R.id.tvCounterOne);

        btnCounterTwo = findViewById(R.id.btnCounterTwo);
        tvCounterTwo = findViewById(R.id.tvCounterTwo);

        btnCounterThree = findViewById(R.id.btnCounterThree);
        tvCounterThree = findViewById(R.id.tvCounterThree);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
