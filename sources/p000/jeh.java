package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jeh */
public final class jeh {
    /* renamed from: a */
    private static final int[] f7741a = new int[1];

    /* renamed from: a */
    public static int m4430a(int i) {
        GLES20.glGetIntegerv(i, f7741a, 0);
        return f7741a[0];
    }
}
