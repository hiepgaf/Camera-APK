package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: cqz */
public final class cqz implements cra {
    /* renamed from: a */
    public cqz f12547a = null;
    /* renamed from: b */
    public cqz f12548b = null;
    /* renamed from: c */
    private Object f12549c = null;
    /* renamed from: d */
    private boolean f12550d = false;
    /* renamed from: e */
    private final /* synthetic */ cqy f12551e;

    cqz(cqy cqy, Object obj) {
        this.f12551e = cqy;
        this.f12549c = jri.m13152b(obj);
    }

    /* renamed from: a */
    public final boolean mo1052a() {
        return this.f12547a != null;
    }

    /* renamed from: b */
    public final boolean mo1053b() {
        return this.f12548b != null;
    }

    /* renamed from: c */
    public final boolean mo1054c() {
        return this.f12550d;
    }

    /* renamed from: d */
    public final cqy mo1055d() {
        return this.f12551e;
    }

    /* renamed from: e */
    public final cra mo1056e() {
        if (mo1052a()) {
            return this.f12547a;
        }
        throw new NoSuchElementException("Trying to access non-existent next node.");
    }

    /* renamed from: f */
    public final cra mo1057f() {
        if (mo1053b()) {
            return this.f12548b;
        }
        throw new NoSuchElementException("Trying to access non-existent previous node.");
    }

    /* renamed from: g */
    public final void mo1058g() {
        jri.m13154b(this.f12550d ^ 1, (Object) "Cannot delete already deleted node.");
        cqy cqy = this.f12551e;
        cqz cqz = this.f12547a;
        cqz cqz2 = this.f12548b;
        if (cqz2 != null) {
            cqz2.f12547a = cqz;
        }
        if (cqz != null) {
            cqz.f12548b = cqz2;
        }
        if (cqy.f2574a == this) {
            cqy.f2574a = cqz;
        }
        if (cqy.f2575b == this) {
            cqy.f2575b = cqz2;
        }
        cqy.f2576c--;
        this.f12550d = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12549c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("DoublyLinkedNodeImpl{ ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    /* renamed from: h */
    public final Object mo1059h() {
        return this.f12549c;
    }
}
