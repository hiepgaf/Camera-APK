package p000;

import android.net.Uri;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: glo */
public final class glo implements gln {
    /* renamed from: b */
    private static final String f17024b = bli.m862a("CaptureSessMgrImpl");
    /* renamed from: a */
    public final Map f17025a = new LinkedHashMap();
    /* renamed from: c */
    private final gnu f17026c;
    /* renamed from: d */
    private final ikd f17027d;
    /* renamed from: e */
    private final iya f17028e;
    /* renamed from: f */
    private final irs f17029f;

    public glo(gnu gnu, ikd ikd, iya iya, irs irs) {
        this.f17026c = gnu;
        this.f17027d = ikd;
        this.f17028e = iya;
        this.f17029f = irs;
    }

    /* renamed from: a */
    public final void mo1505a(glq glq) {
        this.f17027d.execute(new glp(this, glq));
    }

    /* renamed from: a */
    public final void mo1503a(Uri uri) {
        synchronized (this.f17025a) {
            gkr c = m11168c(uri);
        }
        if (c != null) {
            c.mo2878e();
        } else {
            bli.m873e(f17024b, "Session was already removed, cannot be finalized");
        }
    }

    /* renamed from: b */
    public final gkr mo1506b(Uri uri) {
        gkr gkr;
        synchronized (this.f17025a) {
            gkr = (gkr) this.f17025a.get(uri.toString());
        }
        return gkr;
    }

    /* renamed from: a */
    public final File mo1502a(String str) {
        return this.f17026c.mo1507a(str);
    }

    /* renamed from: a */
    public final void mo1504a(gkr gkr) {
        glm grj = new grj(this.f17029f, this.f17028e);
        ((grg) jri.m13152b(gkr.mo1482h())).mo1516a((grj) grj);
        gkr.mo2870a(grj);
        synchronized (this.f17025a) {
            this.f17025a.put(gkr.mo2887o().toString(), gkr);
        }
    }

    /* renamed from: c */
    private final gkr m11168c(Uri uri) {
        if (uri == null) {
            return null;
        }
        gkr gkr;
        synchronized (this.f17025a) {
            gkr = (gkr) this.f17025a.remove(uri.toString());
        }
        return gkr;
    }
}
