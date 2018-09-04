package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* renamed from: eos */
final class eos implements eox, hus, hut, ien {
    /* renamed from: a */
    public static final String f15307a = bli.m862a("FusedLocProvider");
    /* renamed from: g */
    public static final int f15308g = 20000;
    /* renamed from: i */
    private static final Uri f15309i = Uri.parse("content://com.google.settings/partner");
    /* renamed from: b */
    public final hji f15310b;
    /* renamed from: c */
    public hjk f15311c;
    /* renamed from: d */
    public final Context f15312d;
    /* renamed from: e */
    public boolean f15313e;
    /* renamed from: f */
    public boolean f15314f = false;
    /* renamed from: h */
    private final eoy f15315h;

    eos(Context context, eoy eoy) {
        this.f15315h = eoy;
        hur a = new hur(context).m3486a(ieo.f6977a);
        htl.m3432b((Object) this, (Object) "Listener must not be null");
        a.f6682b.add(this);
        htl.m3432b((Object) this, (Object) "Listener must not be null");
        a.f6683c.add(this);
        this.f15310b = new hji(a.m3485a());
        this.f15312d = context;
    }

    /* renamed from: a */
    public final void mo1238a() {
        m9786d();
        bli.m863a(f15307a, "apiClient#disconnect");
        hjk hjk = this.f15311c;
        if (hjk != null) {
            hut hut = hjk.f6271a;
            hut.f17906a.mo1830b((hus) hut);
            hut.f17906a.mo1831b(hut);
            hut.f17906a.mo1832c();
            this.f15311c = null;
        }
    }

    /* renamed from: b */
    public final Location mo1239b() {
        if (this.f15313e) {
            hjk hjk = this.f15311c;
            if (hjk == null) {
                bli.m873e(f15307a, "Cannot provide location because the apiClient is not currently connected.");
                return null;
            }
            Location a = iel.m3712a(hjk.f6271a.f17906a);
            if (a == null) {
                bli.m873e(f15307a, "Fused location API did not provide a location.");
                return null;
            } else if (Double.isInfinite(a.getLatitude()) || Double.isNaN(a.getLatitude()) || Double.isInfinite(a.getLongitude()) || Double.isNaN(a.getLongitude()) || (a.getLatitude() == 0.0d && a.getLongitude() == 0.0d)) {
                String str = f15307a;
                r1 = String.valueOf(a);
                r4 = new StringBuilder(String.valueOf(r1).length() + 67);
                r4.append("Fused location API provided a location that is probably incorrect: ");
                r4.append(r1);
                bli.m873e(str, r4.toString());
                return null;
            } else {
                long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - a.getElapsedRealtimeNanos()) / 1000000;
                if (elapsedRealtimeNanos <= 1800000) {
                    return a;
                }
                r1 = f15307a;
                r4 = new StringBuilder(91);
                r4.append("Fused location API provided a location from ");
                r4.append(((float) elapsedRealtimeNanos) / 1000.0f);
                r4.append(" seconds ago. Ignoring location.");
                bli.m873e(r1, r4.toString());
                return null;
            }
        }
        bli.m863a(f15307a, "Fused location does not have the record location permission.");
        return null;
    }

    /* renamed from: b */
    private static int m9778b(Context context) {
        Cursor query;
        Throwable e;
        int parseInt;
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        String str = null;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            query = contentResolver.query(f15309i, new String[]{"value"}, "name=?", new String[]{"use_location_for_services"}, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        str = query.getString(0);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    try {
                        bli.m874e(f15307a, "Failed to get 'Use My Location' setting", e);
                        if (query != null) {
                            query.close();
                        }
                        if (str != null) {
                            return 2;
                        }
                        try {
                            parseInt = Integer.parseInt(str);
                        } catch (NumberFormatException e3) {
                            parseInt = 2;
                        }
                        return parseInt;
                    } catch (Throwable e4) {
                        cursor = query;
                        th = e4;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable e42) {
                    cursor = query;
                    th = e42;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (RuntimeException e5) {
            e42 = e5;
            query = null;
            bli.m874e(f15307a, "Failed to get 'Use My Location' setting", e42);
            if (query != null) {
                query.close();
            }
            if (str != null) {
                return 2;
            }
            parseInt = Integer.parseInt(str);
            return parseInt;
        } catch (Throwable e422) {
            th = e422;
            cursor2 = null;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (str != null) {
            return 2;
        }
        parseInt = Integer.parseInt(str);
        return parseInt;
    }

    /* renamed from: a */
    static boolean m9777a(Context context) {
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) == null || eos.m9778b(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        String str = f15307a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Connection failed: ");
        stringBuilder.append(valueOf);
        bli.m873e(str, stringBuilder.toString());
        eoy eoy = this.f15315h;
        bli.m873e(epa.f15325a, "Connection to fused location provider failed.");
        eoy.f3999a.m9796e();
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        String str = f15307a;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("onConnectionSuspended: ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: c */
    public final void mo1240c() {
        bli.m871d(f15307a, "Got location.");
    }

    /* renamed from: a */
    public final kpk mo1237a(boolean z) {
        kpk d = kpw.m18056d();
        new eot(this, d, z).execute(new Void[0]);
        return d;
    }

    /* renamed from: d */
    final void m9786d() {
        if (this.f15314f && this.f15311c != null) {
            try {
                bli.m869c(f15307a, "FusedLocationApi#removeLocationUpdates");
                huq huq = this.f15311c.f6271a.f17906a;
                huq.mo1848b(new iev(huq, this));
            } catch (Throwable e) {
                bli.m874e(f15307a, "Failed to remove location listeners. ", e);
            }
        }
        this.f15314f = false;
        this.f15313e = false;
    }
}
