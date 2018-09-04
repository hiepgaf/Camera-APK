package p000;

import java.io.StringWriter;

/* compiled from: PG */
/* renamed from: jyk */
public final class jyk implements jmu {
    /* renamed from: a */
    private final /* synthetic */ StringWriter f19116a;

    public jyk(StringWriter stringWriter) {
        this.f19116a = stringWriter;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2075a(Object obj, String str) {
        jwa jwa = (jwa) obj;
        if (jwa instanceof jvy) {
            return new jwf(jwa, this.f19116a);
        }
        return jwa;
    }
}
