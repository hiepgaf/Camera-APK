package p000;

import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jyc */
public final class jyc implements jmu {
    /* renamed from: a */
    private final /* synthetic */ jyt f19108a;

    public jyc(jyt jyt) {
        this.f19108a = jyt;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2075a(Object obj, String str) {
        jia jia = new jia((VideoFrameProvider) obj);
        this.f19108a.m4701a("frame_grabs.csv", new jic(jia));
        this.f19108a.m4701a("decoder_stats.txt", new jib(jia));
        return jia;
    }
}
