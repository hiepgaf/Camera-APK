package p000;

import android.opengl.GLES20;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Target;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Usage;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdj */
final class jdj implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jdo f7720a;
    /* renamed from: b */
    private final /* synthetic */ int f7721b = Target.ARRAY_BUFFER;
    /* renamed from: c */
    private final /* synthetic */ int f7722c = 34964;
    /* renamed from: d */
    private final /* synthetic */ ByteBuffer f7723d;

    jdj(jdo jdo, ByteBuffer byteBuffer) {
        this.f7720a = jdo;
        this.f7723d = byteBuffer;
    }

    public final /* synthetic */ Object call() {
        jfj d = this.f7720a.mo3489d();
        int i = this.f7721b;
        int i2 = this.f7722c;
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        jet jet = new jet(d, iArr[0], i, i2);
        Buffer buffer = this.f7723d;
        jet.m17961b();
        jet.f23560c = buffer.limit();
        jet.f23561d = 0;
        GLES20.glBufferData(jet.f23559b, jet.f23560c, buffer, Usage.STATIC_DRAW);
        return jet;
    }

    public final String toString() {
        return "create-gl-buffer-with-static";
    }
}
