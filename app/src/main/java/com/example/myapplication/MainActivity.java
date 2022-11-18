package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    Button Submit;
    EditText Input1;
    EditText Input2;
    EditText Input3;
    TextView Equivalent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit = (Button)findViewById(R.id.submit);
        Equivalent = (TextView) findViewById(R.id.equivalent);
        Input1 = (EditText)findViewById((R.id.Number1));
        Input2 = (EditText)findViewById((R.id.Number2));
        Input3 = (EditText)findViewById((R.id.Number3));
        Submit.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String firstNumber;
                        if (Input1.getText().toString().trim().isEmpty()) {
                            firstNumber = "0";
                        } else
                            firstNumber = Input1.getText().toString();
                        String secondNumber;
                        if (Input1.getText().toString().trim().isEmpty()) {
                            secondNumber = "0";
                        } else
                            secondNumber = Input2.getText().toString();
                        String thirdNumber;
                        if (Input1.getText().toString().trim().isEmpty()) {
                            thirdNumber = "1";
                        } else
                            thirdNumber = Input3.getText().toString();
                        int number1 = Integer.parseInt(firstNumber);
                        int number2 = Integer.parseInt(secondNumber);
                        int number3 = Integer.parseInt(thirdNumber);
                        int equal = number1 + number2 * number3;
                        String equalTo = String.valueOf(equal);
                        Equivalent.setText(equalTo);
                    }
                });

    }
}
