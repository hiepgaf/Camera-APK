package p000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: geg */
public final class geg implements gey {
    /* renamed from: f */
    private static final String f16841f = bli.m862a("LcLbTaskManager");
    /* renamed from: a */
    public final ilb f16842a = new ilb(Long.valueOf(0));
    /* renamed from: b */
    public final long f16843b;
    /* renamed from: c */
    public final ilp f16844c;
    /* renamed from: d */
    public final Object f16845d;
    /* renamed from: e */
    public boolean f16846e;
    /* renamed from: g */
    private final gev f16847g;
    /* renamed from: h */
    private final iqb f16848h;
    /* renamed from: i */
    private final LinkedList f16849i;
    /* renamed from: j */
    private List f16850j;

    public geg(era era, eqy eqy, gev gev) {
        this.f16847g = gev;
        this.f16849i = new LinkedList();
        this.f16845d = new Object();
        this.f16846e = false;
        this.f16850j = new ArrayList();
        this.f16843b = Math.min(300000000, eqy.f4103a);
        era.m2029a(new geh(this));
        this.f16844c = era.m2027a(eqv.LIGHTCYCLE_REFOCUS);
        this.f16844c.mo2859a(new gei(this), khx.m4940a());
        this.f16848h = new gej(this);
    }

    /* renamed from: a */
    public final void mo1467a(gek gek) {
        synchronized (this.f16845d) {
            this.f16850j.add(gek);
        }
    }

    /* renamed from: a */
    public final void mo1468a(geu geu) {
        synchronized (this.f16845d) {
            if (((Boolean) this.f16844c.mo2860b()).booleanValue()) {
                m11004b(geu);
            } else {
                String str = f16841f;
                String valueOf = String.valueOf(geu);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Memory low, delaying processing [");
                stringBuilder.append(valueOf);
                stringBuilder.append("]");
                bli.m869c(str, stringBuilder.toString());
                this.f16849i.add(geu);
                m11005d();
            }
        }
    }

    /* renamed from: a */
    public final void mo1469a(gex gex) {
        synchronized (this.f16845d) {
            if (((Boolean) this.f16844c.mo2860b()).booleanValue()) {
                m11004b(gex);
            } else {
                String str = f16841f;
                String valueOf = String.valueOf(gex);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Memory low, delaying processing [");
                stringBuilder.append(valueOf);
                stringBuilder.append("]");
                bli.m869c(str, stringBuilder.toString());
                gex.releaseRgbz();
                this.f16849i.add(gex);
                m11005d();
            }
        }
    }

    /* renamed from: a */
    public final long mo1466a() {
        return this.f16843b;
    }

    /* renamed from: b */
    public final int mo1470b() {
        int size;
        synchronized (this.f16845d) {
            size = this.f16849i.size();
        }
        return size;
    }

    /* renamed from: c */
    final void m11011c() {
        synchronized (this.f16845d) {
            if (!this.f16849i.isEmpty()) {
                m11004b((geu) this.f16849i.removeFirst());
                m11005d();
            }
        }
    }

    /* renamed from: b */
    private final void m11004b(geu geu) {
        synchronized (this.f16845d) {
            String str = f16841f;
            String valueOf = String.valueOf(geu);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Memory OK, processing task [");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            bli.m869c(str, stringBuilder.toString());
            this.f16846e = true;
            ilb ilb = this.f16842a;
            ilb.mo348a(Long.valueOf(((Long) ilb.mo2860b()).longValue() + this.f16843b));
            geu.addFinishedCallback(this.f16848h);
            this.f16847g.m2510a(geu);
        }
    }

    /* renamed from: d */
    private final void m11005d() {
        synchronized (this.f16845d) {
            int size = this.f16849i.size();
            String str = f16841f;
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Number of tasks in queue ");
            stringBuilder.append(size);
            bli.m863a(str, stringBuilder.toString());
            List<gek> list = this.f16850j;
            if (list != null) {
                for (gek q : list) {
                    q.mo3413q();
                }
            }
        }
    }
}
