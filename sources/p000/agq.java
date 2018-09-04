package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: agq */
final class agq {
    /* renamed from: a */
    private boolean f443a;
    /* renamed from: b */
    private final Handler f444b = new Handler(Looper.getMainLooper(), new agr());

    agq() {
    }

    /* renamed from: a */
    final void m248a(agn agn) {
        arq.m653a();
        if (this.f443a) {
            this.f444b.obtainMessage(1, agn).sendToTarget();
            return;
        }
        this.f443a = true;
        agn.mo58e();
        this.f443a = false;
    }
}
