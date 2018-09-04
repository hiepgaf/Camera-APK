package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aoc */
public final class aoc implements ads {
    /* renamed from: b */
    private final ads f19801b;

    public aoc(ads ads) {
        this.f19801b = (ads) aqe.m585a((Object) ads, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoc)) {
            return false;
        }
        return this.f19801b.equals(((aoc) obj).f19801b);
    }

    public final int hashCode() {
        return this.f19801b.hashCode();
    }

    /* renamed from: a */
    public final agn mo2591a(Context context, agn agn, int i, int i2) {
        any any = (any) agn.mo55b();
        agn alv = new alv(any.m6869b(), acc.m98a(context).f187a);
        agn a = this.f19801b.mo2591a(context, alv, i, i2);
        if (!alv.equals(a)) {
            alv.mo58e();
        }
        Bitmap bitmap = (Bitmap) a.mo55b();
        any.f10102a.f796a.m520a(this.f19801b, bitmap);
        return agn;
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        this.f19801b.mo21a(messageDigest);
    }
}
