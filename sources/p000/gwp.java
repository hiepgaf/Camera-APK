package p000;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gwp */
public final class gwp implements eoc, eof, eoh, eol {
    /* renamed from: a */
    public static final long[] f17477a = new long[]{0, 150, 75, 150};
    /* renamed from: b */
    private static final String f17478b = bli.m862a("DoubleTwistCntrlr");
    /* renamed from: c */
    private final gkh f17479c;
    /* renamed from: d */
    private SensorEventListener f17480d;
    /* renamed from: e */
    private boolean f17481e;
    /* renamed from: f */
    private boolean f17482f;
    /* renamed from: g */
    private gyk f17483g;
    /* renamed from: h */
    private irs f17484h;
    /* renamed from: i */
    private boolean f17485i;

    private gwp(Context context, BottomBarController bottomBarController, gkh gkh, gyk gyk) {
        this.f17485i = true;
        this.f17479c = gkh;
        this.f17483g = gyk;
        this.f17482f = gyk.m2919a();
        this.f17480d = new gwq(this, (Vibrator) context.getSystemService("vibrator"), bottomBarController);
    }

    public gwp(Context context, BottomBarController bottomBarController, irs irs) {
        this(context, bottomBarController, new gkh(context), new gyk(context));
        this.f17484h = irs;
    }

    /* renamed from: f */
    public final void mo378f() {
        this.f17479c.m2587b(this.f17480d);
        this.f17480d = null;
    }

    /* renamed from: g */
    public final void mo379g() {
        this.f17485i = true;
        if (this.f17481e) {
            this.f17479c.m2587b(this.f17480d);
        }
    }

    /* renamed from: h */
    public final void mo380h() {
        this.f17482f = this.f17483g.m2919a();
        if (this.f17482f && this.f17481e) {
            this.f17479c.m2586a(this.f17480d);
        }
        this.f17485i = false;
    }

    /* renamed from: a */
    public final boolean m11618a(boolean z) {
        this.f17481e = z;
        if (this.f17485i) {
            return false;
        }
        if (this.f17482f && z) {
            String str = f17478b;
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("registering listener ");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            return this.f17479c.m2586a(this.f17480d);
        }
        valueOf = f17478b;
        String valueOf2 = String.valueOf(this);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        stringBuilder2.append("unregistering listener ");
        stringBuilder2.append(valueOf2);
        bli.m863a(valueOf, stringBuilder2.toString());
        this.f17479c.m2587b(this.f17480d);
        return false;
    }
}
