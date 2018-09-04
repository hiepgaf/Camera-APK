package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jnu */
final class jnu implements jnp {
    /* renamed from: a */
    private final /* synthetic */ String[] f18948a;

    jnu(String[] strArr) {
        this.f18948a = strArr;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        List arrayList = new ArrayList();
        for (String str : this.f18948a) {
            if (!str.equals("Video_VFR")) {
                arrayList.add((jir) jms.m4595a(jir.class, str));
            }
        }
        return (jir[]) arrayList.toArray(new jir[arrayList.size()]);
    }
}
