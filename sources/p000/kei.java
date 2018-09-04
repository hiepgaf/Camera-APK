package p000;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: kei */
class kei extends kej {
    /* renamed from: a */
    public Object[] f19180a;
    /* renamed from: b */
    public int f19181b = 0;
    /* renamed from: c */
    public boolean f19182c;

    kei(int i) {
        khb.m4859a(i, "initialCapacity");
        this.f19180a = new Object[i];
    }

    /* renamed from: a */
    public kei mo3231a(Object obj) {
        jri.m13152b(obj);
        m13448a(this.f19181b + 1);
        Object[] objArr = this.f19180a;
        int i = this.f19181b;
        this.f19181b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public /* synthetic */ kej mo2141b(Object obj) {
        return mo3231a(obj);
    }

    /* renamed from: a */
    public kej mo2140a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m13448a(this.f19181b + collection.size());
            if (collection instanceof keh) {
                this.f19181b = ((keh) collection).mo2142a(this.f19180a, this.f19181b);
                return this;
            }
        }
        super.mo2140a(iterable);
        return this;
    }

    /* renamed from: a */
    private final void m13448a(int i) {
        Object obj = this.f19180a;
        int length = obj.length;
        if (length < i) {
            this.f19180a = Arrays.copyOf(obj, kej.m4801a(length, i));
            this.f19182c = false;
        } else if (this.f19182c) {
            this.f19180a = (Object[]) obj.clone();
            this.f19182c = false;
        }
    }
}
