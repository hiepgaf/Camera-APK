package p000;

/* compiled from: PG */
/* renamed from: ezl */
public final class ezl implements iqo {
    /* renamed from: a */
    public final evn f15810a;

    public ezl(evn evn) {
        this.f15810a = evn;
    }

    /* renamed from: a */
    public final void m10120a() {
        this.f15810a.f4279d.cancel(false);
        this.f15810a.f4281f.cancel(false);
        this.f15810a.f4280e.cancel(false);
    }

    public final void close() {
    }

    /* renamed from: b */
    public final boolean m10122b() {
        if (this.f15810a.f4279d.isDone() && this.f15810a.f4280e.isDone() && this.f15810a.f4282g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m10121a(ezl ezl) {
        if (ezl.f15810a.f4278c <= this.f15810a.f4278c) {
            return false;
        }
        if (!ezl.f15810a.f4279d.isDone() || this.f15810a.f4279d.isDone()) {
            return false;
        }
        return true;
    }
}
