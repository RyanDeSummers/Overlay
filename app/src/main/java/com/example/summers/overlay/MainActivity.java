package com.example.summers.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent svc = new Intent(this, OverlayShowingService.class);
        startService(svc);
        finish();
    }
}