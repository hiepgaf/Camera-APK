package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jgd */
public final class jgd {
    /* renamed from: a */
    public final List f7796a;
    /* renamed from: b */
    public final jgx f7797b;
    /* renamed from: c */
    private boolean f7798c;
    /* renamed from: d */
    private boolean f7799d;
    /* renamed from: e */
    private kbg f7800e;
    /* renamed from: f */
    private kbg f7801f;
    /* renamed from: g */
    private volatile kbg f7802g;
    /* renamed from: h */
    private final Object f7803h;
    /* renamed from: i */
    private final kpw f7804i = kpw.m18056d();
    /* renamed from: j */
    private final kpw f7805j = kpw.m18056d();
    /* renamed from: k */
    private final kpw f7806k = kpw.m18056d();

    public jgd(jgx jgx) {
        this.f7797b = jgx;
        this.f7796a = Collections.synchronizedList(new ArrayList());
        this.f7798c = false;
        this.f7799d = false;
        this.f7800e = kau.f19138a;
        this.f7801f = kau.f19138a;
        this.f7802g = kau.f19138a;
        this.f7803h = new Object();
    }

    /* renamed from: a */
    public final /* synthetic */ jgc m4461a(MediaFormat mediaFormat) {
        Object d = kpw.m18056d();
        return (jfy) new jfy(mediaFormat, this.f7797b.mo1292a(new jhe(mediaFormat, d))).m4466a(new jge(this, mediaFormat, d));
    }

    /* renamed from: a */
    public final synchronized kpk m4462a() {
        kpk d;
        if (this.f7799d) {
            if (!this.f7798c) {
                for (jgg a : this.f7796a) {
                    a.mo1997a();
                }
            }
            this.f7798c = true;
            d = kpw.m18056d();
            kow.m13622a(this.f7797b.mo1294b(), new jfv(d), kpq.f8410a);
        } else {
            d = kow.m13617a(Boolean.valueOf(true));
        }
        return d;
    }

    /* renamed from: b */
    public final synchronized void m4463b() {
        if (this.f7799d) {
            throw new IllegalStateException("MediaEncoder already started.");
        }
        synchronized (this.f7803h) {
            this.f7804i.mo3557a((Float) this.f7800e.mo2085c());
            this.f7805j.mo3557a((Float) this.f7801f.mo2085c());
        }
        this.f7806k.mo3557a((Integer) this.f7802g.mo2085c());
        this.f7797b.mo1293a();
        for (jgg b : this.f7796a) {
            b.mo1998b();
        }
        this.f7799d = true;
    }
}
