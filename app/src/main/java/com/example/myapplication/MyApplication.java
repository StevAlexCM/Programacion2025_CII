package com.example.myapplication;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this); // Inicializa Firebase
        // Opcional: Habilita las capacidades sin conexión (persistencia de datos)
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
