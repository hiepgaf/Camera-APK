package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaCompleteCallback;
import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.GoudaProgressCallback;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.clientallocator.MapInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.MapYuvClientAllocator;

/* compiled from: PG */
/* renamed from: gcy */
final class gcy implements fow {
    /* renamed from: a */
    public GoudaProgressCallback f16779a;
    /* renamed from: b */
    public GoudaCompleteCallback f16780b;
    /* renamed from: c */
    public GoudaImageCallback f16781c;
    /* renamed from: d */
    public GoudaImageCallback f16782d;
    /* renamed from: e */
    public GoudaImageCallback f16783e;
    /* renamed from: f */
    public MapInterleavedU8ClientAllocator f16784f;
    /* renamed from: g */
    public MapYuvClientAllocator f16785g;
    /* renamed from: h */
    public MapInterleavedU8ClientAllocator f16786h;
    /* renamed from: i */
    public final /* synthetic */ gcv f16787i;
    /* renamed from: j */
    private final /* synthetic */ long f16788j;
    /* renamed from: k */
    private final /* synthetic */ gdv f16789k;
    /* renamed from: l */
    private final /* synthetic */ boolean f16790l;
    /* renamed from: m */
    private final /* synthetic */ ExifMetadata f16791m;
    /* renamed from: n */
    private final /* synthetic */ boolean f16792n;
    /* renamed from: o */
    private final /* synthetic */ boolean f16793o;
    /* renamed from: p */
    private final /* synthetic */ InterleavedReadViewU8 f16794p;
    /* renamed from: q */
    private final /* synthetic */ GoudaRequest f16795q;
    /* renamed from: r */
    private final /* synthetic */ InterleavedReadViewU16 f16796r;

    gcy(gcv gcv, long j, gdv gdv, boolean z, ExifMetadata exifMetadata, boolean z2, boolean z3, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, InterleavedReadViewU16 interleavedReadViewU16) {
        this.f16787i = gcv;
        this.f16788j = j;
        this.f16789k = gdv;
        this.f16790l = z;
        this.f16791m = exifMetadata;
        this.f16792n = z2;
        this.f16793o = z3;
        this.f16794p = interleavedReadViewU8;
        this.f16795q = goudaRequest;
        this.f16796r = interleavedReadViewU16;
    }

    /* renamed from: a */
    public final kpk mo568a() {
        kpk d = kpw.m18056d();
        String str = gcv.f16763a;
        long j = this.f16788j;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Processing shot ");
        stringBuilder.append(j);
        bli.m863a(str, stringBuilder.toString());
        this.f16787i.f16764b.execute(new gcz(this, this.f16789k, d, this.f16790l, this.f16791m, this.f16792n, this.f16793o, this.f16788j, this.f16794p, this.f16795q, this.f16796r));
        return d;
    }

    /* renamed from: b */
    public final kpk mo569b() {
        return kow.m13617a(Boolean.valueOf(false));
    }
}
