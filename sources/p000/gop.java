package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gop */
final class gop implements gol, iqo {
    /* renamed from: a */
    public final iqt f17161a;
    /* renamed from: b */
    private final Executor f17162b;
    /* renamed from: c */
    private final /* synthetic */ goo f17163c;

    gop(goo goo, iqt iqt, Executor executor) {
        this.f17163c = goo;
        this.f17161a = iqt;
        this.f17162b = executor;
    }

    public final void close() {
        this.f17163c.f21541a.mo1538b((gol) this);
    }

    /* renamed from: a */
    public final void mo1526a(String str) {
        if (this.f17163c.f21543c.equals(str)) {
            Object a = this.f17163c.mo3450a();
            if (a != null) {
                this.f17162b.execute(new goq(this, a));
            }
        }
    }
}
