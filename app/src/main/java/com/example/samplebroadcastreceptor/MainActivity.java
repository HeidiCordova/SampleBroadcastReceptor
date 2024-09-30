package com.example.samplebroadcastreceptor;
import com.example.samplebroadcastreceptor.MoonBroadcastReceiver;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="Receptor";
    private MoonBroadcastReceiver moonBroadcastReceiver= new MoonBroadcastReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
        IntentFilter filter=new IntentFilter(MoonBroadcastReceiver.EXTRA_MOON_PHASE);
        registerReceiver(moonBroadcastReceiver,filter, Context.RECEIVER_NOT_EXPORTED);


    }
    @Override
    public void onRestart(){
        Log.d(TAG,"onRestart");
        super.onRestart();
    }
    @Override
    public void onResume(){
        Log.d(TAG,"onResume");
        super.onResume();
    }
    @Override
    public void onPause(){
        Log.d(TAG,"onPause");
        super.onPause();
    }
    @Override
    public void onStop(){
        Log.d(TAG,"onStop");
        super.onStop();
    }
    @Override
    public void onDestroy(){
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }




}