package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ket */
class ket implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object[] f8259a;
    /* renamed from: b */
    private final Object[] f8260b;

    ket(kes kes) {
        this.f8259a = new Object[kes.size()];
        this.f8260b = new Object[kes.size()];
        Iterator c = kes.m4814h().mo2144c();
        int i = 0;
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            this.f8259a[i] = entry.getKey();
            this.f8260b[i] = entry.getValue();
            i++;
        }
    }

    /* renamed from: a */
    final Object m4817a(khb khb) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f8259a;
            if (i >= objArr.length) {
                return khb.mo2135a();
            }
            khb.mo2137a(objArr[i], this.f8260b[i]);
            i++;
        }
    }

    Object readResolve() {
        return m4817a(new khb(this.f8259a.length));
    }
}
