package p000;

/* compiled from: PG */
/* renamed from: hkq */
public final class hkq implements kov {
    /* renamed from: a */
    private final /* synthetic */ hkk f17924a;

    public hkq(hkk hkk) {
        this.f17924a = hkk;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = hkk.f6290a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
        stringBuilder.append("CamcorderSnapshot is not available: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
        this.f17924a.f6294e.m3241d(true);
    }

    public final /* synthetic */ void b_(Object obj) {
        bju bju = (bju) obj;
        String str = hkk.f6290a;
        String valueOf = String.valueOf(bju.f1214b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
        stringBuilder.append("CamcorderSnapshot is available: file=");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        this.f17924a.f6295f.add(bju);
        this.f17924a.f6294e.m3241d(true);
    }
}
