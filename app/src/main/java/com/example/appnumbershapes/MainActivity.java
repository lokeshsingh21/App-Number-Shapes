package com.example.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//import java.util.*;
public class MainActivity extends AppCompatActivity {

    void onClick(View view){
        Log.i("Info","Checking the number");
        EditText num=(EditText)findViewById(R.id.numbertext);
        Number obj=new Number();
        obj.number=Integer.parseInt(num.getText().toString());
        String ans;
        if(obj.isSquare() && obj.isTraingular())
            ans="both traingular and square number...";
        else if(obj.isTraingular())
            ans="a traingular number...";
        else if(obj.isSquare())
            ans="a square number...";
        else
            ans="neither a triangular number nor a square number...";
        Toast.makeText(this,obj.number+" is "+ans,Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
class Number{
    int number;
    boolean isTraingular(){
        int temp=1;
        temp+=(8*number);
        int sqrt=(int)Math.sqrt(temp);
        if((sqrt*sqrt)==temp && sqrt%2==1)
            return true;
        return false;
    }
    boolean isSquare(){
        int sqrt=(int)Math.sqrt(number);
        if((sqrt*sqrt)==number)
            return true;
        return false;
    }
}