package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.gqz;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class BurstSessionStatistics extends InstrumentationSession {
    /* renamed from: a */
    public static final String f12293a = bli.m862a("BurstSessionStats");
    /* renamed from: b */
    private long f12294b = 0;
    /* renamed from: c */
    private long f12295c = 0;
    /* renamed from: d */
    private long f12296d;
    /* renamed from: e */
    private long f12297e;
    /* renamed from: f */
    private long f12298f;
    /* renamed from: g */
    private long f12299g;
    /* renamed from: h */
    private int f12300h;
    /* renamed from: i */
    private int f12301i;
    /* renamed from: j */
    private int f12302j;
    /* renamed from: n */
    private int f12303n;

    public BurstSessionStatistics(iya iya, String str) {
        super(iya, str);
    }

    @UsedByReflection
    public synchronized int getAcquiredFrameCount() {
        return this.f12300h;
    }

    @UsedByReflection
    public synchronized float getBurstAcquisitionFrameRate() {
        return ((float) this.f12300h) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized float getBurstDurationS() {
        return ((float) (this.f12295c - this.f12294b)) / 1.0E9f;
    }

    @UsedByReflection
    public synchronized long getBurstEndNs() {
        return this.f12295c;
    }

    @UsedByReflection
    public synchronized long getBurstFilesSavedNs() {
        return this.f12299g;
    }

    @UsedByReflection
    public synchronized long getBurstPreviewAvailableNs() {
        return this.f12298f;
    }

    @UsedByReflection
    public synchronized int getBurstSavedFrameCount() {
        return this.f12301i;
    }

    @UsedByReflection
    public synchronized float getBurstSavingFrameRate() {
        return ((float) this.f12301i) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized float getBurstScoringFrameRate() {
        return ((float) this.f12302j) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized long getBurstSoundStartNs() {
        return this.f12296d;
    }

    @UsedByReflection
    public synchronized long getBurstStartNs() {
        return this.f12294b;
    }

    @UsedByReflection
    public synchronized int getSaveErrorCount() {
        return this.f12303n;
    }

    @UsedByReflection
    public synchronized int getScoredFrameCount() {
        return this.f12302j;
    }

    /* renamed from: a */
    public static kwk m8409a() {
        return new gqz();
    }

    /* renamed from: b */
    public final synchronized void m8410b() {
        if (this.f12299g == 0) {
            this.f12299g = SystemClock.elapsedRealtimeNanos();
            m1326a("Burst all files saved", this.f12299g);
        }
    }

    /* renamed from: c */
    public final synchronized void m8411c() {
        if (this.f12295c == 0 && this.f12294b != 0) {
            this.f12295c = SystemClock.elapsedRealtimeNanos();
            m1326a("Burst ended", this.f12295c);
        }
    }

    /* renamed from: d */
    public final synchronized void m8412d() {
        this.f12300h++;
    }

    /* renamed from: e */
    public final synchronized void m8413e() {
        this.f12303n++;
    }

    /* renamed from: f */
    public final synchronized void m8414f() {
        this.f12301i++;
    }

    /* renamed from: g */
    public final synchronized void m8415g() {
        this.f12302j++;
    }

    /* renamed from: h */
    public final synchronized void m8416h() {
        if (this.f12298f == 0) {
            this.f12298f = SystemClock.elapsedRealtimeNanos();
            m1326a("Burst previews generated", this.f12298f);
        }
    }

    /* renamed from: i */
    public final synchronized void m8417i() {
        if (this.f12296d == 0) {
            this.f12296d = SystemClock.elapsedRealtimeNanos();
            m1326a("Burst sound indicator started", this.f12296d);
        }
    }

    /* renamed from: j */
    public final synchronized void m8418j() {
        if (this.f12297e == 0) {
            this.f12297e = SystemClock.elapsedRealtimeNanos();
            m1326a("Burst sound indicator stopped", this.f12297e);
        }
    }

    /* renamed from: k */
    public final synchronized void m8419k() {
        if (this.f12294b == 0) {
            this.f12294b = SystemClock.elapsedRealtimeNanos();
            this.f12300h = 0;
            this.f12301i = 0;
            this.f12303n = 0;
            m1326a("Burst started", this.f12294b);
        }
    }
}
