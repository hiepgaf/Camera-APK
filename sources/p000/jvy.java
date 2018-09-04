package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jvy */
public final class jvy implements jwa {
    /* renamed from: a */
    private final jwa f21973a;
    /* renamed from: b */
    private final FeatureTable f21974b;
    /* renamed from: c */
    private final TreeSet f21975c = new TreeSet();
    /* renamed from: d */
    private int f21976d = 0;

    public jvy(jwa jwa, FeatureTable featureTable) {
        jri.m13152b((Object) jwa);
        jri.m13152b((Object) featureTable);
        jri.m13143a(true);
        this.f21973a = jwa;
        this.f21974b = featureTable;
    }

    /* renamed from: e */
    private final synchronized void m16381e() {
        while (!this.f21975c.isEmpty() && ((Long) this.f21975c.first()).longValue() <= this.f21974b.getLatestValidTimestamp()) {
            m16382f();
        }
    }

    /* renamed from: a */
    public final synchronized Set mo3186a() {
        Set hashSet;
        hashSet = new HashSet(this.f21973a.mo3186a());
        hashSet.addAll(this.f21975c);
        return hashSet;
    }

    /* renamed from: f */
    private final synchronized void m16382f() {
        this.f21973a.mo2035b(((Long) this.f21975c.pollFirst()).longValue());
        this.f21976d++;
    }

    /* renamed from: g */
    private final synchronized void m16383g() {
        m16381e();
        while (this.f21975c.size() > 0) {
            long longValue = ((Long) this.f21975c.first()).longValue();
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append("Timed out waiting for features inserting: ");
            stringBuilder.append(longValue);
            Log.d("FeatureWaitingFrameDropper", stringBuilder.toString());
            m16382f();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        if (!this.f21975c.remove(Long.valueOf(j))) {
            this.f21973a.mo2034a(j);
            this.f21976d--;
        }
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        this.f21975c.add(Long.valueOf(j));
        m16383g();
    }

    /* renamed from: b */
    public final kbg mo3187b() {
        return this.f21973a.mo3187b();
    }

    /* renamed from: c */
    public final synchronized void mo3188c() {
        this.f21975c.clear();
        this.f21973a.mo3188c();
    }

    /* renamed from: d */
    public final synchronized long mo3189d() {
        m16383g();
        if (this.f21976d == 0 && !this.f21975c.isEmpty()) {
            String valueOf = String.valueOf(this.f21975c.first());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("No frame was inserted, inserting a new frame with timestamp: ");
            stringBuilder.append(valueOf);
            Log.e("FeatureWaitingFrameDropper", stringBuilder.toString());
            m16382f();
        }
        return this.f21973a.mo3189d();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("FeatureWaitingFrameDropper, mMaxPendingFrameCount=");
        stringBuilder.append(0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
