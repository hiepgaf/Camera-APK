package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jmn */
final class jmn implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f18943a;

    jmn(MffContext mffContext) {
        this.f18943a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jsi(this.f18943a, (VideoFrameProvider) jms.m4595a(VideoFrameProvider.class, "default"), (jla) jms.m4595a(jla.class, "med-res-acquisition-pipeline"), (jrj) jms.m4595a(jrj.class, "med-res-acquisition-pipeline"), new jlu(), "med-res-acquisition-pipeline");
    }
}
