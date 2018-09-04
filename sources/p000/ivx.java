package p000;

import android.os.Build;
import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: ivx */
public final class ivx {
    /* renamed from: a */
    public final boolean f7500a;
    /* renamed from: b */
    public final boolean f7501b;
    /* renamed from: c */
    public final boolean f7502c;
    /* renamed from: d */
    public final boolean f7503d;
    /* renamed from: e */
    public final boolean f7504e;

    private ivx(int i, String str) {
        boolean z;
        boolean z2 = false;
        if (i >= 21) {
        }
        if (i >= 23) {
            z = true;
        } else {
            z = false;
        }
        this.f7500a = z;
        if (i >= 24) {
            z = true;
        } else {
            z = false;
        }
        this.f7501b = z;
        if (i >= 26) {
            z = true;
        } else {
            z = false;
        }
        this.f7502c = z;
        if (i > 27) {
            z = true;
        } else if (i >= 27) {
            String str2 = "P";
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            if (str2.length() <= 4) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            if (str.charAt(0) > str2.charAt(0)) {
                z = true;
            } else if (str.startsWith(str2)) {
                z = true;
            } else if ("MASTER".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f7503d = z;
        if (this.f7502c && !this.f7503d) {
            z2 = true;
        }
        this.f7504e = z2;
    }

    /* renamed from: a */
    public static ivx m4268a() {
        int intValue;
        Integer valueOf = Integer.valueOf(VERSION.SDK_INT);
        String str = Build.ID;
        if (valueOf.intValue() > 0) {
            intValue = valueOf.intValue();
        } else {
            intValue = 1;
        }
        if (str == null) {
            str = "AAA01";
        }
        return new ivx(intValue, str);
    }
}
