package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: eow */
final class eow implements LocationListener {
    /* renamed from: a */
    public Location f3996a;
    /* renamed from: b */
    public boolean f3997b = false;
    /* renamed from: c */
    private String f3998c;

    public eow(String str) {
        this.f3998c = str;
        this.f3996a = new Location(this.f3998c);
    }

    public final void onLocationChanged(Location location) {
        if (location.getLatitude() != 0.0d || location.getLongitude() != 0.0d) {
            if (!this.f3997b) {
                bli.m863a(eov.f15317a, "Got first location.");
            }
            this.f3996a.set(location);
            this.f3997b = true;
        }
    }

    public final void onProviderDisabled(String str) {
        this.f3997b = false;
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case 0:
            case 1:
                this.f3997b = false;
                return;
            default:
                return;
        }
    }
}
