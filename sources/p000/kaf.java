package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kaf */
public final class kaf implements AutoCloseable {
    /* renamed from: a */
    private final List f8168a = new ArrayList();

    public final void close() {
        for (kae close : this.f8168a) {
            close.close();
        }
    }

    public final String toString() {
        int size = this.f8168a.size();
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("SafeHandlePool[count=");
        stringBuilder.append(size);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final kae m4724a(AutoCloseable autoCloseable) {
        return m4725a(new jzy(jqk.m13097b(autoCloseable)));
    }

    /* renamed from: a */
    public final kae m4725a(kae kae) {
        this.f8168a.add(kae);
        return kae;
    }
}
