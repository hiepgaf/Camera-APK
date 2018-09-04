package p000;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bez */
public final class bez {
    /* renamed from: c */
    private static final String f1112c = bli.m862a("CdrCharacteristics");
    /* renamed from: a */
    public final ffc f1113a;
    /* renamed from: b */
    public final Map f1114b;

    public bez(ffc ffc, Map map) {
        this.f1113a = ffc;
        this.f1114b = map;
        for (inc inc : this.f1114b.keySet()) {
            String str = f1112c;
            String valueOf = String.valueOf(inc);
            String valueOf2 = String.valueOf(map.get(inc));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length());
            stringBuilder.append("checkResolutionListOrder: [");
            stringBuilder.append(valueOf);
            stringBuilder.append("] = ");
            stringBuilder.append(valueOf2);
            bli.m869c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final List m803a(inc inc) {
        Object obj = (List) this.f1114b.get(inc);
        jri.m13152b(obj);
        return obj;
    }

    /* renamed from: a */
    public final boolean m804a() {
        return this.f1113a.mo1940v();
    }

    /* renamed from: a */
    public final boolean m805a(inc inc, ine ine) {
        Object obj = (List) this.f1114b.get(inc);
        jri.m13152b(obj);
        return obj.contains(ine);
    }
}
