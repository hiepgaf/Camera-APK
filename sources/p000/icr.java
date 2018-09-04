package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: icr */
final class icr implements iee {
    /* renamed from: a */
    private final /* synthetic */ icq f18191a;

    icr(icq icq) {
        this.f18191a = icq;
    }

    /* renamed from: a */
    public final void mo1817a(ConnectionResult connectionResult) {
        this.f18191a.f18184g.lock();
        try {
            icq icq = this.f18191a;
            icq.f18181d = connectionResult;
            icq.m12078a(icq);
        } finally {
            this.f18191a.f18184g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1815a(int i, boolean z) {
        this.f18191a.f18184g.lock();
        try {
            icq icq = this.f18191a;
            if (!icq.f18183f) {
                ConnectionResult connectionResult = icq.f18182e;
                if (connectionResult != null) {
                    if (connectionResult.m15094b()) {
                        icq = this.f18191a;
                        icq.f18183f = true;
                        icq.f18179b.mo1224a(i);
                        this.f18191a.f18184g.unlock();
                        return;
                    }
                }
            }
            icq = this.f18191a;
            icq.f18183f = false;
            icq.m12079a(icq, i, z);
        } finally {
            this.f18191a.f18184g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1816a(Bundle bundle) {
        this.f18191a.f18184g.lock();
        try {
            icq icq = this.f18191a;
            Bundle bundle2 = icq.f18180c;
            if (bundle2 == null) {
                icq.f18180c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.f18191a.f18181d = ConnectionResult.f20457a;
            icq.m12078a(this.f18191a);
        } finally {
            this.f18191a.f18184g.unlock();
        }
    }
}
