package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ixh */
public final class ixh implements ixm {
    /* renamed from: a */
    private final ixk f18642a;
    /* renamed from: b */
    private final Object f18643b = this;
    /* renamed from: c */
    private final kgx f18644c = new kho(kgc.f19196a);
    /* renamed from: d */
    private final kcv f18645d = new kcv();

    public ixh(ixk ixk) {
        this.f18642a = ixk;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1953a(long j, Object obj) {
        iqo iqo = (iqo) obj;
        synchronized (this.f18643b) {
            kgx kgx = this.f18644c;
            Long valueOf = Long.valueOf(j);
            kgx.add(valueOf);
            this.f18645d.mo2100a(valueOf, iqo);
            m12621h();
        }
    }

    /* renamed from: a */
    public final int mo1951a() {
        int i;
        synchronized (this.f18643b) {
            if (this.f18642a.mo1323a() < 0) {
                i = this.f18645d.mo3206i() + 1;
            } else {
                i = this.f18642a.mo1323a();
            }
        }
        return i;
    }

    /* renamed from: a */
    private final void m12619a(Long l, iqo iqo) {
        this.f18645d.mo2102c(l, iqo);
        this.f18644c.remove(l);
    }

    /* renamed from: h */
    private final void m12621h() {
        if (!this.f18645d.mo3608m()) {
            while (this.f18642a.mo1325a(khb.m4874a(this.f18644c))) {
                Long l = (Long) this.f18644c.mo3221k().mo3240b();
                iqo iqo = (iqo) this.f18645d.mo3604b(l).get(0);
                m12619a(l, iqo);
                iqo.close();
            }
        }
    }

    /* renamed from: b */
    private final iqo m12620b(long j) {
        synchronized (this.f18643b) {
            kgx kgx = this.f18644c;
            Long valueOf = Long.valueOf(j);
            if (kgx.contains(valueOf)) {
                iqo iqo = (iqo) this.f18645d.mo3604b(valueOf).get(0);
                return iqo;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1952a(long j) {
        return m12620b(j);
    }

    /* renamed from: b */
    public final List mo1955b() {
        List arrayList;
        synchronized (this.f18643b) {
            arrayList = new ArrayList(this.f18645d.mo3206i());
            long j = -1;
            for (Long longValue : this.f18644c) {
                long longValue2 = longValue.longValue();
                if (j != longValue2) {
                    arrayList.addAll(this.f18645d.mo3604b(Long.valueOf(longValue2)));
                    j = longValue2;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private final iqo m12622i() {
        synchronized (this.f18643b) {
            if (this.f18644c.isEmpty()) {
                return null;
            }
            iqo iqo = (iqo) this.f18645d.mo3604b((Long) this.f18644c.mo3221k().mo3240b()).get(0);
            return iqo;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo1956c() {
        return m12622i();
    }

    /* renamed from: j */
    private final iqo m12623j() {
        synchronized (this.f18643b) {
            if (this.f18644c.isEmpty()) {
                return null;
            }
            List b = this.f18645d.mo3604b((Long) this.f18644c.mo3222l().mo3240b());
            iqo iqo = (iqo) b.get(b.size() - 1);
            return iqo;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo1957d() {
        return m12623j();
    }

    /* renamed from: e */
    public final /* synthetic */ Collection mo1958e() {
        return m12624k();
    }

    /* renamed from: k */
    private final List m12624k() {
        List arrayList;
        synchronized (this.f18643b) {
            arrayList = new ArrayList(this.f18645d.mo3206i());
            long j = -1;
            for (Long longValue : this.f18644c) {
                long longValue2 = longValue.longValue();
                if (j != longValue2) {
                    arrayList.addAll(this.f18645d.mo3604b(Long.valueOf(longValue2)));
                    j = longValue2;
                }
            }
            this.f18645d.mo3200c();
            this.f18644c.clear();
        }
        return arrayList;
    }

    /* renamed from: l */
    private final iqo m12625l() {
        synchronized (this.f18643b) {
            if (this.f18644c.isEmpty()) {
                return null;
            }
            Long l = (Long) this.f18644c.mo3221k().mo3240b();
            iqo iqo = (iqo) this.f18645d.mo3604b(l).get(0);
            m12619a(l, iqo);
            return iqo;
        }
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo1959f() {
        return m12625l();
    }

    /* renamed from: a */
    public final boolean mo1954a(int i) {
        synchronized (this.f18643b) {
            if (this.f18642a.mo1324a(i)) {
                m12621h();
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public final int mo1960g() {
        int i;
        synchronized (this.f18643b) {
            i = this.f18645d.mo3206i();
        }
        return i;
    }
}
