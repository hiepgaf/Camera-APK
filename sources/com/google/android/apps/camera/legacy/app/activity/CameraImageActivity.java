package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* compiled from: PG */
public class CameraImageActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getIntent());
        intent.setClass(this, CameraActivity.class);
        intent.addFlags(268435456);
        if (isVoiceInteraction()) {
            intent.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0));
        }
        startActivity(intent);
        finish();
    }
}
