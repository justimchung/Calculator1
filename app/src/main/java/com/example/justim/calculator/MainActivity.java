package com.example.justim.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button btnAdd, btnSub, btnMul, btnDiv;
    private EditText edOne, edTwo;
    private TextView tvInfo;

    //註解

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edOne = (EditText)findViewById(R.id.edOne);
        edTwo = (EditText)findViewById(R.id.edTwo);
        tvInfo = (TextView)findViewById(R.id.tvInfo);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(calcAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnSub.setOnClickListener(calcSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        //btnMul.setOnClickListener(calc);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        //btnDiv.setOnClickListener(calc);
    }



    private View.OnClickListener calcAdd = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double one, two;
            one = Double.parseDouble(edOne.getText().toString());
            two = Double.parseDouble(edTwo.getText().toString());
            tvInfo.setText(String.valueOf(one+two));
        }
    };

    private View.OnClickListener calcSub = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double one, two;
            one = Double.parseDouble(edOne.getText().toString());
            two = Double.parseDouble(edTwo.getText().toString());
            tvInfo.setText(String.valueOf(one-two));
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
