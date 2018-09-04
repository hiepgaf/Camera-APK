package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.pipeline.Pipeline;

/* compiled from: PG */
/* renamed from: jsl */
public class jsl implements Pipeline {
    /* renamed from: a */
    public final FeatureTable f19010a;
    /* renamed from: b */
    public final jbj f19011b;
    /* renamed from: c */
    private final jif f19012c;
    /* renamed from: d */
    private boolean f19013d = false;

    public jsl(jif jif, FeatureTable featureTable) {
        this.f19010a = featureTable;
        jri.m13152b((Object) jif);
        this.f19012c = jif;
        this.f19011b = jbj.m12751d();
    }

    public jaq process() {
        if (this.f19012c.mo2004a() > 0) {
            this.f19012c.mo2005a(new jsm(this));
        } else {
            this.f19011b.m12763a(this.f19010a);
        }
        return this.f19011b;
    }

    /* renamed from: a */
    final synchronized void m13179a() {
        if (!this.f19013d) {
            this.f19012c.mo2006b();
            this.f19013d = true;
        }
    }

    public void resume() {
    }

    public synchronized void stop() {
        if (!this.f19013d && this.f19012c.mo2004a() > 0) {
            this.f19012c.mo2007c();
        }
    }

    public void suspend() {
    }

    public String toString() {
        return "FeatureExtractionPipeline";
    }
}
