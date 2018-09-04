package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: elj */
public final class elj extends ejq {
    /* renamed from: e */
    public int f15274e;
    /* renamed from: f */
    private int f15275f;
    /* renamed from: g */
    private String f15276g;

    public elj() {
        this.f15276g = "precision mediump float;                            \nuniform float uBrightness;                          \nuniform float uAlpha;                               \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.rgb *= uBrightness * uAlpha;         \n  gl_FragColor.a = gl_FragColor.a * uAlpha;         \n}                                                   \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f15276g);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.b = ejq.m1802a(this.d, "aTextureCoord");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
        this.f15274e = ejq.m1804b(this.d, "uBrightness");
        this.f15275f = ejq.m1804b(this.d, "uAlpha");
        GLES20.glUseProgram(this.f3693d);
        GLES20.glUniform1f(this.f15274e, 0.5f);
        GLES20.glUniform1f(this.f15275f, 0.5f);
    }

    /* renamed from: a */
    public final void m9746a(float f) {
        GLES20.glUniform1f(this.f15275f, f);
    }
}
