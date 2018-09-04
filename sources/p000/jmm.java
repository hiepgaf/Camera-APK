package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jmm */
final class jmm implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f18942a;

    jmm(MffContext mffContext) {
        this.f18942a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jsi(this.f18942a, (VideoFrameProvider) jms.m4595a(VideoFrameProvider.class, "default"), (jla) jms.m4595a(jlb.class, "low-res-acquisition-pipeline"), (jrj) jms.m4595a(jrj.class, "low-res-acquisition-pipeline"), new jlt(), "low-res-acquisition-pipeline");
    }
}
