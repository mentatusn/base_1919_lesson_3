package com.gb.base_1919_lesson_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Counter counter = new Counter();

    private Button btnCounterOne;
    private Button btnCounterTwo;
    private Button btnCounterThree;
    private TextView tvCounterOne;
    private TextView tvCounterTwo;
    private TextView tvCounterThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListeners();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counterOne",counter.getCounterOne());
        outState.putInt("counterTwo",counter.getCounterTwo());
        outState.putInt("counterThree",counter.getCounterThree());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter.setCounterOne(savedInstanceState.getInt("counterOne"));
        tvCounterOne.setText(String.format("%d", counter.getCounterOne()));

        counter.setCounterTwo(savedInstanceState.getInt("counterTwo"));
        tvCounterTwo.setText(String.format("%d", counter.getCounterTwo()));

        counter.setCounterThree(savedInstanceState.getInt("counterThree"));
        tvCounterThree.setText(String.format("%d", counter.getCounterThree()));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.btnCounterOne): {
                counter.incCounterOne();
                tvCounterOne.setText(String.format("%d", counter.getCounterOne()));
                break;
            }
            case (R.id.btnCounterTwo): {
                counter.incCounterTwo();
                tvCounterTwo.setText(String.format("%d", counter.getCounterTwo()));
                break;
            }
            case (R.id.btnCounterThree): {
                counter.incCounterThree();;
                tvCounterThree.setText(String.format("%d", counter.getCounterThree()));
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
                counter.incCounterOne();
                tvCounterOne.setText(String.format("%d", counter.getCounterOne()));
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
                    counter.incCounterOne();
                    tvCounterOne.setText(String.format("%d", counter.getCounterOne()));
                    break;
                }
                case (R.id.btnCounterTwo): {
                    counter.incCounterTwo();
                    tvCounterTwo.setText(String.format("%d", counter.getCounterTwo()));
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
