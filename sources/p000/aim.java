package p000;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: aim */
public final class aim implements ajz {
    /* renamed from: a */
    private static final int f9813a = 22;
    /* renamed from: b */
    private final AssetManager f9814b;
    /* renamed from: c */
    private final ain f9815c;

    public aim(AssetManager assetManager, ain ain) {
        this.f9814b = assetManager;
        this.f9815c = ain;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        return new aka(new arf(uri), this.f9815c.mo90a(this.f9814b, uri.toString().substring(f9813a)));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo89a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
