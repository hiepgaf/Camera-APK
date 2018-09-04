package p000;

import android.media.Image.Plane;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: itw */
public final class itw implements ixa {
    /* renamed from: a */
    private final int f18578a;
    /* renamed from: b */
    private final int f18579b;
    /* renamed from: c */
    private final ByteBuffer f18580c;

    public itw(Plane plane) {
        this.f18578a = plane.getPixelStride();
        this.f18579b = plane.getRowStride();
        this.f18580c = plane.getBuffer();
    }

    /* renamed from: a */
    public final ByteBuffer mo637a() {
        return this.f18580c;
    }

    /* renamed from: b */
    public final int mo638b() {
        return this.f18578a;
    }

    /* renamed from: c */
    public final int mo639c() {
        return this.f18579b;
    }
}
