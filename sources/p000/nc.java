package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: PG */
/* renamed from: nc */
final class nc {
    /* renamed from: a */
    public static nc f8867a;
    /* renamed from: b */
    private final Context f8868b;
    /* renamed from: c */
    private final LocationManager f8869c;
    /* renamed from: d */
    private final nd f8870d = new nd();

    nc(Context context, LocationManager locationManager) {
        this.f8868b = context;
        this.f8869c = locationManager;
    }

    /* renamed from: a */
    private final Location m5617a(String str) {
        try {
            if (this.f8869c.isProviderEnabled(str)) {
                return this.f8869c.getLastKnownLocation(str);
            }
        } catch (Throwable e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    final boolean m5618a() {
        nd ndVar = this.f8870d;
        if (ndVar.f8872b > System.currentTimeMillis()) {
            return ndVar.f8871a;
        }
        Location a;
        Location a2;
        Location location;
        if (ll.m5505a(this.f8868b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            a = m5617a("network");
        } else {
            a = null;
        }
        if (ll.m5505a(this.f8868b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            a2 = m5617a("gps");
        } else {
            a2 = null;
        }
        if (a2 == null || a == null) {
            if (a2 != null) {
                location = a2;
            } else {
                location = a;
            }
        } else if (a2.getTime() > a.getTime()) {
            location = a2;
        } else {
            location = a;
        }
        if (location == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i = Calendar.getInstance().get(11);
            if (i < 6 || i >= 22) {
                return true;
            }
            return false;
        }
        boolean z;
        nd ndVar2 = this.f8870d;
        long currentTimeMillis = System.currentTimeMillis();
        if (nb.f8863a == null) {
            nb.f8863a = new nb();
        }
        nb nbVar = nb.f8863a;
        nbVar.m5616a(-86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        nbVar.m5616a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (nbVar.f8866d == 1) {
            z = true;
        } else {
            z = false;
        }
        long j = nbVar.f8865c;
        long j2 = nbVar.f8864b;
        nbVar.m5616a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j3 = nbVar.f8865c;
        if (j == -1 || j2 == -1) {
            j3 = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis <= j2) {
                if (currentTimeMillis > j) {
                    j3 = j2;
                } else {
                    j3 = j;
                }
            }
            j3 += 60000;
        }
        ndVar2.f8871a = z;
        ndVar2.f8872b = j3;
        return ndVar.f8871a;
    }
}
