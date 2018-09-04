package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jfd */
public final class jfd extends jfa {
    jfd(int i, String str) {
        super(i);
        GLES20.glShaderSource(this.e, str);
    }

    public final void close() {
        GLES20.glDeleteShader(this.e);
    }
}
