package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: eps */
public final class eps {
    /* renamed from: a */
    private Integer f4047a;
    /* renamed from: b */
    private String f4048b;
    /* renamed from: c */
    private Boolean f4049c;
    /* renamed from: d */
    private Boolean f4050d;
    /* renamed from: e */
    private Float f4051e;
    /* renamed from: f */
    private String f4052f;
    /* renamed from: g */
    private String f4053g;
    /* renamed from: h */
    private Boolean f4054h;
    /* renamed from: i */
    private Float f4055i;
    /* renamed from: j */
    private kbg f4056j;
    /* renamed from: k */
    private Boolean f4057k;
    /* renamed from: l */
    private Rect f4058l;
    /* renamed from: m */
    private kbg f4059m;
    /* renamed from: n */
    private Boolean f4060n;

    eps(byte b) {
        this();
        this.f4056j = kau.f19138a;
        this.f4059m = kau.f19138a;
    }

    /* renamed from: a */
    public final epr m1969a() {
        String str = "";
        if (this.f4047a == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (this.f4048b == null) {
            str = String.valueOf(str).concat(" filename");
        }
        if (this.f4049c == null) {
            str = String.valueOf(str).concat(" frontFacing");
        }
        if (this.f4050d == null) {
            str = String.valueOf(str).concat(" isHDR");
        }
        if (this.f4051e == null) {
            str = String.valueOf(str).concat(" zoom");
        }
        if (this.f4052f == null) {
            str = String.valueOf(str).concat(" flashSetting");
        }
        if (this.f4053g == null) {
            str = String.valueOf(str).concat(" hdrPlusSetting");
        }
        if (this.f4054h == null) {
            str = String.valueOf(str).concat(" gridLinesOn");
        }
        if (this.f4055i == null) {
            str = String.valueOf(str).concat(" timerSeconds");
        }
        if (this.f4057k == null) {
            str = String.valueOf(str).concat(" volumeButtonShutter");
        }
        if (this.f4058l == null) {
            str = String.valueOf(str).concat(" activeSensorSize");
        }
        if (this.f4060n == null) {
            str = String.valueOf(str).concat(" isSelfieFlashOn");
        }
        if (str.isEmpty()) {
            return new epo(this.f4047a.intValue(), this.f4048b, this.f4049c.booleanValue(), this.f4050d.booleanValue(), this.f4051e.floatValue(), this.f4052f, this.f4053g, this.f4054h.booleanValue(), this.f4055i.floatValue(), this.f4056j, this.f4057k, this.f4058l, this.f4059m, this.f4060n);
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

    /* renamed from: a */
    public final eps m1972a(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null activeSensorSize");
        }
        this.f4058l = rect;
        return this;
    }

    /* renamed from: a */
    public final eps m1974a(String str) {
        if (str == null) {
            throw new NullPointerException("Null filename");
        }
        this.f4048b = str;
        return this;
    }

    /* renamed from: b */
    public final eps m1979b(String str) {
        if (str == null) {
            throw new NullPointerException("Null flashSetting");
        }
        this.f4052f = str;
        return this;
    }

    /* renamed from: a */
    public final eps m1976a(boolean z) {
        this.f4049c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final eps m1981b(boolean z) {
        this.f4054h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final eps m1982c(String str) {
        if (str == null) {
            throw new NullPointerException("Null hdrPlusSetting");
        }
        this.f4053g = str;
        return this;
    }

    /* renamed from: c */
    public final eps m1983c(boolean z) {
        this.f4050d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final eps m1973a(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null isSelfieFlashOn");
        }
        this.f4060n = bool;
        return this;
    }

    /* renamed from: a */
    public final eps m1975a(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null meteringData");
        }
        this.f4059m = kbg;
        return this;
    }

    /* renamed from: a */
    public final eps m1971a(int i) {
        this.f4047a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final eps m1970a(float f) {
        this.f4055i = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final eps m1980b(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null touchCoordinate");
        }
        this.f4056j = kbg;
        return this;
    }

    /* renamed from: b */
    public final eps m1978b(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null volumeButtonShutter");
        }
        this.f4057k = bool;
        return this;
    }

    /* renamed from: b */
    public final eps m1977b(float f) {
        this.f4051e = Float.valueOf(f);
        return this;
    }
}
