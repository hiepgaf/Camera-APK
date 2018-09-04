package p000;

/* compiled from: PG */
/* renamed from: fmz */
final class fmz implements ixg {
    /* renamed from: a */
    private final /* synthetic */ fmw f16214a;

    fmz(fmw fmw) {
        this.f16214a = fmw;
    }

    /* renamed from: a */
    public final void mo1411a() {
        Object obj = (fyr) this.f16214a.f16210a.poll();
        jri.m13139a(obj, (Object) "ImageWriter.ImageListener#onInputImageReleased called, but there are no in-flight images!");
        obj.close();
    }
}
