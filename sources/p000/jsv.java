package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jsv */
public final class jsv implements jst {
    /* renamed from: a */
    private final jst f19015a;

    public jsv(jst jst, String str, Writer writer) {
        jri.m13152b((Object) jst);
        jri.m13152b((Object) str);
        jri.m13152b((Object) writer);
        this.f19015a = jst;
    }

    public final String toString() {
        return String.format("%s[metric=%s]", new Object[]{"LoggingFrameSegmentDistanceMetric", this.f19015a});
    }
}
