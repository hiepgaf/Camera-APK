package p000;

import android.graphics.RectF;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Config;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterpacks.storage.FrameConsumerFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jsi */
public class jsi implements jsh {
    /* renamed from: a */
    public final jrj f21894a;
    /* renamed from: b */
    public final jbj f21895b = jbj.m12751d();
    /* renamed from: c */
    private final FilterGraph f21896c;
    /* renamed from: d */
    private final VideoFrameProvider f21897d;
    /* renamed from: e */
    private final AtomicBoolean f21898e = new AtomicBoolean(false);
    /* renamed from: f */
    private final jaq f21899f;
    /* renamed from: g */
    private final Listener f21900g = new jsj(this);
    /* renamed from: h */
    private boolean f21901h;

    public jsi(MffContext mffContext, VideoFrameProvider videoFrameProvider, jla jla, jrj jrj, GraphFactory graphFactory, String str) {
        jri.m13152b((Object) mffContext);
        jri.m13152b((Object) videoFrameProvider);
        jri.m13152b((Object) jla);
        jri.m13152b((Object) jrj);
        this.f21894a = jrj;
        this.f21897d = videoFrameProvider;
        this.f21901h = false;
        this.f21896c = graphFactory.create(mffContext);
        this.f21896c.getVariable("videoProvider").setValue(this.f21897d);
        ((FrameConsumerFilter) this.f21896c.getFilter("frameConsumer")).setFrameConsumer(jla);
        GraphRunner graphRunner = new GraphRunner(mffContext, new Config(), this.f21900g);
        graphRunner.setThreadName(str);
        this.f21896c.attachToRunner(graphRunner);
        this.f21899f = this.f21895b.mo1973a(jlk.f7915a, new jsk());
    }

    public jaq process() {
        if (this.f21898e.compareAndSet(false, true)) {
            this.f21896c.run();
        }
        return this.f21899f;
    }

    public void resume() {
    }

    /* renamed from: a */
    public final void m16335a(RectF rectF) {
        this.f21896c.getVariable("cropRect").setValue(Quad.fromRect(rectF));
    }

    public synchronized void stop() {
        if (this.f21898e.compareAndSet(false, true)) {
            this.f21895b.m12763a(this.f21894a);
        } else if (!this.f21901h) {
            ((VideoProviderSource) this.f21896c.getFilter("camera")).forceClose();
        }
    }

    public void suspend() {
    }

    /* renamed from: a */
    final synchronized void m16334a() {
        if (!this.f21901h) {
            this.f21896c.getRunner().stop();
            this.f21896c.getRunner().tearDown();
            this.f21901h = true;
        }
    }

    public String toString() {
        return "BurstAcquisitionPipeline";
    }
}
