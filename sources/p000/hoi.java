package p000;

import android.graphics.Bitmap.CompressFormat;

/* compiled from: PG */
/* renamed from: hoi */
final class hoi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f6410a;
    /* renamed from: b */
    private final /* synthetic */ aqq f6411b;
    /* renamed from: c */
    private final /* synthetic */ hod f6412c;

    hoi(hod hod, byte[] bArr, aqq aqq) {
        this.f6412c = hod;
        this.f6410a = bArr;
        this.f6411b = aqq;
    }

    public final void run() {
        acj a = acc.m100b(this.f6412c.f21601b).m6281a(byte[].class);
        if (aqg.f865b == null) {
            aqg.f865b = new aqg().m611e().m596a();
        }
        acj a2 = a.m119a(aqg.f865b.m599a(alu.f19788b, (CompressFormat) aqe.m585a(CompressFormat.JPEG, "Argument must not be null")).m599a(alu.f19787a, Integer.valueOf(30))).m120a(this.f6410a);
        if (!a2.f236a.m605a(4)) {
            a2 = a2.m119a(aqg.m595b(afm.f412a));
        }
        if (!a2.f236a.m605a(256)) {
            if (aqg.f864a == null) {
                aqg.f864a = new aqg().m614h().m596a();
            }
            a2 = a2.m119a(aqg.f864a);
        }
        a2.m122a(this.f6411b, null);
    }
}
