package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;

/* compiled from: PG */
/* renamed from: jij */
public final class jij implements Listener, jif {
    /* renamed from: a */
    private jzt f18829a;
    /* renamed from: b */
    private final jid f18830b;
    /* renamed from: c */
    private jik f18831c = jik.STOPPED;

    public jij(jid jid, FeatureTable featureTable) {
        boolean z;
        jri.m13152b((Object) jid);
        jri.m13152b((Object) featureTable);
        this.f18830b = jid;
        jid.f7847a.getRunner().setListener(this);
        if (jid.f7848b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "FeatureExtractionGraph should have at least one output.");
        for (jii featureTable2 : jid.f7848b) {
            featureTable2.setFeatureTable(featureTable);
        }
    }

    /* renamed from: a */
    private static void m12858a(jik jik, jik jik2) {
        if (jik != jik2) {
            String name = jik2.name();
            String name2 = jik.name();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 37) + String.valueOf(name2).length());
            stringBuilder.append("Expected extractor to be in ");
            stringBuilder.append(name);
            stringBuilder.append(" actual: ");
            stringBuilder.append(name2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int mo2004a() {
        return this.f18830b.f7848b.size();
    }

    public final void onGraphRunnerError(Exception exception, boolean z) {
        jzt jzt = this.f18829a;
        if (jzt != null) {
            jzt.mo2045a(exception);
        }
    }

    public final void onGraphRunnerStopped(GraphRunner graphRunner) {
        jzt jzt = this.f18829a;
        if (jzt != null) {
            jzt.mo2046b();
        }
    }

    /* renamed from: b */
    public final void mo2006b() {
        jid jid = this.f18830b;
        jid.f7847a.getRunner().stop();
        jid.f7847a.getRunner().tearDown();
    }

    /* renamed from: a */
    public final synchronized void mo2005a(jzt jzt) {
        jri.m13152b((Object) jzt);
        jij.m12858a(this.f18831c, jik.STOPPED);
        this.f18831c = jik.RUNNING;
        this.f18830b.f7847a.run();
        this.f18829a = jzt;
        this.f18829a.mo2044a();
    }

    /* renamed from: c */
    public final synchronized void mo2007c() {
        jij.m12858a(this.f18831c, jik.RUNNING);
        ((VideoProviderSource) this.f18830b.f7847a.getFilter("camera")).forceClose();
        this.f18831c = jik.STOPPED;
    }

    public final String toString() {
        return "FilterFwFeatureExtractor";
    }
}
