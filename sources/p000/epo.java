package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: epo */
final class epo extends epr {
    /* renamed from: a */
    private final int f15344a;
    /* renamed from: b */
    private final String f15345b;
    /* renamed from: c */
    private final boolean f15346c;
    /* renamed from: d */
    private final boolean f15347d;
    /* renamed from: e */
    private final float f15348e;
    /* renamed from: f */
    private final String f15349f;
    /* renamed from: g */
    private final String f15350g;
    /* renamed from: h */
    private final boolean f15351h;
    /* renamed from: i */
    private final float f15352i;
    /* renamed from: j */
    private final kbg f15353j;
    /* renamed from: k */
    private final Boolean f15354k;
    /* renamed from: l */
    private final Rect f15355l;
    /* renamed from: m */
    private final kbg f15356m;
    /* renamed from: n */
    private final Boolean f15357n;

    epo(int i, String str, boolean z, boolean z2, float f, String str2, String str3, boolean z3, float f2, kbg kbg, Boolean bool, Rect rect, kbg kbg2, Boolean bool2) {
        this.f15344a = i;
        this.f15345b = str;
        this.f15346c = z;
        this.f15347d = z2;
        this.f15348e = f;
        this.f15349f = str2;
        this.f15350g = str3;
        this.f15351h = z3;
        this.f15352i = f2;
        this.f15353j = kbg;
        this.f15354k = bool;
        this.f15355l = rect;
        this.f15356m = kbg2;
        this.f15357n = bool2;
    }

    /* renamed from: a */
    public final Rect mo1245a() {
        return this.f15355l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epr)) {
            return false;
        }
        epr epr = (epr) obj;
        if (this.f15344a == epr.mo1254j() && this.f15345b.equals(epr.mo1246b()) && this.f15346c == epr.mo1248d() && this.f15347d == epr.mo1251g() && Float.floatToIntBits(this.f15348e) == Float.floatToIntBits(epr.mo1258n()) && this.f15349f.equals(epr.mo1247c()) && this.f15350g.equals(epr.mo1250f()) && this.f15351h == epr.mo1249e() && Float.floatToIntBits(this.f15352i) == Float.floatToIntBits(epr.mo1255k()) && this.f15353j.equals(epr.mo1256l()) && this.f15354k.equals(epr.mo1257m()) && this.f15355l.equals(epr.mo1245a()) && this.f15356m.equals(epr.mo1253i()) && this.f15357n.equals(epr.mo1252h())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo1246b() {
        return this.f15345b;
    }

    /* renamed from: c */
    public final String mo1247c() {
        return this.f15349f;
    }

    /* renamed from: d */
    public final boolean mo1248d() {
        return this.f15346c;
    }

    /* renamed from: e */
    public final boolean mo1249e() {
        return this.f15351h;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((this.f15344a ^ 1000003) * 1000003) ^ this.f15345b.hashCode()) * 1000003;
        if (this.f15346c) {
            i = 1231;
        } else {
            i = 1237;
        }
        hashCode = (i ^ hashCode) * 1000003;
        if (this.f15347d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (((((((i ^ hashCode) * 1000003) ^ Float.floatToIntBits(this.f15348e)) * 1000003) ^ this.f15349f.hashCode()) * 1000003) ^ this.f15350g.hashCode()) * 1000003;
        if (this.f15351h) {
            i2 = 1231;
        }
        return ((((((((((((i ^ i2) * 1000003) ^ Float.floatToIntBits(this.f15352i)) * 1000003) ^ this.f15353j.hashCode()) * 1000003) ^ this.f15354k.hashCode()) * 1000003) ^ this.f15355l.hashCode()) * 1000003) ^ this.f15356m.hashCode()) * 1000003) ^ this.f15357n.hashCode();
    }

    /* renamed from: f */
    public final String mo1250f() {
        return this.f15350g;
    }

    /* renamed from: g */
    public final boolean mo1251g() {
        return this.f15347d;
    }

    /* renamed from: h */
    public final Boolean mo1252h() {
        return this.f15357n;
    }

    /* renamed from: i */
    public final kbg mo1253i() {
        return this.f15356m;
    }

    /* renamed from: j */
    public final int mo1254j() {
        return this.f15344a;
    }

    /* renamed from: k */
    public final float mo1255k() {
        return this.f15352i;
    }

    public final String toString() {
        int i = this.f15344a;
        String str = this.f15345b;
        boolean z = this.f15346c;
        boolean z2 = this.f15347d;
        float f = this.f15348e;
        String str2 = this.f15349f;
        String str3 = this.f15350g;
        boolean z3 = this.f15351h;
        float f2 = this.f15352i;
        String valueOf = String.valueOf(this.f15353j);
        String valueOf2 = String.valueOf(this.f15354k);
        String valueOf3 = String.valueOf(this.f15355l);
        String valueOf4 = String.valueOf(this.f15356m);
        String valueOf5 = String.valueOf(this.f15357n);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 288) + length2) + length3) + length4) + length5) + length6) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
        stringBuilder.append("DecorateAtTimeCaptureRequestData{mode=");
        stringBuilder.append(i);
        stringBuilder.append(", filename=");
        stringBuilder.append(str);
        stringBuilder.append(", frontFacing=");
        stringBuilder.append(z);
        stringBuilder.append(", isHDR=");
        stringBuilder.append(z2);
        stringBuilder.append(", zoom=");
        stringBuilder.append(f);
        stringBuilder.append(", flashSetting=");
        stringBuilder.append(str2);
        stringBuilder.append(", hdrPlusSetting=");
        stringBuilder.append(str3);
        stringBuilder.append(", gridLinesOn=");
        stringBuilder.append(z3);
        stringBuilder.append(", timerSeconds=");
        stringBuilder.append(f2);
        stringBuilder.append(", touchCoordinate=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", volumeButtonShutter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", activeSensorSize=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", meteringData=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", isSelfieFlashOn=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: l */
    public final kbg mo1256l() {
        return this.f15353j;
    }

    /* renamed from: m */
    public final Boolean mo1257m() {
        return this.f15354k;
    }

    /* renamed from: n */
    public final float mo1258n() {
        return this.f15348e;
    }
}
