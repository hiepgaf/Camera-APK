package p000;

import android.app.Activity;
import android.content.Context;
import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* renamed from: gyl */
public final class gyl {
    /* renamed from: a */
    public static final String f5803a = bli.m862a("LensUtil");
    /* renamed from: b */
    public final Activity f5804b;
    /* renamed from: c */
    public final ikd f5805c;
    /* renamed from: d */
    public final LensApi f5806d;
    /* renamed from: e */
    public final kpw f5807e = kpw.m18056d();
    /* renamed from: f */
    private final bkw f5808f;

    gyl(Context context, Activity activity, ikd ikd, bkw bkw) {
        this.f5804b = activity;
        this.f5808f = bkw;
        this.f5806d = new LensApi(context);
        this.f5805c = ikd;
    }

    /* renamed from: a */
    public final kpk m2922a() {
        if (!ije.m3779a(this.f5808f.f1255a, "camera:google_lens_enabled", true)) {
            return kow.m13617a(Boolean.valueOf(false));
        }
        if (!this.f5807e.isDone()) {
            this.f5806d.checkLensAvailability(new gyo(this, System.currentTimeMillis()));
        }
        return this.f5807e;
    }

    /* renamed from: a */
    public static final /* synthetic */ Boolean m2920a(kpk kpk) {
        if (kpk.isDone()) {
            try {
                return (Boolean) kpk.get();
            } catch (Throwable e) {
                bli.m867b(f5803a, "Exception getting supposedly done Lens future", e);
            }
        }
        return Boolean.valueOf(false);
    }
}
