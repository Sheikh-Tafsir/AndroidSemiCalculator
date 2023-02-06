package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView tv;

    Button addbtn,subbtn,mulbtn,divbtn,modbtn,equalbtn,clearbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addbtn=findViewById(R.id.addButton);
        subbtn=findViewById(R.id.subButton);
        mulbtn=findViewById(R.id.mulButton);
        divbtn=findViewById(R.id.divButton);
        modbtn=findViewById(R.id.modButton);
        clearbtn=findViewById(R.id.clearButton);


        addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                if(n2.getText().toString().length() == 0){
                    n2.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int res=nu1+nu2;
                String str1=String.valueOf(res);
                tv.setText(str1);
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                if(n2.getText().toString().length() == 0){
                    n2.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int res=nu1-nu2;
                String str1=String.valueOf(res);
                tv.setText(str1);
            }
        });

        mulbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                if(n2.getText().toString().length() == 0){
                    n2.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int res=nu1*nu2;
                String str1=String.valueOf(res);
                tv.setText(str1);
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                if(n2.getText().toString().length() == 0){
                    n2.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int res=nu1/nu2;
                String str1=String.valueOf(res);
                tv.setText(str1);
            }
        });

        modbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                if(n2.getText().toString().length() == 0){
                    n2.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int res=nu1%nu2;
                String str1=String.valueOf(res);
                tv.setText(str1);
            }
        });


        clearbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                n2=findViewById(R.id.num2);
                tv=findViewById(R.id.result);
                n2.setText("");
                n1.setText("");
                tv.setText("");
            }
        });

    }

}