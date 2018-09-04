package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jeb */
final class jeb implements jeg {
    /* renamed from: a */
    private final /* synthetic */ String f18741a;
    /* renamed from: b */
    private final /* synthetic */ float[] f18742b;

    jeb(String str, float[] fArr) {
        this.f18741a = str;
        this.f18742b = fArr;
    }

    /* renamed from: a */
    public final void mo1988a(jfc jfc) {
        GLES20.glUniformMatrix4fv(jfc.m17962a(this.f18741a), 0, false, this.f18742b, 0);
    }
}
