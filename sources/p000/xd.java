package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: xd */
public final class xd {
    /* renamed from: a */
    private List f9505a = new ArrayList(5);

    /* renamed from: a */
    public final void m6234a(xe xeVar) {
        this.f9505a.add(xeVar);
    }

    /* renamed from: a */
    public final xe m6233a(int i) {
        return (xe) this.f9505a.get(i);
    }

    /* renamed from: a */
    public final int m6232a() {
        return this.f9505a.size();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < m6232a(); i++) {
            stringBuffer.append(m6233a(i));
            if (i < m6232a() - 1) {
                int i2 = m6233a(i + 1).f9507b;
                if (i2 == 1 || i2 == 2) {
                    stringBuffer.append('/');
                }
            }
        }
        return stringBuffer.toString();
    }
}
