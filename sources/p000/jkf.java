package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.FrameWarper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkf */
final class jkf implements jau {
    /* renamed from: a */
    public final jzp f18875a;
    /* renamed from: b */
    public final jqo f18876b;
    /* renamed from: c */
    public final FrameWarper f18877c;
    /* renamed from: d */
    public final /* synthetic */ jjy f18878d;
    /* renamed from: e */
    private final jrg f18879e;

    public jkf(jjy jjy, jrg jrg, jzp jzp, jqo jqo, FrameWarper frameWarper) {
        this.f18878d = jjy;
        this.f18879e = jrg;
        this.f18875a = jzp;
        this.f18876b = jqo;
        this.f18877c = frameWarper;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        jke jke = (jke) obj;
        return this.f18879e.m13130b(jke.f7891a).mo1973a(executor, new jkg(this, jke));
    }
}
