package p000;

/* compiled from: PG */
/* renamed from: gej */
final class gej implements iqb {
    /* renamed from: a */
    private final /* synthetic */ geg f16853a;

    gej(geg geg) {
        this.f16853a = geg;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo369a(Object obj) {
        geu geu = (geu) obj;
        geg geg = this.f16853a;
        synchronized (geg.f16845d) {
            geg.f16846e = false;
            ilb ilb = geg.f16842a;
            ilb.mo348a(Long.valueOf(((Long) ilb.mo2860b()).longValue() - geg.f16843b));
            geg.m11011c();
        }
        geu.removeFinishedCallback(this);
    }
}
