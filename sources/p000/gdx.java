package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.imageproc.Resample;

/* compiled from: PG */
/* renamed from: gdx */
final class gdx implements Runnable {
    /* renamed from: a */
    private final InterleavedReadViewU8 f5102a;
    /* renamed from: b */
    private final kpw f5103b;
    /* renamed from: c */
    private final int f5104c;
    /* renamed from: d */
    private final int f5105d;
    /* renamed from: e */
    private final float f5106e;

    public gdx(InterleavedReadViewU8 interleavedReadViewU8, kpw kpw, int i, int i2, float f) {
        this.f5102a = interleavedReadViewU8;
        this.f5103b = kpw;
        this.f5104c = i;
        this.f5105d = i2;
        this.f5106e = f;
    }

    public final void run() {
        Object interleavedImageU8 = new InterleavedImageU8(this.f5104c, this.f5105d, this.f5102a.num_channels());
        if (Resample.resampleLanczos(this.f5102a, this.f5106e, interleavedImageU8)) {
            bli.m863a(gdw.f16836a, "Gouda image upsampled successfully.");
            this.f5103b.mo3557a(interleavedImageU8);
            return;
        }
        bli.m866b(gdw.f16836a, "Error upsampling gouda image");
        this.f5103b.m17780a(new RuntimeException("Image couldn't be upsampled."));
    }
}
