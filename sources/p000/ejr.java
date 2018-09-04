package p000;

/* compiled from: PG */
/* renamed from: ejr */
public final class ejr extends ejq {
    /* renamed from: e */
    private String f15207e;

    public ejr() {
        this.f15207e = "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord );  \n}                                                   \n";
        this.d = ejq.m1803a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", this.f15207e);
        this.a = ejq.m1802a(this.d, "aPosition");
        this.b = ejq.m1802a(this.d, "aTextureCoord");
        this.c = ejq.m1804b(this.d, "uMvpMatrix");
    }
}
