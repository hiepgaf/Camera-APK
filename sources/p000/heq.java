package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: heq */
public final class heq {
    /* renamed from: a */
    private static final String f6108a = bli.m862a("ViewfinderSizeSel");
    /* renamed from: b */
    private final iqp f6109b;
    /* renamed from: c */
    private final bkw f6110c;

    public heq(iqp iqp, bkw bkw) {
        this.f6109b = iqp;
        this.f6110c = bkw;
    }

    /* renamed from: a */
    public final iqp m3098a(List list, ipz ipz, iut iut, boolean z) {
        String a;
        boolean z2;
        double d = ((double) ipz.f7305c) / ((double) ipz.f7306d);
        jri.m13152b((Object) list);
        jri.m13143a(list.isEmpty() ^ 1);
        if (!z) {
            if (iut == iut.FRONT) {
                a = ije.m3774a(this.f6110c.f1255a, "camera:blacklisted_preview_resolutions_back", "");
            } else {
                a = ije.m3774a(this.f6110c.f1255a, "camera:blacklisted_preview_resolutions_back", "");
            }
            list = gly.m11183a(list, a);
        }
        int i = 0;
        for (iqp iqp : r19) {
            if (iqp.f7330b <= 1080) {
                i++;
            }
        }
        Object arrayList = new ArrayList(i);
        for (iqp iqp2 : r19) {
            int i2 = iqp2.f7330b;
            if (i2 <= 1080) {
                arrayList.add(new iqp(iqp2.f7329a, i2));
            }
        }
        jri.m13152b(arrayList);
        jri.m13143a(arrayList.isEmpty() ^ 1);
        iqp iqp22 = this.f6109b;
        int min = Math.min(iqp22.f7329a, iqp22.f7330b);
        i = -1;
        int i3 = 0;
        double d2 = Double.MAX_VALUE;
        while (i3 < arrayList.size()) {
            double d3;
            double d4;
            iqp22 = (iqp) arrayList.get(i3);
            if (Math.abs((((double) iqp22.f7329a) / ((double) iqp22.f7330b)) - d) > 0.02d) {
                d3 = d2;
                i2 = i;
                d4 = d3;
            } else {
                double abs = (double) Math.abs(iqp22.f7330b - min);
                if (abs < d2) {
                    d4 = abs;
                    i2 = i3;
                } else if (abs != d2) {
                    d3 = d2;
                    i2 = i;
                    d4 = d3;
                } else if (iqp22.f7330b < min) {
                    d4 = abs;
                    i2 = i3;
                } else {
                    d3 = d2;
                    i2 = i;
                    d4 = d3;
                }
            }
            i3++;
            i = i2;
            d2 = d4;
        }
        if (i == -1) {
            a = f6108a;
            String valueOf = String.valueOf(arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
            stringBuilder.append("No preview size match the aspect ratio. available sizes: ");
            stringBuilder.append(valueOf);
            bli.m873e(a, stringBuilder.toString());
            int i4 = 0;
            d2 = Double.MAX_VALUE;
            while (i4 < arrayList.size()) {
                iqp22 = (iqp) arrayList.get(i4);
                if (((double) Math.abs(iqp22.f7330b - min)) >= d2) {
                    d3 = d2;
                    i2 = i;
                    d4 = d3;
                } else {
                    d4 = (double) Math.abs(iqp22.f7330b - min);
                    i2 = i4;
                }
                i4++;
                i = i2;
                d2 = d4;
            }
        }
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13153b(z2);
        return (iqp) arrayList.get(i);
    }

    /* renamed from: a */
    public final iqp m3099a(List list, iqp iqp, iut iut) {
        return m3098a(list, ipz.m4019b(iqp), iut, false);
    }
}
