package p000;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: evl */
final class evl {
    /* renamed from: a */
    private final /* synthetic */ evb f4272a;

    evl(evb evb) {
        this.f4272a = evb;
    }

    /* renamed from: a */
    final jfx m2143a() {
        jfx jfx;
        synchronized (this.f4272a.f15593a) {
            jri.m13154b(true, (Object) "Trying to use an available input buffer twice");
            jfw jfw = ((jgb) jri.m13152b(this.f4272a.f15598f)).f18765a;
            if (jfw.f7784d != null) {
                throw new AssertionError("MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
            }
            Object obj;
            int a = jfw.m4453a();
            if (a < 0) {
                obj = null;
            } else {
                ByteBuffer inputBuffer = jfw.f7781a.getInputBuffer(a);
                if (inputBuffer == null) {
                    obj = null;
                } else {
                    int capacity = inputBuffer.capacity();
                    Image inputImage = jfw.f7781a.getInputImage(a);
                    if (inputImage == null) {
                        obj = null;
                    } else {
                        obj = new jfs(jfw, inputImage, capacity, a);
                    }
                }
            }
            jfx = (jfx) jri.m13139a(obj, (Object) "Couldn't fetch input buffer from codec even though we got a callback");
        }
        return jfx;
    }
}
