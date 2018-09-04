package p000;

import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: esg */
final /* synthetic */ class esg implements Runnable {
    /* renamed from: a */
    private final esd f4188a;
    /* renamed from: b */
    private final esu f4189b;
    /* renamed from: c */
    private final long f4190c;
    /* renamed from: d */
    private final File f4191d;
    /* renamed from: e */
    private final int f4192e;
    /* renamed from: f */
    private final kpk f4193f;
    /* renamed from: g */
    private final Uri f4194g;

    esg(esd esd, esu esu, long j, File file, int i, kpk kpk, Uri uri) {
        this.f4188a = esd;
        this.f4189b = esu;
        this.f4190c = j;
        this.f4191d = file;
        this.f4192e = i;
        this.f4193f = kpk;
        this.f4194g = uri;
    }

    public final void run() {
        eug a;
        esd esd = this.f4188a;
        Object obj = this.f4189b;
        long j = this.f4190c;
        File file = this.f4191d;
        int i = this.f4192e;
        kpk kpk = this.f4193f;
        Uri uri = this.f4194g;
        esu esu = (esu) jri.m13152b(obj);
        eyb eyb = esu.f4212b;
        if (eyb != null) {
            eyb.f15745b.m8014a(eyb.f15747d);
        }
        synchronized (esd.f15449g) {
            esd.f15453k.remove(Long.valueOf(j));
            ety ety = new ety(esd);
            String str = esd.f15443a;
            String valueOf = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("Attempting to take microvideo for ");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            eyy eyy = esu.f4215e;
            eyt eyv = new eyv(eyy.f4372a, TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS), (List) eyy.f4373b.mo345a(), esd.f15450h, eyy.f4375d, eyy.f4374c);
            bsn bsn = eyy.f4374c.f1307a;
            long a2 = eyv.mo1319a();
            euw euw = new euw();
            kpk d = kpw.m18056d();
            fah fah = new fah();
            kpw d2 = kpw.m18056d();
            ezc ezc = new ezc(esd, file, a2, i, j, euw, d, kpk, fah, d2);
            valueOf = esd.f15443a;
            stringBuilder = new StringBuilder(55);
            stringBuilder.append("We have starting timestamp CROSS <");
            stringBuilder.append(a2);
            stringBuilder.append(">");
            bli.m863a(valueOf, stringBuilder.toString());
            a = esu.f4211a.mo1306a(ezc, Math.max(0, a2), j);
            a.f15560g.mo3616b(d);
            esd.f15448f.put(uri, new eso(a, file, euw, esd.f15451i, System.currentTimeMillis(), esd.f15450h));
            esd.f15452j = esd.f15451i + 1500000;
            eyv.mo1320a(new ess(d2, fah, new ezr(file, a)));
            bli.m863a(esd.f15443a, "startup done HLINE");
        }
        a.f15558e.mo1985a(esf.f4187a, esd.f15444b);
    }
}
