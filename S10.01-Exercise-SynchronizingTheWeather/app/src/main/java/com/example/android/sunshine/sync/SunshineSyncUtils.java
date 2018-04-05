package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.example.android.sunshine.sync.SunshineSyncIntentService;

// COMPLETE (9) Create a class called SunshineSyncUtils
//  COMPLETE (10) Create a public static void method called startImmediateSync
//  COMPLETE (11) Within that method, start the SunshineSyncIntentService
public class SunshineSyncUtils {
    public static void startImmediateSync(@NonNull final Context context){
        Intent intentForImmediateSync = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentForImmediateSync);
    }
}