package p000;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: goy */
public final class goy {
    /* renamed from: a */
    private final SharedPreferences f5611a;

    public goy(SharedPreferences sharedPreferences, hke hke) {
        this.f5611a = sharedPreferences;
    }

    /* renamed from: a */
    public final synchronized int m2693a(String str) {
        return this.f5611a.getInt(goy.m2692c(str), 0);
    }

    /* renamed from: c */
    private static String m2692c(String str) {
        String valueOf = String.valueOf("tooltip_impression_count_for_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public final synchronized int m2694b(String str) {
        int i;
        String c = goy.m2692c(str);
        i = this.f5611a.getInt(c, 0) + 1;
        String valueOf = String.valueOf("tooltip_latest_impression_timestamp_for_");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        this.f5611a.edit().putInt(c, i).putLong(valueOf2, System.currentTimeMillis()).apply();
        return i;
    }
}
