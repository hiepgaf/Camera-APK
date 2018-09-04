package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aop */
public final class aop {
    /* renamed from: a */
    private final List f814a = new ArrayList();

    /* renamed from: a */
    public final synchronized aoo m527a(Class cls, Class cls2) {
        aoo aoo;
        if (cls2.isAssignableFrom(cls)) {
            aoo = aor.f10122a;
        } else {
            for (aoq aoq : this.f814a) {
                if (aoq.m530a(cls, cls2)) {
                    aoo = aoq.f815a;
                }
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(cls2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length());
            stringBuilder.append("No transcoder registered to transcode from ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to ");
            stringBuilder.append(valueOf2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return aoo;
    }

    /* renamed from: b */
    public final synchronized List m529b(Class cls, Class cls2) {
        List list;
        List arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            list = arrayList;
        } else {
            for (aoq a : this.f814a) {
                if (a.m530a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            list = arrayList;
        }
        return list;
    }

    /* renamed from: a */
    public final synchronized void m528a(Class cls, Class cls2, aoo aoo) {
        this.f814a.add(new aoq(cls, cls2, aoo));
    }
}
