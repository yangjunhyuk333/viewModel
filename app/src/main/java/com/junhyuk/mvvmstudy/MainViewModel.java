package com.junhyuk.mvvmstudy;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    int Num = 0;
    String NumString;
    TextView textView;
    Button button1Plus;
    Button button2Minus;
    Context context;

    public MainViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public void findId(Activity activity){
        textView = (TextView) activity.findViewById(R.id.text1);
        button1Plus = (Button) activity.findViewById(R.id.button);
        button2Minus = (Button) activity.findViewById(R.id.button2);
    }

    public void plus(){

        ++Num;
        NumString = Integer.toString(Num);
        textView.setText(NumString);

    }

    public void minus(){
        --Num;
        if(Num < 0){
            Num = 0;
            Toast.makeText(context, "감소 시킬 수 있는 최소 값은 0입니다.", Toast.LENGTH_LONG).show();
        }
        NumString = Integer.toString(Num);
        textView.setText(NumString);
    }
}
