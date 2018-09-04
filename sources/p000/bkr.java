package p000;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: bkr */
public final class bkr implements koj {
    /* renamed from: a */
    private final /* synthetic */ iou f10992a;

    public bkr(iou iou) {
        this.f10992a = iou;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo419a(Object obj) {
        Location d;
        long longValue = ((Long) jri.m13152b((Long) obj)).longValue();
        if (longValue < 0) {
            ing ing = this.f10992a.f18469n;
            if (ing != null) {
                ing.mo2961a(true);
            }
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("The storage space is too low. available space (byte)=");
            stringBuilder.append(longValue);
            bli.m866b("VideoRecPreImp2", stringBuilder.toString());
        }
        this.f10992a.f18462g.m838a();
        if (this.f10992a.f18464i.mo2084b()) {
            longValue = Math.min(longValue, ((Long) this.f10992a.f18464i.mo2081a()).longValue());
        }
        if (this.f10992a.f18460e.mo2084b()) {
            d = ((hjw) this.f10992a.f18460e.mo2081a()).mo1244d();
        } else {
            d = null;
        }
        String b = this.f10992a.f18461f.m2814b(System.currentTimeMillis());
        iou iou = this.f10992a;
        iou.f18468m = iou.f18461f.m2811a(b, iou.f18457b.mo1896f().f7150c);
        b = String.valueOf(this.f10992a.f18468m.getPath());
        String str = "video will be save as ";
        if (b.length() == 0) {
            b = new String(str);
        } else {
            b = str.concat(b);
        }
        bli.m869c("VideoRecPreImp2", b);
        iou = this.f10992a;
        iou.f18467l = ((Integer) iou.f18459d.mo2860b()).intValue();
        iou iou2 = this.f10992a;
        iot iot = new iot(iou2.f18473r, iou2.f18458c, iou2.f18465j);
        iou2 = this.f10992a;
        iot.f7247d = iou2.f18457b;
        iot.f7246c = iou2.f18456a;
        iot.f7251h = this.f10992a.f18463h * 1000;
        iot.f7253j = this.f10992a.f18467l;
        iot.f7252i = longValue;
        if (d != null) {
            iot.f7259p = d;
        }
        if (this.f10992a.f18470o.mo2084b()) {
            Surface surface = (Surface) this.f10992a.f18470o.mo2081a();
            if (surface == null) {
                Log.e("VideoRecorderImpl", "Surface is not valid");
                throw new IllegalArgumentException("Surface is not valid");
            }
            if (iot.f7248e != iok.SURFACE) {
                Log.w("VideoRecorderImpl", "colorformat will be set to SURFACE as a surface is provided");
                iot.f7248e = iok.SURFACE;
            }
            iot.f7258o = surface;
        }
        if (this.f10992a.f18466k.mo2084b()) {
            iot.f7255l = ((ParcelFileDescriptor) this.f10992a.f18466k.mo2081a()).getFileDescriptor();
        } else {
            iot.f7254k = this.f10992a.f18468m;
        }
        iot.f7260q = this.f10992a.f18472q;
        return this.f10992a.f18473r.mo2198a(new bks(iot));
    }
}
