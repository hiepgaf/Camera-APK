package p000;

/* compiled from: PG */
/* renamed from: hpb */
final class hpb implements iqt {
    /* renamed from: a */
    private final /* synthetic */ hox f17979a;

    hpb(hox hox) {
        this.f17979a = hox;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        int round = Math.round(((float) (Math.log((double) (((Float) obj).floatValue() / this.f17979a.f17963a)) / Math.log((double) (((Float) this.f17979a.f17978q.mo2860b()).floatValue() / this.f17979a.f17963a)))) * 100000.0f);
        if (this.f17979a.f17965c.getProgress() != round) {
            this.f17979a.f17965c.setProgress(round);
        }
    }
}
