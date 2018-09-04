package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: fna */
public final class fna implements fne {
    /* renamed from: a */
    private final kpk f16215a;
    /* renamed from: b */
    private final int f16216b;
    /* renamed from: c */
    private final ilp f16217c;

    public fna(kpk kpk, int i) {
        this.f16215a = kpk;
        this.f16216b = i;
        ilp ilb = new ilb(Integer.valueOf(0));
        kow.m13622a(kpk, new fnb(ilb), kpq.f8410a);
        this.f16217c = ilq.m3831b(ilb);
    }

    /* renamed from: a */
    public final ilp mo1409a() {
        return this.f16217c;
    }

    /* renamed from: b */
    public final int mo1410b() {
        return this.f16216b;
    }

    /* renamed from: a */
    public final fng mo1408a(int i) {
        try {
            return ((fne) this.f16215a.get(0, TimeUnit.SECONDS)).mo1408a(i);
        } catch (ExecutionException e) {
            return null;
        } catch (TimeoutException e2) {
            return null;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
