package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: alz */
public final class alz extends alw {
    /* renamed from: b */
    private static final byte[] f22584b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    public final boolean equals(Object obj) {
        return obj instanceof alz;
    }

    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }

    /* renamed from: a */
    protected final Bitmap mo3350a(agw agw, Bitmap bitmap, int i, int i2) {
        return anb.m369b(agw, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        messageDigest.update(f22584b);
    }
}
