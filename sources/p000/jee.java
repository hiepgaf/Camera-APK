package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jee */
final class jee implements izr {
    /* renamed from: a */
    private final int f18748a;

    jee(int i) {
        this.f18748a = i;
        GLES20.glEnableVertexAttribArray(i);
    }

    public final void close() {
        GLES20.glDisableVertexAttribArray(this.f18748a);
    }
}
