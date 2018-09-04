package p000;

/* compiled from: PG */
/* renamed from: inw */
final class inw extends ioc {
    /* renamed from: a */
    private final int f21756a;
    /* renamed from: b */
    private final int f21757b;
    /* renamed from: c */
    private final int f21758c;
    /* renamed from: d */
    private final int f21759d;
    /* renamed from: e */
    private final int f21760e;
    /* renamed from: f */
    private final int f21761f;
    /* renamed from: g */
    private final int f21762g;
    /* renamed from: h */
    private final int f21763h;
    /* renamed from: i */
    private final int f21764i;
    /* renamed from: j */
    private final int f21765j;
    /* renamed from: k */
    private final int f21766k;
    /* renamed from: l */
    private final int f21767l;
    /* renamed from: m */
    private final int f21768m;

    inw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f21756a = i;
        this.f21757b = i2;
        this.f21758c = i3;
        this.f21759d = i4;
        this.f21760e = i5;
        this.f21761f = i6;
        this.f21762g = i7;
        this.f21763h = i8;
        this.f21764i = i9;
        this.f21765j = i10;
        this.f21766k = i11;
        this.f21767l = i12;
        this.f21768m = i13;
    }

    /* renamed from: a */
    public final int mo3126a() {
        return this.f21756a;
    }

    /* renamed from: b */
    public final int mo3127b() {
        return this.f21757b;
    }

    /* renamed from: c */
    public final int mo3128c() {
        return this.f21758c;
    }

    /* renamed from: d */
    public final int mo3129d() {
        return this.f21759d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ioc)) {
            return false;
        }
        ioc ioc = (ioc) obj;
        if (this.f21756a == ioc.mo3126a() && this.f21757b == ioc.mo3127b() && this.f21758c == ioc.mo3128c() && this.f21759d == ioc.mo3129d() && this.f21760e == ioc.mo3130e() && this.f21761f == ioc.mo3131f() && this.f21762g == ioc.mo3132g() && this.f21763h == ioc.mo3133h() && this.f21764i == ioc.mo3135j() && this.f21765j == ioc.mo3134i() && this.f21766k == ioc.mo3136k() && this.f21767l == ioc.mo3137l() && this.f21768m == ioc.mo3138m()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo3130e() {
        return this.f21760e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.f21756a ^ 1000003) * 1000003) ^ this.f21757b) * 1000003) ^ this.f21758c) * 1000003) ^ this.f21759d) * 1000003) ^ this.f21760e) * 1000003) ^ this.f21761f) * 1000003) ^ this.f21762g) * 1000003) ^ this.f21763h) * 1000003) ^ this.f21764i) * 1000003) ^ this.f21765j) * 1000003) ^ this.f21766k) * 1000003) ^ this.f21767l) * 1000003) ^ this.f21768m;
    }

    /* renamed from: f */
    public final int mo3131f() {
        return this.f21761f;
    }

    public final String toString() {
        int i = this.f21756a;
        int i2 = this.f21757b;
        int i3 = this.f21758c;
        int i4 = this.f21759d;
        int i5 = this.f21760e;
        int i6 = this.f21761f;
        int i7 = this.f21762g;
        int i8 = this.f21763h;
        int i9 = this.f21764i;
        int i10 = this.f21765j;
        int i11 = this.f21766k;
        int i12 = this.f21767l;
        int i13 = this.f21768m;
        StringBuilder stringBuilder = new StringBuilder(375);
        stringBuilder.append("SimpleCamcorderProfileProxy{audioBitRate=");
        stringBuilder.append(i);
        stringBuilder.append(", audioChannels=");
        stringBuilder.append(i2);
        stringBuilder.append(", audioCodec=");
        stringBuilder.append(i3);
        stringBuilder.append(", audioSampleRate=");
        stringBuilder.append(i4);
        stringBuilder.append(", fileFormat=");
        stringBuilder.append(i5);
        stringBuilder.append(", quality=");
        stringBuilder.append(i6);
        stringBuilder.append(", videoBitRate=");
        stringBuilder.append(i7);
        stringBuilder.append(", videoCodec=");
        stringBuilder.append(i8);
        stringBuilder.append(", videoCodecProfile=");
        stringBuilder.append(i9);
        stringBuilder.append(", videoCodecLevel=");
        stringBuilder.append(i10);
        stringBuilder.append(", videoFrameHeight=");
        stringBuilder.append(i11);
        stringBuilder.append(", videoFrameRate=");
        stringBuilder.append(i12);
        stringBuilder.append(", videoFrameWidth=");
        stringBuilder.append(i13);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: g */
    public final int mo3132g() {
        return this.f21762g;
    }

    /* renamed from: h */
    public final int mo3133h() {
        return this.f21763h;
    }

    /* renamed from: i */
    public final int mo3134i() {
        return this.f21765j;
    }

    /* renamed from: j */
    public final int mo3135j() {
        return this.f21764i;
    }

    /* renamed from: k */
    public final int mo3136k() {
        return this.f21766k;
    }

    /* renamed from: l */
    public final int mo3137l() {
        return this.f21767l;
    }

    /* renamed from: m */
    public final int mo3138m() {
        return this.f21768m;
    }
}
