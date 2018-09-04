package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import p000.aqe;
import p000.bli;
import p000.cdu;
import p000.cdv;
import p000.cdw;
import p000.ikb;

/* compiled from: PG */
public class TrampolineActivity extends Activity {
    /* renamed from: a */
    public static final String f2307a = bli.m862a("TrampolineActivity");
    /* renamed from: c */
    private static final Object f2308c = new Object();
    /* renamed from: e */
    private static TrampolineActivity f2309e = null;
    /* renamed from: b */
    public final BroadcastReceiver f2310b = new cdu(this);
    /* renamed from: d */
    private ikb f2311d;
    /* renamed from: f */
    private Intent f2312f;
    /* renamed from: g */
    private boolean f2313g = false;
    /* renamed from: h */
    private final BroadcastReceiver f2314h = new cdv();

    /* renamed from: a */
    public static void m1237a() {
        synchronized (f2308c) {
            if (f2309e != null) {
                f2309e.finish();
            }
            f2309e = null;
        }
    }

    /* renamed from: a */
    public final void m1238a(Context context) {
        bli.m869c(f2307a, "Device unlocked, firing target intent.");
        Intent intent = new Intent(context, CameraActivity.class);
        intent.setFlags(intent.getFlags() | 67108864).setAction("android.intent.action.MAIN");
        TaskStackBuilder create = TaskStackBuilder.create(context);
        if (this.f2313g) {
            create.addNextIntent(intent);
        }
        create.addNextIntent(this.f2312f).startActivities();
        m1237a();
    }

    protected void onCreate(Bundle bundle) {
        bli.m869c(f2307a, "Trampoline onCreate");
        synchronized (f2308c) {
            f2309e = this;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.flags |= 4194304;
        window.setAttributes(attributes);
        registerReceiver(this.f2314h, new IntentFilter("android.intent.action.SCREEN_OFF"));
        Intent intent = getIntent();
        this.f2312f = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
        aqe.m585a(this.f2312f, "Argument must not be null");
        this.f2313g = intent.getBooleanExtra("push_camera", false);
    }

    protected void onDestroy() {
        bli.m869c(f2307a, "Trampoline onDestroy");
        unregisterReceiver(this.f2314h);
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        bli.m869c(f2307a, "Trampoline onNewIntent");
        super.onNewIntent(intent);
    }

    protected void onPause() {
        bli.m869c(f2307a, "Trampoline onPause");
        this.f2311d.close();
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f2311d = new ikb();
        bli.m869c(f2307a, "Trampoline onResume");
        if (((KeyguardManager) getSystemService("keyguard")).isDeviceLocked()) {
            bli.m869c(f2307a, "Waiting for device to be unlocked");
            registerReceiver(this.f2310b, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f2311d.mo1879a(new cdw(this));
            return;
        }
        bli.m869c(f2307a, "Launching target activity from onResume");
        m1238a(this);
    }

    protected void onStart() {
        bli.m869c(f2307a, "Trampoline onStart");
        super.onStart();
    }

    protected void onStop() {
        bli.m869c(f2307a, "Trampoline onStop");
        super.onStop();
    }
}
