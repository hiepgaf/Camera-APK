package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gst */
public final class gst {
    /* renamed from: a */
    public static final String f5672a = bli.m862a("SingleKeyCache");
    /* renamed from: b */
    public final String f5673b;
    /* renamed from: c */
    public final gsr f5674c;
    /* renamed from: d */
    public final gly f5675d;
    /* renamed from: e */
    public Object f5676e;
    /* renamed from: f */
    public final Object f5677f = new Object();
    /* renamed from: g */
    private final kpk f5678g;
    /* renamed from: h */
    private final Executor f5679h;

    public gst(kpk kpk, String str, Executor executor, gsr gsr, gly gly) {
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) str);
        this.f5678g = kpk;
        this.f5673b = str;
        this.f5679h = executor;
        this.f5674c = gsr;
        this.f5675d = gly;
    }

    /* renamed from: a */
    public final kpk m2800a() {
        synchronized (this.f5677f) {
            Object obj = this.f5676e;
            if (obj != null) {
                kpk a = kow.m13617a(obj);
                return a;
            }
            return kny.m18046a(this.f5678g, new gsu(this), this.f5679h);
        }
    }

    /* renamed from: b */
    public final void m2802b() {
        synchronized (this.f5677f) {
            this.f5676e = null;
        }
        kny.m18045a(this.f5678g, new gsv(this), this.f5679h);
    }

    /* renamed from: a */
    public final kpk m2801a(Object obj) {
        String str = f5672a;
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("pending update: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        return kny.m18046a(this.f5678g, new gsw(this, obj), this.f5679h);
    }
}
