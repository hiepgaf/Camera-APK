package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: hm */
final class hm implements hx {
    /* renamed from: a */
    private final /* synthetic */ mz f17929a;
    /* renamed from: b */
    private final /* synthetic */ Handler f17930b;

    hm(mz mzVar, Handler handler) {
        this.f17929a = mzVar;
        this.f17930b = handler;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1738a(Object obj) {
        hr hrVar = (hr) obj;
        if (hrVar == null) {
            this.f17929a.m14126a(1, this.f17930b);
            return;
        }
        int i = hrVar.f6465b;
        if (i == 0) {
            this.f17929a.m14128a(hrVar.f6464a, this.f17930b);
        } else {
            this.f17929a.m14126a(i, this.f17930b);
        }
    }
}
