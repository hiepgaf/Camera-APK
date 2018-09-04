package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* compiled from: PG */
/* renamed from: bkc */
final class bkc implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ kpw f1231a;
    /* renamed from: b */
    public final /* synthetic */ kpw f1232b;
    /* renamed from: c */
    public final /* synthetic */ kpw f1233c;
    /* renamed from: d */
    public final /* synthetic */ bjz f1234d;
    /* renamed from: e */
    private final /* synthetic */ bhj f1235e;

    bkc(bjz bjz, bhj bhj, kpw kpw, kpw kpw2, kpw kpw3) {
        this.f1234d = bjz;
        this.f1235e = bhj;
        this.f1231a = kpw;
        this.f1232b = kpw2;
        this.f1233c = kpw3;
    }

    public final void run() {
        try {
            Object obj;
            int i;
            bhr bhr = this.f1234d.f20097c;
            iwn a = this.f1235e.m7380a(4);
            bhr.m821a(a);
            Range b = bhr.f1160b.mo437b();
            a.m4292a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, b);
            String str = bhr.f1159a;
            String valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
            stringBuilder.append(valueOf);
            bli.m869c(str, stringBuilder.toString());
            if (!bhr.f1162d.mo1885b()) {
                obj = null;
            } else if (((Boolean) bhr.f1161c.mo2860b()).booleanValue()) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i = 1;
            } else {
                i = 3;
            }
            a.m4292a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
            String str2 = bhr.f1159a;
            StringBuilder stringBuilder2 = new StringBuilder(27);
            stringBuilder2.append("CONTROL_AF_MODE=");
            stringBuilder2.append(i);
            bli.m871d(str2, stringBuilder2.toString());
            a.m4293a(this.f1234d.f20100f.mo3154g());
            a.m4292a(CaptureRequest.JPEG_QUALITY, this.f1234d.f20096b);
            a.m4292a(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((iqm) this.f1234d.f20102h.mo2860b()).f7326e));
            this.f1235e.m7382a(fiv.NON_REPEATING, a, new bhw(), new bkd(this));
        } catch (Throwable e) {
            this.f1232b.m17780a(e);
        }
    }
}
