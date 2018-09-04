package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: jtx */
public final class jtx {
    /* renamed from: a */
    private final HashMap f7978a = khb.m4899d();

    /* renamed from: a */
    public final jtx m4643a(jtv jtv, float f) {
        this.f7978a.put((jtv) jri.m13152b((Object) jtv), Float.valueOf(f));
        return this;
    }

    /* renamed from: a */
    public final jtx m4642a(FeatureTable featureTable, jza jza, float f) {
        this.f7978a.put(new juc(featureTable, jza), Float.valueOf(f));
        return this;
    }

    /* renamed from: a */
    public final jtw m4641a() {
        return new jtw(this.f7978a);
    }
}
