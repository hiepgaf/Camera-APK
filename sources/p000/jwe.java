package p000;

import android.util.Log;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jwe */
public final class jwe implements jwa {
    /* renamed from: a */
    private final jwa f21984a;
    /* renamed from: b */
    private final TreeSet f21985b = new TreeSet();
    /* renamed from: c */
    private long f21986c = -1;

    public jwe(jwa jwa) {
        jri.m13152b((Object) jwa);
        this.f21984a = jwa;
    }

    /* renamed from: a */
    public final Set mo3186a() {
        return this.f21984a.mo3186a();
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        if (!this.f21985b.remove(Long.valueOf(j))) {
            this.f21984a.mo2034a(j);
        }
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        long j2 = this.f21986c;
        StringBuilder stringBuilder;
        if (j < j2) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Encountered out of order frame with timestamp:");
            stringBuilder.append(j);
            Log.w("InOrderTimestampFrameDropper", stringBuilder.toString());
            this.f21985b.add(Long.valueOf(j));
        } else if (j == j2) {
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("Encountered duplicate frame with timestamp:");
            stringBuilder.append(j);
            Log.w("InOrderTimestampFrameDropper", stringBuilder.toString());
            this.f21985b.add(Long.valueOf(j));
        } else {
            this.f21986c = j;
            this.f21984a.mo2035b(j);
        }
    }

    /* renamed from: b */
    public final kbg mo3187b() {
        return this.f21984a.mo3187b();
    }

    /* renamed from: c */
    public final synchronized void mo3188c() {
        this.f21986c = -1;
        this.f21985b.clear();
        this.f21984a.mo3188c();
    }

    /* renamed from: d */
    public final synchronized long mo3189d() {
        long d;
        if (this.f21985b.isEmpty()) {
            d = this.f21984a.mo3189d();
        } else {
            d = ((Long) this.f21985b.first()).longValue();
        }
        return d;
    }
}
