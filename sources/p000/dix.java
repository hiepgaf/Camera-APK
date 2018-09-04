package p000;

import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dix */
public final class dix implements bfs, iqo {
    /* renamed from: a */
    public static final String f13456a = bli.m862a("CdrActiveCapSsn");
    /* renamed from: A */
    private final dju f13457A;
    /* renamed from: B */
    private final gxz f13458B;
    /* renamed from: C */
    private final eqa f13459C;
    /* renamed from: D */
    private final ikb f13460D = new ikb();
    /* renamed from: b */
    public final bdy f13461b;
    /* renamed from: c */
    public final Executor f13462c;
    /* renamed from: d */
    public final ikd f13463d;
    /* renamed from: e */
    public final gci f13464e;
    /* renamed from: f */
    public final hat f13465f;
    /* renamed from: g */
    public final cqx f13466g;
    /* renamed from: h */
    public final hkv f13467h;
    /* renamed from: i */
    public final djz f13468i;
    /* renamed from: j */
    public final dkd f13469j;
    /* renamed from: k */
    public final erk f13470k;
    /* renamed from: l */
    public final Object f13471l = new Object();
    /* renamed from: m */
    public final bcv f13472m;
    /* renamed from: n */
    public final hkw f13473n;
    /* renamed from: o */
    public boolean f13474o = false;
    /* renamed from: p */
    public final List f13475p = new ArrayList();
    /* renamed from: q */
    public hkk f13476q;
    /* renamed from: r */
    public hks f13477r;
    /* renamed from: s */
    public final gsp f13478s;
    /* renamed from: t */
    public djn f13479t = djn.NO_RECORDING;
    /* renamed from: u */
    public final gnh f13480u;
    /* renamed from: v */
    private final iut f13481v;
    /* renamed from: w */
    private final hfz f13482w;
    /* renamed from: x */
    private final Executor f13483x;
    /* renamed from: y */
    private final cqm f13484y;
    /* renamed from: z */
    private final djo f13485z;

    public dix(bdy bdy, Executor executor, iut iut, Executor executor2, hfz hfz, ikd ikd, gci gci, cqm cqm, hat hat, cqx cqx, djo djo, dju dju, hkv hkv, djz djz, dkd dkd, erk erk, gxz gxz, eqa eqa, gsp gsp, bcv bcv, ast ast, hks hks, gnh gnh) {
        this.f13461b = (bdy) this.f13460D.mo1879a(bdy);
        this.f13462c = executor;
        this.f13481v = iut;
        this.f13483x = executor2;
        this.f13482w = hfz;
        this.f13463d = ikd;
        this.f13464e = gci;
        this.f13484y = cqm;
        this.f13465f = hat;
        this.f13466g = cqx;
        this.f13485z = djo;
        this.f13457A = dju;
        this.f13467h = hkv;
        this.f13468i = djz;
        this.f13469j = dkd;
        this.f13470k = erk;
        this.f13458B = gxz;
        this.f13459C = eqa;
        this.f13478s = gsp;
        this.f13472m = bcv;
        this.f13477r = hks;
        this.f13480u = gnh;
        this.f13473n = new hkw(this);
        this.f13460D.mo1879a(ast);
    }

    public final void close() {
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        bli.m871d(f13456a, "close");
        synchronized (this.f13471l) {
            if (this.f13479t == djn.CLOSED) {
                bli.m866b(f13456a, "ActiveCamcorderCaptureSession has been closed.");
                return;
            }
            bli.m863a(f13456a, "close");
            if (this.f13479t == djn.RECORDING || this.f13479t == djn.STARTING_RECORDING) {
                this.f13463d.execute(new diy(this));
            }
            if (this.f13479t == djn.RECORDING) {
                jri.m13152b(this.f13476q);
                kpk a = this.f13476q.m3228a(true);
                this.f13476q = null;
                try {
                    hku hku = (hku) a.get();
                    m9124b(hku);
                    this.f13483x.execute(new djc(this, hku));
                } catch (InterruptedException e2) {
                    e = e2;
                    str = f13456a;
                    valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to close current recording: ");
                    stringBuilder.append(valueOf);
                    bli.m866b(str, stringBuilder.toString());
                    m9129g();
                    this.f13463d.execute(new diz(this));
                    this.f13479t = djn.CLOSED;
                    this.f13460D.close();
                } catch (ExecutionException e3) {
                    e = e3;
                    str = f13456a;
                    valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to close current recording: ");
                    stringBuilder.append(valueOf);
                    bli.m866b(str, stringBuilder.toString());
                    m9129g();
                    this.f13463d.execute(new diz(this));
                    this.f13479t = djn.CLOSED;
                    this.f13460D.close();
                }
            }
            if (this.f13479t == djn.RECORDING || this.f13479t == djn.STARTING_RECORDING || this.f13479t == djn.STOPPING_RECORDING) {
                m9129g();
                this.f13463d.execute(new diz(this));
            }
            this.f13479t = djn.CLOSED;
            this.f13460D.close();
        }
    }

    /* renamed from: a */
    final synchronized void m9122a(hku hku) {
        synchronized (hku.f6314b) {
            List list = hku.f6314b;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                bju bju = (bju) listIterator.previous();
                dju dju = this.f13457A;
                dju.f3108a.mo1587a(bju.f1214b.getName(), this.f13481v, bju.f1213a, bju.f1219g, bju.f1218f, (float) (bju.f1222j / 1000));
                djo djo = this.f13485z;
                epy epy = new epy(djo.f3105b);
                epy.f4067a = bju.f1214b;
                epy.f4068b = bju.f1215c;
                epy = epy.m1995a(bju.f1216d);
                epy.f4069c = iqm.m4037a(bju.f1220h);
                kbg b = kbg.m4744b(djo.f3104a.insert(Media.EXTERNAL_CONTENT_URI, epy.m1994a(bju.f1217e).m1993a(bju.f1221i).m1996a(bju.f1214b.getName()).m1992a().f4066a));
                if (b.mo2084b()) {
                    this.f13482w.mo1009a(this.f13484y.m8618a((Uri) b.mo2081a()), true);
                } else {
                    String str = f13456a;
                    String valueOf = String.valueOf(bju);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    stringBuilder.append("Could not insert video snapshot ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" into MediaStore");
                    bli.m866b(str, stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: c */
    final djm m9125c() {
        Object d = kpw.m18056d();
        Uri a = this.f13478s.mo1633a();
        eqi b = this.f13459C.mo1261b(System.currentTimeMillis(), a.getLastPathSegment(), glw.VIDEO, d, this.f13461b.mo2658a().mo1896f().f7150c);
        this.f13480u.m2635a(a, glw.VIDEO, b);
        return new dhr(a, b, d);
    }

    /* renamed from: b */
    final void m9124b(hku hku) {
        if (!hku.f6313a.isEmpty()) {
            int size = hku.f6313a.size() - this.f13475p.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    this.f13475p.add(m9125c());
                }
            }
            int i2 = 0;
            for (bgl bgl : hku.f6313a) {
                djm djm = (djm) this.f13475p.get(i2);
                String str = f13456a;
                String valueOf = String.valueOf(bgl);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("recordingDidSucceed: videoFile=");
                stringBuilder.append(valueOf);
                bli.m869c(str, stringBuilder.toString());
                dju dju = this.f13457A;
                dju.f3108a.mo1593a(false, bgl.f1133a.getName(), this.f13481v, bgl.f1134b.mo1897g().m3881c(), bgl.f1137e, bgl.f1133a.length(), (float) bgl.m813a(), bgl.f1136d, dju.f3109b.m1641a(), dju.f3109b.m1644b(), bgl.f1139g);
                djm.mo1148b().mo3557a(new eqr(bgl));
                jri.m13152b(djm.mo1147a());
                kow.m13622a(djm.mo1147a().mo1262a(), new djl(this, djm), kpq.f8410a);
                i2++;
            }
        }
        this.f13475p.clear();
    }

    /* renamed from: a */
    public final void mo1154a() {
        kow.m13622a(m9130h(), new dje(this), this.f13463d);
    }

    /* renamed from: b */
    public final void mo1155b() {
        kow.m13622a(m9130h(), new djf(this), this.f13463d);
    }

    /* renamed from: d */
    public final boolean m9126d() {
        ikd.m12259a();
        synchronized (this.f13471l) {
            hkk hkk = this.f13476q;
            if (hkk != null) {
                boolean a = hkk.m3229a();
                return a;
            }
            return false;
        }
    }

    /* renamed from: e */
    public final boolean m9127e() {
        ikd.m12259a();
        synchronized (this.f13471l) {
            hkk hkk = this.f13476q;
            if (hkk != null) {
                boolean b = hkk.m3230b();
                return b;
            }
            return false;
        }
    }

    /* renamed from: f */
    final void m9128f() {
        this.f13464e.mo1449g();
        this.f13468i.m9150b();
        this.f13465f.mo1701c();
        this.f13467h.f6321g.m9611c(true);
    }

    /* renamed from: g */
    final void m9129g() {
        this.f13469j.mo1164d();
        this.f13469j.mo1163c();
    }

    /* renamed from: h */
    final kpk m9130h() {
        kpk d;
        boolean z = true;
        synchronized (this.f13471l) {
            if (this.f13479t != djn.RECORDING) {
                z = false;
            }
            jri.m13153b(z);
            this.f13479t = djn.STOPPING_RECORDING;
            this.f13467h.m3239c(true);
            jri.m13152b(this.f13476q);
            d = kpw.m18056d();
            this.f13483x.execute(new dja(this, this.f13476q.f6291b.mo2673g(), d));
            kpk a = this.f13476q.m3228a(false);
            this.f13476q = null;
            d = kny.m18045a(iel.m3717a(d, a, new dji(this), this.f13463d), new djj(this), this.f13483x);
            kow.m13622a(d, new djk(this), this.f13463d);
        }
        return d;
    }
}
