package p000;

/* compiled from: PG */
/* renamed from: gfc */
final class gfc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ iwz f5133a;
    /* renamed from: b */
    private final /* synthetic */ gfa f5134b;

    gfc(gfa gfa, iwz iwz) {
        this.f5134b = gfa;
        this.f5133a = iwz;
    }

    public final void run() {
        this.f5133a.close();
        gfa gfa = this.f5134b;
        gfa.f16865e++;
        int i = gfa.f16864d;
        int i2 = gfa.f16865e;
        StringBuilder stringBuilder = new StringBuilder(88);
        stringBuilder.append("Release of image occurred.  Good fun. Total Images Open/Closed = ");
        stringBuilder.append(i);
        stringBuilder.append("/");
        stringBuilder.append(i2);
        bli.m871d(gfa.f16860a, stringBuilder.toString());
    }
}
