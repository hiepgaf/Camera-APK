package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: frv */
final class frv implements kaw {
    /* renamed from: a */
    private final hju f16481a;

    public frv(hju hju) {
        this.f16481a = hju;
    }

    /* renamed from: a */
    private final foz m10717a(fkp fkp) {
        jri.m13152b((Object) fkp);
        try {
            iqm b;
            iwp iwp = (iwp) koz.m5028a((Future) jri.m13152b(fkp.m17318h()), TimeoutException.class, TimeUnit.MILLISECONDS);
            hju hju = this.f16481a;
            ixa ixa = (ixa) fkp.mo2718e().get(0);
            byte[] bArr = new byte[ixa.mo637a().capacity()];
            ixa.mo637a().get(bArr);
            itg itg = new itg(itg.m4194a(bArr));
            iqm a = isx.m4158a(isx.m4159a(itg.f7455a));
            Integer num = (Integer) iwp.mo3143a(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                b = iqm.m4039b(num.intValue() - a.f7326e);
            } else {
                b = iqm.CLOCKWISE_0;
            }
            iqp a2 = new iqp(fkp.mo2720g(), fkp.mo2717d()).m4047a(b);
            itg.m4199a(a2.f7329a, a2.f7330b, a, kbg.m4745c(iwp));
            Object a3 = foz.m2358a(fkp.mo2719f(), bArr, a2, a.f7326e, itg.f7455a, hju, true);
            fkp.close();
            return (foz) jri.m13152b(a3);
        } catch (TimeoutException e) {
            throw new kqf("Timeout reterieving image metadata.");
        } catch (Throwable th) {
            fkp.close();
        }
    }
}
