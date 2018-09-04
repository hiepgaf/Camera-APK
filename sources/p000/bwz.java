package p000;

/* compiled from: PG */
/* renamed from: bwz */
public final class bwz extends bzx {
    /* renamed from: a */
    private final kbg f11376a;
    /* renamed from: b */
    private final kbg f11377b;
    /* renamed from: c */
    private final kbg f11378c;
    /* renamed from: d */
    private final kbg f11379d;
    /* renamed from: e */
    private final kbg f11380e;
    /* renamed from: f */
    private final kbg f11381f;
    /* renamed from: g */
    private final kbg f11382g;
    /* renamed from: h */
    private final kbg f11383h;
    /* renamed from: i */
    private final kbg f11384i;
    /* renamed from: j */
    private final kbg f11385j;

    public bwz(kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kbg kbg5, kbg kbg6, kbg kbg7, kbg kbg8, kbg kbg9, kbg kbg10) {
        this.f11376a = kbg;
        this.f11377b = kbg2;
        this.f11378c = kbg3;
        this.f11379d = kbg4;
        this.f11380e = kbg5;
        this.f11381f = kbg6;
        this.f11382g = kbg7;
        this.f11383h = kbg8;
        this.f11384i = kbg9;
        this.f11385j = kbg10;
    }

    /* renamed from: a */
    public final kbg mo595a() {
        return this.f11377b;
    }

    /* renamed from: b */
    public final kbg mo596b() {
        return this.f11380e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzx)) {
            return false;
        }
        bzx bzx = (bzx) obj;
        if (this.f11376a.equals(bzx.mo601g()) && this.f11377b.equals(bzx.mo595a()) && this.f11378c.equals(bzx.mo597c()) && this.f11379d.equals(bzx.mo600f()) && this.f11380e.equals(bzx.mo596b()) && this.f11381f.equals(bzx.mo599e()) && this.f11382g.equals(bzx.mo604j()) && this.f11383h.equals(bzx.mo602h()) && this.f11384i.equals(bzx.mo598d()) && this.f11385j.equals(bzx.mo603i())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final kbg mo597c() {
        return this.f11378c;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11376a.hashCode() ^ 1000003) * 1000003) ^ this.f11377b.hashCode()) * 1000003) ^ this.f11378c.hashCode()) * 1000003) ^ this.f11379d.hashCode()) * 1000003) ^ this.f11380e.hashCode()) * 1000003) ^ this.f11381f.hashCode()) * 1000003) ^ this.f11382g.hashCode()) * 1000003) ^ this.f11383h.hashCode()) * 1000003) ^ this.f11384i.hashCode()) * 1000003) ^ this.f11385j.hashCode();
    }

    /* renamed from: d */
    public final kbg mo598d() {
        return this.f11384i;
    }

    /* renamed from: e */
    public final kbg mo599e() {
        return this.f11381f;
    }

    /* renamed from: f */
    public final kbg mo600f() {
        return this.f11379d;
    }

    /* renamed from: g */
    public final kbg mo601g() {
        return this.f11376a;
    }

    /* renamed from: h */
    public final kbg mo602h() {
        return this.f11383h;
    }

    /* renamed from: i */
    public final kbg mo603i() {
        return this.f11385j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11376a);
        String valueOf2 = String.valueOf(this.f11377b);
        String valueOf3 = String.valueOf(this.f11378c);
        String valueOf4 = String.valueOf(this.f11379d);
        String valueOf5 = String.valueOf(this.f11380e);
        String valueOf6 = String.valueOf(this.f11381f);
        String valueOf7 = String.valueOf(this.f11382g);
        String valueOf8 = String.valueOf(this.f11383h);
        String valueOf9 = String.valueOf(this.f11384i);
        String valueOf10 = String.valueOf(this.f11385j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder stringBuilder = new StringBuilder((((((((((length + 185) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length());
        stringBuilder.append("ShotConfig{progressCallback=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", baseFrameCallback=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", exifMetadataCallback=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", postviewRgbCallback=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", dngCallback=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", pdCallback=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", yuvCallback=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", rgbCallback=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", jpegCallback=");
        stringBuilder.append(valueOf9);
        stringBuilder.append(", shotStatusCallback=");
        stringBuilder.append(valueOf10);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: j */
    public final kbg mo604j() {
        return this.f11382g;
    }
}
