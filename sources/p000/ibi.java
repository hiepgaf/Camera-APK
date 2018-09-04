package p000;

import java.util.Arrays;

/* renamed from: ibi */
public final class ibi extends ibm {
    /* renamed from: a */
    public byte[] f21653a;
    /* renamed from: b */
    public String f21654b;
    /* renamed from: c */
    public double f21655c;
    /* renamed from: d */
    public float f21656d;
    /* renamed from: e */
    public long f21657e;
    /* renamed from: f */
    public int f21658f;
    /* renamed from: g */
    public int f21659g;
    /* renamed from: h */
    public boolean f21660h;
    /* renamed from: i */
    public ibg[] f21661i;
    /* renamed from: j */
    public ibh[] f21662j;
    /* renamed from: k */
    public String[] f21663k;
    /* renamed from: l */
    public long[] f21664l;
    /* renamed from: m */
    public float[] f21665m;
    /* renamed from: n */
    public long f21666n;

    public ibi() {
        this.f21653a = ibs.f6918f;
        this.f21654b = "";
        this.f21655c = 0.0d;
        this.f21656d = 0.0f;
        this.f21657e = 0;
        this.f21658f = 0;
        this.f21659g = 0;
        this.f21660h = false;
        this.f21661i = ibg.m15974b();
        this.f21662j = ibh.m15977b();
        this.f21663k = ibs.f6916d;
        this.f21664l = ibs.f6914b;
        this.f21665m = ibs.f6915c;
        this.f21666n = 0;
        this.o = null;
        this.p = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibi)) {
            return false;
        }
        ibi ibi = (ibi) obj;
        if (!Arrays.equals(this.f21653a, ibi.f21653a)) {
            return false;
        }
        String str = this.f21654b;
        if (str != null) {
            if (!str.equals(ibi.f21654b)) {
                return false;
            }
        } else if (ibi.f21654b != null) {
            return false;
        }
        return (Double.doubleToLongBits(this.f21655c) == Double.doubleToLongBits(ibi.f21655c) && Float.floatToIntBits(this.f21656d) == Float.floatToIntBits(ibi.f21656d) && this.f21657e == ibi.f21657e && this.f21658f == ibi.f21658f && this.f21659g == ibi.f21659g && this.f21660h == ibi.f21660h && ibq.m3654a(this.f21661i, ibi.f21661i) && ibq.m3654a(this.f21662j, ibi.f21662j) && ibq.m3654a(this.f21663k, ibi.f21663k) && ibq.m3653a(this.f21664l, ibi.f21664l) && ibq.m3651a(this.f21665m, ibi.f21665m) && this.f21666n == ibi.f21666n) ? (this.o == null || this.o.m3640a()) ? ibi.o == null || ibi.o.m3640a() : this.o.equals(ibi.o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f21653a)) * 31;
        String str = this.f21654b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f21655c);
        int floatToIntBits = Float.floatToIntBits(this.f21656d);
        long j = this.f21657e;
        hashCode = (((((((((((hashCode2 + hashCode) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + floatToIntBits) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + this.f21658f) * 31) + this.f21659g) * 31;
        hashCode2 = !this.f21660h ? 1237 : 1231;
        floatToIntBits = ibq.m3648a(this.f21661i);
        int a = ibq.m3648a(this.f21662j);
        int a2 = ibq.m3648a(this.f21663k);
        int a3 = ibq.m3647a(this.f21664l);
        int a4 = ibq.m3645a(this.f21665m);
        long j2 = this.f21666n;
        hashCode2 = (((((((((((((hashCode2 + hashCode) * 31) + floatToIntBits) * 31) + a) * 31) + a2) * 31) + a3) * 31) + a4) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        ibr ibr;
        int i;
        int i2 = 0;
        int a = super.mo1800a();
        if (!Arrays.equals(this.f21653a, ibs.f6918f)) {
            a += ibl.m3626b(1, this.f21653a);
        }
        String str = this.f21654b;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(2, this.f21654b);
        }
        if (Double.doubleToLongBits(this.f21655c) != Double.doubleToLongBits(0.0d)) {
            a += ibl.m3627c(24) + 8;
        }
        if (Float.floatToIntBits(this.f21656d) != Float.floatToIntBits(0.0f)) {
            a += ibl.m3627c(32) + 4;
        }
        long j = this.f21657e;
        if (j != 0) {
            a += ibl.m3623b(5, j);
        }
        int i3 = this.f21658f;
        if (i3 != 0) {
            a += ibl.m3622b(6, i3);
        }
        i3 = this.f21659g;
        if (i3 != 0) {
            a += ibl.m3627c(ibl.m3629d(i3)) + ibl.m3627c(56);
        }
        if (this.f21660h) {
            a += ibl.m3627c(64) + 1;
        }
        ibg[] ibgArr = this.f21661i;
        if (ibgArr != null && ibgArr.length > 0) {
            i3 = a;
            a = 0;
            while (true) {
                ibg[] ibgArr2 = this.f21661i;
                if (a >= ibgArr2.length) {
                    break;
                }
                ibr = ibgArr2[a];
                if (ibr != null) {
                    i3 += ibl.m3624b(9, ibr);
                }
                a++;
            }
            a = i3;
        }
        ibh[] ibhArr = this.f21662j;
        if (ibhArr == null) {
            i = a;
        } else if (ibhArr.length > 0) {
            i3 = 0;
            while (true) {
                ibh[] ibhArr2 = this.f21662j;
                if (i3 >= ibhArr2.length) {
                    break;
                }
                ibr = ibhArr2[i3];
                if (ibr != null) {
                    a += ibl.m3624b(10, ibr);
                }
                i3++;
            }
            i = a;
        } else {
            i = a;
        }
        String[] strArr = this.f21663k;
        if (strArr == null) {
            i3 = i;
        } else if (strArr.length > 0) {
            a = 0;
            i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f21663k;
                if (a >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[a];
                if (str2 != null) {
                    i4++;
                    i3 += ibl.m3617a(str2);
                }
                a++;
            }
            i3 = (i + i3) + i4;
        } else {
            i3 = i;
        }
        long[] jArr = this.f21664l;
        if (jArr != null && jArr.length > 0) {
            a = 0;
            while (true) {
                long[] jArr2 = this.f21664l;
                i = jArr2.length;
                if (i2 >= i) {
                    break;
                }
                a += ibl.m3628c(jArr2[i2]);
                i2++;
            }
            i3 = (a + i3) + i;
        }
        long j2 = this.f21666n;
        if (j2 != 0) {
            i3 += ibl.m3623b(13, j2);
        }
        float[] fArr = this.f21665m;
        if (fArr == null) {
            return i3;
        }
        a = fArr.length;
        return a > 0 ? ((a << 2) + i3) + a : i3;
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        long doubleToLongBits;
        ibr ibr;
        int i = 0;
        if (!Arrays.equals(this.f21653a, ibs.f6918f)) {
            ibl.m3636a(1, this.f21653a);
        }
        String str = this.f21654b;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(2, this.f21654b);
        }
        if (Double.doubleToLongBits(this.f21655c) != Double.doubleToLongBits(0.0d)) {
            double d = this.f21655c;
            ibl.m3639c(3, 1);
            doubleToLongBits = Double.doubleToLongBits(d);
            if (ibl.f6903a.remaining() < 8) {
                throw new amx(ibl.f6903a.position(), ibl.f6903a.limit());
            }
            ibl.f6903a.putLong(doubleToLongBits);
        }
        if (Float.floatToIntBits(this.f21656d) != Float.floatToIntBits(0.0f)) {
            ibl.m3631a(4, this.f21656d);
        }
        doubleToLongBits = this.f21657e;
        if (doubleToLongBits != 0) {
            ibl.m3633a(5, doubleToLongBits);
        }
        int i2 = this.f21658f;
        if (i2 != 0) {
            ibl.m3632a(6, i2);
        }
        i2 = this.f21659g;
        if (i2 != 0) {
            ibl.m3639c(7, 0);
            ibl.m3637b(ibl.m3629d(i2));
        }
        boolean z = this.f21660h;
        if (z) {
            ibl.m3639c(8, 0);
            if (ibl.f6903a.hasRemaining()) {
                ibl.f6903a.put(z);
            } else {
                throw new amx(ibl.f6903a.position(), ibl.f6903a.limit());
            }
        }
        ibg[] ibgArr = this.f21661i;
        if (ibgArr != null && ibgArr.length > 0) {
            i2 = 0;
            while (true) {
                ibg[] ibgArr2 = this.f21661i;
                if (i2 >= ibgArr2.length) {
                    break;
                }
                ibr = ibgArr2[i2];
                if (ibr != null) {
                    ibl.m3634a(9, ibr);
                }
                i2++;
            }
        }
        ibh[] ibhArr = this.f21662j;
        if (ibhArr != null && ibhArr.length > 0) {
            i2 = 0;
            while (true) {
                ibh[] ibhArr2 = this.f21662j;
                if (i2 >= ibhArr2.length) {
                    break;
                }
                ibr = ibhArr2[i2];
                if (ibr != null) {
                    ibl.m3634a(10, ibr);
                }
                i2++;
            }
        }
        String[] strArr = this.f21663k;
        if (strArr != null && strArr.length > 0) {
            i2 = 0;
            while (true) {
                String[] strArr2 = this.f21663k;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    ibl.m3635a(11, str2);
                }
                i2++;
            }
        }
        long[] jArr = this.f21664l;
        if (jArr != null && jArr.length > 0) {
            i2 = 0;
            while (true) {
                long[] jArr2 = this.f21664l;
                if (i2 >= jArr2.length) {
                    break;
                }
                ibl.m3633a(12, jArr2[i2]);
                i2++;
            }
        }
        doubleToLongBits = this.f21666n;
        if (doubleToLongBits != 0) {
            ibl.m3633a(13, doubleToLongBits);
        }
        float[] fArr = this.f21665m;
        if (fArr != null && fArr.length > 0) {
            while (true) {
                fArr = this.f21665m;
                if (i >= fArr.length) {
                    break;
                }
                ibl.m3631a(14, fArr[i]);
                i++;
            }
        }
        super.mo1801a(ibl);
    }
}
