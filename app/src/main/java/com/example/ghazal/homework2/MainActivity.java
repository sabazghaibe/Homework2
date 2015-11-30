package com.example.ghazal.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView b1=(TextView)findViewById(R.id.btn1);
        TextView b2=(TextView)findViewById(R.id.btn2);
        TextView b3=(TextView)findViewById(R.id.btn3);
        TextView b4=(TextView)findViewById(R.id.btn4);
        TextView b5=(TextView)findViewById(R.id.btn5);
        TextView b6=(TextView)findViewById(R.id.btn6);
        TextView b7=(TextView)findViewById(R.id.btn7);
        TextView b8=(TextView)findViewById(R.id.btn8);
        TextView b9=(TextView)findViewById(R.id.btn9);
        TextView t1=(TextView)findViewById(R.id.textView);



        i=0;

    }

    public void Click(View view)
    {

        TextView b1=(TextView)findViewById(R.id.btn1);
        TextView b2=(TextView)findViewById(R.id.btn2);
        TextView b3=(TextView)findViewById(R.id.btn3);
        TextView b4=(TextView)findViewById(R.id.btn4);
        TextView b5=(TextView)findViewById(R.id.btn5);
        TextView b6=(TextView)findViewById(R.id.btn6);
        TextView b7=(TextView)findViewById(R.id.btn7);
        TextView b8=(TextView)findViewById(R.id.btn8);
        TextView b9=(TextView)findViewById(R.id.btn9);
        TextView t1=(TextView)findViewById(R.id.textView);


        if(i%2==0)
        {
            ((Button)view).setText("X");
            t1.setText("tic tac toe");

        }
        else
        {
            ((Button)view).setText("O");
            t1.setText("tic tac toe");
        }
        i++;

            if(b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X")
            {
             t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

            }

            if(b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }


            if(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }



            if(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X")
            {
                t1.setText("X player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }

            if(b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")
            {
                t1.setText("O player Win");
                i=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }





    }


}
