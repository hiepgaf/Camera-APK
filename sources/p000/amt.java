package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: amt */
public final class amt extends alw {
    /* renamed from: b */
    private static final byte[] f22585b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    public final boolean equals(Object obj) {
        return obj instanceof amt;
    }

    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    /* renamed from: a */
    protected final Bitmap mo3350a(agw agw, Bitmap bitmap, int i, int i2) {
        return anb.m371c(agw, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        messageDigest.update(f22585b);
    }
}
