package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jgp */
public class jgp implements jgo {
    /* renamed from: a */
    public final Object f21846a = new Object();
    /* renamed from: b */
    public final Executor f21847b;
    /* renamed from: c */
    private final kpw f21848c = kpw.m18056d();
    /* renamed from: d */
    private final Set f21849d = new HashSet();
    /* renamed from: e */
    private final List f21850e = new ArrayList();
    /* renamed from: f */
    private long f21851f = 0;
    /* renamed from: g */
    private final kpw f21852g = kpw.m18056d();

    public jgp(Executor executor) {
        this.f21847b = executor;
    }

    /* renamed from: a */
    public final void mo3169a(jgx jgx, long j, long j2) {
        long j3 = this.f21851f;
        if (j < j3) {
            StringBuilder stringBuilder = new StringBuilder(94);
            stringBuilder.append("Promised minimum cut timestamp ");
            stringBuilder.append(j3);
            stringBuilder.append(" later than requested: ");
            stringBuilder.append(j);
            throw new RuntimeException(stringBuilder.toString());
        } else if (this.f21848c.isDone()) {
            synchronized (this.f21846a) {
                this.f21849d.add(new jhl(jgx, j, j2));
                ArrayList arrayList = new ArrayList();
                for (jgu jgu : this.f21850e) {
                    jhl jhl = new jhl(jgx.mo1292a(jgu.f18775a), j, j2);
                    jgu.f18777c.add(jhl);
                    arrayList.add(new jgr(this, jgu, jhl));
                }
                jgx.mo1293a();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
            }
        } else {
            throw new IllegalStateException("CookieCutterMuxer should be started before adding cuts");
        }
    }

    /* renamed from: a */
    public final jhf mo1292a(jhe jhe) {
        jhf jgu;
        synchronized (this.f21846a) {
            jgu = new jgu(this, jhe);
            this.f21850e.add(jgu);
        }
        return jgu;
    }

    /* renamed from: c */
    final /* synthetic */ kpk m16265c() {
        Iterable arrayList = new ArrayList();
        synchronized (this.f21846a) {
            for (jhl jhl : this.f21849d) {
                arrayList.add(((jgx) jhl.f7835a).mo1294b());
            }
        }
        return kny.m18045a(kow.m13616a(arrayList), jgt.f18774a, kpq.f8410a);
    }

    /* renamed from: a */
    public final void mo3168a(long j) {
        synchronized (this.f21846a) {
            if (this.f21848c.isDone()) {
                this.f21851f = Math.max(this.f21851f, j);
                for (jgu jgu : this.f21850e) {
                    Iterator it = jgu.f18776b.iterator();
                    while (it.hasNext() && ((jgy) it.next()).f7819b.presentationTimeUs < j) {
                        it.remove();
                    }
                }
            } else {
                throw new IllegalStateException("Please call this method only after start().");
            }
        }
    }

    /* renamed from: a */
    public final void mo1293a() {
        synchronized (this.f21846a) {
            Iterable arrayList = new ArrayList();
            for (jgu jgu : this.f21850e) {
                arrayList.add(jgu.f18778d);
            }
            this.f21852g.mo3616b(kow.m13616a(arrayList));
        }
        this.f21848c.mo3557a(null);
    }

    /* renamed from: a */
    final void m16263a(jhl jhl, jgy jgy) {
        this.f21847b.execute(new jgs(jhl, jgy));
    }

    /* renamed from: b */
    public final kpk mo1294b() {
        return kny.m18046a(this.f21852g, new jgq(this), this.f21847b);
    }
}
