package p000;

import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: gev */
public final class gev {
    /* renamed from: a */
    public final iqz f5117a;
    /* renamed from: b */
    public final Object f5118b;
    /* renamed from: c */
    public final LinkedList f5119c = new LinkedList();
    /* renamed from: d */
    public int f5120d;
    /* renamed from: e */
    public boolean f5121e;
    /* renamed from: f */
    public boolean f5122f = false;
    /* renamed from: g */
    private final Runnable f5123g;

    public gev(ira ira, Runnable runnable) {
        this.f5123g = runnable;
        this.f5117a = ira.mo511a("ProcessingSvcMgr");
        this.f5118b = new Object();
        this.f5120d = go.aL;
    }

    /* renamed from: a */
    public final void m2510a(geu geu) {
        synchronized (this.f5118b) {
            if (this.f5119c.contains(geu)) {
                throw new IllegalArgumentException("Task already enqueued");
            }
            this.f5119c.add(geu);
            iqz iqz = this.f5117a;
            String valueOf = String.valueOf(geu);
            int size = this.f5119c.size();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Task added [");
            stringBuilder.append(valueOf);
            stringBuilder.append("]. Queue size now: ");
            stringBuilder.append(size);
            iqz.mo514b(stringBuilder.toString());
            if (!this.f5122f) {
                m2509a();
            }
        }
    }

    /* renamed from: a */
    public final void m2509a() {
        synchronized (this.f5118b) {
            if (this.f5120d == go.aL) {
                this.f5117a.mo518d("Starting service (was DESTROYED)");
                this.f5123g.run();
                this.f5120d = go.aJ;
            } else if (this.f5120d == go.aK) {
                this.f5117a.mo518d("Scheduling service restart, is shutting down");
                this.f5121e = true;
            }
        }
    }

    /* renamed from: b */
    public final boolean m2511b() {
        boolean z = true;
        synchronized (this.f5118b) {
            if (this.f5120d != go.aJ && this.f5119c.isEmpty()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final geu m2512c() {
        synchronized (this.f5118b) {
            if (this.f5119c.isEmpty() || this.f5122f) {
                iqz iqz = this.f5117a;
                boolean z = this.f5122f;
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("Popping null. On hold? ");
                stringBuilder.append(z);
                iqz.mo514b(stringBuilder.toString());
                this.f5120d = go.aK;
                return null;
            }
            geu geu = (geu) this.f5119c.remove();
            iqz iqz2 = this.f5117a;
            int size = this.f5119c.size();
            String valueOf = String.valueOf(geu);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
            stringBuilder2.append("Popping a session. Remaining: ");
            stringBuilder2.append(size);
            stringBuilder2.append(" , task ");
            stringBuilder2.append(valueOf);
            iqz2.mo514b(stringBuilder2.toString());
            return geu;
        }
    }

    /* renamed from: d */
    public final boolean m2513d() {
        synchronized (this.f5118b) {
            if (m2511b()) {
                this.f5117a.mo514b("Not able to suspend processing.");
                return false;
            }
            this.f5117a.mo514b("Suspend processing");
            this.f5122f = true;
            return true;
        }
    }
}
