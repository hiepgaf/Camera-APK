package p000;

/* compiled from: PG */
/* renamed from: bfo */
final class bfo implements kov {
    /* renamed from: a */
    private final /* synthetic */ ken f10739a;
    /* renamed from: b */
    private final /* synthetic */ bfl f10740b;

    bfo(bfl bfl, ken ken) {
        this.f10740b = bfl;
        this.f10739a = ken;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = bfl.f19939a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
        stringBuilder.append("onFailure: ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        synchronized (this.f10740b.f19945g) {
            ken ken = this.f10739a;
            int size = ken.size();
            int i = 0;
            while (i < size) {
                Object obj = ken.get(i);
                i++;
                ((iqo) obj).close();
            }
            if (!this.f10740b.f19944f.isDone()) {
                this.f10740b.f19944f.mo3557a(Boolean.valueOf(true));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b_(Object obj) {
    }
}
