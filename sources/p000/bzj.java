package p000;

import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.PdImageCallback;

/* compiled from: PG */
/* renamed from: bzj */
final class bzj extends PdImageCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11537a;
    /* renamed from: b */
    private final /* synthetic */ bze f11538b;

    bzj(bze bze, bzx bzx) {
        this.f11538b = bze;
        this.f11537a = bzx;
    }

    public final void ImageReady(int i, InterleavedReadViewU16 interleavedReadViewU16) {
        boolean z;
        kbg image = this.f11538b.f1749p.getImage();
        if (this.f11538b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        jri.m13154b(image.mo2084b(), (Object) "PdImageCallback::ImageReady() was invoked but corresponding client allocator's image is absent.");
        bli.m863a(bze.f1734a, String.format(null, "Merged PD image ready (shotId = %d)", new Object[]{Integer.valueOf(i)}));
        jri.m13154b(this.f11537a.mo599e().mo2084b(), (Object) "Got PD with no callback present");
        Object obj = (InterleavedReadViewU16) image.mo2081a();
        ((cae) this.f11537a.mo599e().mo2081a()).f1789a.mo3557a(obj);
    }

    public final void MergePdFailed(int i) {
        boolean z;
        String str = bze.f1734a;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(i);
        bli.m873e(str, String.format(null, "MergePD failed (shotId = %d)", objArr));
        if (this.f11538b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        jri.m13154b(this.f11537a.mo599e().mo2084b(), (Object) "Got PD with no callback present");
        cae cae = (cae) this.f11537a.mo599e().mo2081a();
        blr blr = new blr(String.format(null, "MergePD failed (shotId = %d)", new Object[]{r4}));
        cae.m1094a();
    }
}
