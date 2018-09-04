package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: iro */
final class iro implements iri {
    /* renamed from: a */
    private final kpw f18535a = kpw.m18056d();
    /* renamed from: b */
    private final ird f18536b;

    iro(ird ird) {
        this.f18536b = ird;
    }

    /* renamed from: a */
    public final void mo1150a() {
        this.f18535a.mo3557a(irp.RETRY);
    }

    /* renamed from: b */
    public final void mo1153b() {
        this.f18535a.mo3557a(irp.RETRY);
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        if (i == 3) {
            this.f18535a.mo3557a(irp.ERROR);
        } else {
            this.f18535a.mo3557a(irp.RETRY);
        }
    }

    /* renamed from: a */
    public final void mo1152a(iwl iwl) {
        this.f18535a.mo3557a(irp.CONNECTED);
    }

    /* renamed from: a */
    public final irp m12420a(long j) {
        irp irp;
        this.f18536b.mo1903a("awaitResult");
        try {
            irp = (irp) this.f18535a.get(j, TimeUnit.MILLISECONDS);
            this.f18536b.mo1904b();
        } catch (TimeoutException e) {
            try {
                irp = irp.ERROR_TIMEOUT;
                return irp;
            } finally {
                this.f18536b.mo1904b();
            }
        } catch (ExecutionException e2) {
            irp = irp.ERROR_TIMEOUT;
            return irp;
        }
        return irp;
    }
}
