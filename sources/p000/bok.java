package p000;

import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bok */
public final class bok implements bou {
    /* renamed from: a */
    private final bog f20121a;
    /* renamed from: b */
    private final ilp f20122b;
    /* renamed from: c */
    private final iqo f20123c;
    /* renamed from: d */
    private final iqo f20124d;
    /* renamed from: e */
    private final iqz f20125e;
    /* renamed from: f */
    private final boo f20126f;
    /* renamed from: g */
    private final iqt f20127g;
    /* renamed from: h */
    private final iqt f20128h;
    /* renamed from: i */
    private boolean f20129i;
    /* renamed from: j */
    private final Object f20130j = new Object();

    public bok(bog bog, boo boo, ilp ilp, ilp ilp2, ira ira, Executor executor) {
        this.f20121a = bog;
        this.f20126f = boo;
        this.f20122b = ilp;
        this.f20125e = ira.mo511a("ElmyraConnH");
        this.f20125e.mo518d("ElmyraConnectionHandler created.");
        this.f20127g = new bol(this, ilp2);
        this.f20128h = new bom(this, ilp);
        this.f20123c = ilp.mo2859a(this.f20127g, executor);
        this.f20124d = ilp2.mo2859a(this.f20128h, executor);
    }

    public final void close() {
        synchronized (this.f20130j) {
            if (this.f20129i) {
                return;
            }
            this.f20123c.close();
            this.f20124d.close();
            mo2690a();
            this.f20129i = true;
        }
    }

    /* renamed from: a */
    public final void mo2690a() {
        synchronized (this.f20130j) {
            if (this.f20129i) {
                return;
            }
            m14855c();
        }
    }

    /* renamed from: a */
    final void m14857a(hhx hhx, boolean z) {
        iqz iqz = this.f20125e;
        String valueOf = String.valueOf(hhx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
        stringBuilder.append("ApplicationMode is now: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", AGSA availability is now: ");
        stringBuilder.append(z);
        iqz.mo518d(stringBuilder.toString());
        boo boo = this.f20126f;
        m14855c();
    }

    /* renamed from: b */
    public final void mo2691b() {
        synchronized (this.f20130j) {
            if (this.f20129i) {
                return;
            }
            this.f20127g.mo348a((hhx) this.f20122b.mo2860b());
        }
    }

    /* renamed from: c */
    private final void m14855c() {
        synchronized (this.f20130j) {
            if (this.f20129i) {
                return;
            }
            this.f20125e.mo518d("ElmyraClient unbinding from service.");
            bog bog = this.f20121a;
            synchronized (bog.f1358b) {
                if (bog.f1364h) {
                    bog.f1357a.unbindService(bog.f1359c);
                    bog.f1364h = false;
                }
            }
            bog = this.f20121a;
            synchronized (bog.f1358b) {
                bog.f1362f = null;
                kaq kaq = bog.f1361e;
                if (kaq == null) {
                    Log.w("ElmyraClient", "Service is null, should try to reconnect");
                } else {
                    if (null != null) {
                        try {
                            kaq.mo2080a(bog.f1363g, (IBinder) bog.f1360d);
                        } catch (Throwable e) {
                            String str;
                            String str2 = "ElmyraClient";
                            if (null != null) {
                                str = "check";
                            } else {
                                str = "unregister";
                            }
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
                            stringBuilder.append("Failed to ");
                            stringBuilder.append(str);
                            stringBuilder.append(" listener");
                            Log.e(str2, stringBuilder.toString(), e);
                        }
                    } else {
                        kaq.mo2080a(bog.f1363g, null);
                    }
                }
            }
        }
    }
}
