package com.example.root.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import static com.example.root.calculator.R.drawable.gray_bg;
import static com.example.root.calculator.R.drawable.white_selector;

/**
 * Created by root on 16-3-11.
 */
public class ProActivity extends Activity implements View.OnClickListener{
    private RadioGroup rg_radix;

    private Button bt_A;
    private Button bt_B;
    private Button bt_C;
    private Button bt_D;
    private Button bt_E;
    private Button bt_F;
    private Button bt_toBin;
    private Button bt_toOct;
    private Button bt_toDec;
    private Button bt_toHex;

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

    private boolean flag_next = false;
    private boolean flag_oper = false;
    private boolean flag_first_number = true;
    private boolean flag_second_number = false;
    private boolean flag_first_point = false;
    private boolean flag_second_point = false;

    private int flag_radix = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_pro);

        rg_radix = (RadioGroup) findViewById(R.id.sel_radix);

        bt_A = (Button) findViewById(R.id.A);
        bt_B = (Button) findViewById(R.id.B);
        bt_C = (Button) findViewById(R.id.C);
        bt_D = (Button) findViewById(R.id.D);
        bt_E = (Button) findViewById(R.id.E);
        bt_F = (Button) findViewById(R.id.F);
        bt_toBin = (Button) findViewById(R.id.toBin);
        bt_toOct = (Button) findViewById(R.id.toOct);
        bt_toDec = (Button) findViewById(R.id.toDec);
        bt_toHex = (Button) findViewById(R.id.toHex);

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

        setDec();
        rg_radix.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sel_bin:
                        setBin();
                        flag_radix = 2;
                        edit_input.setText("");
                        break;
                    case R.id.sel_oct:
                        setOct();
                        flag_radix = 8;
                        edit_input.setText("");
                        break;
                    case R.id.sel_dec:
                        setDec();
                        flag_radix = 10;
                        edit_input.setText("");
                        break;
                    case R.id.sel_hex:
                        setHex();
                        flag_radix = 16;
                        edit_input.setText("");
                        break;
                }
            }
        });

        bt_A.setOnClickListener(this);
        bt_B.setOnClickListener(this);
        bt_C.setOnClickListener(this);
        bt_D.setOnClickListener(this);
        bt_E.setOnClickListener(this);
        bt_F.setOnClickListener(this);
        bt_toBin.setOnClickListener(this);
        bt_toOct.setOnClickListener(this);
        bt_toDec.setOnClickListener(this);
        bt_toHex.setOnClickListener(this);

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
            case R.id.switch_pro:
                Intent intent = new Intent(ProActivity.this, ProActivity.class);
                startActivity(intent);
                break;

            case R.id.toBin:
                toBin(str);
                break;
            case R.id.toOct:
                toOct(str);
                break;
            case R.id.toDec:
                Log.i("tag", "1: " + str);
                toDec(str);
                break;
            case R.id.toHex:
                toHex(str);
                break;

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
            case R.id.A:
            case R.id.B:
            case R.id.C:
            case R.id.D:
            case R.id.E:
            case R.id.F:
                if (flag_next) {
                    str = "";
                    flag_next = false;
                }
                str = str + ((Button) view).getText();
                edit_input.setText(str);
                break;
            case R.id.bt_point:
                if (flag_next) {
                    str = "";
                    flag_next = false;
                }
                if (flag_first_number && !flag_first_point) {
                    str = str + ((Button) view).getText();
                    edit_input.setText(str);
                    flag_first_point = true;
                    break;
                }
                if (flag_second_number && !flag_second_point) {
                    str = str + ((Button) view).getText();
                    edit_input.setText(str);
                    flag_second_point = true;
                    break;
                }
                break;
            case R.id.bt_plus:
            case R.id.bt_sub:
            case R.id.bt_multi:
            case R.id.bt_divide:
                if (!str.equals("")) {
                    flag_next = false;
                    if (!flag_oper) {
                        str = str + " " + ((Button) view).getText() + " ";
                        edit_input.setText(str);
                        flag_oper = true;
                        flag_first_number = false;
                        flag_second_number = true;
                    }
                }
                break;
            case R.id.bt_del:
                if (flag_next) {
                    str = "";
                    flag_next = false;
                    edit_input.setText(str);
                }
                if (str != null && !str.equals("")) {
                    String str_last = str.substring(str.length() - 1, str.length());
                    if (str_last.equals(" ")) {
                        str = str.substring(0, str.length() - 3);
                        flag_oper = false;
                        flag_first_number = true;
                        flag_second_number = false;
                    } else if (str_last.equals(".")) {
                        str = str.substring(0, str.length() - 1);
                        if (flag_first_number) flag_first_point = false;
                        if (flag_second_number) flag_second_point = false;
                    } else {
                        str = str.substring(0, str.length() - 1);
                    }
                    edit_input.setText(str);
                }
                break;
            case R.id.bt_c:
                str = "";
                edit_input.setText(str);
                init_next();
                break;
            case R.id.bt_eq:
                getResult();
                break;
        }

    }

    private void getResult() {
        String exp = edit_input.getText().toString();
        if (exp == null || exp.equals("") || !exp.contains(" ")) {
            return;
        }
        else {
            String s1 = exp.substring(0, exp.indexOf(" "));
            String operator = exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2);
            String s2 = exp.substring(exp.indexOf(" ") + 3, exp.length());

            if (!s1.equals("") && !s2.equals("")
                    && (!s1.equals(".") && !s2.equals("."))) {
                float n1 = Float.parseFloat(s1);
                float n2 = Float.parseFloat(s2);
                float resultN = 0;

                if (operator.equals("+")) {
                    resultN = n1 + n2;
                } else if (operator.equals("-")) {
                    resultN = n1 - n2;
                } else if (operator.equals("*")) {
                    resultN = n1 * n2;
                } else if (operator.equals("/")) {
                    if (n2 == 0) {
                        edit_input.setText("");
                        init_next();
                        return;
                    }
                    resultN = n1 / n2;
                }

                String result = Float.toString(resultN);
                String[] spl = result.split("\\.");
                int decimal = Integer.parseInt(spl[1]);
                if (decimal == 0) {
                    result = spl[0];
                }
                edit_input.setText(result);
                flag_next = true;
                init_next();
                return;
            }

            else if (!s1.equals("") || s2.equals("")) {
                return;
            }
            else {
                edit_input.setText("");
            }

        }

    }

//        int n = Integer.parseInt(dec);
    private void toBin(String str) {
        int dec = Integer.valueOf(str, flag_radix);
        String str_bin = Integer.toBinaryString(dec);
        edit_input.setText(str_bin);
    }
    private void toOct(String str) {
        int dec = Integer.valueOf(str, flag_radix);
        String str_bin = Integer.toOctalString(dec);
        edit_input.setText(str_bin);
    }
    private void toDec(String str) {
        int dec = Integer.valueOf(str, flag_radix);
        String str_dec = Integer.toString(dec);
        Log.i("tag",str_dec);
        edit_input.setText(str_dec);
    }
    private void toHex(String str) {
        int dec = Integer.valueOf(str, flag_radix);
        String str_bin = Integer.toHexString(dec);
        edit_input.setText(str_bin);
    }

    private void init_next() {
        flag_oper = false;
        flag_first_number = true;
        flag_second_number = false;
        flag_first_point = false;
        flag_second_point = false;
    }

    private void setBin() {
        bt_toBin.setClickable(false);
        bt_toOct.setClickable(true);
        bt_toDec.setClickable(true);
        bt_toHex.setClickable(true);

        bt_point.setClickable(false);
        bt_0.setClickable(true);
        bt_1.setClickable(true);
        bt_2.setClickable(false);
        bt_3.setClickable(false);
        bt_4.setClickable(false);
        bt_5.setClickable(false);
        bt_6.setClickable(false);
        bt_7.setClickable(false);
        bt_8.setClickable(false);
        bt_9.setClickable(false);
        bt_A.setClickable(false);
        bt_B.setClickable(false);
        bt_B.setClickable(false);
        bt_C.setClickable(false);
        bt_D.setClickable(false);
        bt_E.setClickable(false);
        bt_F.setClickable(false);

        bt_toBin.setBackgroundResource(gray_bg);
        bt_toOct.setBackgroundResource(white_selector);
        bt_toDec.setBackgroundResource(white_selector);
        bt_toHex.setBackgroundResource(white_selector);

        bt_point.setBackgroundResource(gray_bg);
        bt_0.setBackgroundResource(white_selector);
        bt_1.setBackgroundResource(white_selector);
        bt_2.setBackgroundResource(gray_bg);
        bt_3.setBackgroundResource(gray_bg);
        bt_4.setBackgroundResource(gray_bg);
        bt_5.setBackgroundResource(gray_bg);
        bt_6.setBackgroundResource(gray_bg);
        bt_7.setBackgroundResource(gray_bg);
        bt_8.setBackgroundResource(gray_bg);
        bt_9.setBackgroundResource(gray_bg);
        bt_A.setBackgroundResource(gray_bg);
        bt_B.setBackgroundResource(gray_bg);
        bt_C.setBackgroundResource(gray_bg);
        bt_D.setBackgroundResource(gray_bg);
        bt_E.setBackgroundResource(gray_bg);
        bt_F.setBackgroundResource(gray_bg);

    }

    private void setOct() {
        bt_toBin.setClickable(true);
        bt_toOct.setClickable(false);
        bt_toDec.setClickable(true);
        bt_toHex.setClickable(true);

        bt_point.setClickable(false);
        bt_0.setClickable(true);
        bt_1.setClickable(true);
        bt_2.setClickable(true);
        bt_3.setClickable(true);
        bt_4.setClickable(true);
        bt_5.setClickable(true);
        bt_6.setClickable(true);
        bt_7.setClickable(true);
        bt_8.setClickable(false);
        bt_9.setClickable(false);
        bt_A.setClickable(false);
        bt_B.setClickable(false);
        bt_B.setClickable(false);
        bt_C.setClickable(false);
        bt_D.setClickable(false);
        bt_E.setClickable(false);
        bt_F.setClickable(false);

        bt_toBin.setBackgroundResource(white_selector);
        bt_toOct.setBackgroundResource(gray_bg);
        bt_toDec.setBackgroundResource(white_selector);
        bt_toHex.setBackgroundResource(white_selector);

        bt_point.setBackgroundResource(gray_bg);
        bt_0.setBackgroundResource(white_selector);
        bt_1.setBackgroundResource(white_selector);
        bt_2.setBackgroundResource(white_selector);
        bt_3.setBackgroundResource(white_selector);
        bt_4.setBackgroundResource(white_selector);
        bt_5.setBackgroundResource(white_selector);
        bt_6.setBackgroundResource(white_selector);
        bt_7.setBackgroundResource(white_selector);
        bt_8.setBackgroundResource(gray_bg);
        bt_9.setBackgroundResource(gray_bg);
        bt_A.setBackgroundResource(gray_bg);
        bt_B.setBackgroundResource(gray_bg);
        bt_C.setBackgroundResource(gray_bg);
        bt_D.setBackgroundResource(gray_bg);
        bt_E.setBackgroundResource(gray_bg);
        bt_F.setBackgroundResource(gray_bg);
    }

    private void setDec() {
        bt_toBin.setClickable(true);
        bt_toOct.setClickable(true);
        bt_toDec.setClickable(false);
        bt_toHex.setClickable(true);

        bt_point.setClickable(true);
        bt_0.setClickable(true);
        bt_1.setClickable(true);
        bt_2.setClickable(true);
        bt_3.setClickable(true);
        bt_4.setClickable(true);
        bt_5.setClickable(true);
        bt_6.setClickable(true);
        bt_7.setClickable(true);
        bt_8.setClickable(true);
        bt_9.setClickable(true);
        bt_A.setClickable(false);
        bt_B.setClickable(false);
        bt_B.setClickable(false);
        bt_C.setClickable(false);
        bt_D.setClickable(false);
        bt_E.setClickable(false);
        bt_F.setClickable(false);

        bt_toBin.setBackgroundResource(white_selector);
        bt_toOct.setBackgroundResource(white_selector);
        bt_toDec.setBackgroundResource(gray_bg);
        bt_toHex.setBackgroundResource(white_selector);

        bt_point.setBackgroundResource(white_selector);
        bt_0.setBackgroundResource(white_selector);
        bt_1.setBackgroundResource(white_selector);
        bt_2.setBackgroundResource(white_selector);
        bt_3.setBackgroundResource(white_selector);
        bt_4.setBackgroundResource(white_selector);
        bt_5.setBackgroundResource(white_selector);
        bt_6.setBackgroundResource(white_selector);
        bt_7.setBackgroundResource(white_selector);
        bt_8.setBackgroundResource(white_selector);
        bt_9.setBackgroundResource(white_selector);
        bt_A.setBackgroundResource(gray_bg);
        bt_B.setBackgroundResource(gray_bg);
        bt_C.setBackgroundResource(gray_bg);
        bt_D.setBackgroundResource(gray_bg);
        bt_E.setBackgroundResource(gray_bg);
        bt_F.setBackgroundResource(gray_bg);
    }
    private void setHex() {
        bt_toBin.setClickable(true);
        bt_toOct.setClickable(true);
        bt_toDec.setClickable(true);
        bt_toHex.setClickable(false);

        bt_point.setClickable(false);
        bt_0.setClickable(true);
        bt_1.setClickable(true);
        bt_2.setClickable(true);
        bt_3.setClickable(true);
        bt_4.setClickable(true);
        bt_5.setClickable(true);
        bt_6.setClickable(true);
        bt_7.setClickable(true);
        bt_8.setClickable(true);
        bt_9.setClickable(true);
        bt_A.setClickable(true);
        bt_B.setClickable(true);
        bt_B.setClickable(true);
        bt_C.setClickable(true);
        bt_D.setClickable(true);
        bt_E.setClickable(true);
        bt_F.setClickable(true);

        bt_toBin.setBackgroundResource(white_selector);
        bt_toOct.setBackgroundResource(white_selector);
        bt_toDec.setBackgroundResource(white_selector);
        bt_toHex.setBackgroundResource(gray_bg);

        bt_point.setBackgroundResource(gray_bg);
        bt_0.setBackgroundResource(white_selector);
        bt_1.setBackgroundResource(white_selector);
        bt_2.setBackgroundResource(white_selector);
        bt_3.setBackgroundResource(white_selector);
        bt_4.setBackgroundResource(white_selector);
        bt_5.setBackgroundResource(white_selector);
        bt_6.setBackgroundResource(white_selector);
        bt_7.setBackgroundResource(white_selector);
        bt_8.setBackgroundResource(white_selector);
        bt_9.setBackgroundResource(white_selector);
        bt_A.setBackgroundResource(white_selector);
        bt_B.setBackgroundResource(white_selector);
        bt_C.setBackgroundResource(white_selector);
        bt_D.setBackgroundResource(white_selector);
        bt_E.setBackgroundResource(white_selector);
        bt_F.setBackgroundResource(white_selector);
    }
}
