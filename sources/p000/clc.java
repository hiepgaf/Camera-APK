package p000;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: clc */
final class clc extends izy {
    /* renamed from: a */
    private final /* synthetic */ jiy f20320a;
    /* renamed from: b */
    private final /* synthetic */ jbj f20321b;
    /* renamed from: c */
    private final /* synthetic */ ckx f20322c;

    clc(ckx ckx, jiy jiy, jbj jbj) {
        this.f20322c = ckx;
        this.f20320a = jiy;
        this.f20321b = jbj;
    }

    public final /* synthetic */ void a_(Object obj) {
        Map map = (Map) obj;
        gev b = this.f20322c.f12136h;
        ckx ckx = this.f20322c;
        gln gln = ckx.f12130b;
        File file = ckx.f12131c;
        jip jip = (jip) map.get(this.f20320a);
        jyt jyt = this.f20322c.f12135g;
        jqo jrd = new jrd();
        Executor a = cht.m1129a();
        ckx ckx2 = this.f20322c;
        b.m2510a(new cof(gln, file, jip, jyt, jrd, a, ckx2.f12133e, this.f20321b, ckx2.f12139k, this.f20322c.f12134f));
    }
}
