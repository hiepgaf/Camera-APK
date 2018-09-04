package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import java.util.concurrent.Executor;
import p000.bli;
import p000.bxj;
import p000.ccs;
import p000.ged;
import p000.gef;

/* compiled from: PG */
public class ProcessingBoostService extends Service {
    /* renamed from: c */
    private static final String f2391c = bli.m862a("ProcessingBoost");
    /* renamed from: a */
    public bxj f2392a;
    /* renamed from: b */
    public Executor f2393b;
    /* renamed from: d */
    private final Messenger f2394d = new Messenger(new ged(this));

    public IBinder onBind(Intent intent) {
        return this.f2394d.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        bli.m869c(f2391c, "onCreate");
        ((gef) ((ccs) getApplication()).mo750a(gef.class)).mo3394a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        bli.m869c(f2391c, "onDestroy");
    }
}
