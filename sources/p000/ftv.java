package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ftv */
final class ftv implements fux {
    /* renamed from: a */
    public final fud f21412a;
    /* renamed from: b */
    private final fux f21413b;
    /* renamed from: c */
    private final kpk f21414c;
    /* renamed from: d */
    private final fuc f21415d;

    ftv(fux fux, kpk kpk, fud fud, fuc fuc) {
        this.f21413b = fux;
        this.f21414c = kpk;
        this.f21412a = fud;
        this.f21415d = fuc;
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        fud fud = this.f21412a;
        long f = iwz.mo2719f();
        synchronized (fud.f16527b.f4726d) {
            Set set = fud.f16526a.f4718e;
            Long valueOf = Long.valueOf(f);
            set.add(valueOf);
            fud.f16527b.f4727e.put(valueOf, fud.f16526a);
        }
        iwz iuz;
        fuc fuc;
        iwz fkp;
        long f2;
        fub a;
        Map map;
        Long valueOf2;
        OutputStream byteArrayOutputStream;
        if (Arrays.asList(new Integer[]{Integer.valueOf(37), Integer.valueOf(38), Integer.valueOf(32)}).contains(Integer.valueOf(iwz.mo2716c()))) {
            iuz = new iuz(iwz, 2);
            fuc = this.f21415d;
            fkp = new fkp(new iva(iuz), kpk);
            synchronized (fuc.f4726d) {
                f2 = fkp.mo2719f();
                a = fuc.m2392a(f2);
                map = a.f4716c;
                valueOf2 = Long.valueOf(f2);
                jri.m13154b(map.containsKey(valueOf2) ^ 1, (Object) "Image already added");
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fuc.f4723a.mo1423a(fkp, byteArrayOutputStream);
                    a.f4716c.put(valueOf2, byteArrayOutputStream.toByteArray());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            this.f21413b.mo2642a(new iva(iuz), kpk);
        } else if (iwz.mo2716c() == 35) {
            iuz = new iuz(iwz, 2);
            fuc = this.f21415d;
            fkp = new fkp(new iva(iuz), kpk);
            synchronized (fuc.f4726d) {
                f2 = fkp.mo2719f();
                a = fuc.m2392a(f2);
                map = a.f4715b;
                valueOf2 = Long.valueOf(f2);
                jri.m13154b(map.containsKey(valueOf2) ^ 1, (Object) "Image already added");
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fuc.f4724b.mo1423a(fkp, byteArrayOutputStream);
                    a.f4715b.put(valueOf2, byteArrayOutputStream.toByteArray());
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f21413b.mo2642a(new iva(iuz), kpk);
        } else {
            this.f21413b.mo2642a(iwz, kpk);
        }
        fuc fuc2 = this.f21415d;
        f = iwz.mo2719f();
        synchronized (fuc2.f4726d) {
            fuc2.m2392a(f).f4717d.put(Long.valueOf(f), kpk);
        }
    }

    public final void close() {
        kow.m13622a(this.f21414c, new ftw(this), kpq.f8410a);
        this.f21413b.close();
    }
}
