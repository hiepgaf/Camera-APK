package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: elk */
public final class elk extends ejq {
    /* renamed from: e */
    private int f15277e;
    /* renamed from: f */
    private String f15278f;

    public elk() {
        this.f15277e = 0;
        this.f15278f = "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f15278f);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.b = ejq.m1802a(this.d, "aTextureCoord");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
        this.f15277e = ejq.m1804b(this.d, "uAlphaFactor");
        GLES20.glUseProgram(this.f3693d);
        GLES20.glUniform1f(this.f15277e, 0.9f);
    }

    /* renamed from: a */
    public final void m9747a(float f) {
        GLES20.glUniform1f(this.f15277e, f);
    }
}
