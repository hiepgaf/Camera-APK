package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: amr */
public final class amr implements ads {
    /* renamed from: b */
    private final ads f19791b;
    /* renamed from: c */
    private final boolean f19792c;

    public amr(ads ads, boolean z) {
        this.f19791b = ads;
        this.f19792c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amr)) {
            return false;
        }
        return this.f19791b.equals(((amr) obj).f19791b);
    }

    public final int hashCode() {
        return this.f19791b.hashCode();
    }

    /* renamed from: a */
    public final agn mo2591a(Context context, agn agn, int i, int i2) {
        Drawable drawable = (Drawable) agn.mo55b();
        agn a = amp.m354a(acc.m98a(context).f187a, drawable, i, i2);
        if (a != null) {
            agn a2 = this.f19791b.mo2591a(context, a, i, i2);
            if (!a2.equals(a)) {
                return amv.m6657a(context.getResources(), a2);
            }
            a2.mo58e();
            return agn;
        } else if (!this.f19792c) {
            return agn;
        } else {
            String valueOf = String.valueOf(drawable);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("Unable to convert ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to a Bitmap");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        this.f19791b.mo21a(messageDigest);
    }
}
