package p000;

import android.content.Context;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import java.util.Date;
import java.util.PriorityQueue;

/* compiled from: PG */
/* renamed from: far */
public final class far implements fbg {
    /* renamed from: a */
    public static final Object f15835a = new Object();
    /* renamed from: f */
    private static final String f15836f = bli.m862a("NtfcnChip");
    /* renamed from: b */
    public final ikd f15837b;
    /* renamed from: c */
    public TextView f15838c;
    /* renamed from: d */
    public fba f15839d;
    /* renamed from: e */
    public fbe f15840e;
    /* renamed from: g */
    private final PriorityQueue f15841g;
    /* renamed from: h */
    private fbe f15842h;
    /* renamed from: i */
    private fbe f15843i;
    /* renamed from: j */
    private fbe f15844j;
    /* renamed from: k */
    private final Runnable f15845k = new fax(this);

    public far(ikd ikd) {
        this.f15837b = ikd;
        this.f15841g = new PriorityQueue();
    }

    /* renamed from: g */
    private final void m10156g() {
        this.f15838c.removeCallbacks(this.f15845k);
    }

    /* renamed from: a */
    public final fbf mo1334a() {
        return new fbf();
    }

    /* renamed from: c */
    private final boolean m10155c(fbe fbe) {
        if (this.f15841g.contains(fbe)) {
            this.f15841g.remove(fbe);
        }
        return this.f15841g.offer(fbe);
    }

    /* renamed from: b */
    public final void mo1337b() {
        bli.m863a(f15836f, "hideAeAfLock");
        mo1336a(this.f15842h);
    }

    /* renamed from: h */
    private final void m10157h() {
        this.f15837b.execute(new faw(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo1336a(p000.fbe r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0034;
    L_0x0002:
        r1 = f15835a;
        monitor-enter(r1);
        r0 = r2.f15840e;	 Catch:{ all -> 0x003a }
        if (r0 == r3) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
    L_0x000a:
        return;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        r1 = f15835a;
        monitor-enter(r1);
        r0 = 0;
        r2.f15840e = r0;	 Catch:{ all -> 0x003d }
        r2.m10156g();	 Catch:{ all -> 0x003d }
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r0 = r2.f15841g;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0030;
    L_0x001e:
        r0 = r2.f15841g;
        r0 = r0.peek();
        r0 = (p000.fbe) r0;
        r0 = p000.jqk.m13102c(r0);
        r0 = (p000.fbe) r0;
        r2.mo1338b(r0);
        goto L_0x000a;
    L_0x0030:
        r2.m10157h();
        goto L_0x000a;
    L_0x0034:
        r0 = r2.f15841g;
        r0.remove(r3);
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: far.a(fbe):void");
    }

    /* renamed from: c */
    public final void mo1339c() {
        bli.m863a(f15836f, "hideWarmLightOn");
        mo1336a(this.f15843i);
    }

    /* renamed from: a */
    public final void mo1335a(Context context, ReplaceableView replaceableView) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        jri.m13139a(replaceableView.getParent(), (Object) "can't replace a view with no parent");
        this.f15838c = (TextView) replaceableView.m1341a(layoutInflater.inflate(R.layout.notification_chip_layout, (ViewGroup) replaceableView.getParent(), false));
        this.f15839d = new fba();
        Object obj = this.f15838c;
        fba fba = this.f15839d;
        hic a = hic.m3163a(100, new LinearInterpolator());
        a.m3164a(obj, "alpha", 0.0f, 1.0f);
        a.f6218a = ScriptIntrinsicBLAS.RsBlas_zsyrk;
        a.m3164a(obj, "scaleX", 0.5f, 1.0f);
        a.m3164a(obj, "scaleY", 0.5f, 1.0f);
        fba.f4420a = a.f6219b.clone();
        a = hic.m3163a(500, new LinearInterpolator());
        a.m3164a(obj, "alpha", 1.0f, 0.0f);
        fba.f4421b = a.f6219b.clone();
        fba.f4421b.addListener(new faz(this));
        fbf a2 = mo1334a();
        a2.f4441d = context.getResources().getString(R.string.af_ae_lock);
        a2.f4438a = true;
        this.f15842h = a2.m2217a();
        a2 = mo1334a();
        a2.f4441d = context.getResources().getString(R.string.warm_light_on);
        a2.f4438a = false;
        this.f15843i = a2.m2217a();
        a2 = mo1334a();
        a2.f4441d = context.getResources().getString(R.string.update_camera_to_use_lens);
        a2.f4438a = false;
        this.f15844j = a2.m2217a();
    }

    /* renamed from: d */
    public final void mo1340d() {
        bli.m863a(f15836f, "showAeAfLock");
        mo1338b(this.f15842h);
    }

    /* renamed from: b */
    public final void mo1338b(fbe fbe) {
        fbe.f4435d = new Date();
        m10157h();
        synchronized (f15835a) {
            Object obj;
            fbe fbe2 = this.f15840e;
            if (fbe2 == null) {
                this.f15840e = fbe;
                obj = 1;
            } else if (fbe.f4433b > fbe2.f4433b) {
                m10155c(fbe);
                obj = null;
            } else if (fbe2.f4432a) {
                m10155c(fbe2);
                this.f15840e = fbe;
                obj = null;
            } else {
                mo1336a(fbe2);
                this.f15840e = fbe;
                obj = null;
            }
            fbe fbe3 = (fbe) jqk.m13102c(this.f15840e);
            this.f15838c.setOnClickListener(null);
            this.f15837b.execute(new fas(this, fbe3));
            if (obj != null) {
                this.f15837b.execute(new fat(this));
            } else {
                this.f15837b.execute(new fau(this));
            }
            this.f15837b.execute(new fav(this));
            m10156g();
            if (!((fbe) jqk.m13102c(this.f15840e)).f4432a) {
                this.f15838c.postDelayed(this.f15845k, (long) fbe3.f4434c);
            }
        }
    }

    /* renamed from: e */
    public final void mo1341e() {
        bli.m863a(f15836f, "showUpdateCameraChip");
        mo1338b(this.f15844j);
    }

    /* renamed from: f */
    public final void mo1342f() {
        bli.m863a(f15836f, "showWarmLightOn");
        mo1338b(this.f15843i);
    }
}
