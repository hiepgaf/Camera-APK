package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: ejs */
public final class ejs extends ejq {
    /* renamed from: e */
    private int f15208e;
    /* renamed from: f */
    private String f15209f;

    public ejs() {
        this.f15209f = "precision mediump float;                       \nuniform vec4 uDrawColor;                       \nvoid main()                                    \n{                                              \n  gl_FragColor = uDrawColor;                   \n}                                              \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   gl_PointSize = 5.5;                      \n}                                           \n", this.f15209f);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
        this.f15208e = ejq.m1804b(this.d, "uDrawColor");
    }

    /* renamed from: b */
    public final void m9717b(float[] fArr) {
        GLES20.glUseProgram(this.f3693d);
        GLES20.glUniform4f(this.f15208e, fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
