package p000;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zc */
final class zc implements PictureCallback {
    /* renamed from: a */
    public final /* synthetic */ aaf f9562a;
    /* renamed from: b */
    private final /* synthetic */ Handler f9563b;
    /* renamed from: c */
    private final /* synthetic */ yu f9564c;

    zc(yu yuVar, Handler handler, aaf aaf) {
        this.f9564c = yuVar;
        this.f9563b = handler;
        this.f9562a = aaf;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        if (this.f9564c.f19755a.f19748e.m74a() == 8) {
            this.f9564c.f19755a.f19748e.m75a(2);
        } else {
            abx.m91e(yo.f19743a, "picture callback returning when not capturing");
        }
        this.f9563b.post(new zd(this, bArr));
    }
}
