package p000;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilb */
public class ilb implements ilp {
    /* renamed from: a */
    private final Executor f21732a;
    /* renamed from: b */
    public final Set f21733b;
    /* renamed from: c */
    public volatile Object f21734c;

    public ilb(inc inc) {
        this((Object) inc);
    }

    public ilb(Object obj) {
        this.f21733b = new CopyOnWriteArraySet();
        this.f21734c = obj;
        this.f21732a = new imk();
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        ijp ijp = new ijp(iqt, executor);
        this.f21733b.add(ijp);
        this.f21732a.execute(new ild(this, ijp));
        return new ile(this, ijp);
    }

    /* renamed from: b */
    public final Object mo2860b() {
        return this.f21734c;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        this.f21732a.execute(new ilc(this, obj));
    }
}
