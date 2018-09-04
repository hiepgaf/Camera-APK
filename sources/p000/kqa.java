package p000;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: kqa */
public final class kqa implements Runnable {
    /* renamed from: a */
    private kpz f8419a;

    public kqa(kpz kpz) {
        this.f8419a = kpz;
    }

    public final void run() {
        kpz kpz = this.f8419a;
        if (kpz != null) {
            kpk kpk = kpz.f23610e;
            if (kpk != null) {
                this.f8419a = null;
                if (kpk.isDone()) {
                    kpz.mo3616b(kpk);
                    return;
                }
                try {
                    String valueOf = String.valueOf(kpk);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    stringBuilder.append("Future timed out: ");
                    stringBuilder.append(valueOf);
                    kpz.m17780a(new TimeoutException(stringBuilder.toString()));
                } finally {
                    kpk.cancel(true);
                }
            }
        }
    }
}
