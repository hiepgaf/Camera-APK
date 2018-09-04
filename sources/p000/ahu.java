package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: ahu */
public final class ahu implements ahm {
    /* renamed from: a */
    private final aib f9805a;
    /* renamed from: b */
    private final File f9806b;
    /* renamed from: c */
    private final long f9807c;
    /* renamed from: d */
    private final ahq f9808d = new ahq();
    /* renamed from: e */
    private acr f9809e;

    @Deprecated
    public ahu(File file, long j) {
        this.f9806b = file;
        this.f9807c = j;
        this.f9805a = new aib();
    }

    /* renamed from: a */
    public final File mo79a(adl adl) {
        String a = this.f9805a.m299a(adl);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String valueOf = String.valueOf(adl);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length());
            stringBuilder.append("Get: Obtained: ");
            stringBuilder.append(a);
            stringBuilder.append(" for for Key: ");
            stringBuilder.append(valueOf);
            Log.v("DiskLruCacheWrapper", stringBuilder.toString());
        }
        try {
            acw b = m6470a().m132b(a);
            if (b != null) {
                return b.f282a[0];
            }
            return null;
        } catch (Throwable e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    private final synchronized acr m6470a() {
        if (this.f9809e == null) {
            this.f9809e = acr.m125a(this.f9806b, this.f9807c);
        }
        return this.f9809e;
    }

    /* renamed from: a */
    public final void mo80a(adl adl, aho aho) {
        ahr ahr;
        String a = this.f9805a.m299a(adl);
        ahq ahq = this.f9808d;
        synchronized (ahq) {
            ahr = (ahr) ahq.f464a.get(a);
            if (ahr == null) {
                ahr = ahq.f465b.m289a();
                ahq.f464a.put(a, ahr);
            }
            ahr.f467b++;
        }
        ahr.f466a.lock();
        acu a2;
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String valueOf = String.valueOf(adl);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length());
                stringBuilder.append("Put: Obtained: ");
                stringBuilder.append(a);
                stringBuilder.append(" for for Key: ");
                stringBuilder.append(valueOf);
                Log.v("DiskLruCacheWrapper", stringBuilder.toString());
            }
            acr a3 = m6470a();
            if (a3.m132b(a) == null) {
                a2 = a3.m129a(a);
                if (a2 == null) {
                    String str = "Had two simultaneous puts for: ";
                    String valueOf2 = String.valueOf(a);
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(str);
                    } else {
                        valueOf2 = str.concat(valueOf2);
                    }
                    throw new IllegalStateException(valueOf2);
                }
                if (aho.f461a.mo94a(aho.f462b, a2.m140d(), aho.f463c)) {
                    a2.m139c();
                }
                a2.m138b();
                this.f9808d.m288a(a);
                return;
            }
            this.f9808d.m288a(a);
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
            }
        } catch (Throwable th) {
            this.f9808d.m288a(a);
        }
    }
}
