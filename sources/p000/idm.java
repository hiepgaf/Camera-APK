package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: idm */
public final class idm implements idq {
    /* renamed from: a */
    private final idr f18260a;

    public idm(idr idr) {
        this.f18260a = idr;
    }

    /* renamed from: a */
    public final ich mo1834a(ich ich) {
        this.f18260a.f21714m.f18263d.add(ich);
        return ich;
    }

    /* renamed from: a */
    public final void mo1835a() {
        for (huo c : this.f18260a.f21707f.values()) {
            c.mo3574c();
        }
        this.f18260a.f21714m.f18265f = Collections.emptySet();
    }

    /* renamed from: a */
    public final void mo1836a(int i) {
    }

    /* renamed from: a */
    public final void mo1837a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo1838a(ConnectionResult connectionResult, huh huh, boolean z) {
    }

    /* renamed from: b */
    public final ich mo1839b(ich ich) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: c */
    public final boolean mo1841c() {
        return true;
    }

    /* renamed from: b */
    public final void mo1840b() {
        idr idr = this.f18260a;
        idr.f21702a.lock();
        try {
            idr.f21712k = new idb(idr, idr.f21709h, idr.f21710i, idr.f21705d, idr.f21711j, idr.f21702a, idr.f21704c);
            idr.f21712k.mo1835a();
            idr.f21703b.signalAll();
        } finally {
            idr.f21702a.unlock();
        }
    }
}
