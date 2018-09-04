package p000;

/* compiled from: PG */
/* renamed from: cga */
final class cga implements kov {
    /* renamed from: a */
    public final /* synthetic */ cfk f11828a;

    cga(cfk cfk) {
        this.f11828a = cfk;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m872d(cfk.f20249a, "exception retrieving cached indicator Bitmap", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        gss gss = (gss) obj;
        String str = cfk.f20249a;
        String valueOf = String.valueOf(gss);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("retrieved indicator Bitmap: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        if (gss != null) {
            bli.m871d(cfk.f20249a, "updating indicator Bitmap from cache");
            this.f11828a.f20299y.mo1658a(gss.f5670a, gss.f5671b.f7326e);
            this.f11828a.f20262M.mo755a(gss.f5670a);
            cfk cfk = this.f11828a;
            if (cfk.f20275Z) {
                this.f11828a.f20282h.post(new cgb(this, cfk.f20297w.getIntExtra("filmstrip_index", 0)));
                this.f11828a.f20275Z = false;
            }
        }
    }
}
