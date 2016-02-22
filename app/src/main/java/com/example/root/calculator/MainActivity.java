package com.example.root.calculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button bt_0;
    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Button bt_7;
    private Button bt_8;
    private Button bt_9;
    private Button bt_plus;
    private Button bt_sub;
    private Button bt_mult;
    private Button bt_divide;
    private Button bt_point;
    private Button bt_eq;
    private Button bt_c;
    private Button bt_del;

    EditText edit_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);
        bt_point = (Button) findViewById(R.id.bt_point);
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_sub = (Button) findViewById(R.id.bt_sub);
        bt_mult = (Button) findViewById(R.id.bt_multi);
        bt_divide = (Button) findViewById(R.id.bt_divide);
        bt_eq = (Button) findViewById(R.id.bt_eq);
        bt_c = (Button) findViewById(R.id.bt_c);
        bt_del = (Button) findViewById(R.id.bt_del);
        edit_input = (EditText) findViewById(R.id.editText);

        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_point.setOnClickListener(this);
        bt_plus.setOnClickListener(this);
        bt_sub.setOnClickListener(this);
        bt_mult.setOnClickListener(this);
        bt_divide.setOnClickListener(this);
        bt_del.setOnClickListener(this);
        bt_c.setOnClickListener(this);
        bt_eq.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String str = edit_input.getText().toString();
        switch (view.getId()) {
            case R.id.bt_0:
            case R.id.bt_1:
            case R.id.bt_2:
            case R.id.bt_3:
            case R.id.bt_4:
            case R.id.bt_5:
            case R.id.bt_6:
            case R.id.bt_7:
            case R.id.bt_8:
            case R.id.bt_9:
            case R.id.bt_point:
                edit_input.setText(str + ((Button)view).getText());
                break;
            case R.id.bt_plus:
            case R.id.bt_sub:
            case R.id.bt_multi:
            case R.id.bt_divide:
                edit_input.setText(str + " " + ((Button)view).getText() + " ");
                break;
            case R.id.bt_del:
                if (str != null && !str.equals(""))
                    edit_input.setText(str.substring(0, str.length() - 1));
                break;
            case R.id.bt_c:
                edit_input.setText("");
                break;
            case R.id.bt_eq:
                getResult();
                break;
        }
    }

    private void getResult() {
        String exp = edit_input.getText().toString();
        if (exp == null && exp.equals(""))
            return;
        else if (!exp.contains(" "))
            return;
        else {

        };

    }
}
