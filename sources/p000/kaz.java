package p000;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kaz */
public class kaz {
    /* renamed from: a */
    public final String f8178a;

    kaz(kaz kaz) {
        this.f8178a = kaz.f8178a;
    }

    public kaz(String str) {
        this.f8178a = (String) jri.m13152b((Object) str);
    }

    /* renamed from: a */
    public Appendable mo2092a(Appendable appendable, Iterator it) {
        jri.m13152b((Object) appendable);
        if (it.hasNext()) {
            appendable.append(mo2089a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f8178a);
                appendable.append(mo2089a(it.next()));
            }
        }
        return appendable;
    }

    /* renamed from: a */
    private final StringBuilder m4731a(StringBuilder stringBuilder, Iterator it) {
        try {
            mo2092a((Appendable) stringBuilder, it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final String m4735a(Iterable iterable) {
        return m4731a(new StringBuilder(), iterable.iterator()).toString();
    }

    /* renamed from: a */
    public static kaz m4732a(String str) {
        return new kaz(str);
    }

    /* renamed from: a */
    public kaz mo2090a() {
        return new kbb(this, this);
    }

    /* renamed from: a */
    CharSequence mo2089a(Object obj) {
        jri.m13152b(obj);
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }

    /* renamed from: b */
    public kaz mo2091b(String str) {
        jri.m13152b((Object) str);
        return new kba(this, this, str);
    }

    /* renamed from: c */
    public kbc mo2093c(String str) {
        return new kbc(this, str);
    }
}
