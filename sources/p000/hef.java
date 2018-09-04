package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: hef */
public final class hef implements hec {
    /* renamed from: a */
    private final int f17707a;
    /* renamed from: b */
    private final int f17708b;
    /* renamed from: c */
    private final Object[] f17709c;

    public hef(int i, int i2, Object... objArr) {
        this.f17707a = i;
        this.f17708b = i2;
        this.f17709c = objArr;
    }

    /* renamed from: a */
    public final String mo1726a(Resources resources) {
        return resources.getQuantityString(this.f17707a, this.f17708b, this.f17709c);
    }
}
