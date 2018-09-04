package p000;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bnu */
final class bnu implements bno {
    /* renamed from: a */
    private final bno f11110a;
    /* renamed from: b */
    private final in f11111b = new in();
    /* renamed from: c */
    private final iqz f11112c;
    /* renamed from: d */
    private final iqx f11113d;

    bnu(bno bno, iqz iqz, iqx iqx) {
        this.f11110a = bno;
        this.f11112c = iqz;
        this.f11113d = iqx;
    }

    /* renamed from: b */
    private static String m7622b(long j) {
        long convert = TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS);
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(convert);
        stringBuilder.append(" MS");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo531a(long j) {
        long nanoTime = System.nanoTime();
        long longValue = ((Long) this.f11111b.m3869b(j)).longValue();
        iqz iqz = this.f11112c;
        String b = bnu.m7622b(nanoTime - longValue);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 49);
        stringBuilder.append("Compression time for image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(b);
        iqz.mo514b(stringBuilder.toString());
        this.f11110a.mo531a(j);
    }

    /* renamed from: a */
    public final void mo534a(UUID uuid, long j, IOException iOException) {
        iqz iqz = this.f11112c;
        String message = iOException.getMessage();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(message).length() + 41);
        stringBuilder.append("Error saving image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(message);
        iqz.mo516c(stringBuilder.toString());
        this.f11110a.mo534a(uuid, j, iOException);
    }

    /* renamed from: a */
    public final void mo532a(bnk bnk) {
        long nanoTime = System.nanoTime();
        this.f11113d.m4059a();
        long longValue = ((Long) this.f11111b.m3869b(bnk.f11071c)).longValue();
        this.f11111b.m3866a(bnk.f11071c);
        iqz iqz = this.f11112c;
        long j = bnk.f11071c;
        String b = bnu.m7622b(nanoTime - longValue);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 48);
        stringBuilder.append("Total save time for image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(b);
        iqz.mo514b(stringBuilder.toString());
        this.f11110a.mo532a(bnk);
    }

    /* renamed from: a */
    public final void mo533a(fkp fkp) {
        this.f11111b.m3867a(fkp.mo2719f(), Long.valueOf(System.nanoTime()));
        this.f11110a.mo533a(fkp);
    }
}
