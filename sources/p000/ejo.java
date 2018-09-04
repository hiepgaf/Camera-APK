package p000;

import android.opengl.GLES20;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;

/* compiled from: PG */
/* renamed from: ejo */
public final class ejo {
    /* renamed from: a */
    public int f3688a = -1;

    public ejo(int i) {
        switch (i - 1) {
            case 0:
                this.f3688a = ejo.m1798c();
                return;
            case 1:
                this.f3688a = ejo.m1797b();
                return;
            default:
                this.f3688a = ejo.m1798c();
                return;
        }
    }

    /* renamed from: a */
    public final void m1799a() {
        int i = this.f3688a;
        if (i < 0) {
            throw new ejp("Trying to bind without a loaded texture");
        }
        GLES20.glBindTexture(3553, i);
        ejp.m1801a("glBindTexture");
    }

    /* renamed from: b */
    public static int m1797b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, WrapAxes.f2483S, WrapModes.CLAMP_TO_EDGE);
        GLES20.glTexParameteri(3553, WrapAxes.f2484T, WrapModes.CLAMP_TO_EDGE);
        return iArr[0];
    }

    /* renamed from: c */
    public static int m1798c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, WrapAxes.f2483S, WrapModes.CLAMP_TO_EDGE);
        GLES20.glTexParameteri(3553, WrapAxes.f2484T, WrapModes.CLAMP_TO_EDGE);
        return iArr[0];
    }

    /* renamed from: d */
    public final void m1800d() {
        GLES20.glDeleteTextures(1, new int[]{this.f3688a}, 0);
        this.f3688a = -1;
    }
}
