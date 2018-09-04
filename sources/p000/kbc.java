package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kbc */
public final class kbc {
    /* renamed from: a */
    private final kaz f8179a;
    /* renamed from: b */
    private final String f8180b;

    kbc(kaz kaz, String str) {
        this.f8179a = kaz;
        this.f8180b = (String) jri.m13152b((Object) str);
    }

    /* renamed from: a */
    public final StringBuilder m4739a(StringBuilder stringBuilder, Iterator it) {
        try {
            jri.m13152b((Object) stringBuilder);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                stringBuilder.append(this.f8179a.mo2089a(entry.getKey()));
                stringBuilder.append(this.f8180b);
                stringBuilder.append(this.f8179a.mo2089a(entry.getValue()));
                while (it.hasNext()) {
                    stringBuilder.append(this.f8179a.f8178a);
                    entry = (Entry) it.next();
                    stringBuilder.append(this.f8179a.mo2089a(entry.getKey()));
                    stringBuilder.append(this.f8180b);
                    stringBuilder.append(this.f8179a.mo2089a(entry.getValue()));
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
