package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: eli */
public final class eli extends ejq {
    /* renamed from: e */
    private int f15272e;
    /* renamed from: f */
    private String f15273f;

    public eli() {
        this.f15272e = 0;
        this.f15273f = "precision mediump float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.a = gl_FragColor.a * uAlphaFactor;   \n}                                                   \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f15273f);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.b = ejq.m1802a(this.d, "aTextureCoord");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
        this.f15272e = ejq.m1804b(this.d, "uAlphaFactor");
        GLES20.glUseProgram(this.f3693d);
        GLES20.glUniform1f(this.f15272e, 1.0f);
    }

    /* renamed from: a */
    public final void m9745a(float f) {
        GLES20.glUniform1f(this.f15272e, f);
    }
}
