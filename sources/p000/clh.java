package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: clh */
public final class clh implements iqo {
    /* renamed from: a */
    public final Object f12152a = new Object();
    /* renamed from: b */
    public final Surface f12153b = new Surface(this.f12155d);
    /* renamed from: c */
    public final List f12154c = new ArrayList();
    /* renamed from: d */
    private final SurfaceTexture f12155d;

    public clh(SurfaceTexture surfaceTexture) {
        this.f12155d = surfaceTexture;
    }

    public final void close() {
        synchronized (this.f12152a) {
            for (iqo close : this.f12154c) {
                close.close();
            }
            this.f12153b.release();
            this.f12155d.release();
        }
    }
}
