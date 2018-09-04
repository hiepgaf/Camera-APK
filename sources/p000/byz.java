package p000;

import com.google.googlex.gcam.MemoryStateCallback;

/* compiled from: PG */
/* renamed from: byz */
final class byz extends MemoryStateCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f11518a;

    byz(byy byy) {
        this.f11518a = byy;
    }

    public final void Run(long j, long j2) {
        String str = byy.f1720a;
        StringBuilder stringBuilder = new StringBuilder(105);
        stringBuilder.append("MemoryStateCallback: peakMemoryBytes=");
        stringBuilder.append(j);
        stringBuilder.append(" peakMemoryWithNewShotBytes=");
        stringBuilder.append(j2);
        bli.m871d(str, stringBuilder.toString());
        this.f11518a.f1723d.mo348a(Long.valueOf(j));
        this.f11518a.f1724e.mo348a(Long.valueOf(j2));
    }
}
