package p000;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jwy */
public final class jwy implements jxo {
    /* renamed from: a */
    public final kpw f19095a = kpw.m18056d();
    /* renamed from: b */
    private final AtomicBoolean f19096b = new AtomicBoolean(false);

    /* renamed from: a */
    public final /* synthetic */ OutputStream mo427a(jxn jxn) {
        if (!this.f19096b.getAndSet(true)) {
            return new jwz(this);
        }
        throw new IllegalStateException("BufferedArtifactRasterSink supports rasterizing only up to one artifact.");
    }
}
