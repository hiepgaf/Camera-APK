package p000;

import android.location.Location;
import android.location.LocationManager;

/* compiled from: PG */
/* renamed from: eov */
final class eov implements eox {
    /* renamed from: a */
    public static final String f15317a = bli.m862a("LcyLocProvider");
    /* renamed from: b */
    private final kwk f15318b;
    /* renamed from: c */
    private LocationManager f15319c;
    /* renamed from: d */
    private boolean f15320d;
    /* renamed from: e */
    private eow[] f15321e = new eow[]{new eow("gps"), new eow("network")};

    eov(kwk kwk) {
        this.f15318b = kwk;
    }

    /* renamed from: a */
    public final void mo1238a() {
        bli.m863a(f15317a, "disconnect");
    }

    /* renamed from: b */
    public final Location mo1239b() {
        if (!this.f15320d) {
            return null;
        }
        int i = 0;
        while (true) {
            eow[] eowArr = this.f15321e;
            if (i < eowArr.length) {
                Location location;
                eow eow = eowArr[i];
                if (eow.f3997b) {
                    location = eow.f3996a;
                } else {
                    location = null;
                }
                if (location != null) {
                    return location;
                }
                i++;
            } else {
                bli.m863a(f15317a, "No location received yet.");
                return null;
            }
        }
    }

    /* renamed from: a */
    public final kpk mo1237a(boolean z) {
        String str;
        String valueOf;
        String str2;
        int i = 0;
        if (this.f15320d != z) {
            this.f15320d = z;
            if (z) {
                bli.m871d(f15317a, "starting location updates");
                if (this.f15319c == null) {
                    this.f15319c = (LocationManager) this.f15318b.mo345a();
                }
                LocationManager locationManager = this.f15319c;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000, 0.0f, this.f15321e[1]);
                    } catch (Throwable e) {
                        bli.m870c(f15317a, "fail to request location update, ignore", e);
                    } catch (IllegalArgumentException e2) {
                        str = f15317a;
                        valueOf = String.valueOf(e2.getMessage());
                        str2 = "provider does not exist ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m863a(str, valueOf);
                    }
                    try {
                        this.f15319c.requestLocationUpdates("gps", 1000, 0.0f, this.f15321e[0]);
                    } catch (Throwable e3) {
                        bli.m870c(f15317a, "fail to request location update, ignore", e3);
                    } catch (IllegalArgumentException e22) {
                        str = f15317a;
                        valueOf = String.valueOf(e22.getMessage());
                        str2 = "provider does not exist ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m863a(str, valueOf);
                    }
                    bli.m863a(f15317a, "startReceivingLocationUpdates");
                }
            } else {
                bli.m871d(f15317a, "stopping location updates");
                if (this.f15319c != null) {
                    while (true) {
                        eow[] eowArr = this.f15321e;
                        if (i >= eowArr.length) {
                            break;
                        }
                        try {
                            this.f15319c.removeUpdates(eowArr[i]);
                        } catch (Throwable e4) {
                            bli.m870c(f15317a, "fail to remove location listners, ignore", e4);
                        }
                        i++;
                    }
                    bli.m863a(f15317a, "stopReceivingLocationUpdates");
                }
            }
        }
        return kow.m13617a(Boolean.valueOf(z));
    }
}
