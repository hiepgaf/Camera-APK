package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: agk */
public final class agk {
    /* renamed from: a */
    private final iw f440a;
    /* renamed from: b */
    private final List f441b;
    /* renamed from: c */
    private final String f442c;

    public agk(Class cls, Class cls2, Class cls3, List list, iw iwVar) {
        this.f440a = iwVar;
        this.f441b = (List) aqe.m587a((Collection) list);
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 21) + String.valueOf(simpleName2).length()) + String.valueOf(simpleName3).length());
        stringBuilder.append("Failed LoadPath{");
        stringBuilder.append(simpleName);
        stringBuilder.append("->");
        stringBuilder.append(simpleName2);
        stringBuilder.append("->");
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.f442c = stringBuilder.toString();
    }

    /* renamed from: a */
    public final agn m243a(ady ady, adp adp, int i, int i2, afl afl) {
        List list = (List) aqe.m585a((List) this.f440a.mo341a(), "Argument must not be null");
        try {
            agn a = m242a(ady, adp, i, i2, afl, list);
            return a;
        } finally {
            this.f440a.mo342a(list);
        }
    }

    /* renamed from: a */
    private final agn m242a(ady ady, adp adp, int i, int i2, afl afl, List list) {
        agn a;
        int size = this.f441b.size();
        agn agn = null;
        int i3 = 0;
        while (i3 < size) {
            afk afk = (afk) this.f441b.get(i3);
            try {
                ads b;
                agn a2;
                adh a3;
                adr adr;
                int i4;
                adl aez;
                String valueOf;
                StringBuilder stringBuilder;
                aff aff;
                agn a4 = afk.m221a(ady, i, i2, adp);
                afd afd = afl.f411b;
                adf adf = afl.f410a;
                Class cls = a4.mo55b().getClass();
                if (adf != adf.RESOURCE_DISK_CACHE) {
                    b = afd.f9674a.m207b(cls);
                    a2 = b.mo2591a(afd.f9678e, a4, afd.f9682i, afd.f9683j);
                } else {
                    b = null;
                    a2 = a4;
                }
                if (!a4.equals(a2)) {
                    a4.mo58e();
                }
                if (afd.f9674a.f370c.f211d.f227b.m561a(a2.mo56c()) != null) {
                    adr a5 = afd.f9674a.f370c.f211d.f227b.m561a(a2.mo56c());
                    if (a5 == null) {
                        throw new aci(a2.mo56c());
                    }
                    a3 = a5.mo2592a(afd.f9685l);
                    adr = a5;
                } else {
                    a3 = adh.NONE;
                    adr = null;
                }
                afc afc = afd.f9674a;
                adl adl = afd.f9690q;
                List b2 = afc.m208b();
                int size2 = b2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (((aka) b2.get(i5)).f506a.equals(adl)) {
                        i4 = 1;
                        if (afd.f9684k.mo45a(i4 ^ 1, adf, a3)) {
                            if (adr != null) {
                                throw new aci(a2.mo55b().getClass());
                            }
                            switch (a3.ordinal()) {
                                case 0:
                                    aez = new aez(afd.f9690q, afd.f9679f);
                                    break;
                                case 1:
                                    aez = new agp(afd.f9674a.f370c.f210c, afd.f9690q, afd.f9679f, afd.f9682i, afd.f9683j, b, cls, afd.f9685l);
                                    break;
                                default:
                                    valueOf = String.valueOf(a3);
                                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                                    stringBuilder.append("Unknown strategy: ");
                                    stringBuilder.append(valueOf);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            a2 = agl.m6406a(a2);
                            aff = afd.f9676c;
                            aff.f386a = aez;
                            aff.f387b = adr;
                            aff.f388c = a2;
                        }
                        a = afk.f405a.mo315a(a2, adp);
                        if (a != null) {
                            i3++;
                            agn = a;
                        } else if (a == null) {
                            return a;
                        } else {
                            throw new agg(this.f442c, new ArrayList(list));
                        }
                    }
                }
                i4 = 0;
                if (afd.f9684k.mo45a(i4 ^ 1, adf, a3)) {
                    if (adr != null) {
                        switch (a3.ordinal()) {
                            case 0:
                                aez = new aez(afd.f9690q, afd.f9679f);
                                break;
                            case 1:
                                aez = new agp(afd.f9674a.f370c.f210c, afd.f9690q, afd.f9679f, afd.f9682i, afd.f9683j, b, cls, afd.f9685l);
                                break;
                            default:
                                valueOf = String.valueOf(a3);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                                stringBuilder.append("Unknown strategy: ");
                                stringBuilder.append(valueOf);
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        a2 = agl.m6406a(a2);
                        aff = afd.f9676c;
                        aff.f386a = aez;
                        aff.f387b = adr;
                        aff.f388c = a2;
                    } else {
                        throw new aci(a2.mo55b().getClass());
                    }
                }
                a = afk.f405a.mo315a(a2, adp);
            } catch (agg e) {
                list.add(e);
                a = agn;
            }
            if (a != null) {
                i3++;
                agn = a;
            } else if (a == null) {
                return a;
            } else {
                throw new agg(this.f442c, new ArrayList(list));
            }
        }
        a = agn;
        if (a == null) {
            return a;
        }
        throw new agg(this.f442c, new ArrayList(list));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f441b.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 22);
        stringBuilder.append("LoadPath{decodePaths=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
