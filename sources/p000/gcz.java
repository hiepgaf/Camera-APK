package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaCallbacks;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.clientallocator.MapInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.MapYuvClientAllocator;

/* renamed from: gcz */
final /* synthetic */ class gcz implements Runnable {
    /* renamed from: a */
    private final gcy f5075a;
    /* renamed from: b */
    private final gdv f5076b;
    /* renamed from: c */
    private final kpw f5077c;
    /* renamed from: d */
    private final boolean f5078d;
    /* renamed from: e */
    private final ExifMetadata f5079e;
    /* renamed from: f */
    private final boolean f5080f;
    /* renamed from: g */
    private final boolean f5081g;
    /* renamed from: h */
    private final long f5082h;
    /* renamed from: i */
    private final InterleavedReadViewU8 f5083i;
    /* renamed from: j */
    private final GoudaRequest f5084j;
    /* renamed from: k */
    private final InterleavedReadViewU16 f5085k;

    gcz(gcy gcy, gdv gdv, kpw kpw, boolean z, ExifMetadata exifMetadata, boolean z2, boolean z3, long j, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, InterleavedReadViewU16 interleavedReadViewU16) {
        this.f5075a = gcy;
        this.f5076b = gdv;
        this.f5077c = kpw;
        this.f5078d = z;
        this.f5079e = exifMetadata;
        this.f5080f = z2;
        this.f5081g = z3;
        this.f5082h = j;
        this.f5083i = interleavedReadViewU8;
        this.f5084j = goudaRequest;
        this.f5085k = interleavedReadViewU16;
    }

    public final void run() {
        gcy gcy = this.f5075a;
        gdv gdv = this.f5076b;
        knk knk = this.f5077c;
        boolean z = this.f5078d;
        boolean z2 = this.f5080f;
        boolean z3 = this.f5081g;
        long j = this.f5082h;
        InterleavedReadViewU8 interleavedReadViewU8 = this.f5083i;
        GoudaRequest goudaRequest = this.f5084j;
        InterleavedReadViewU16 interleavedReadViewU16 = this.f5085k;
        try {
            synchronized (gcy.f16787i.f16766d) {
                if (gcy.f16787i.f16769g != null) {
                    gcy.f16779a = new gda(gdv);
                    gcy.f16780b = new gdb(knk, gdv);
                    gcy.f16781c = new gdc(gcy, gdv, z, z2, z3);
                    gcy.f16784f = new MapInterleavedU8ClientAllocator();
                    gcy.f16785g = new MapYuvClientAllocator();
                    GoudaCallbacks goudaCallbacks = new GoudaCallbacks();
                    goudaCallbacks.setProgress_callback(gcy.f16779a);
                    goudaCallbacks.setComplete_callback(gcy.f16780b);
                    goudaCallbacks.setImage_callback(gcy.f16781c);
                    goudaCallbacks.setRgb_allocator(gcy.f16784f);
                    goudaCallbacks.setYuv_allocator(gcy.f16785g);
                    if (gcy.f16787i.f16765c.m954a(gdp.f5091a)) {
                        gcy.f16782d = new gdd(gcy, gdv);
                        goudaCallbacks.setSecondary_image_callback(gcy.f16782d);
                    }
                    if (gcy.f16787i.f16765c.m954a(gdp.f5092b)) {
                        gcy.f16783e = new gde(gcy, gdv);
                        gcy.f16786h = new MapInterleavedU8ClientAllocator();
                        goudaCallbacks.setDebug_rgb_allocator(gcy.f16786h);
                        goudaCallbacks.setDebug_image_callback(gcy.f16783e);
                    }
                    gcy.f16787i.f16769g.Process(j, goudaCallbacks, interleavedReadViewU8, goudaRequest, interleavedReadViewU16);
                }
            }
        } catch (Throwable e) {
            bli.m867b(gcv.f16763a, "Error processing the input image:", e);
            knk.m17780a(e);
        }
    }
}
