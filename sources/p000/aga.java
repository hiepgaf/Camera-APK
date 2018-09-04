package p000;

import android.os.Handler.Callback;
import android.os.Message;
import java.util.List;

/* compiled from: PG */
/* renamed from: aga */
final class aga implements Callback {
    aga() {
    }

    public final boolean handleMessage(Message message) {
        afy afy = (afy) message.obj;
        aqh aqh;
        switch (message.what) {
            case 1:
                afy.f9713b.mo344b();
                if (!afy.f9730s) {
                    if (!afy.f9712a.isEmpty()) {
                        if (!afy.f9724m) {
                            afy.f9728q = new age(afy.f9722k, afy.f9718g, true);
                            afy.f9724m = true;
                            afy.f9728q.m6399a();
                            afy.f9715d.mo49a(afy, afy.f9717f, afy.f9728q);
                            int size = afy.f9712a.size();
                            for (int i = 0; i < size; i++) {
                                aqh = (aqh) afy.f9712a.get(i);
                                if (!afy.m6397b(aqh)) {
                                    afy.f9728q.m6399a();
                                    aqh.mo322a(afy.f9728q, afy.f9723l);
                                }
                            }
                            afy.f9728q.m6405f();
                            break;
                        }
                        throw new IllegalStateException("Already have resource");
                    }
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                afy.f9722k.mo58e();
                break;
            case 2:
                afy.f9713b.mo344b();
                if (!afy.f9730s) {
                    if (!afy.f9712a.isEmpty()) {
                        if (!afy.f9726o) {
                            afy.f9726o = true;
                            afy.f9715d.mo49a(afy, afy.f9717f, null);
                            for (aqh aqh2 : afy.f9712a) {
                                if (!afy.m6397b(aqh2)) {
                                    aqh2.mo321a(afy.f9725n);
                                }
                            }
                            break;
                        }
                        throw new IllegalStateException("Already failed once");
                    }
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                break;
            case 3:
                afy.f9713b.mo344b();
                if (afy.f9730s) {
                    afy.f9715d.mo48a(afy, afy.f9717f);
                    break;
                }
                throw new IllegalStateException("Not cancelled");
            default:
                int i2 = message.what;
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unrecognized message: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
        arq.m653a();
        afy.f9712a.clear();
        afy.f9717f = null;
        afy.f9728q = null;
        afy.f9722k = null;
        List list = afy.f9727p;
        if (list != null) {
            list.clear();
        }
        afy.f9726o = false;
        afy.f9730s = false;
        afy.f9724m = false;
        afd afd = afy.f9729r;
        if (afd.f9677d.m218c()) {
            afd.m6361b();
        }
        afy.f9729r = null;
        afy.f9725n = null;
        afy.f9723l = null;
        afy.f9714c.mo342a(afy);
        return true;
    }
}
