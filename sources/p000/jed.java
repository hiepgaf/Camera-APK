package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jed */
final class jed implements jeg {
    /* renamed from: a */
    private final /* synthetic */ String f18743a;
    /* renamed from: b */
    private final /* synthetic */ float f18744b;
    /* renamed from: c */
    private final /* synthetic */ float f18745c = 0.0f;
    /* renamed from: d */
    private final /* synthetic */ float f18746d;
    /* renamed from: e */
    private final /* synthetic */ float f18747e;

    jed(String str, float f, float f2) {
        this.f18743a = str;
        this.f18744b = f;
        this.f18746d = f2;
        this.f18747e = 1.0f;
    }

    /* renamed from: a */
    public final void mo1988a(jfc jfc) {
        GLES20.glUniform4f(jfc.m17962a(this.f18743a), this.f18744b, 0.0f, this.f18746d, this.f18747e);
    }
}
