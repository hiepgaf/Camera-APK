package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: aos */
final class aos implements apa {
    /* renamed from: a */
    private final Set f10123a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private boolean f10124b;
    /* renamed from: c */
    private boolean f10125c;

    aos() {
    }

    /* renamed from: a */
    public final void mo316a(apb apb) {
        this.f10123a.add(apb);
        if (this.f10125c) {
            apb.mo8b();
        } else if (this.f10124b) {
            apb.mo9c();
        } else {
            apb.mo10d();
        }
    }

    /* renamed from: a */
    final void m6881a() {
        this.f10125c = true;
        for (apb b : arq.m651a(this.f10123a)) {
            b.mo8b();
        }
    }

    /* renamed from: b */
    final void m6883b() {
        this.f10124b = true;
        for (apb c : arq.m651a(this.f10123a)) {
            c.mo9c();
        }
    }

    /* renamed from: c */
    final void m6885c() {
        this.f10124b = false;
        for (apb d : arq.m651a(this.f10123a)) {
            d.mo10d();
        }
    }

    /* renamed from: b */
    public final void mo317b(apb apb) {
        this.f10123a.remove(apb);
    }
}
