package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fds */
public final class fds implements fel {
    /* renamed from: a */
    public final fem mo1361a(fip fip, fim fim) {
        return new fdt();
    }

    /* renamed from: a */
    public static fis m10241a(fis... fisArr) {
        kbg kbg = kau.f19138a;
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Set hashSet3 = new HashSet();
        kbg kbg2 = kbg;
        for (fis fis : fisArr) {
            if (fis.f4581a.mo2084b()) {
                kbg2 = fis.f4581a;
            }
            hashSet.addAll(fis.f4582b);
            hashSet2.addAll(fis.f4583c);
            hashSet3.addAll(fis.f4584d);
        }
        return new fis(kbg2, hashSet, hashSet2, hashSet3);
    }

    /* renamed from: a */
    public static fjl m10244a(fjk fjk, int i) {
        fjl a = fjk.mo1398a();
        try {
            a.mo3437a(i).get();
            return a;
        } catch (InterruptedException e) {
            a.close();
            throw e;
        } catch (Throwable e2) {
            a.close();
            throw new isr(e2);
        }
    }

    /* renamed from: a */
    public static ilp m10246a(Key key, ilp ilp) {
        return ilq.m3817a(ilq.m3817a(ilp, new fiu(key)), fit.f16064a);
    }

    /* renamed from: a */
    public static fiw m10242a(iqt iqt) {
        return new fiy(iqt, iqt);
    }

    /* renamed from: b */
    public static fiw m10249b(iqt iqt) {
        return new fja(iqt, iqt);
    }

    /* renamed from: a */
    public static fis m10239a(Collection collection) {
        return new fis(kau.f19138a, Collections.emptySet(), keu.m13477a(collection), Collections.emptySet());
    }

    /* renamed from: b */
    public static fiw m10250b(Collection collection) {
        return new fix(collection);
    }

    /* renamed from: a */
    public static fiw m10243a(fiw... fiwArr) {
        return new fix(fiwArr);
    }

    /* renamed from: a */
    public static fis m10236a(Key key, Object obj) {
        return fds.m10238a(new fin(key, obj));
    }

    /* renamed from: a */
    public static fis m10238a(fin fin) {
        return new fis(kau.f19138a, Collections.emptySet(), Collections.emptySet(), keu.m13472a((Object) fin));
    }

    /* renamed from: a */
    public static fis m10240a(List list) {
        return new fis(kau.f19138a, Collections.emptySet(), Collections.emptySet(), keu.m13477a((Collection) list));
    }

    /* renamed from: c */
    public static fiw m10251c(iqt iqt) {
        return new fiz(iqt, iqt);
    }

    /* renamed from: a */
    public static fis m10237a(fhy fhy) {
        return new fis(kau.f19138a, keu.m13472a((Object) fhy), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    public static fis m10235a(int i) {
        return new fis(kbg.m4745c(Integer.valueOf(i)), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    public static iwz m10247a(fjj fjj, int... iArr) {
        iwz f = fjj.mo3045f();
        iwz iwz = null;
        int i = -1;
        while (f != null) {
            iwz iwz2;
            if (khx.m4942a(iArr, f.mo2716c())) {
                int g = f.mo2720g() * f.mo2717d();
                if (g <= i) {
                    iwz2 = iwz;
                } else if (iwz != null) {
                    iwz.close();
                    i = g;
                    iwz2 = f;
                } else {
                    i = g;
                    iwz2 = f;
                }
            } else {
                f.close();
                iwz2 = iwz;
            }
            f = fjj.mo3045f();
            iwz = iwz2;
        }
        fjj.close();
        return iwz;
    }

    /* renamed from: a */
    public static fis m10234a() {
        return new fis(kau.f19138a, Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: b */
    public static fiw m10248b() {
        return new fiw('\u0000');
    }

    /* renamed from: c */
    public final void mo1362c() {
    }

    /* renamed from: a */
    public static fko m10245a(fmg fmg, int i) {
        while (i >= 2) {
            fko fmi;
            fjl a = fmg.f4622a.mo1398a();
            if (a.mo3438b(i)) {
                fmi = new fmi(a);
            } else {
                a.close();
                fmi = null;
            }
            if (fmi != null) {
                return fmi;
            }
            i--;
        }
        return null;
    }
}
