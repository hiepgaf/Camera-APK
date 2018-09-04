package p000;

import android.util.Log;

/* renamed from: hqz */
final /* synthetic */ class hqz implements Runnable {
    /* renamed from: a */
    private final hqx f6462a;
    /* renamed from: b */
    private final byte[] f6463b;

    hqz(hqx hqx, byte[] bArr) {
        this.f6462a = hqx;
        this.f6463b = bArr;
    }

    public final void run() {
        hqx hqx = this.f6462a;
        byte[] bArr = this.f6463b;
        if (!hqx.m15931g() || hqx.mo3103c()) {
            Log.w("LensServiceConnImpl", "ServiceEvent received after connection disposed.");
            return;
        }
        krn b = krn.m5104b();
        krl krl = hqj.f6447a;
        b.f8446b.put(new kro(krl.f8439a, krl.f8442d.f8456b), krl);
        try {
            Object obj;
            Object a = kry.m17797a(hqp.f23588c, bArr, b);
            if (a != null) {
                boolean z;
                boolean booleanValue = Boolean.TRUE.booleanValue();
                byte byteValue = ((Byte) a.mo3571a(go.bV, null)).byteValue();
                if (byteValue == (byte) 1) {
                    z = true;
                } else if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    boolean c = kto.f8542a.m5175a(a).mo2300c(a);
                    if (booleanValue) {
                        if (c) {
                            obj = a;
                        } else {
                            obj = null;
                        }
                        a.mo3571a(go.bW, obj);
                        z = c;
                    } else {
                        z = c;
                    }
                }
                if (!z) {
                    ksh ksh = new ksh(new jdh().getMessage());
                    if (ksh == null) {
                        throw null;
                    }
                    throw ksh;
                }
            }
            kry kry = (hqp) a;
            if (kry.f23591b == hqn.LENS_SERVICE_API_VERSION.f18084b) {
                krl a2 = kry.m17793a(hqj.f6447a);
                if (a2.f8439a != ((kry) kry.mo3571a(go.ca, null))) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                obj = kry.f23582g.m5120a(a2.f8442d);
                if (obj == null) {
                    obj = a2.f8440b;
                } else if (a2.f8442d.f8457c.f8614d == gcb.f5060j) {
                    ksf ksf = null;
                    obj = ksf.mo1772a(((Integer) obj).intValue());
                }
                hqx.f21610b = ((hqk) obj).f23517b;
                hqx.m15922a(3);
            }
        } catch (Throwable e) {
            Log.e("LensServiceConnImpl", "Unable to parse the protobuf.", e);
            hqx.m15922a(6);
        }
    }
}
