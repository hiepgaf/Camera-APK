package p000;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: khi */
class khi implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final Object f8287a;
    /* renamed from: b */
    private final Object f8288b;

    khi(Object obj, Object obj2) {
        this.f8288b = jri.m13152b(obj);
        if (obj2 == null) {
            obj2 = this;
        }
        this.f8287a = obj2;
    }

    /* renamed from: a */
    Object mo2169a() {
        return this.f8288b;
    }

    public String toString() {
        String obj;
        synchronized (this.f8287a) {
            obj = this.f8288b.toString();
        }
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f8287a) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
