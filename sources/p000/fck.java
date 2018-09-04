package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: fck */
public final class fck {
    /* renamed from: a */
    private PointF f4468a;
    /* renamed from: b */
    private Integer f4469b;

    fck(byte b) {
        this();
    }

    /* renamed from: a */
    public final fcj m2249a() {
        String str = "";
        if (this.f4468a == null) {
            str = String.valueOf(str).concat(" normalizedCenterPoint");
        }
        if (this.f4469b == null) {
            str = String.valueOf(str).concat(" confidenceScore");
        }
        if (str.isEmpty()) {
            return new fdc(this.f4468a, this.f4469b.intValue());
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
    public final fck m2250a(int i) {
        this.f4469b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final fck m2251a(PointF pointF) {
        if (pointF == null) {
            throw new NullPointerException("Null normalizedCenterPoint");
        }
        this.f4468a = pointF;
        return this;
    }
}
