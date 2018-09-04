package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ics */
final class ics implements iee {
    /* renamed from: a */
    private final /* synthetic */ icq f18192a;

    ics(icq icq) {
        this.f18192a = icq;
    }

    /* renamed from: a */
    public final void mo1817a(ConnectionResult connectionResult) {
        this.f18192a.f18184g.lock();
        try {
            icq icq = this.f18192a;
            icq.f18182e = connectionResult;
            icq.m12078a(icq);
        } finally {
            this.f18192a.f18184g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1815a(int i, boolean z) {
        this.f18192a.f18184g.lock();
        try {
            icq icq = this.f18192a;
            if (icq.f18183f) {
                icq.f18183f = false;
                icq.m12079a(icq, i, z);
                this.f18192a.f18184g.unlock();
                return;
            }
            icq.f18183f = true;
            icq.f18178a.mo1224a(i);
        } finally {
            this.f18192a.f18184g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1816a(Bundle bundle) {
        this.f18192a.f18184g.lock();
        try {
            this.f18192a.f18182e = ConnectionResult.f20457a;
            icq.m12078a(this.f18192a);
        } finally {
            this.f18192a.f18184g.unlock();
        }
    }
}
