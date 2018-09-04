package com.google.android.apps.camera.legacy.app.refocus;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.EditingFinishedListener;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;
import com.google.android.apps.refocus.viewer.RGBZView;
import com.google.android.apps.refocus.viewer.RGBZViewer$RenderProgress;
import java.util.concurrent.CountDownLatch;
import p000.bkw;
import p000.bli;
import p000.cbx;
import p000.cby;
import p000.cct;
import p000.ccu;
import p000.cef;
import p000.ceg;
import p000.cgm;
import p000.cgn;
import p000.cgt;
import p000.dxd;
import p000.dxf;
import p000.dxi;
import p000.enq;
import p000.eqf;
import p000.gey;
import p000.gho;
import p000.ghp;
import p000.gls;
import p000.glu;
import p000.gnf;
import p000.gnu;
import p000.gsk;
import p000.gsn;
import p000.gsx;
import p000.gtf;
import p000.gtg;
import p000.gtj;
import p000.hsq;
import p000.hsr;
import p000.icu;
import p000.ird;
import p000.kwk;

/* compiled from: PG */
public class ViewerActivity extends cef implements cct {
    /* renamed from: d */
    public static final String f20374d = bli.m862a("ViewerActivity");
    /* renamed from: e */
    public RGBZFocusControls f20375e;
    /* renamed from: f */
    public icu f20376f;
    /* renamed from: g */
    public RGBZ f20377g;
    /* renamed from: h */
    public boolean f20378h = true;
    /* renamed from: i */
    public boolean f20379i;
    /* renamed from: j */
    public gnf f20380j;
    /* renamed from: k */
    public gnu f20381k;
    /* renamed from: l */
    public bkw f20382l;
    /* renamed from: m */
    public gey f20383m;
    /* renamed from: n */
    public Uri f20384n;
    /* renamed from: o */
    public ContentResolver f20385o;
    /* renamed from: p */
    public gtf f20386p;
    /* renamed from: q */
    public kwk f20387q;
    /* renamed from: r */
    public gho f20388r;
    /* renamed from: s */
    public Handler f20389s;
    /* renamed from: u */
    private ProgressOverlay f20390u;
    /* renamed from: v */
    private HandlerThread f20391v;
    /* renamed from: w */
    private Handler f20392w;
    /* renamed from: x */
    private dxi f20393x;
    /* renamed from: y */
    private final EditingFinishedListener f20394y = new dxd(this);

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f20378h ? super.dispatchTouchEvent(motionEvent) : false;
    }

    /* renamed from: a */
    public final ccu mo2796a(Class cls) {
        return (ccu) cls.cast(this.f20393x);
    }

    public void onBackPressed() {
        finish();
    }

    protected void onCreate(Bundle bundle) {
        cgm a = ((cgt) getApplication()).mo751a();
        ceg b = mo658b();
        mo657a();
        this.f20393x = a.mo3388a(b);
        dxi dxi = this.f20393x;
        this.f11738a = (ird) dxi.f21194c.f22692p.mo345a();
        this.f11739b = dxi.f21194c.m16935b();
        this.f11740c = enq.m9771a(dxi.f21194c.f22678c);
        cgn cgn = dxi.f21194c;
        kwk kwk = cgn.f22690n;
        kwk kwk2 = cgn.ak;
        kwk kwk3 = glu.f17035a;
        kwk kwk4 = dxi.f21194c.bd;
        kwk kwk5 = gsk.f17299a;
        cgn cgn2 = dxi.f21194c;
        kwk kwk6 = cgn2.ah;
        kwk kwk7 = cgn2.ai;
        kwk kwk8 = gsn.f17301a;
        cgn cgn3 = dxi.f21194c;
        this.f20380j = new gnf(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, cgn3.am, dxi.f21192a, cgn3.aj, cgn3.al);
        this.f20381k = gls.m11175a(gsn.m11483b(), cby.m7971b(dxi.f21194c.f22677b));
        this.f20382l = (bkw) dxi.f21194c.f22695s.mo345a();
        this.f20383m = (gey) dxi.f21194c.bn.mo345a();
        dxi.f21193b.mo345a();
        this.f20384n = eqf.m9823b();
        this.f20385o = cbx.m7968b(dxi.f21194c.f22677b);
        cgn cgn4 = dxi.f21194c;
        this.f20386p = gtj.m11503a((gtg) cgn4.af.mo345a(), (gsx) cgn4.ag.mo345a());
        this.f20387q = dxi.f21194c.bc;
        super.onCreate(bundle);
        setContentView(R.layout.viewer_activity);
        this.f20379i = false;
        if (getCallingPackage() != null) {
            String str = f20374d;
            String valueOf = String.valueOf(getCallingPackage());
            String str2 = "Calling from ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            if (getCallingPackage().indexOf("com.google.android.apps.photos") >= 0) {
                this.f20379i = true;
            }
        }
        this.f20391v = new HandlerThread("RGBZ RenderTask");
        this.f20391v.start();
        this.f20392w = new Handler(this.f20391v.getLooper());
        RGBZView rGBZView = (RGBZView) findViewById(R.id.render_image);
        this.f20375e = (RGBZFocusControls) findViewById(R.id.focus_controls);
        rGBZView.f2464a = this.f20375e;
        hsq hsq = rGBZView.f2464a;
        if (hsq != null) {
            hsq.mo800a(rGBZView.f2465b);
        }
        this.f20375e.f12360g = this.f20394y;
        this.f20390u = (ProgressOverlay) findViewById(R.id.progress_overlay);
        this.f20376f = new icu(getApplicationContext(), this.f20392w, this.f20382l);
        this.f20377g = m15070d();
        if (this.f20377g == null) {
            bli.m866b(f20374d, "Could not read a valid RGBZ");
            finish();
            return;
        }
        icu icu = this.f20376f;
        icu.f18198f = rGBZView;
        Bitmap bitmap = icu.f18199g;
        if (bitmap != null) {
            rGBZView.setImageBitmap(bitmap);
        }
        this.f20376f.f18207o = this.f20375e;
        icu icu2 = this.f20376f;
        RGBZ rgbz = this.f20377g;
        Runnable dxf = new dxf(this);
        icu2.f18206n = false;
        icu2.f18203k = null;
        icu2.f18205m = null;
        icu2.f18200h = null;
        icu2.f18202j = null;
        icu2.f18201i = null;
        icu2.f18204l = 0.004f;
        if (rgbz != null) {
            icu2.m12110b(rgbz.getPreview());
            icu2.f18208p = new CountDownLatch(1);
            new hsr(icu2, rgbz, dxf).start();
        }
        Toast.makeText(getApplicationContext(), R.string.processing_notification, 1);
        this.f20388r = new ghp();
        this.f20388r.mo1485a(this.f20390u);
        this.f20389s = new Handler(getMainLooper());
    }

    protected void onDestroy() {
        this.f20391v.quitSafely();
        super.onDestroy();
    }

    protected void onPause() {
        RGBZViewer$RenderProgress rGBZViewer$RenderProgress = this.f20376f.f18202j;
        if (rGBZViewer$RenderProgress != null) {
            rGBZViewer$RenderProgress.cancel();
        }
        this.f20388r.mo1486b();
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f20388r.mo1487c();
    }

    /* renamed from: d */
    private final RGBZ m15070d() {
        if ("content".equals(getIntent().getScheme())) {
            try {
                return new RGBZ(getIntent().getData(), getContentResolver());
            } catch (Throwable e) {
                String str = f20374d;
                String valueOf = String.valueOf(getIntent().getData());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Fail to parse RGBZ from ");
                stringBuilder.append(valueOf);
                bli.m867b(str, stringBuilder.toString(), e);
                return null;
            }
        }
        str = f20374d;
        String valueOf2 = String.valueOf(getIntent().getScheme());
        valueOf = "Refocus: Unknown scheme ";
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        bli.m866b(str, valueOf2);
        return null;
    }
}
