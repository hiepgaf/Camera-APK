package p000;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;

/* compiled from: PG */
/* renamed from: hej */
final class hej implements Callback2 {
    /* renamed from: a */
    private final /* synthetic */ hei f6090a;

    hej(hei hei) {
        this.f6090a = hei;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        boolean z = false;
        iqp iqp = new iqp(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        ipz a = ipz.m4019b(iqp).m4024a();
        iqz iqz = this.f6090a.f17714b;
        String valueOf = String.valueOf(iqp);
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf2).length());
        stringBuilder.append("SurfaceEvent: surfaceChanged (newSize: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", newRatio: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" )");
        iqz.mo514b(stringBuilder.toString());
        iqz iqz2 = this.f6090a.f17714b;
        int width = surfaceFrame.width();
        int height = surfaceFrame.height();
        StringBuilder stringBuilder2 = new StringBuilder(68);
        stringBuilder2.append("SurfaceEvent: surfaceChanged (surfaceFrame: ");
        stringBuilder2.append(width);
        stringBuilder2.append("x");
        stringBuilder2.append(height);
        stringBuilder2.append(")");
        iqz2.mo514b(stringBuilder2.toString());
        if (!this.f6090a.f17720h.isDone()) {
            boolean b;
            iqz iqz3;
            hei hei = this.f6090a;
            if (surface.isValid()) {
                a = ipz.m4019b(iqp).m4024a();
                ipz a2 = hei.f17718f.f6106b.m4024a();
                b = kbf.m16436b(a, a2);
                if (!b) {
                    iqz3 = hei.f17714b;
                    valueOf2 = String.valueOf(a.m4024a());
                    String valueOf3 = String.valueOf(a2.m4024a());
                    StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf2).length() + 47) + String.valueOf(valueOf3).length());
                    stringBuilder3.append("Aspect ratios do not match! surface: ");
                    stringBuilder3.append(valueOf2);
                    stringBuilder3.append(" preview: ");
                    stringBuilder3.append(valueOf3);
                    iqz3.mo519e(stringBuilder3.toString());
                }
            } else {
                b = false;
            }
            if (b) {
                hei hei2 = this.f6090a;
                iqz3 = hei2.f17714b;
                String valueOf4 = String.valueOf(hei2.f17718f.f6105a);
                StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(valueOf4).length() + 47);
                stringBuilder4.append("Setting fixed size after surfaceChanged event: ");
                stringBuilder4.append(valueOf4);
                iqz3.mo518d(stringBuilder4.toString());
                gsg gsg = this.f6090a.f17719g;
                if (gsg.f17297c == 0) {
                    z = true;
                }
                jri.m13154b(z, (Object) "Accidental session reuse.");
                iya iya = gsg.m;
                gsg.f17297c = SystemClock.elapsedRealtimeNanos();
                gsg.m1328a("Surface Start", gsg.f17295a, "Surface Ready", gsg.f17297c);
                hei2 = this.f6090a;
                hmz hmz = hei2.f17715c;
                iqp iqp2 = hei2.f17718f.f6105a;
                hmz.mo1744a(iqp2.f7329a, iqp2.f7330b);
                hei2 = this.f6090a;
                hei2.f17721i = hei2.f17713a.mo1742a(hei2.f17715c.getHolder(), this.f6090a.f17718f.f6105a.m4051e());
                hei2 = this.f6090a;
                hei2.f17721i.mo3093a(hei2.f17716d.mo1448f());
                hei2 = this.f6090a;
                hei2.f17720h.mo3616b(hei2.f17721i.mo3091a());
            }
        }
        hmx hmx = this.f6090a.f17721i;
        if (hmx != null) {
            hmx.mo3092a(iqp.m4051e());
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        boolean z;
        this.f6090a.f17714b.mo514b("SurfaceEvent: surfaceCreated");
        gsg gsg = this.f6090a.f17719g;
        if (gsg.f17296b == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Accidental session reuse.");
        iya iya = gsg.m;
        gsg.f17296b = SystemClock.elapsedRealtimeNanos();
        gsg.m1327a("Surface Created", gsg.f17295a, gsg.f17296b);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        hmx hmx = this.f6090a.f17721i;
        if (hmx != null) {
            hmx.close();
            this.f6090a.f17721i = null;
        }
        this.f6090a.f17714b.mo514b("SurfaceEvent: surfaceDestroyed");
        if (!this.f6090a.f17720h.isDone()) {
            this.f6090a.f17714b.mo520f("A previous future exists, but the active Surface object is null. Setting exception. Surface has been destroyed.");
            this.f6090a.f17720h.m17780a(new isr("Surface has been destroyed."));
        }
        this.f6090a.f17717e.run();
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f6090a.f17714b.mo514b("SurfaceEvent: surfaceRedrawNeeded");
    }
}
