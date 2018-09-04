package p000;

import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: crc */
final class crc implements cre {
    /* renamed from: a */
    public cra f12552a;
    /* renamed from: b */
    public err f12553b;
    /* renamed from: d */
    private final /* synthetic */ crb f12554d;

    public crc(crb crb, err err) {
        this.f12554d = crb;
        this.f12553b = (err) jri.m13152b((Object) err);
    }

    /* renamed from: a */
    public final List mo1060a(int i) {
        int i2 = 0;
        this.f12554d.f2584e.lock();
        try {
            int i3;
            List linkedList = new LinkedList();
            cre c = mo1064c();
            int i4 = i;
            while (i4 > 0) {
                if (c == c) {
                    i3 = 0;
                    break;
                }
                linkedList.addFirst(c);
                c = c.mo1064c();
                i4--;
            }
            i3 = 0;
            while (i3 < i4) {
                linkedList.addFirst(c);
                i3++;
            }
            linkedList.addLast(this);
            c = mo1063b();
            while (i > 0 && c != c) {
                linkedList.addLast(c);
                c = c.mo1063b();
                i--;
            }
            while (i2 < i) {
                linkedList.addLast(c);
                i2++;
            }
            return linkedList;
        } finally {
            this.f12554d.f2584e.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo1062a() {
        return this.f12552a.mo1054c();
    }

    /* renamed from: b */
    public final cre mo1063b() {
        this.f12554d.f2584e.lock();
        crd crd;
        try {
            cre cre;
            if (this.f12552a.mo1052a()) {
                cre = (cre) this.f12552a.mo1056e().mo1059h();
                if (!(crd == null || cre == null)) {
                    crd.mo1068a(cre);
                }
                return cre;
            }
            cre = cre.f2587c;
            this.f12554d.f2584e.unlock();
            crd = this.f12554d.f2581b;
            return cre;
        } finally {
            this.f12554d.f2584e.unlock();
            crd = this.f12554d.f2581b;
        }
    }

    /* renamed from: c */
    public final cre mo1064c() {
        this.f12554d.f2584e.lock();
        crd crd;
        try {
            cre cre;
            if (this.f12552a.mo1053b()) {
                cre = (cre) this.f12552a.mo1057f().mo1059h();
                if (!(crd == null || cre == null)) {
                    crd.mo1068a(cre);
                }
                return cre;
            }
            cre = cre.f2587c;
            this.f12554d.f2584e.unlock();
            crd = this.f12554d.f2581b;
            return cre;
        } finally {
            this.f12554d.f2584e.unlock();
            crd = this.f12554d.f2581b;
        }
    }

    /* renamed from: d */
    public final void mo1065d() {
        this.f12554d.f2585f.lock();
        try {
            err err = ((crc) this.f12552a.mo1059h()).f12553b;
            this.f12552a.mo1058g();
            this.f12554d.f2582c.remove(err.mo1033g().f4155h);
        } finally {
            this.f12554d.f2585f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1061a(err err) {
        jri.m13152b((Object) err);
        this.f12554d.f2585f.lock();
        try {
            this.f12554d.f2582c.remove(this.f12553b.mo1033g().f4155h);
            this.f12554d.f2582c.put(err.mo1033g().f4155h, this);
            this.f12553b = err;
        } finally {
            this.f12554d.f2585f.unlock();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12553b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("FilmstripItemNode{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public final err mo1066e() {
        return this.f12553b;
    }
}
