package p000;

/* compiled from: PG */
/* renamed from: fih */
class fih extends fiw {
    /* renamed from: a */
    private final /* synthetic */ fie f16057a;

    fih(fie fie) {
        this.f16057a = fie;
    }

    /* renamed from: a */
    public void mo508a(fhq fhq) {
        synchronized (this.f16057a.f16049c) {
            fie fie = this.f16057a;
            fie.f16051e++;
            fie.f16050d++;
            if (fie.f16050d >= fie.f16047a) {
                fie.f16050d = 0;
                fie.f16048b.mo519e("Backing off");
                fie = this.f16057a;
                fie.f16051e--;
            }
        }
        try {
            this.f16057a.m10408a();
        } catch (isr e) {
        }
    }
}
