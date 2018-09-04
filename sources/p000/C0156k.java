package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: k */
public final class C0156k implements Iterator, C0124m {
    /* renamed from: a */
    private C0123j f19131a;
    /* renamed from: b */
    private boolean f19132b = true;
    /* renamed from: c */
    private final /* synthetic */ C0121g f19133c;

    C0156k(C0121g c0121g) {
        this.f19133c = c0121g;
    }

    public final boolean hasNext() {
        if (!this.f19132b) {
            C0123j c0123j = this.f19131a;
            if (c0123j == null || c0123j.f7595c == null) {
                return false;
            }
            return true;
        } else if (this.f19133c.f4945b != null) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ Object next() {
        if (this.f19132b) {
            this.f19132b = false;
            this.f19131a = this.f19133c.f4945b;
        } else {
            C0123j c0123j = this.f19131a;
            if (c0123j != null) {
                c0123j = c0123j.f7595c;
            } else {
                c0123j = null;
            }
            this.f19131a = c0123j;
        }
        return this.f19131a;
    }

    public final void a_(C0123j c0123j) {
        C0123j c0123j2 = this.f19131a;
        if (c0123j == c0123j2) {
            boolean z;
            this.f19131a = c0123j2.f7596d;
            if (this.f19131a == null) {
                z = true;
            } else {
                z = false;
            }
            this.f19132b = z;
        }
    }
}
