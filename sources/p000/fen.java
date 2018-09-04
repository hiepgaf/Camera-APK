package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: fen */
public final class fen {
    /* renamed from: a */
    private static final String f4496a = bli.m862a("TgrMachine");
    /* renamed from: b */
    private final Integer f4497b;
    /* renamed from: c */
    private final int f4498c;
    /* renamed from: d */
    private final Set f4499d;
    /* renamed from: e */
    private final fep f4500e;
    /* renamed from: f */
    private feo f4501f;
    /* renamed from: g */
    private Long f4502g;
    /* renamed from: h */
    private Long f4503h;
    /* renamed from: i */
    private Long f4504i;

    public fen(Integer num, Set set, int i, fep fep) {
        this.f4497b = num;
        this.f4499d = set;
        this.f4498c = i;
        this.f4500e = fep;
        this.f4501f = feo.WAITING_FOR_TRIGGER;
        this.f4502g = null;
        this.f4503h = null;
    }

    public fen(Set set, fep fep) {
        this(null, set, 60, fep);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean m2270a(long r10, java.lang.Integer r12, java.lang.Integer r13, java.lang.Long r14) {
        /*
        r9 = this;
        r8 = 2;
        r2 = 1;
        r1 = 0;
        r0 = r9.f4501f;
        r3 = p000.feo.DONE;
        if (r0 != r3) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r0 = r9.f4497b;
        if (r0 == 0) goto L_0x0159;
    L_0x000e:
        if (r12 == 0) goto L_0x0156;
    L_0x0010:
        r0 = java.util.Objects.equals(r12, r0);
        if (r0 != 0) goto L_0x0153;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r3 = r9.f4501f;
        r4 = p000.feo.WAITING_FOR_TRIGGER;
        if (r3 != r4) goto L_0x004a;
    L_0x001d:
        r3 = r9.f4502g;
        if (r3 == 0) goto L_0x0029;
    L_0x0021:
        r4 = r3.longValue();
        r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x004a;
    L_0x0029:
        if (r0 == 0) goto L_0x004a;
    L_0x002b:
        r0 = p000.feo.TRIGGERED;
        r9.f4501f = r0;
        r0 = java.lang.Long.valueOf(r10);
        r9.f4502g = r0;
        r0 = f4496a;
        r3 = new java.lang.Object[r8];
        r4 = r9.f4500e;
        r3[r1] = r4;
        r4 = r9.f4501f;
        r3[r2] = r4;
        r4 = "Trigger type %s is now %s";
        r3 = java.lang.String.format(r4, r3);
        p000.bli.m863a(r0, r3);
    L_0x004a:
        r0 = r9.f4501f;
        r3 = p000.feo.TRIGGERED;
        if (r0 != r3) goto L_0x0150;
    L_0x0050:
        r0 = r9.f4504i;
        if (r0 != 0) goto L_0x0058;
    L_0x0054:
        if (r14 == 0) goto L_0x0058;
    L_0x0056:
        r9.f4504i = r14;
    L_0x0058:
        r0 = r9.f4502g;
        r4 = r0.longValue();
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0150;
    L_0x0062:
        r0 = r9.f4503h;
        if (r0 == 0) goto L_0x006e;
    L_0x0066:
        r4 = r0.longValue();
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0150;
    L_0x006e:
        r0 = r9.f4502g;
        p000.jri.m13152b(r0);
        r0 = r9.f4499d;
        r0 = r0.contains(r13);
        if (r0 != 0) goto L_0x010e;
    L_0x007b:
        r0 = r9.f4502g;
        p000.jri.m13152b(r0);
        r0 = r9.f4498c;
        if (r0 < 0) goto L_0x014d;
    L_0x0084:
        r0 = r9.f4502g;
        r4 = r0.longValue();
        r4 = r10 - r4;
        r0 = r9.f4498c;
        r6 = (long) r0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x014a;
    L_0x0093:
        r3 = r2;
    L_0x0094:
        if (r3 == 0) goto L_0x00c6;
    L_0x0096:
        r0 = f4496a;
        r4 = r9.f4498c;
        r5 = r9.f4500e;
        r5 = java.lang.String.valueOf(r5);
        r6 = java.lang.String.valueOf(r5);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r6 = r6 + 39;
        r7.<init>(r6);
        r6 = "Frame limit of ";
        r7.append(r6);
        r7.append(r4);
        r4 = " reached for ";
        r7.append(r4);
        r7.append(r5);
        r4 = r7.toString();
        p000.bli.m863a(r0, r4);
    L_0x00c6:
        if (r14 == 0) goto L_0x0148;
    L_0x00c8:
        r0 = r9.f4504i;
        if (r0 == 0) goto L_0x0146;
    L_0x00cc:
        r4 = r14.longValue();
        r0 = r9.f4504i;
        r6 = r0.longValue();
        r4 = r4 - r6;
        r6 = 3000000000; // 0xb2d05e00 float:-2.4257133E-8 double:1.4821969375E-314;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0144;
    L_0x00e0:
        r0 = r2;
    L_0x00e1:
        if (r0 == 0) goto L_0x0109;
    L_0x00e3:
        r4 = f4496a;
        r5 = r9.f4500e;
        r5 = java.lang.String.valueOf(r5);
        r6 = java.lang.String.valueOf(r5);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r6 = r6 + 40;
        r7.<init>(r6);
        r6 = "Time limit of 3000000000 ns reached for ";
        r7.append(r6);
        r7.append(r5);
        r5 = r7.toString();
        p000.bli.m863a(r4, r5);
    L_0x0109:
        if (r3 == 0) goto L_0x013e;
    L_0x010b:
        r0 = r2;
    L_0x010c:
        if (r0 == 0) goto L_0x0150;
    L_0x010e:
        r0 = p000.feo.DONE;
        r9.f4501f = r0;
        r0 = java.lang.Long.valueOf(r10);
        r9.f4503h = r0;
        r0 = f4496a;
        r3 = 3;
        r3 = new java.lang.Object[r3];
        r4 = r9.f4500e;
        r3[r1] = r4;
        r1 = r9.f4501f;
        r3[r2] = r1;
        r1 = r9.f4502g;
        r4 = r1.longValue();
        r4 = r10 - r4;
        r1 = java.lang.Long.valueOf(r4);
        r3[r8] = r1;
        r1 = "Trigger type %s is now %s after %d frames";
        r1 = java.lang.String.format(r1, r3);
        p000.bli.m863a(r0, r1);
        goto L_0x0009;
    L_0x013e:
        if (r0 != 0) goto L_0x0142;
    L_0x0140:
        r0 = r1;
        goto L_0x010c;
    L_0x0142:
        r0 = r2;
        goto L_0x010c;
    L_0x0144:
        r0 = r1;
        goto L_0x00e1;
    L_0x0146:
        r0 = r1;
        goto L_0x00e1;
    L_0x0148:
        r0 = r1;
        goto L_0x00e1;
    L_0x014a:
        r3 = r1;
        goto L_0x0094;
    L_0x014d:
        r3 = r1;
        goto L_0x0094;
    L_0x0150:
        r2 = r1;
        goto L_0x0009;
    L_0x0153:
        r0 = r2;
        goto L_0x0017;
    L_0x0156:
        r0 = r1;
        goto L_0x0017;
    L_0x0159:
        r0 = r2;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fen.a(long, java.lang.Integer, java.lang.Integer, java.lang.Long):boolean");
    }
}
