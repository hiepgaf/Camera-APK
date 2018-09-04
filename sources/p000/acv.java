package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: acv */
final class acv {
    /* renamed from: a */
    public final String f275a;
    /* renamed from: b */
    public final long[] f276b;
    /* renamed from: c */
    public File[] f277c;
    /* renamed from: d */
    public File[] f278d;
    /* renamed from: e */
    public boolean f279e;
    /* renamed from: f */
    public acu f280f;
    /* renamed from: g */
    public final /* synthetic */ acr f281g;

    acv(acr acr, String str) {
        this.f281g = acr;
        this.f275a = str;
        int i = acr.f257b;
        this.f276b = new long[i];
        this.f277c = new File[i];
        this.f278d = new File[i];
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('.');
        int length = stringBuilder.length();
        for (i = 0; i < acr.f257b; i++) {
            stringBuilder.append(i);
            this.f277c[i] = new File(acr.f256a, stringBuilder.toString());
            stringBuilder.append(".tmp");
            this.f278d[i] = new File(acr.f256a, stringBuilder.toString());
            stringBuilder.setLength(length);
        }
    }

    /* renamed from: a */
    public final String m142a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long j : this.f276b) {
            stringBuilder.append(' ');
            stringBuilder.append(j);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static IOException m141a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        String str = "unexpected journal line: ";
        throw new IOException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
