package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jse */
final class jse implements izi {
    /* renamed from: a */
    private final /* synthetic */ jsb f19007a;

    jse(jsb jsb) {
        this.f19007a = jsb;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        juh juh = new juh(this.f19007a.f18999a.m13133c());
        List b = khb.m4885b();
        b.add(juh);
        List arrayList = new ArrayList();
        for (jir jir : this.f19007a.f19001c) {
            for (juh juh2 : jir.f7853a.mo2054a(b)) {
                arrayList.add(new jsp(jir.f7854b, juh2));
            }
        }
        return arrayList;
    }
}
