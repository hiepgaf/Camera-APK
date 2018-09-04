package p000;

import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;

/* compiled from: PG */
/* renamed from: cic */
final class cic implements iqo {
    /* renamed from: a */
    private final /* synthetic */ chz f12020a;

    cic(chz chz) {
        this.f12020a = chz;
    }

    public final void close() {
        SurfaceTextureStreamer surfaceTextureStreamer = this.f12020a.f12002b;
        if (surfaceTextureStreamer != null) {
            surfaceTextureStreamer.close();
        }
    }
}
