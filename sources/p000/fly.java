package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fly */
final class fly implements flg, ikz {
    /* renamed from: a */
    public final img f23192a = new img(new flz(this));
    /* renamed from: b */
    private final fjs f23193b;
    /* renamed from: c */
    private final int f23194c;
    /* renamed from: d */
    private final int f23195d;
    /* renamed from: e */
    private final Object f23196e = new Object();
    /* renamed from: f */
    private final List f23197f = new ArrayList();
    /* renamed from: g */
    private boolean f23198g;

    fly(fju fju, int i, int i2) {
        this.f23193b = fju.f4591a;
        this.f23194c = i;
        this.f23195d = i2;
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f23196e) {
            this.f23198g = true;
            bbo.addAll(this.f23197f);
            this.f23197f.clear();
        }
        this.f23192a.m16083a();
        bbo.close();
    }

    /* renamed from: a */
    public final List mo3440a() {
        bbo bbo = new bbo();
        List arrayList = new ArrayList();
        synchronized (this.f23196e) {
            for (flb flb : this.f23197f) {
                Object obj;
                iwp iwp = (iwp) iel.m3713a(flb.f21373a);
                if (iwp == null) {
                    obj = null;
                } else if (this.f23193b.mo1392a(iwp)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    bbo.add(flb);
                } else {
                    arrayList.add(flb);
                }
            }
            this.f23197f.clear();
        }
        this.f23192a.m16083a();
        bbo.close();
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo1403e() {
        boolean z = false;
        flb flb = null;
        int i = 1;
        while (!z && r0 != 0) {
            synchronized (this.f23196e) {
                if (!this.f23197f.isEmpty()) {
                    Collection collection = this.f23197f;
                    ken.m13458a(collection);
                    flb = (flb) collection.remove(0);
                }
                i = this.f23197f.isEmpty() ^ 1;
            }
            if (flb != null) {
                z = flb.m17328i();
            }
        }
        this.f23192a.m16083a();
        return z;
    }

    /* renamed from: c */
    public final List mo3441c() {
        bbo bbo = new bbo();
        List arrayList = new ArrayList();
        synchronized (this.f23196e) {
            for (flb flb : this.f23197f) {
                Object obj;
                iwp iwp = (iwp) iel.m3713a(flb.f21373a);
                if (iwp == null) {
                    obj = null;
                } else if (this.f23193b.mo1392a(iwp)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    bbo.add(flb);
                } else {
                    arrayList.add(flb.m17327h());
                }
            }
            this.f23197f.removeAll(bbo);
            int max = Math.max(Math.min(this.f23195d, this.f23197f.size() - 1), 0);
            while (this.f23197f.size() > max) {
                Collection collection = this.f23197f;
                ken.m13458a(collection);
                bbo.add((flb) collection.remove(0));
            }
        }
        this.f23192a.m16083a();
        bbo.close();
        return arrayList;
    }

    /* renamed from: f */
    public final ilp mo1404f() {
        return this.f23192a;
    }

    public final String t_() {
        return "SelectiveFrameStore";
    }

    /* renamed from: b */
    public final boolean mo2650b() {
        boolean z;
        synchronized (this.f23196e) {
            z = this.f23198g;
        }
        return z;
    }

    /* renamed from: d */
    final /* synthetic */ Integer m17342d() {
        Integer valueOf;
        synchronized (this.f23196e) {
            int i = 0;
            for (flb g : this.f23197f) {
                if (g.m17326g()) {
                    i++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        return valueOf;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        fjj fjj = (fjj) obj;
        bbo bbo = new bbo();
        synchronized (this.f23196e) {
            List list = this.f23197f;
            List arrayList = new ArrayList();
            for (iwz f = fjj.mo3045f(); f != null; f = fjj.mo3045f()) {
                arrayList.add(new iuz(f));
            }
            fjj.close();
            list.add(new flb(fjj.mo3044e(), fjj.mo3043d(), arrayList));
            for (fjj fjj2 : this.f23197f) {
                if (fjj2.mo3041a() == 0) {
                    bbo.add(fjj2);
                } else {
                    iwp iwp = (iwp) iel.m3713a(fjj2.mo3043d());
                    if (iwp != null && this.f23193b.mo1392a(iwp)) {
                        bbo.add(fjj2);
                    }
                }
            }
            if (this.f23198g) {
                bbo.add(fjj);
            }
            this.f23197f.removeAll(bbo);
            while (this.f23197f.size() > this.f23194c) {
                ken.m13458a(this.f23197f);
                bbo.add((fjj) this.f23197f.remove(0));
            }
        }
        this.f23192a.m16083a();
        bbo.close();
    }
}
