package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: clf */
final class clf implements izi {
    /* renamed from: a */
    private final Executor f12149a;
    /* renamed from: b */
    private final jqo f12150b;
    /* renamed from: c */
    private final /* synthetic */ ckx f12151c;

    public clf(ckx ckx, Executor executor, jqo jqo) {
        this.f12151c = ckx;
        this.f12149a = executor;
        this.f12150b = jqo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo711a(Object obj) {
        return m8326a();
    }

    /* renamed from: a */
    private final Pipeline m8326a() {
        if (!ckx.m8315a(this.f12151c.f12131c)) {
            return new cle();
        }
        try {
            FeatureTable a = jlf.m4531a(this.f12151c.f12131c);
            jxm a2 = jli.m12943a(this.f12151c.f12131c);
            jrg a3 = jqk.m13087a(this.f12151c.f12131c, jxr.m4679a(a2)).m4620a();
            if (a3.m13135e().isEmpty()) {
                return new cle();
            }
            ckx ckx = this.f12151c;
            return ckx.m8318a(ckx.f12132d, a, a2, a3, this.f12149a, this.f12150b);
        } catch (Throwable e) {
            String str = ckx.f12129a;
            String valueOf = String.valueOf(this.f12151c.f12131c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("Failed to load feature files from ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            kqg.f8420a.mo2210b(e);
            return new cle();
        }
    }
}
