package p000;

/* compiled from: PG */
/* renamed from: djf */
final class djf implements kov {
    /* renamed from: a */
    private final /* synthetic */ dix f13488a;

    djf(dix dix) {
        this.f13488a = dix;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        bgl bgl;
        boolean z;
        hku hku = (hku) obj;
        if (hku.f6313a.isEmpty()) {
            bgl = null;
        } else {
            bgl = (bgl) hku.f6313a.get(0);
        }
        if (bgl == null) {
            z = false;
        } else {
            if (bgl.f1133a.length() >= 3700000000L) {
                z = true;
            } else {
                z = false;
            }
            String str = dix.f13456a;
            long length = bgl.f1133a.length();
            StringBuilder stringBuilder = new StringBuilder(58);
            stringBuilder.append("Video file size onMaxFileSizeReached: ");
            stringBuilder.append(length);
            bli.m869c(str, stringBuilder.toString());
        }
        if (z) {
            hkv hkv = this.f13488a.f13467h;
            hkv.f6321g.m9611c(false);
            hkv.f6322h = hkv.f6317c.mo1628b(hkv.mo1156a());
            hkv.m3240d();
            return;
        }
        this.f13488a.f13467h.m3237b(false);
    }
}
