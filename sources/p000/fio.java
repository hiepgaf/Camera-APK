package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fio */
public final class fio {
    /* renamed from: a */
    public int f4573a;
    /* renamed from: b */
    private final Map f4574b;
    /* renamed from: c */
    private final Set f4575c;
    /* renamed from: d */
    private final Set f4576d;
    /* renamed from: e */
    private final kbg f4577e;

    public fio() {
        this.f4573a = 1;
        this.f4575c = new HashSet();
        this.f4574b = new HashMap();
        this.f4576d = new HashSet();
        this.f4577e = kau.f19138a;
    }

    public fio(fim fim) {
        this.f4573a = fim.f4566a;
        this.f4576d = new HashSet(fim.f4569d);
        this.f4575c = new HashSet();
        this.f4575c.addAll(fim.f4568c);
        this.f4574b = new HashMap();
        for (fin a : fim.f4567b) {
            m2306a(a);
        }
        this.f4577e = fim.f4570e;
    }

    public fio(fio fio) {
        this(fio.m2301a());
    }

    public fio(iwp iwp) {
        this.f4573a = -1;
        this.f4575c = new HashSet();
        this.f4574b = new HashMap();
        this.f4576d = new HashSet();
        this.f4577e = kbg.m4744b(iwp);
    }

    /* renamed from: a */
    public final fio m2307a(fiw fiw) {
        this.f4575c.add(fiw);
        return this;
    }

    /* renamed from: a */
    public final fio m2304a(fhy fhy) {
        m2305a(fhy.x_());
        return this;
    }

    /* renamed from: a */
    public final fio m2305a(fhz fhz) {
        this.f4576d.add(fhz);
        return this;
    }

    /* renamed from: a */
    public final fim m2301a() {
        return new fim(this.f4573a, keu.m13477a(this.f4574b.values()), this.f4575c, this.f4576d, this.f4577e);
    }

    /* renamed from: b */
    public final fio m2308b() {
        return new fio(m2301a());
    }

    /* renamed from: c */
    public final fio m2309c() {
        this.f4576d.clear();
        return this;
    }

    /* renamed from: a */
    public final fio m2303a(Key key, Object obj) {
        this.f4574b.put(key, new fin(key, obj));
        return this;
    }

    /* renamed from: a */
    public final fio m2306a(fin fin) {
        m2303a(fin.f4571a, fin.f4572b);
        return this;
    }

    /* renamed from: a */
    public final fio m2302a(int i) {
        fio fio = new fio(this);
        fio.f4573a = i;
        return fio;
    }
}
