package p000;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.GoudaSwigWrapper;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcv */
public final class gcv implements gds {
    /* renamed from: a */
    public static final String f16763a = bli.m862a("GoudaCtrlr");
    /* renamed from: b */
    public final Executor f16764b;
    /* renamed from: c */
    public final bsn f16765c;
    /* renamed from: d */
    public final Object f16766d = new Object();
    /* renamed from: e */
    public final kbg f16767e;
    /* renamed from: f */
    public boolean f16768f = false;
    /* renamed from: g */
    public final GoudaSwigWrapper f16769g;
    /* renamed from: h */
    public gdt f16770h;
    /* renamed from: i */
    private final fov f16771i;
    /* renamed from: j */
    private final goy f16772j;
    /* renamed from: k */
    private final boolean f16773k;
    /* renamed from: l */
    private final gdg f16774l;
    /* renamed from: m */
    private final boolean f16775m;
    /* renamed from: n */
    private gdu f16776n;

    public gcv(GoudaSwigWrapper goudaSwigWrapper, fov fov, Executor executor, goy goy, boolean z, bsn bsn, Context context, kbg kbg) {
        synchronized (this.f16766d) {
            this.f16769g = goudaSwigWrapper;
        }
        this.f16771i = fov;
        this.f16764b = executor;
        this.f16772j = goy;
        this.f16773k = z;
        this.f16765c = bsn;
        this.f16775m = bsn.m954a(gdp.f5095e);
        this.f16767e = kbg;
        this.f16774l = new gdg(context, new gcx(this, goy));
    }

    /* renamed from: a */
    public final boolean mo1454a(boolean z) {
        hdz hdz = this.f16774l;
        if (!hdz.f6085h) {
            return false;
        }
        if (z) {
            hdz.m3086a();
        } else {
            hdz.mo1775c();
        }
        gdt gdt = this.f16770h;
        if (gdt != null) {
            gdt.f5096a.mo348a(Boolean.valueOf(false));
            gdt.f5097b.m10996d();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1451a() {
        synchronized (this.f16766d) {
            if (this.f16768f) {
                bli.m873e(f16763a, "init() called on an already initialized PortraitController.");
                return;
            }
            this.f16764b.execute(new gcw(this));
        }
    }

    /* renamed from: b */
    public final void mo1455b() {
        this.f16774l.m3088b();
    }

    /* renamed from: a */
    public final kpk mo1450a(long j, InterleavedReadViewU8 interleavedReadViewU8, InterleavedReadViewU16 interleavedReadViewU16, GoudaRequest goudaRequest, boolean z, boolean z2, boolean z3, ExifMetadata exifMetadata, gdv gdv) {
        synchronized (this.f16766d) {
            if (this.f16769g == null || !this.f16768f) {
                kpk a = kow.m13618a(new isr("Controller hasn't been initialized"));
                return a;
            }
            String str = f16763a;
            String valueOf = String.valueOf(this.f16771i.f16278a.mo2860b());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
            stringBuilder.append("Submitting task ");
            stringBuilder.append(j);
            stringBuilder.append(", already in queue: ");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            goudaRequest.setEmbed_gdepth_metadata(this.f16775m);
            return this.f16771i.m10590a(new gcy(this, j, gdv, z2, exifMetadata, z, z3, interleavedReadViewU8, goudaRequest, interleavedReadViewU16));
        }
    }

    /* renamed from: a */
    public final void mo1452a(gdt gdt) {
        this.f16770h = gdt;
    }

    /* renamed from: a */
    public final void mo1453a(gdu gdu) {
        this.f16776n = gdu;
    }

    /* renamed from: c */
    public final void mo1456c() {
        if (!this.f16773k && this.f16772j.m2693a("gouda_tutorial_dismiss") <= 0) {
            gdu gdu = this.f16776n;
            if (gdu != null) {
                gdu.f5098a.f21001c.mo2757l().m9605a(this.f16774l, LayoutInflater.from(gdu.f5098a.f21011m));
                gdt gdt = this.f16770h;
                if (gdt != null) {
                    synchronized (gdt.f5097b.f16827e) {
                        gdt.f5097b.m10994b();
                        gdt.f5097b.f16829g = false;
                        gdt.f5096a.mo348a(Boolean.valueOf(true));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static kbg m10972a(String str) {
        if (kbi.m4752a(str)) {
            return kau.f19138a;
        }
        try {
            return kbg.m4745c(we.m6119a(str));
        } catch (wb e) {
            bli.m866b(f16763a, "String was not a serialized XMPMeta.");
            return kau.f19138a;
        }
    }
}
