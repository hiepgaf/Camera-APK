package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grp;
import p000.iya;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationSession {
    /* renamed from: a */
    private static final String f2409a = bli.m862a("Instrumentation");
    /* renamed from: b */
    private final String f2410b;
    /* renamed from: k */
    public final long f2411k = SystemClock.elapsedRealtimeNanos();
    /* renamed from: l */
    public grp f2412l;
    /* renamed from: m */
    public final iya f2413m;

    public InstrumentationSession(iya iya, String str) {
        jri.m13152b((Object) iya);
        jri.m13152b((Object) str);
        this.f2413m = iya;
        this.f2410b = str;
    }

    /* renamed from: l */
    public final void m1329l() {
        grp grp = this.f2412l;
        if (grp != null) {
            grp.handleClose(this);
            this.f2412l = null;
        }
    }

    /* renamed from: a */
    public final void m1326a(String str, long j) {
        String str2 = f2409a;
        String str3 = this.f2410b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 27) + String.valueOf(str).length());
        stringBuilder.append(str3);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        stringBuilder.append(": @");
        stringBuilder.append(j / 1000000);
        stringBuilder.append("ms");
        bli.m863a(str2, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m1327a(String str, long j, long j2) {
        if (j != 0 && j2 != 0) {
            String str2 = f2409a;
            String str3 = this.f2410b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 35) + String.valueOf(str).length());
            stringBuilder.append(str3);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder.append(" duration: ");
            stringBuilder.append((j2 - j) / 1000000);
            stringBuilder.append("ms");
            bli.m869c(str2, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void m1328a(String str, long j, String str2, long j2) {
        if (j != 0 && j2 != 0) {
            String str3 = f2409a;
            String str4 = this.f2410b;
            int length = String.valueOf(str4).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 30) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append(str4);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder.append(" to ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append((j2 - j) / 1000000);
            stringBuilder.append("ms");
            bli.m869c(str3, stringBuilder.toString());
        }
    }
}
