package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import p000.hua;
import p000.idv;

public class GoogleApiActivity extends Activity implements OnCancelListener {
    /* renamed from: a */
    private int f2469a = 0;

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2469a = 0;
            setResult(i2);
            if (booleanExtra) {
                idv a = idv.m3685a((Context) this);
                switch (i2) {
                    case -1:
                        a.m3695b();
                        break;
                    case 0:
                        ConnectionResult connectionResult = new ConnectionResult(13, null);
                        int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                        if (!a.m3694a(connectionResult, intExtra)) {
                            Handler handler = a.f6953h;
                            handler.sendMessage(handler.obtainMessage(5, intExtra, 0, connectionResult));
                            break;
                        }
                        break;
                }
            }
        } else if (i == 2) {
            this.f2469a = 0;
            setResult(i2);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f2469a = 0;
        setResult(0);
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2469a);
        super.onSaveInstanceState(bundle);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2469a = bundle.getInt("resolution");
        }
        if (this.f2469a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    Log.e("GoogleApiActivity", "Activity started without resolution");
                    finish();
                    return;
                } else if (pendingIntent == null) {
                    hua.f18117a.m11985b(this, num.intValue(), 2, this);
                    this.f2469a = 1;
                    return;
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f2469a = 1;
                        return;
                    } catch (Throwable e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                        return;
                    }
                }
            }
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
        }
    }
}
