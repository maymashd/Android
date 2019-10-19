package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

     private String lastButton="null";
     private TextView textView;
     private double firstNum=0;
    private double secondNum=0;
     private String operation="";
     private boolean other=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("textView"));
        lastButton=savedInstanceState.getString("lastButton");
        firstNum=savedInstanceState.getDouble("firstNum");
        secondNum=savedInstanceState.getDouble("secondNum");
        other=savedInstanceState.getBoolean("other");
        operation=savedInstanceState.getString("operation");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("lastButton",lastButton);
        outState.putString("textView",textView.getText().toString());
        outState.putDouble("firstNum",firstNum);
        outState.putDouble("secondNum",secondNum);
        outState.putString("operation",operation);
        outState.putBoolean("other",other);

    }



    public void makeInt(){

        double nums=Double.valueOf(textView.getText().toString());
        int nums2=0;
        if (nums-(int)nums==0){
               nums2=(int) nums;
               textView.setText(Integer.toString(nums2));
        }

    }
    public void makeInt2(){
        String s=textView.getText().toString();
        String s2=s.substring(s.length()-1,s.length());
        s=s.substring(0,s.length()-1);
        double nums=Double.valueOf(s);
        int nums2=0;
        if (nums-(int)nums==0){
            nums2=(int) nums;
            textView.setText(Integer.toString(nums2));
            textView.append(s2);
        }

    }

    public void cleaner1(){
        lastButton="null";
        firstNum=0;
        secondNum=0;
        operation="";
        other=false;
    }



    public void cleaner(){
        lastButton="null";
        textView.setText("0");
        firstNum=0;
        secondNum=0;
        operation="";
        other=false;
    }
    public void onButtonClick(View v){

    }
    public void error(){
        cleaner();
        textView.setText("Error");

    }

    public void makeOperation(){

        if (operation.equals("*")){
            firstNum*=secondNum;
        }
        if (operation.equals("+")){
            firstNum+=secondNum;
        }
        if (operation.equals("/")){

            if (textView.getText().toString().equals("0")){
                cleaner();
                textView.setText("Infinity");

                return;
            }
            firstNum/=secondNum;
            int d=(int)(firstNum*1000000);
            firstNum=(d*1.0)/1000000;
        }
        if (operation.equals("-")){

            firstNum-=secondNum;
        }
        if (operation.equals("^")){
            firstNum=Math.pow(firstNum,secondNum);
        }
    }

    public void dot(View v){


        if (textView.getText().toString().equals("Error") || textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity")){
            return;
        }

        if (lastButton.equals("null")){
            textView.setText("0.");
            lastButton="number";
            return;
        }
        if (lastButton.equals("operation")){
            textView.setText("0.");
            lastButton="number";
        }


        if ( textView.getText().toString().contains(".")==true){
            return;
        }

        textView.append(".");

    }
    public void procent(View v){
        if (textView.getText().toString().equals("Error") || textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity")){
            return;
        }
        if (textView.getText().toString().equals("") || lastButton.equals("operation"))
        {
            return;
        }
        if (other==true){

            secondNum=Double.valueOf(textView.getText().toString());
            makeOperation();
            if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
                return;
            }
            textView.setText(Double.toString(firstNum));
            other=false;
        }
        double a=Double.valueOf(textView.getText().toString());
        long d=(long)(a*100000);
        a=(d*1.0)/100000;
        textView.setText(Double.toString(a/100));
        makeInt();
        cleaner1();
        lastButton="equal";
    }

    public void equalClick(View v){
        if (textView.getText().toString().equals("Error") || textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity")){
            return;
        }
        if (other==false){
            return;
        }

        if (textView.getText().toString().equals("")){
            return;
        }

        if (lastButton.equals("operation")){
            error();
            return;
        }
        secondNum=Double.valueOf(textView.getText().toString());

       makeOperation();
        if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
            return;
        }
        textView.setText(Double.toString(firstNum));
        makeInt();
        operation="equal";
        other=false;

    }

    public void cleaning(View v){
        cleaner();
    }

    public void operationClicked(View v){

        if (textView.getText().toString().equals("Error") || textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity")){
            return;
        }



        if (textView.getText().toString().equals("-")){

            int a=v.getId();
            Button btn=(Button)findViewById(a);
            if (btn.getText().toString().equals("+")){
                textView.setText("+");
                return;
            }
            else if (btn.getText().toString().equals("-")){
                return;
            }

        }
        if (textView.getText().toString().equals(""))
        {
            int a=v.getId();
            Button btn=(Button)findViewById(a);
            String s=btn.getText().toString();
            if (s.equals("+")){
                return;
            }
            if (s.equals("-") ){
                textView.setText("-");
                lastButton="number";
            }
            return;
        }


        String se=textView.getText().toString();
        String se2=se.substring(se.length()-1,se.length());

        if (se2.equals(".")){
            se=se.substring(0,se.length()-1);
            textView.setText(se);

        }

        int a=v.getId();
        Button btn=(Button)findViewById(a);

        if (other==true){
            if (lastButton.equals("operation")){
                operation=btn.getText().toString();

                textView.setText(Double.toString(firstNum)+operation);
                makeInt2();
                return;
            }
            secondNum=Double.valueOf(textView.getText().toString());
          makeOperation();
            if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
                return;
            }
            operation=btn.getText().toString();
            textView.setText(Double.toString(firstNum)+operation);
            makeInt2();
        }
        else {
            if (lastButton.equals("null")){
                return;
            }
            String s=btn.getText().toString();

                firstNum=Double.valueOf(textView.getText().toString());
                operation=btn.getText().toString();
                textView.setText(Double.toString(firstNum)+operation);
                makeInt2();


        }

        lastButton="operation";
        other=true;
    }

    public void operationClicked2(View v){
        if (textView.getText().toString().equals("Error") || textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity")){
            return;
        }
        Button btn=(Button)findViewById(v.getId());
        String s=btn.getText().toString();
        if (s.equals("abs")){
            if (lastButton.equals("number") || lastButton.equals("equal")){
                if (other==false){
                    firstNum=Double.valueOf(textView.getText().toString());
                }
                if (other==true){

                    secondNum=Double.valueOf(textView.getText().toString());
                    makeOperation();
                    if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
                        return;
                    }
                    other=false;

                }
                double d=firstNum;
                d=Math.abs(d);
                textView.setText(Double.toString(d));
                makeInt();
            }


        }
        else if (s.equals("√\u200E")){

            if (lastButton.equals("equal") || lastButton.equals("number")){
                if (other==false){
                    firstNum=Double.valueOf(textView.getText().toString());
                }
                if (other==true){

                    secondNum=Double.valueOf(textView.getText().toString());
                    makeOperation();
                    if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
                        return;
                    }
                    other=false;

                }

                double d=firstNum;
                if (d>=0){
                    firstNum=Math.sqrt(firstNum);
                    textView.setText(Double.toString(firstNum));
                    makeInt();
                }
                else{
                    textView.setText("Error");
                    return;
                }



            }

        }
        else if(s.equals("x^2")){
            if (lastButton.equals("number") || lastButton.equals("equal")){
                if (other==false){
                    firstNum=Double.valueOf(textView.getText().toString());
                }
                if (other==true){

                    secondNum=Double.valueOf(textView.getText().toString());
                    makeOperation();
                    if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("Error") || textView.getText().toString().equals("-Infinity")){
                        return;
                    }
                    other=false;

                }
                double d=firstNum;
                d=d*d;
                textView.setText(Double.toString(d));
                makeInt();
            }
        }

    }


    public void delete(View v){
        if (textView.getText().toString().equals("Infinity") || textView.getText().toString().equals("-Infinity") || textView.getText().toString().equals("Error") ){
            textView.setText("");
            cleaner();
            return;
        }
        String s=textView.getText().toString();
        if (lastButton.equals("operation")){
            s=s.substring(0,s.length()-1);
            lastButton="number";
            other=false;
            textView.setText(s);
            return;
        }
        if (lastButton.equals("number") || lastButton.equals("equal") || lastButton.equals("procent")){
            s=s.substring(0,s.length()-1);
            if (s.equals("")){
                lastButton="null";
            }
            textView.setText(s);
        }

    }

    public void numberClicked(View v){

      String s=textView.getText().toString();
      if (s.equals("Infinity") || s.equals("-Infinity") || s.equals("Error") ){
          cleaner();

      }


     int a=v.getId();
     Button btn=(Button)findViewById(a);
     String num=btn.getText().toString();
     textView=(TextView)findViewById(R.id.textView);
     if (lastButton.equals("null")){
         if (num.equals("0")){
             return;
         }
         textView.setText(num);
         lastButton="number";
     }

     else if (lastButton.equals("number")){
        String lastNum=textView.getText().toString();
        if (lastNum.equals("0"))
        {
            return;
        }
        System.out.println(lastNum);
        lastNum=lastNum+num;
        textView.setText(lastNum);
     }

     else if (lastButton.equals("operation")){
         textView.setText(num);
         lastButton="number";
     }
    }


}
