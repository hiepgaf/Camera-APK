package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: gfo */
public final class gfo implements gfn {
    /* renamed from: a */
    public final List f16883a = new ArrayList();
    /* renamed from: b */
    public final HashMap f16884b = new HashMap();

    static {
        bli.m862a("IProxyListener");
    }

    gfo() {
    }

    /* renamed from: a */
    private final List m11040a(long j) {
        List arrayList = new ArrayList();
        for (gfn gfn : this.f16883a) {
            if (this.f16884b.get(gfn) == null || ((Long) this.f16884b.get(gfn)).longValue() == j) {
                arrayList.add(gfn);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int m11041a() {
        int size;
        synchronized (this.f16883a) {
            size = this.f16884b.size();
        }
        return size;
    }

    /* renamed from: b */
    public final int m11046b() {
        int size;
        synchronized (this.f16883a) {
            size = this.f16883a.size();
        }
        return size;
    }

    /* renamed from: a */
    public final void mo1417a(ggu ggu, ggs ggs) {
        synchronized (this.f16883a) {
            List<gfn> a = m11040a(ggu.f5174b);
        }
        for (gfn a2 : a) {
            a2.mo1417a(ggu, ggs);
        }
    }

    /* renamed from: a */
    public final void mo1418a(ggu ggu, ggv ggv) {
        synchronized (this.f16883a) {
            List<gfn> a = m11040a(ggu.f5174b);
        }
        for (gfn a2 : a) {
            a2.mo1418a(ggu, ggv);
        }
    }

    /* renamed from: a */
    public final void mo1416a(ggu ggu, Uri uri) {
        synchronized (this.f16883a) {
            List<gfn> a = m11040a(ggu.f5174b);
        }
        for (gfn a2 : a) {
            a2.mo1416a(ggu, uri);
        }
    }

    /* renamed from: a */
    public final void mo1415a(ggu ggu) {
        synchronized (this.f16883a) {
            List<gfn> a = m11040a(ggu.f5174b);
        }
        for (gfn a2 : a) {
            a2.mo1415a(ggu);
        }
    }
}
