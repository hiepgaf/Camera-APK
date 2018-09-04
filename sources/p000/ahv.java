package p000;

import android.annotation.SuppressLint;

/* compiled from: PG */
/* renamed from: ahv */
public final class ahv extends arn implements ahw {
    /* renamed from: a */
    private ahx f9810a;

    public ahv(long j) {
        super(j);
    }

    /* renamed from: a */
    protected final /* synthetic */ int mo81a(Object obj) {
        agn agn = (agn) obj;
        if (agn == null) {
            return super.mo81a(null);
        }
        return agn.mo57d();
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo86a(Object obj, Object obj2) {
        agn agn = (agn) obj2;
        ahx ahx = this.f9810a;
        if (ahx != null && agn != null) {
            ahx.mo50a(agn);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ agn mo83a(adl adl, agn agn) {
        return (agn) super.m639b(adl, agn);
    }

    /* renamed from: a */
    public final /* synthetic */ agn mo82a(adl adl) {
        return (agn) super.m640c(adl);
    }

    /* renamed from: a */
    public final void mo85a(ahx ahx) {
        this.f9810a = ahx;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo84a(int i) {
        if (i >= 40) {
            m635a(0);
        } else if (i >= 20 || i == 15) {
            m635a(m637b() / 2);
        }
    }
}
