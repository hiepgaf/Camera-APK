package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: heg */
public final class heg implements hec {
    /* renamed from: a */
    private final int f17710a;
    /* renamed from: b */
    private final Object[] f17711b;

    public heg(int i, Object... objArr) {
        this.f17710a = i;
        this.f17711b = objArr;
    }

    /* renamed from: a */
    public final String mo1726a(Resources resources) {
        return resources.getString(this.f17710a, this.f17711b);
    }
}
