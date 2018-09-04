package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: grh */
public final class grh implements grg {
    /* renamed from: a */
    private static final String f17234a = bli.m862a("CaptureSessionSCI");
    /* renamed from: b */
    private long f17235b = 0;
    /* renamed from: c */
    private final irs f17236c;
    /* renamed from: d */
    private Boolean f17237d = Boolean.FALSE;
    /* renamed from: e */
    private ExifInterface f17238e;
    /* renamed from: f */
    private List f17239f;
    /* renamed from: g */
    private epl f17240g;
    /* renamed from: h */
    private grj f17241h = null;
    /* renamed from: i */
    private epu f17242i;
    /* renamed from: j */
    private Long f17243j;
    /* renamed from: k */
    private Long f17244k;
    /* renamed from: l */
    private Integer f17245l;
    /* renamed from: m */
    private klg f17246m;
    /* renamed from: n */
    private kkc f17247n;
    /* renamed from: o */
    private kln f17248o;
    /* renamed from: p */
    private Long f17249p;
    /* renamed from: q */
    private epr f17250q;

    public grh(irs irs) {
        this.f17236c = irs;
    }

    /* renamed from: a */
    public final void mo1514a(epr epr) {
        this.f17250q = epr;
    }

    /* renamed from: a */
    public final void mo1518a(kkc kkc) {
        this.f17247n = kkc;
    }

    /* renamed from: a */
    public final void mo1511a(long j) {
        this.f17243j = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo1515a(epu epu, Long l, Integer num) {
        this.f17242i = epu;
        this.f17244k = l;
        this.f17245l = num;
    }

    /* renamed from: a */
    public final void mo1519a(klg klg) {
        this.f17246m = klg;
    }

    /* renamed from: a */
    public final void mo1517a(iwp iwp) {
        Face[] faceArr = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
        if (faceArr == null) {
            this.f17239f = null;
        } else {
            this.f17239f = new ArrayList(r2);
            for (Face a : faceArr) {
                this.f17239f.add(gic.m2562a(a));
            }
        }
        iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE);
    }

    /* renamed from: b */
    public final void mo1523b(long j) {
        this.f17249p = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo1520a(kln kln) {
        this.f17248o = kln;
    }

    /* renamed from: a */
    public final void mo1512a(ExifInterface exifInterface) {
        this.f17238e = exifInterface;
    }

    /* renamed from: a */
    public final grj mo1510a() {
        return this.f17241h;
    }

    /* renamed from: b */
    public final void mo1522b() {
        this.f17235b = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo1524c() {
        m11385a(0);
    }

    /* renamed from: a */
    private final void m11385a(int i) {
        kla a;
        Object obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17235b;
        epl epl = this.f17240g;
        if (epl != null) {
            a = epl.m1946a();
        } else {
            a = null;
        }
        kln kln = this.f17248o;
        if (kln != null) {
            kln.f22371a = (int) elapsedRealtime;
        }
        epr epr = this.f17250q;
        if (epr == null) {
            obj = null;
        } else if (this.f17235b != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            int i2;
            boolean z;
            irs irs = this.f17236c;
            if (epr == null) {
                bli.m866b(f17234a, "inferMode called while atTimeRequestData not present yet");
                i2 = 0;
            } else if (kln != null) {
                i2 = 21;
            } else if (this.f17242i == null) {
                i2 = epr.mo1254j();
            } else {
                i2 = 7;
            }
            epr = this.f17250q;
            ExifInterface exifInterface = this.f17238e;
            if (epr == null) {
                z = true;
            } else if (epr.mo1252h().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                z = true;
            } else if (this.f17237d.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            z = Boolean.valueOf(z).booleanValue();
            Long l = this.f17244k;
            if (l != null) {
                elapsedRealtime = l.longValue();
            }
            irs.mo1573a(i2, epr, exifInterface, z, Float.valueOf(((float) elapsedRealtime) / 1000.0f), this.f17239f, a, i, this.f17242i, this.f17243j, this.f17245l, this.f17246m, this.f17247n, this.f17248o, this.f17249p);
        }
    }

    /* renamed from: d */
    public final void mo1525d() {
        m11385a(1);
    }

    /* renamed from: a */
    public final void mo1521a(boolean z) {
        this.f17237d = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo1513a(epl epl) {
        this.f17240g = epl;
    }

    /* renamed from: a */
    public final void mo1516a(grj grj) {
        this.f17241h = grj;
    }
}
