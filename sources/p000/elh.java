package p000;

/* compiled from: PG */
/* renamed from: elh */
public final class elh extends ejq {
    /* renamed from: e */
    private String f15271e;

    public elh() {
        this.f15271e = "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = 0.85;                                \n  if (texcolor.r < .0001) texcolor.a = 0.0;         \n  gl_FragColor = texcolor;                          \n}                                                   \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f15271e);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.b = ejq.m1802a(this.d, "aTextureCoord");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
    }
}
