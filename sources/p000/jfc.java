package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jfc */
public final class jfc extends jfa {
    jfc(int i) {
        super(i);
    }

    public final void close() {
        GLES20.glDeleteProgram(this.e);
    }

    /* renamed from: a */
    public final int m17962a(String str) {
        return GLES20.glGetUniformLocation(this.e, str);
    }
}
