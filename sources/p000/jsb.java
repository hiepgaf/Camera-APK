package p000;

import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jsb */
public class jsb implements Pipeline {
    /* renamed from: a */
    public final jrg f18999a;
    /* renamed from: b */
    public final jso f19000b;
    /* renamed from: c */
    public final jir[] f19001c;
    /* renamed from: d */
    public final jbj f19002d = jbj.m12751d();
    /* renamed from: e */
    private final jll f19003e;
    /* renamed from: f */
    private final jbj f19004f = jbj.m12751d();
    /* renamed from: g */
    private final jaq f19005g;

    public jsb(jrg jrg, jso jso, jll jll, jir... jirArr) {
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) jll);
        jri.m13152b((Object) jso);
        jri.m13152b((Object) jirArr);
        this.f18999a = jrg;
        this.f19003e = jll;
        this.f19000b = jso;
        this.f19001c = jirArr;
        this.f19005g = this.f19004f.mo1973a((Executor) jll, new jse(this)).mo1973a((Executor) jll, new jsc(this)).mo1973a((Executor) jll, new jsf(this)).mo1975a((Executor) jll, new jbc(new jsg())).mo1973a((Executor) jll, new jsd());
        this.f19002d.mo1980a(izw.f18704a);
    }

    public synchronized jaq process() {
        this.f19004f.m12763a(izg.f7590a);
        return this.f19005g;
    }

    public void resume() {
        this.f19003e.mo2036a();
    }

    public void stop() {
    }

    public void suspend() {
        this.f19003e.mo2037b();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f18999a);
        String valueOf2 = String.valueOf(this.f19000b);
        String valueOf3 = String.valueOf(this.f19003e);
        String arrays = Arrays.toString(this.f19001c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 93) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(arrays).length());
        stringBuilder.append("ArtifactGenerationPipeline[mediaFileStore=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", artifactFilter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", renderExecutor=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", artifactSpecs=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
