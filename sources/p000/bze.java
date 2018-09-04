package p000;

import android.util.DisplayMetrics;
import com.google.googlex.gcam.BaseFrameCallback;
import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.PdImageCallback;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.ProgressCallback;
import com.google.googlex.gcam.ShotStatusCallback;
import com.google.googlex.gcam.clientallocator.UniqueBitmapClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueYuvClientAllocator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bze */
public final class bze {
    /* renamed from: a */
    public static final String f1734a = bli.m862a("HdrPShotParams");
    /* renamed from: b */
    public final fwa f1735b;
    /* renamed from: c */
    public final List f1736c;
    /* renamed from: d */
    public final List f1737d;
    /* renamed from: e */
    public final ProgressCallback f1738e;
    /* renamed from: f */
    public final ShotStatusCallback f1739f;
    /* renamed from: g */
    public final BaseFrameCallback f1740g;
    /* renamed from: h */
    public final PostviewCallback f1741h;
    /* renamed from: i */
    public final PdImageCallback f1742i;
    /* renamed from: j */
    public final EncodedBlobCallback f1743j;
    /* renamed from: k */
    public final FinalImageCallback f1744k;
    /* renamed from: l */
    public final EncodedBlobCallback f1745l;
    /* renamed from: m */
    public final UniqueBitmapClientAllocator f1746m;
    /* renamed from: n */
    public final UniqueInterleavedU8ClientAllocator f1747n = new UniqueInterleavedU8ClientAllocator();
    /* renamed from: o */
    public final UniqueYuvClientAllocator f1748o = new UniqueYuvClientAllocator();
    /* renamed from: p */
    public final UniqueInterleavedU16ClientAllocator f1749p = new UniqueInterleavedU16ClientAllocator();
    /* renamed from: q */
    public final bzx f1750q;
    /* renamed from: r */
    public iqo f1751r;
    /* renamed from: s */
    private int f1752s = go.f5588z;
    /* renamed from: t */
    private final AtomicReference f1753t = new AtomicReference(kau.f19138a);
    /* renamed from: u */
    private final Object f1754u = new Object();

    public bze(bzx bzx, DisplayMetrics displayMetrics, fwa fwa, int i, grk grk, bku bku, bmh bmh) {
        this.f1750q = bzx;
        this.f1735b = fwa;
        this.f1736c = new ArrayList();
        this.f1737d = new ArrayList();
        this.f1738e = new bzf(bzx);
        this.f1739f = new bzg(this, i, bku, bmh, grk, bzx, fwa);
        this.f1740g = new bzh(this, bzx);
        this.f1746m = new UniqueBitmapClientAllocator(displayMetrics);
        this.f1741h = new bzi(this, bzx);
        this.f1742i = new bzj(this, bzx);
        this.f1743j = new bzk(this, bzx);
        this.f1744k = new bzl(this, bzx);
        this.f1745l = new bzm(this, bzx);
    }

    /* renamed from: a */
    final void m1080a(ExifMetadata exifMetadata) {
        synchronized (this.f1754u) {
            if (this.f1750q.mo597c().mo2084b() && !((kbg) this.f1753t.getAndSet(kbg.m4745c(exifMetadata))).mo2084b()) {
                ((cab) this.f1750q.mo597c().mo2081a()).f1783a.mo3557a((Object) exifMetadata);
            }
        }
    }

    /* renamed from: a */
    public final void m1079a() {
        if (this.f1750q.mo599e().mo2084b()) {
            cae cae = (cae) this.f1750q.mo599e().mo2081a();
            blr blr = new blr(String.format(null, "MergePD failed (notified by command)", new Object[0]));
            cae.m1094a();
        }
    }
}
