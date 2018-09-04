package p000;

/* compiled from: PG */
/* renamed from: iod */
public final class iod {
    /* renamed from: a */
    private Integer f7210a;
    /* renamed from: b */
    private Integer f7211b;
    /* renamed from: c */
    private Integer f7212c;
    /* renamed from: d */
    private Integer f7213d;
    /* renamed from: e */
    private Integer f7214e;
    /* renamed from: f */
    private Integer f7215f;
    /* renamed from: g */
    private Integer f7216g;
    /* renamed from: h */
    private Integer f7217h;
    /* renamed from: i */
    private Integer f7218i;
    /* renamed from: j */
    private Integer f7219j;
    /* renamed from: k */
    private Integer f7220k;
    /* renamed from: l */
    private Integer f7221l;
    /* renamed from: m */
    private Integer f7222m;

    iod(byte b) {
        this();
    }

    /* renamed from: a */
    public final iod m3920a(int i) {
        this.f7210a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final iod m3921b(int i) {
        this.f7211b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final iod m3922c(int i) {
        this.f7212c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final iod m3923d(int i) {
        this.f7213d = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final ioc m3919a() {
        String str = "";
        if (this.f7210a == null) {
            str = String.valueOf(str).concat(" audioBitRate");
        }
        if (this.f7211b == null) {
            str = String.valueOf(str).concat(" audioChannels");
        }
        if (this.f7212c == null) {
            str = String.valueOf(str).concat(" audioCodec");
        }
        if (this.f7213d == null) {
            str = String.valueOf(str).concat(" audioSampleRate");
        }
        if (this.f7214e == null) {
            str = String.valueOf(str).concat(" fileFormat");
        }
        if (this.f7215f == null) {
            str = String.valueOf(str).concat(" quality");
        }
        if (this.f7216g == null) {
            str = String.valueOf(str).concat(" videoBitRate");
        }
        if (this.f7217h == null) {
            str = String.valueOf(str).concat(" videoCodec");
        }
        if (this.f7218i == null) {
            str = String.valueOf(str).concat(" videoCodecProfile");
        }
        if (this.f7219j == null) {
            str = String.valueOf(str).concat(" videoCodecLevel");
        }
        if (this.f7220k == null) {
            str = String.valueOf(str).concat(" videoFrameHeight");
        }
        if (this.f7221l == null) {
            str = String.valueOf(str).concat(" videoFrameRate");
        }
        if (this.f7222m == null) {
            str = String.valueOf(str).concat(" videoFrameWidth");
        }
        if (str.isEmpty()) {
            return new inw(this.f7210a.intValue(), this.f7211b.intValue(), this.f7212c.intValue(), this.f7213d.intValue(), this.f7214e.intValue(), this.f7215f.intValue(), this.f7216g.intValue(), this.f7217h.intValue(), this.f7218i.intValue(), this.f7219j.intValue(), this.f7220k.intValue(), this.f7221l.intValue(), this.f7222m.intValue());
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: e */
    public final iod m3924e(int i) {
        this.f7214e = Integer.valueOf(i);
        return this;
    }

    /* renamed from: f */
    public final iod m3925f(int i) {
        this.f7215f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: g */
    public final iod m3926g(int i) {
        this.f7216g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    public final iod m3927h(int i) {
        this.f7217h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    public final iod m3928i(int i) {
        this.f7219j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: j */
    public final iod m3929j(int i) {
        this.f7218i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: k */
    public final iod m3930k(int i) {
        this.f7220k = Integer.valueOf(i);
        return this;
    }

    /* renamed from: l */
    public final iod m3931l(int i) {
        this.f7221l = Integer.valueOf(i);
        return this;
    }

    /* renamed from: m */
    public final iod m3932m(int i) {
        this.f7222m = Integer.valueOf(i);
        return this;
    }
}
