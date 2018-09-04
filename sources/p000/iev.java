package p000;

import com.google.android.gms.location.internal.zzq;

/* renamed from: iev */
public final class iev extends ieq {
    /* renamed from: a */
    private final /* synthetic */ ien f23544a;

    public iev(huq huq, ien ien) {
        this.f23544a = ien;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        iff iff = (iff) hul;
        Object obj = this.f23544a;
        String simpleName = ien.class.getSimpleName();
        htl.m3432b(obj, (Object) "Listener must not be null");
        htl.m3432b((Object) simpleName, (Object) "Listener type must not be null");
        htl.m3404a(simpleName, (Object) "Listener type must not be empty");
        Object iei = new iei(obj, simpleName);
        iex iey = new iey(this);
        ifb ifb = iff.f23545m;
        ifb.f6981a.f6985a.m3525o();
        htl.m3432b(iei, (Object) "Invalid null listener key");
        synchronized (ifb.f6982b) {
            ifn ifn = (ifn) ifb.f6982b.remove(iei);
            if (ifn != null) {
                ifn.m12205a();
                ((ifa) ifb.f6981a.f6985a.m3526p()).m3728a(zzq.m15119a(ifn, iey));
            }
        }
    }
}
