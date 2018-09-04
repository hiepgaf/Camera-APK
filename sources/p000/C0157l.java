package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: l */
abstract class C0157l implements Iterator, C0124m {
    /* renamed from: a */
    private C0123j f19328a;
    /* renamed from: b */
    private C0123j f19329b;

    C0157l(C0123j c0123j, C0123j c0123j2) {
        this.f19328a = c0123j2;
        this.f19329b = c0123j;
    }

    /* renamed from: a */
    abstract C0123j mo3070a(C0123j c0123j);

    /* renamed from: b */
    abstract C0123j mo3071b(C0123j c0123j);

    public boolean hasNext() {
        return this.f19329b != null;
    }

    public /* synthetic */ Object next() {
        C0123j c0123j = this.f19329b;
        this.f19329b = m14025a();
        return c0123j;
    }

    /* renamed from: a */
    private final C0123j m14025a() {
        C0123j c0123j = this.f19329b;
        C0123j c0123j2 = this.f19328a;
        if (c0123j == c0123j2 || c0123j2 == null) {
            return null;
        }
        return mo3071b(c0123j);
    }

    public final void a_(C0123j c0123j) {
        if (this.f19328a == c0123j && c0123j == this.f19329b) {
            this.f19329b = null;
            this.f19328a = null;
        }
        C0123j c0123j2 = this.f19328a;
        if (c0123j2 == c0123j) {
            this.f19328a = mo3070a(c0123j2);
        }
        if (this.f19329b == c0123j) {
            this.f19329b = m14025a();
        }
    }
}
