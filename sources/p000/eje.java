package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.WindowManager;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: eje */
public final class eje {
    /* renamed from: g */
    private static final String f3655g = bli.m862a("CameraSetupAgent");
    /* renamed from: a */
    public final Handler f3656a;
    /* renamed from: b */
    public aah f3657b = null;
    /* renamed from: c */
    public aag f3658c;
    /* renamed from: d */
    public boolean f3659d;
    /* renamed from: e */
    public boolean f3660e = false;
    /* renamed from: f */
    private abw f3661f;
    /* renamed from: h */
    private SurfaceTexture f3662h = new SurfaceTexture(100);

    public eje(aah aah, Handler handler) {
        this.f3657b = aah;
        this.f3656a = handler;
    }

    /* renamed from: a */
    public final synchronized abw m1761a(WindowManager windowManager, Context context, aag aag, boolean z, int i) {
        abw abw = null;
        synchronized (this) {
            this.f3658c = aag;
            this.f3659d = true;
            aah aah = this.f3657b;
            if (aah == null) {
                bli.m869c(f3655g, "Camera is null");
            } else if (aah.mo2566d().m74a() == 1) {
                bli.m869c(f3655g, "Camera is closed");
            } else {
                aaz e = this.f3657b.mo2567e();
                this.f3657b.mo2560a(false);
                if (z && i != 0) {
                    iqm b;
                    abo i2 = this.f3657b.mo2571i();
                    if (ejh.m1767a(context, e) == abc.AUTO) {
                        this.f3660e = true;
                    }
                    i2.f151q = ejh.m1767a(context, e);
                    i2.f150p = ejh.m1766a(e);
                    i2.f152r = ejh.m1771c(e);
                    i2.mo2577a(1.0f);
                    ejg a = ejf.m1763a(e, i);
                    this.f3661f = a.f3667a;
                    i2.m69b(this.f3661f);
                    ejh.m1769a(e, i2);
                    i2.f159y = new abw(0, 0);
                    i2.m65a(100);
                    i2.m67a(a.f3668b);
                    switch (windowManager.getDefaultDisplay().getRotation()) {
                        case 0:
                            b = iqm.m4039b(0);
                            break;
                        case 1:
                            b = iqm.m4039b(90);
                            break;
                        case 2:
                            b = iqm.m4039b(MediaDecoder.ROTATE_180);
                            break;
                        case 3:
                            b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                            break;
                        default:
                            b = iqm.CLOCKWISE_0;
                            break;
                    }
                    this.f3657b.m3a(b.m4041a());
                    this.f3657b.mo2562a(i2);
                    float f = e.f67u;
                    StringBuilder stringBuilder = new StringBuilder(40);
                    stringBuilder.append("Field of view reported = ");
                    stringBuilder.append(f);
                }
                this.f3657b.mo2555a(this.f3662h);
                if (this.f3659d) {
                    ejh.m1768a(this.f3657b, this.f3661f, this.f3656a, this.f3658c);
                } else {
                    this.f3657b.mo2556a(this.f3656a, this.f3658c);
                }
                abw = this.f3661f;
            }
        }
        return abw;
    }
}
