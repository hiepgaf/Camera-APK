package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: amy */
public final class amy implements adq {
    /* renamed from: a */
    private final ans f9895a;
    /* renamed from: b */
    private final agw f9896b;

    public amy(ans ans, agw agw) {
        this.f9895a = ans;
        this.f9896b = agw;
    }

    /* renamed from: a */
    public final /* synthetic */ agn mo101a(Object obj, int i, int i2, adp adp) {
        agn a = this.f9895a.m6853a((Uri) obj);
        if (a == null) {
            return null;
        }
        return amp.m354a(this.f9896b, (Drawable) a.mo55b(), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo102a(Object obj, adp adp) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
