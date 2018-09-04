package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: icb */
public final class icb extends ibz {
    /* renamed from: a */
    private final ich f18160a;

    public icb(ich ich) {
        this.f18160a = ich;
    }

    /* renamed from: a */
    public final void mo1804a(Status status) {
        this.f18160a.m16019b(status);
    }

    /* renamed from: a */
    public final void mo1805a(icx icx, boolean z) {
        ick ick = this.f18160a;
        icx.f6937a.put(ick, Boolean.valueOf(z));
        huv huv = new huv(icx, ick);
        htl.m3436b(true, (Object) "Callback cannot be null.");
        synchronized (ick.f18167g) {
            if (ick.m12068b()) {
                huv.m3492a();
            } else {
                ick.f18168h.add(huv);
            }
        }
    }

    /* renamed from: a */
    public final void mo1806a(ief ief) {
        this.f18160a.m16020b(ief.f21718a);
    }
}
