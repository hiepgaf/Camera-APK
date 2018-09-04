package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: hia */
public final class hia implements kwk {
    /* renamed from: a */
    private final kwk f17898a;

    public hia(kwk kwk) {
        this.f17898a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        Intent intent = (Intent) this.f17898a.mo345a();
        if ("android.media.action.VIDEO_CAPTURE".equals(intent.getAction())) {
            obj = hhx.VIDEO_INTENT;
        } else if ("android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(intent.getAction())) {
            obj = hhx.IMAGE_INTENT;
        } else if ("android.media.action.VIDEO_CAMERA".equals(intent.getAction())) {
            obj = hhx.VIDEO;
        } else {
            obj = hhx.PHOTO;
        }
        return (hhx) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
