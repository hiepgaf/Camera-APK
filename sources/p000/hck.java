package p000;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: hck */
public final class hck {
    /* renamed from: a */
    public Integer f5961a;
    /* renamed from: b */
    public Integer f5962b;
    /* renamed from: c */
    public Drawable f5963c;
    /* renamed from: d */
    public Boolean f5964d;
    /* renamed from: e */
    public Integer f5965e;
    /* renamed from: f */
    public Integer f5966f;
    /* renamed from: g */
    public Integer f5967g;
    /* renamed from: h */
    private Integer f5968h;
    /* renamed from: i */
    private Integer f5969i;
    /* renamed from: j */
    private Integer f5970j;
    /* renamed from: k */
    private Integer f5971k;
    /* renamed from: l */
    private Integer f5972l;
    /* renamed from: m */
    private Integer f5973m;
    /* renamed from: n */
    private Integer f5974n;
    /* renamed from: o */
    private Integer f5975o;
    /* renamed from: p */
    private hbf f5976p;

    hck(byte b) {
        this();
    }

    /* renamed from: a */
    final hck m3051a(boolean z) {
        this.f5964d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final hcj m3048a() {
        String str = "";
        if (this.f5968h == null) {
            str = String.valueOf(str).concat(" photoCircleRadius");
        }
        if (this.f5969i == null) {
            str = String.valueOf(str).concat(" photoCircleAlpha");
        }
        if (this.f5961a == null) {
            str = String.valueOf(str).concat(" photoCircleColor");
        }
        if (this.f5970j == null) {
            str = String.valueOf(str).concat(" videoDotRadius");
        }
        if (this.f5962b == null) {
            str = String.valueOf(str).concat(" videoCircleColor");
        }
        if (this.f5971k == null) {
            str = String.valueOf(str).concat(" stopSquareHalfSize");
        }
        if (this.f5972l == null) {
            str = String.valueOf(str).concat(" portraitInnerCircleRadius");
        }
        if (this.f5973m == null) {
            str = String.valueOf(str).concat(" portraitOuterCircleRadius");
        }
        if (this.f5974n == null) {
            str = String.valueOf(str).concat(" buttonImageRectHalfSize");
        }
        if (this.f5964d == null) {
            str = String.valueOf(str).concat(" animateRippleEffect");
        }
        if (this.f5965e == null) {
            str = String.valueOf(str).concat(" ripplePaintAlpha");
        }
        if (this.f5966f == null) {
            str = String.valueOf(str).concat(" rippleRadius");
        }
        if (this.f5967g == null) {
            str = String.valueOf(str).concat(" mainButtonColor");
        }
        if (this.f5975o == null) {
            str = String.valueOf(str).concat(" roundButtonRadius");
        }
        if (this.f5976p == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (str.isEmpty()) {
            return new hay(this.f5968h.intValue(), this.f5969i.intValue(), this.f5961a.intValue(), this.f5970j.intValue(), this.f5962b.intValue(), this.f5971k.intValue(), this.f5972l.intValue(), this.f5973m.intValue(), this.f5963c, this.f5974n.intValue(), this.f5964d.booleanValue(), this.f5965e.intValue(), this.f5966f.intValue(), this.f5967g.intValue(), this.f5975o.intValue(), this.f5976p);
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

    /* renamed from: b */
    public final int m3052b() {
        Integer num = this.f5974n;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"buttonImageRectHalfSize\" has not been set");
    }

    /* renamed from: a */
    final hck m3049a(int i) {
        this.f5974n = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    final hck m3053b(int i) {
        this.f5967g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final hbf m3054c() {
        hbf hbf = this.f5976p;
        if (hbf != null) {
            return hbf;
        }
        throw new IllegalStateException("Property \"mode\" has not been set");
    }

    /* renamed from: a */
    public final hck m3050a(hbf hbf) {
        if (hbf == null) {
            throw new NullPointerException("Null mode");
        }
        this.f5976p = hbf;
        return this;
    }

    /* renamed from: d */
    public final int m3056d() {
        Integer num = this.f5969i;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"photoCircleAlpha\" has not been set");
    }

    /* renamed from: c */
    final hck m3055c(int i) {
        this.f5969i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    final hck m3057d(int i) {
        this.f5961a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: e */
    public final int m3058e() {
        Integer num = this.f5968h;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"photoCircleRadius\" has not been set");
    }

    /* renamed from: e */
    final hck m3059e(int i) {
        this.f5968h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: f */
    public final int m3060f() {
        Integer num = this.f5972l;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"portraitInnerCircleRadius\" has not been set");
    }

    /* renamed from: f */
    final hck m3061f(int i) {
        this.f5972l = Integer.valueOf(i);
        return this;
    }

    /* renamed from: g */
    public final int m3062g() {
        Integer num = this.f5973m;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"portraitOuterCircleRadius\" has not been set");
    }

    /* renamed from: g */
    final hck m3063g(int i) {
        this.f5973m = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    final hck m3065h(int i) {
        this.f5965e = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    final hck m3067i(int i) {
        this.f5966f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    public final int m3064h() {
        Integer num = this.f5975o;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"roundButtonRadius\" has not been set");
    }

    /* renamed from: j */
    final hck m3069j(int i) {
        this.f5975o = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    public final int m3066i() {
        Integer num = this.f5971k;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"stopSquareHalfSize\" has not been set");
    }

    /* renamed from: k */
    final hck m3070k(int i) {
        this.f5971k = Integer.valueOf(i);
        return this;
    }

    /* renamed from: l */
    final hck m3071l(int i) {
        this.f5962b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: j */
    public final int m3068j() {
        Integer num = this.f5970j;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"videoDotRadius\" has not been set");
    }

    /* renamed from: m */
    final hck m3072m(int i) {
        this.f5970j = Integer.valueOf(i);
        return this;
    }
}
