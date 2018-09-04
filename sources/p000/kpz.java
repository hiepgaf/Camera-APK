package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kpz */
public final class kpz extends knt {
    /* renamed from: e */
    public kpk f23610e;
    /* renamed from: f */
    public Future f23611f;

    public kpz(kpk kpk) {
        this.f23610e = (kpk) jri.m13152b((Object) kpk);
    }

    /* renamed from: a */
    protected final void mo3613a() {
        m17778a(this.f23610e);
        Future future = this.f23611f;
        if (future != null) {
            future.cancel(false);
        }
        this.f23610e = null;
        this.f23611f = null;
    }

    /* renamed from: b */
    protected final String mo3614b() {
        kpk kpk = this.f23610e;
        if (kpk == null) {
            return null;
        }
        String valueOf = String.valueOf(kpk);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("inputFuture=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
