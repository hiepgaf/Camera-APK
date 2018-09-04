package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jkr */
public final class jkr implements jja {
    /* renamed from: a */
    public final long f18893a;
    /* renamed from: b */
    public final float f18894b;
    /* renamed from: c */
    public final boolean f18895c;
    /* renamed from: d */
    public final boolean f18896d;
    /* renamed from: e */
    private final int f18897e;

    public jkr(long j, int i, float f, boolean z, boolean z2) {
        this.f18893a = j;
        this.f18897e = i;
        this.f18894b = f;
        this.f18895c = z;
        this.f18896d = z2;
    }

    /* renamed from: a */
    public final /* synthetic */ jxn mo2016a(jrg jrg) {
        return m12905b(jrg);
    }

    /* renamed from: b */
    private final jxp m12905b(jrg jrg) {
        return new jxp(GDepthUtil.MIME_JPEG, this.f18893a, this.f18897e, jrg.f18971a, jrg.f18972b);
    }

    /* renamed from: b */
    public final long mo2009b() {
        return this.f18893a;
    }

    /* renamed from: a */
    public final jaq mo2015a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        return jrg.m13130b(this.f18893a).mo1973a(executor, new jks(jqo, jxo, m12905b(jrg)));
    }

    /* renamed from: a */
    public final jaq mo2014a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return jrg.m13130b(this.f18893a).mo1973a(executor, jkm.m12897b(jqo, context));
    }
}
