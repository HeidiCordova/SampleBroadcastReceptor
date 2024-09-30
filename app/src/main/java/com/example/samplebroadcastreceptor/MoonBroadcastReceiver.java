package com.example.samplebroadcastreceptor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class MoonBroadcastReceiver extends BroadcastReceiver {
    public static final String EXTRA_MOON_PHASE = "org.idnp.sampleintentbroadcatreceiver.MoonBroadcastReceiver.EXTRA_MOON_PHASE";

    private static final String TAG="MoonBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent){
        String message = intent.getStringExtra(EXTRA_MOON_PHASE);
        writeToFile(message,context);
        Log.d("Mybroadcastreceiver","Mensaje recibido: "+message);
    }
    private void writeToFile(String data, Context context){
        try{
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("config.txt",Context.MODE_APPEND));
            outputStreamWriter.write(data);
        }catch (IOException e){
            Log.e("Exception","File write failed: "+ e.toString());
        }
    }
}