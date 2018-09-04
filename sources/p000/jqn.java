package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: jqn */
public abstract class jqn extends jzw implements jqr {
    public jqn(Bitmap bitmap) {
        super(bitmap, (byte) 0);
    }

    /* renamed from: a */
    protected abstract void mo3589a(Bitmap bitmap);

    /* renamed from: a */
    public final int mo3496a() {
        return ((Bitmap) mo3191e()).getHeight();
    }

    /* renamed from: b */
    public final int mo3498b() {
        return ((Bitmap) mo3191e()).getWidth();
    }

    /* renamed from: c */
    public final int mo3499c() {
        return ((Bitmap) mo3191e()).getAllocationByteCount();
    }
}
