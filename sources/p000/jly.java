package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jly */
final class jly implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f18934a;

    jly(MffContext mffContext) {
        this.f18934a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jsi(this.f18934a, (VideoFrameProvider) jms.m4595a(VideoFrameProvider.class, "default"), new jkw((jwa) jms.m4595a(jwa.class, "default"), (jqt) jms.m4595a(jrb.class, "default"), 9), (jrj) jms.m4595a(jrj.class, "default"), new jlp(), "screen-res-acquisition-pipeline");
    }
}
