package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jin */
public final class jin implements jif {
    /* renamed from: a */
    public jzt f18833a;
    /* renamed from: b */
    public boolean f18834b = false;
    /* renamed from: c */
    public final FeatureTable f18835c;
    /* renamed from: d */
    private final VideoFrameProvider f18836d;
    /* renamed from: e */
    private final VideoFrameConsumer f18837e = new jio(this);

    public jin(VideoFrameProvider videoFrameProvider, FeatureTable featureTable) {
        jri.m13152b((Object) videoFrameProvider);
        jri.m13152b((Object) featureTable);
        this.f18836d = videoFrameProvider;
        this.f18835c = featureTable;
    }

    /* renamed from: a */
    public final int mo2004a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo2006b() {
    }

    /* renamed from: a */
    public final synchronized void mo2005a(jzt jzt) {
        if (!this.f18834b) {
            this.f18834b = true;
            this.f18833a = jzt;
            this.f18836d.addVideoFrameConsumer(this.f18837e);
            this.f18833a.mo2044a();
        }
    }

    /* renamed from: c */
    public final synchronized void mo2007c() {
        if (this.f18834b) {
            this.f18836d.removeVideoFrameConsumer(this.f18837e);
            jzt jzt = this.f18833a;
            if (jzt != null) {
                jzt.mo2046b();
            }
            this.f18834b = false;
        }
    }

    public final String toString() {
        return "TimestampFeatureExtractor";
    }
}
