package p000;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjm */
final class jjm implements jau {
    /* renamed from: a */
    private final jrg f18852a;
    /* renamed from: b */
    private final jqo f18853b;
    /* renamed from: c */
    private final List f18854c;

    public jjm(jrg jrg, jqo jqo, List list) {
        this.f18852a = jrg;
        this.f18853b = jqo;
        this.f18854c = list;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        Pair pair = (Pair) obj;
        long longValue = ((Long) pair.second).longValue();
        List list = this.f18854c;
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((jjl) list.get(i2)).f7883a == longValue) {
                i = i2;
            }
        }
        if (i == -1) {
            StringBuilder stringBuilder = new StringBuilder(58);
            stringBuilder.append("No face crop data found for timestamp ");
            stringBuilder.append(longValue);
            throw new RuntimeException(stringBuilder.toString());
        }
        return this.f18852a.m13130b(longValue).mo1973a(executor, new jjn(this.f18853b)).mo1973a(executor, new jjo((jqr) pair.first, ((jjl) list.get(i)).f7884b));
    }
}
