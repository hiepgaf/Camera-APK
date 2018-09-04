package p000;

import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.util.SparseArray;
import com.google.android.GoogleCamera.R;
import java.util.NoSuchElementException;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: gpv */
public final class gpv implements gpu, iqo {
    /* renamed from: a */
    public static final String f17205a = bli.m862a("SoundPlayer");
    /* renamed from: b */
    public final Object f17206b;
    /* renamed from: c */
    public boolean f17207c;
    /* renamed from: d */
    private final Context f17208d;
    /* renamed from: e */
    private final SparseArray f17209e;
    /* renamed from: f */
    private SoundPool f17210f;
    /* renamed from: g */
    private final ilp f17211g;
    /* renamed from: h */
    private final kwk f17212h;
    /* renamed from: i */
    private final OnLoadCompleteListener f17213i = new gpw(this);

    public gpv(Context context, ilp ilp, kwk kwk) {
        this.f17208d = context;
        this.f17206b = new Object();
        this.f17209e = new SparseArray();
        this.f17211g = ilp;
        this.f17212h = kwk;
        this.f17207c = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r3 = this;
        r1 = r3.f17206b;
        monitor-enter(r1);
        r0 = r3.f17207c;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.f17207c = r0;	 Catch:{ all -> 0x0037 }
        r0 = r3.f17210f;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x0010:
        r0 = f17205a;	 Catch:{ all -> 0x0037 }
        r2 = "Closing SoundPool";
        p000.bli.m869c(r0, r2);	 Catch:{ all -> 0x0037 }
        r0 = r3.f17209e;	 Catch:{ all -> 0x0037 }
        r0.clear();	 Catch:{ all -> 0x0037 }
        r0 = r3.f17210f;	 Catch:{ all -> 0x0037 }
        r0 = p000.jqk.m13102c(r0);	 Catch:{ all -> 0x0037 }
        r0 = (android.media.SoundPool) r0;	 Catch:{ all -> 0x0037 }
        r0.autoPause();	 Catch:{ all -> 0x0037 }
        r0 = r3.f17210f;	 Catch:{ all -> 0x0037 }
        r0 = p000.jqk.m13102c(r0);	 Catch:{ all -> 0x0037 }
        r0 = (android.media.SoundPool) r0;	 Catch:{ all -> 0x0037 }
        r0.release();	 Catch:{ all -> 0x0037 }
        r0 = 0;
        r3.f17210f = r0;	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        goto L_0x0008;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gpv.close():void");
    }

    /* renamed from: e */
    final gpz m11309e(int i) {
        synchronized (this.f17206b) {
            for (int i2 = 0; i2 < this.f17209e.size(); i2++) {
                gpz gpz = (gpz) this.f17209e.valueAt(i2);
                if (gpz.f5625b == i) {
                    return gpz;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("SoundInfo for sampleId ");
            stringBuilder.append(i);
            stringBuilder.append(" not found.");
            throw new NoSuchElementException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private final SoundPool m11301c() {
        if (this.f17210f == null && !this.f17207c) {
            bli.m869c(f17205a, "Creating SoundPool");
            this.f17210f = (SoundPool) this.f17212h.mo345a();
            ((SoundPool) jqk.m13102c(this.f17210f)).setOnLoadCompleteListener(this.f17213i);
        }
        return (SoundPool) jqk.m13102c(this.f17210f);
    }

    /* renamed from: a */
    public final kpk mo1554a(int i) {
        kpk a;
        synchronized (this.f17206b) {
            if (this.f17207c) {
                a = kow.m13617a(Boolean.valueOf(false));
            } else {
                gpz gpz = (gpz) this.f17209e.get(i);
                String str;
                if (gpz == null) {
                    String str2 = f17205a;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Loading sound: ");
                    stringBuilder.append(i);
                    bli.m863a(str2, stringBuilder.toString());
                    gpz = new gpz();
                    gpz.f5624a = i;
                    this.f17209e.put(i, gpz);
                    gpz.f5625b = m11301c().load(this.f17208d, i, 1);
                    str = f17205a;
                    int i2 = gpz.f5625b;
                    StringBuilder stringBuilder2 = new StringBuilder(44);
                    stringBuilder2.append("Sound: ");
                    stringBuilder2.append(i);
                    stringBuilder2.append(" got sampleId: ");
                    stringBuilder2.append(i2);
                    bli.m871d(str, stringBuilder2.toString());
                } else {
                    str = f17205a;
                    StringBuilder stringBuilder3 = new StringBuilder(62);
                    stringBuilder3.append("Ignoring loadSound for previously loaded resource: ");
                    stringBuilder3.append(i);
                    bli.m871d(str, stringBuilder3.toString());
                }
                a = gpz.f5626c;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo1555a() {
        synchronized (this.f17206b) {
            if (!this.f17207c) {
                m11301c().autoPause();
            }
        }
    }

    /* renamed from: b */
    public final void mo1557b(int i) {
        kow.m13622a(mo1554a(i), new gpx(this, i), kpq.f8410a);
    }

    /* renamed from: a */
    public final int m11302a(int i, float f, int i2) {
        if (((Boolean) this.f17211g.mo2860b()).booleanValue()) {
            int i3;
            synchronized (this.f17206b) {
                if (this.f17207c) {
                    i3 = -1;
                } else {
                    gpz gpz = (gpz) this.f17209e.get(i);
                    if (gpz != null) {
                        i3 = m11301c().play(gpz.f5625b, f, f, 0, i2, 1.0f);
                    } else {
                        String str = f17205a;
                        StringBuilder stringBuilder = new StringBuilder(50);
                        stringBuilder.append("Ignoring sound that is not yet loaded: ");
                        stringBuilder.append(i);
                        bli.m869c(str, stringBuilder.toString());
                        i3 = -1;
                    }
                }
            }
            return i3;
        }
        bli.m863a(f17205a, "Sounds disabled by settings.");
        return -1;
    }

    /* renamed from: c */
    public final kpk mo1558c(int i) {
        kpk d = kpw.m18056d();
        new Timer().schedule(new gpy(this, d, R.raw.camera_burst_loop), 300);
        return d;
    }

    /* renamed from: b */
    public final void mo1556b() {
        synchronized (this.f17206b) {
            if (!this.f17207c) {
                m11301c().autoResume();
            }
        }
    }

    /* renamed from: d */
    public final void mo1559d(int i) {
        synchronized (this.f17206b) {
            if (!(this.f17207c || i == -1)) {
                m11301c().stop(i);
            }
        }
    }

    /* renamed from: f */
    public final boolean m11310f(int i) {
        synchronized (this.f17206b) {
            if (this.f17207c) {
                return false;
            }
            gpz gpz = (gpz) this.f17209e.get(i);
            if (gpz == null) {
                return false;
            }
            this.f17209e.remove(i);
            boolean unload = m11301c().unload(gpz.f5625b);
            return unload;
        }
    }
}
