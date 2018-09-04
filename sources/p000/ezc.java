package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: ezc */
public final class ezc implements ezi, kbn {
    /* renamed from: a */
    private final esd f15794a;
    /* renamed from: b */
    private final File f15795b;
    /* renamed from: c */
    private final long f15796c;
    /* renamed from: d */
    private final int f15797d;
    /* renamed from: e */
    private final long f15798e;
    /* renamed from: f */
    private final euw f15799f;
    /* renamed from: g */
    private final kpw f15800g;
    /* renamed from: h */
    private final kpk f15801h;
    /* renamed from: i */
    private final kpw f15802i;

    public ezc(esd esd, File file, long j, int i, long j2, euw euw, kpw kpw, kpk kpk, fah fah, kpw kpw2) {
        this.f15794a = esd;
        this.f15795b = file;
        this.f15796c = j;
        this.f15797d = i;
        this.f15798e = j2;
        this.f15799f = euw;
        this.f15800g = kpw;
        this.f15801h = kpk;
        this.f15802i = kpw2;
    }

    /* renamed from: a */
    public final String mo1321a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Object mo605b() {
        esd esd = this.f15794a;
        File file = this.f15795b;
        long j = this.f15796c;
        int i = this.f15797d;
        long j2 = this.f15798e;
        euw euw = this.f15799f;
        kpw kpw = this.f15800g;
        kpk kpk = this.f15801h;
        knk knk = this.f15802i;
        String str = esd.f15443a;
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
        stringBuilder.append("Created muxer for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" for shutter <");
        stringBuilder.append(j);
        stringBuilder.append(">");
        bli.m863a(str, stringBuilder.toString());
        euh euh = esd.f15447e;
        Object fai = new fai(new eus(new eup(new etp(((jhj) new jhj(esd.f15444b).m12844a(file)).m12843a(i).m12845b().m12842a(), j2, kpw, kpk, esd.f15444b)), euw));
        knk.mo3557a(fai);
        return fai.f4406a;
    }

    /* renamed from: a */
    public final boolean mo1322a(gid gid, gid gid2) {
        throw new NoSuchMethodError();
    }
}
