package p000;

/* compiled from: PG */
/* renamed from: gvy */
final class gvy implements kov {
    /* renamed from: a */
    private final /* synthetic */ gvv f17446a;

    gvy(gvv gvv) {
        this.f17446a = gvv;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m872d(gvv.f17434a, "exception retrieving cached indicator Bitmap", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        gss gss = (gss) obj;
        String str = gvv.f17434a;
        String valueOf = String.valueOf(gss);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("retrieved indicator Bitmap: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        if (gss != null) {
            bli.m871d(gvv.f17434a, "updating indicator Bitmap from cache");
            this.f17446a.mo1658a(gss.f5670a, gss.f5671b.f7326e);
        }
    }
}
