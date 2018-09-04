package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ikb */
public class ikb implements iji, iqo {
    /* renamed from: a */
    private final ikb f18321a;
    /* renamed from: b */
    private final ikv f18322b;
    /* renamed from: c */
    private final Object f18323c;
    /* renamed from: d */
    private final Set f18324d;
    /* renamed from: e */
    private boolean f18325e;

    public ikb() {
        this(ikw.f7071a);
    }

    private ikb(ikb ikb, ikv ikv) {
        this.f18322b = ikv;
        this.f18323c = new Object();
        this.f18324d = new HashSet();
        this.f18321a = ikb;
        this.f18325e = false;
    }

    public ikb(ikv ikv) {
        this.f18322b = ikv;
        this.f18323c = new Object();
        this.f18324d = new HashSet();
        this.f18321a = null;
        this.f18325e = false;
    }

    /* renamed from: a */
    public final iqo mo1879a(iqo iqo) {
        Object obj;
        jri.m13152b((Object) iqo);
        synchronized (this.f18323c) {
            if (this.f18325e) {
                obj = 1;
            } else {
                this.f18324d.add(iqo);
                obj = null;
            }
        }
        if (obj != null) {
            this.f18322b.mo1881a(iqo);
        }
        return iqo;
    }

    public void close() {
        Iterable arrayList = new ArrayList();
        synchronized (this.f18323c) {
            if (this.f18325e) {
                return;
            }
            this.f18325e = true;
            ikb ikb = this.f18321a;
            if (ikb != null) {
                synchronized (ikb.f18323c) {
                    ikb.f18324d.remove(this);
                }
            }
            arrayList.addAll(this.f18324d);
            this.f18324d.clear();
            this.f18322b.mo1882a(arrayList, "Lifetime#close");
        }
    }

    /* renamed from: b */
    public final ikb mo1880b() {
        return (ikb) mo1879a(new ikb(this, this.f18322b));
    }

    /* renamed from: a */
    public boolean mo3049a() {
        boolean z;
        synchronized (this.f18323c) {
            z = this.f18325e;
        }
        return z;
    }
}
