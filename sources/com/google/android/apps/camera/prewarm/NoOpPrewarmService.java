package com.google.android.apps.camera.prewarm;

import android.service.media.CameraPrewarmService;
import p000.bli;
import p000.ccs;
import p000.gea;
import p000.geb;
import p000.ikq;
import p000.irs;

/* compiled from: PG */
public class NoOpPrewarmService extends CameraPrewarmService {
    /* renamed from: a */
    public static final String f2387a = bli.m862a("NoOpPrewarmService");
    /* renamed from: b */
    public irs f2388b;
    /* renamed from: c */
    public ikq f2389c;
    /* renamed from: d */
    private Runnable f2390d;

    public void onCooldown(boolean z) {
        this.f2389c.m12263a();
        this.f2388b.mo1606g();
    }

    public void onCreate() {
        ((geb) ((ccs) getApplication()).mo750a(geb.class)).mo3393a(this);
        super.onCreate();
        this.f2390d = new gea(this);
    }

    public void onPrewarm() {
        this.f2389c.m12264a(this.f2390d);
        this.f2388b.mo1607h();
    }
}
