package p000;

import android.util.LongSparseArray;
import java.util.List;

/* compiled from: PG */
/* renamed from: jxm */
public class jxm {
    /* renamed from: a */
    private final LongSparseArray f8069a = new LongSparseArray();

    /* renamed from: a */
    public final synchronized jxa m4672a(long j) {
        jxa jxa;
        jxa = (jxa) this.f8069a.get(j);
        if (jxa == null) {
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("No such timestamp in MetaDataStore: ");
            stringBuilder.append(j);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return jxa;
    }

    /* renamed from: a */
    public final synchronized List m4671a() {
        List b;
        b = khb.m4885b();
        for (int i = 0; i < this.f8069a.size(); i++) {
            b.add((jxa) this.f8069a.valueAt(i));
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void m4673a(jxa jxa) {
        this.f8069a.put(((Long) jxa.m4665a(jxa.f8044a)).longValue(), jxa);
    }
}
