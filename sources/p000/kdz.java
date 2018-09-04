package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kdz */
public abstract class kdz extends kdv implements Set {
    protected kdz() {
    }

    /* renamed from: c */
    protected abstract Set mo3513c();

    protected /* synthetic */ Object F_() {
        return mo3513c();
    }

    /* renamed from: b */
    protected /* synthetic */ Collection mo3225b() {
        return mo3513c();
    }

    public boolean equals(Object obj) {
        return obj == this || mo3513c().equals(obj);
    }

    public int hashCode() {
        return mo3513c().hashCode();
    }
}
