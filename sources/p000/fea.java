package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: fea */
public final class fea implements fde {
    /* renamed from: a */
    private final iqz f15893a;
    /* renamed from: b */
    private final ird f15894b;

    fea(ird ird, ira ira) {
        this.f15894b = ird;
        this.f15893a = ira.mo511a("Simple3A");
    }

    /* renamed from: a */
    public final fdf mo1357a(fip fip, fdg fdg, fim fim) {
        fec fec = new fec(fip, fdg, new fio(fim), this.f15894b, this.f15893a);
        try {
            fio fio;
            fio fio2;
            fdx b;
            ird ird;
            String valueOf;
            StringBuilder stringBuilder;
            switch (fdg.f4478b.ordinal()) {
                case 1:
                case 2:
                    fio = new fio(fec.f15901e);
                    fio2 = new fio(fec.f15901e);
                    b = fec.m10265b(fec.f15899c.f4478b, fio, fio2);
                    fec.f15900d.mo1381a(Collections.singletonList(fio2.m2301a()), fiv.REPEATING);
                    fec.f15900d.mo1381a(Collections.singletonList(fio.m2301a()), fiv.NON_REPEATING);
                    ird = fec.f15897a;
                    valueOf = String.valueOf(fec.f15899c.f4478b);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder.append("AF-");
                    stringBuilder.append(valueOf);
                    ird.mo1903a(stringBuilder.toString());
                    fec.f15902f = b.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                    break;
            }
            switch (fdg.f4477a.ordinal()) {
                case 2:
                    fio = new fio(fec.f15901e);
                    fio2 = new fio(fec.f15901e);
                    b = fec.m10263a(fec.f15899c.f4477a, fio, fio2);
                    fec.f15900d.mo1381a(Collections.singletonList(fio2.m2301a()), fiv.REPEATING);
                    fec.f15900d.mo1381a(Collections.singletonList(fio.m2301a()), fiv.NON_REPEATING);
                    ird = fec.f15897a;
                    valueOf = String.valueOf(fec.f15899c.f4477a);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder.append("AE-");
                    stringBuilder.append(valueOf);
                    ird.mo1903a(stringBuilder.toString());
                    fec.f15902f = b.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                    break;
            }
            switch (fdg.f4479c.ordinal()) {
                case 2:
                    fio = new fio(fec.f15901e);
                    fdx a = fec.m10261a(null, fio);
                    fec.f15900d.mo1381a(Collections.singletonList(fio.m2301a()), fiv.REPEATING);
                    ird = fec.f15897a;
                    String valueOf2 = String.valueOf(fec.f15899c.f4479c);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 4);
                    stringBuilder.append("AWB-");
                    stringBuilder.append(valueOf2);
                    ird.mo1903a(stringBuilder.toString());
                    fec.f15902f = a.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                    break;
            }
            return fec;
        } catch (Throwable th) {
            fec.close();
        }
    }
}
