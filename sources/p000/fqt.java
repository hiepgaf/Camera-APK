package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: fqt */
final class fqt implements kov {
    /* renamed from: a */
    private final /* synthetic */ fri f16398a;
    /* renamed from: b */
    private final /* synthetic */ long f16399b;
    /* renamed from: c */
    private final /* synthetic */ fqh f16400c;

    fqt(fqh fqh, fri fri, long j) {
        this.f16400c = fqh;
        this.f16398a = fri;
        this.f16399b = j;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f16398a.b.close();
    }

    public final /* synthetic */ void b_(Object obj) {
        foz foz = (foz) obj;
        this.f16398a.b.close();
        if (foz == null) {
            mo349a(new NullPointerException());
        } else if (foz.f4657f) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            grj a = this.f16400c.f21396c.mo1510a();
            if (a != null) {
                a.f17253a = this.f16399b;
                a.f17254b = elapsedRealtimeNanos;
            }
        }
    }
}
