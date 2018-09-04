package p000;

import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jrm */
final class jrm implements jqr {
    /* renamed from: a */
    public final String f23404a;
    /* renamed from: b */
    public final long f23405b;
    /* renamed from: c */
    public final String f23406c;
    /* renamed from: d */
    public final int f23407d;
    /* renamed from: e */
    public final int f23408e;
    /* renamed from: f */
    public final int f23409f;
    /* renamed from: g */
    public volatile long f23410g = -1;
    /* renamed from: h */
    private final jqr f23411h;
    /* renamed from: i */
    private final AtomicReference f23412i = new AtomicReference(null);
    /* renamed from: j */
    private final Set f23413j;

    public jrm(String str, String str2, jqr jqr, Set set) {
        this.f23404a = str;
        this.f23406c = str2;
        this.f23411h = jqr;
        this.f23405b = System.nanoTime();
        this.f23407d = jqr.mo3499c();
        this.f23408e = jqr.mo3498b();
        this.f23409f = jqr.mo3496a();
        this.f23413j = set;
        synchronized (this.f23413j) {
            this.f23413j.add(this);
        }
    }

    public final void close() {
        m17675a("CLOSE");
        this.f23411h.close();
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo3190d() {
        m17675a("DETACH");
        return (Bitmap) this.f23411h.mo3190d();
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo3191e() {
        return (Bitmap) this.f23411h.mo3191e();
    }

    /* renamed from: f */
    public final String m17681f() {
        return (String) this.f23412i.get();
    }

    /* renamed from: a */
    public final int mo3496a() {
        return this.f23409f;
    }

    /* renamed from: b */
    public final int mo3498b() {
        return this.f23408e;
    }

    /* renamed from: a */
    private final void m17675a(String str) {
        if (this.f23412i.compareAndSet(null, str)) {
            this.f23410g = System.nanoTime();
        }
    }

    /* renamed from: c */
    public final int mo3499c() {
        return this.f23407d;
    }
}
