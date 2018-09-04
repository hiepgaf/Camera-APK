package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: icv */
final class icv implements ifu {
    /* renamed from: a */
    private final /* synthetic */ icu f18210a;

    icv(icu icu) {
        this.f18210a = icu;
    }

    /* renamed from: a */
    public final void mo1825a(ifv ifv) {
        Lock lock = null;
        lock.lock();
        try {
            if (this.f18210a.f18193a) {
                Map map;
                if (ifv.mo1857b()) {
                    Map map2 = null;
                    this.f18210a.f18194b = new ih(map2.size());
                    map = null;
                    for (ict ict : map.values()) {
                        this.f18210a.f18194b.put(ict.f6701b, ConnectionResult.f20457a);
                    }
                } else if (ifv.mo1856a() instanceof huz) {
                    huz huz = (huz) ifv.mo1856a();
                    this.f18210a.f18194b = huz.f6697a;
                    icu icu = this.f18210a;
                    map = null;
                    ConnectionResult connectionResult = lock;
                    for (ict ict2 : map.values()) {
                        huh huh = ict2.f6700a;
                        ConnectionResult connectionResult2 = (ConnectionResult) icu.f18194b.get(ict2.f6701b);
                        if (!connectionResult2.m15094b()) {
                            Map map3 = null;
                            if (!((Boolean) map3.get(huh)).booleanValue() || connectionResult2.m15093a() || huc.m3460b(connectionResult2.f20458b)) {
                                int i = connectionResult2.f20458b;
                                if (connectionResult != null) {
                                    if (connectionResult == null) {
                                        connectionResult = connectionResult2;
                                    }
                                } else if (connectionResult == null) {
                                    connectionResult = connectionResult2;
                                }
                            }
                        }
                    }
                    if (connectionResult == null) {
                        icu.f18195c = connectionResult;
                    } else {
                        icu.f18195c = connectionResult;
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", ifv.mo1856a());
                    this.f18210a.f18194b = Collections.emptyMap();
                    this.f18210a.f18195c = new ConnectionResult(8);
                }
                icu icu2 = this.f18210a;
                ConnectionResult connectionResult3 = icu2.f18195c;
                idn idn;
                if (connectionResult3 == null) {
                    null.f18265f = Collections.emptySet();
                    icu icu3 = this.f18210a;
                    while (true) {
                        Queue queue = null;
                        if (queue.isEmpty()) {
                            break;
                        }
                        queue = null;
                        icu3.mo1811b((ich) queue.remove());
                    }
                    idn = null;
                    idn.mo1816a(null);
                } else {
                    icu2.f18193a = false;
                    idn = null;
                    idn.mo1817a(connectionResult3);
                }
                Condition condition = null;
                condition.signalAll();
                return;
            }
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }
}
