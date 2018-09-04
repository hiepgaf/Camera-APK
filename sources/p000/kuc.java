package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kuc */
final class kuc implements Iterator {
    /* renamed from: a */
    private int f8566a = -1;
    /* renamed from: b */
    private boolean f8567b;
    /* renamed from: c */
    private Iterator f8568c;
    /* renamed from: d */
    private final /* synthetic */ ktu f8569d;

    kuc(ktu ktu) {
        this.f8569d = ktu;
    }

    /* renamed from: a */
    private final Iterator m5296a() {
        if (this.f8568c == null) {
            this.f8568c = this.f8569d.f8550b.entrySet().iterator();
        }
        return this.f8568c;
    }

    public final boolean hasNext() {
        boolean z = true;
        if (this.f8566a + 1 >= this.f8569d.f8549a.size()) {
            if (this.f8569d.f8550b.isEmpty()) {
                z = false;
            } else if (!m5296a().hasNext()) {
                return false;
            }
        }
        return z;
    }

    public final /* synthetic */ Object next() {
        this.f8567b = true;
        int i = this.f8566a + 1;
        this.f8566a = i;
        if (i < this.f8569d.f8549a.size()) {
            return (Entry) this.f8569d.f8549a.get(this.f8566a);
        }
        return (Entry) m5296a().next();
    }

    public final void remove() {
        if (this.f8567b) {
            this.f8567b = false;
            this.f8569d.m5288a();
            if (this.f8566a < this.f8569d.f8549a.size()) {
                ktu ktu = this.f8569d;
                int i = this.f8566a;
                this.f8566a = i - 1;
                ktu.m5291c(i);
                return;
            }
            m5296a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
