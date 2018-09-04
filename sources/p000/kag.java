package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: kag */
public final class kag extends kac implements jqr, kah {
    public kag(jqr jqr) {
        this((kae) jqr);
    }

    private kag(kae kae) {
        super((jzx) kae);
    }

    private kag(kag kag) {
        super((kac) kag);
    }

    public kag(kag kag, byte b) {
        this(kag);
    }

    public final void close() {
        super.close();
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3502a(jzx jzx) {
        ((kae) jzx).close();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo3190d() {
        return super.mo3190d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo3191e() {
        return super.mo3191e();
    }

    /* renamed from: a */
    public final int mo3496a() {
        return ((Bitmap) super.mo3191e()).getHeight();
    }

    /* renamed from: b */
    public final int mo3498b() {
        return ((Bitmap) super.mo3191e()).getWidth();
    }

    public final kah D_() {
        return new kag(this);
    }

    public final /* synthetic */ kai E_() {
        return D_();
    }

    /* renamed from: c */
    public final int mo3499c() {
        return ((Bitmap) super.mo3191e()).getAllocationByteCount();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
