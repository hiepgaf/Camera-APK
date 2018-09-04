package p000;

import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hmr */
final class hmr implements hmx {
    /* renamed from: a */
    public final List f21593a = new ArrayList();
    /* renamed from: b */
    private final Set f21594b;
    /* renamed from: c */
    private final iyc f21595c;
    /* renamed from: d */
    private final Surface f21596d;
    /* renamed from: e */
    private final hmu f21597e;

    hmr(Set set, iyc iyc, Surface surface, hmu hmu) {
        this.f21594b = set;
        this.f21595c = iyc;
        this.f21597e = hmu;
        this.f21596d = surface;
    }

    public final void close() {
        try {
            for (iqo close : this.f21593a) {
                close.close();
            }
            this.f21595c.close();
            this.f21596d.release();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final kpk mo3091a() {
        return this.f21595c.mo1962a();
    }

    /* renamed from: a */
    public final void mo3092a(Size size) {
        this.f21595c.mo1963a(this.f21596d, size);
    }

    /* renamed from: b */
    public final void m15900b() {
        iyc iyc = this.f21595c;
        ArrayList arrayList = new ArrayList(this.f21594b);
        Collections.sort(arrayList, hmt.f6371a);
        List arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            hml hml = (hml) arrayList.get(i);
            if (((Boolean) hml.mo1739a().mo2860b()).booleanValue()) {
                arrayList2.add(hml.mo1740b().mo1745a());
                i = i2;
            } else {
                i = i2;
            }
        }
        iyc.mo1965a(arrayList2);
    }

    /* renamed from: a */
    public final void mo3093a(iqm iqm) {
        this.f21595c.mo1964a(iqm);
        this.f21597e.m3249a(iqm);
    }
}
