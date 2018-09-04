package p000;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjp */
public final class jjp extends jjq {
    /* renamed from: c */
    private final jxm f21858c;
    /* renamed from: d */
    private final ByteBuffer f21859d;

    public jjp(String str, jxm jxm, ByteBuffer byteBuffer) {
        super(str, 5);
        jri.m13152b((Object) jxm);
        jri.m13152b((Object) byteBuffer);
        this.f21858c = jxm;
        this.f21859d = byteBuffer;
    }

    /* renamed from: a */
    public final jaq mo2013a(juh juh, Executor executor) {
        boolean z;
        jri.m13152b((Object) juh);
        if (juh.m4648d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Cannot create all smiles photo from an empty stack!");
        Map hashMap = new HashMap();
        jzp jzp = (jzp) this.f21858c.m4672a(juh.m4644a()).m4665a(jxa.f8045b);
        Iterator it = juh.iterator();
        jzp jzp2 = jzp;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            jxa a = this.f21858c.m4672a(longValue);
            jzp = (jzp) a.m4665a(jxa.f8045b);
            if (jzp2.equals(jzp)) {
                hashMap.put(Long.valueOf(longValue), (List) a.m4665a(jxa.f8046c));
                jzp2 = jzp;
            } else {
                throw new IllegalStateException("Expected metadata image size to be consistent.");
            }
        }
        return jli.m12948b(new jjg(this.f18858a, this.f18859b, juh.m4647c(), hashMap, jzp2, this.f21859d));
    }
}
