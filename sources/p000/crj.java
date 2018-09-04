package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: crj */
public final class crj implements crd {
    /* renamed from: a */
    public static final String f12569a = bli.m862a("OnDemandLoader");
    /* renamed from: b */
    public final int f12570b;
    /* renamed from: c */
    public final kwk f12571c;
    /* renamed from: d */
    public crg f12572d;
    /* renamed from: e */
    public final ikb f12573e;
    /* renamed from: f */
    public final ird f12574f;
    /* renamed from: g */
    public AtomicBoolean f12575g = new AtomicBoolean(true);
    /* renamed from: h */
    public AtomicBoolean f12576h = new AtomicBoolean(false);
    /* renamed from: i */
    public ijx f12577i;
    /* renamed from: j */
    public ArrayList f12578j = new ArrayList();
    /* renamed from: k */
    public crb f12579k;

    public crj(kwk kwk, aws aws, bmb bmb, ird ird) {
        int i;
        this.f12571c = (kwk) jri.m13152b((Object) kwk);
        this.f12573e = aws.mo373a().mo1880b();
        this.f12577i = new ijx(ijy.m3789a(this.f12573e, "OnDemandLoader"));
        this.f12574f = (ird) jri.m13152b((Object) ird);
        if (bmb.m884b()) {
            i = 1;
        } else {
            i = 20;
        }
        this.f12570b = i;
    }

    /* renamed from: a */
    final void m8702a(kpw kpw) {
        this.f12577i.execute(new crl(this, kpw));
    }

    /* renamed from: a */
    public final void mo1068a(cre cre) {
        if (!this.f12575g.get() && !this.f12576h.get() && this.f12578j.contains(cre) && this.f12575g.compareAndSet(false, true)) {
            int b = this.f12579k.m1427b(cre.mo1066e().mo1033g().f4155h);
            String str = f12569a;
            int i = this.f12579k.f2583d.f2576c;
            StringBuilder stringBuilder = new StringBuilder(79);
            stringBuilder.append("Node at index: ");
            stringBuilder.append(b);
            stringBuilder.append(" triggering load. Current filmstrip size: ");
            stringBuilder.append(i);
            bli.m863a(str, stringBuilder.toString());
            m8702a(null);
        }
    }
}
