package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kho */
public final class kho extends kct implements Serializable {
    public static final long serialVersionUID = 1;
    /* renamed from: a */
    public final transient keb f23424a;
    /* renamed from: b */
    public final transient khv f23425b;
    /* renamed from: c */
    private final transient khw f23426c;

    private kho(khw khw, keb keb, khv khv) {
        super(keb.f8246a);
        this.f23426c = khw;
        this.f23424a = keb;
        this.f23425b = khv;
    }

    public kho(Comparator comparator) {
        super(comparator);
        this.f23424a = keb.m4792a(comparator);
        this.f23425b = new khv(null, 1);
        khv khv = this.f23425b;
        kho.m17744a(khv, khv);
        this.f23426c = new khw();
    }

    /* renamed from: a */
    public final int mo2106a(Object obj, int i) {
        khb.m4859a(i, "occurrences");
        if (i == 0) {
            return mo3226a(obj);
        }
        jri.m13143a(this.f23424a.m4794a(obj));
        khv khv = (khv) this.f23426c.f8308a;
        if (khv != null) {
            int[] iArr = new int[1];
            this.f23426c.m4933a(khv, khv.m4929a(super.mo3216a(), obj, i, iArr));
            return iArr[0];
        }
        super.mo3216a().compare(obj, obj);
        khv khv2 = new khv(obj, i);
        khv khv3 = this.f23425b;
        kho.m17745a(khv3, khv2, khv3);
        this.f23426c.m4933a(khv, khv2);
        return 0;
    }

    /* renamed from: a */
    private final long m17743a(khs khs, khv khv) {
        while (khv != null) {
            int compare = super.mo3216a().compare(this.f23424a.f8251f, khv.f8299a);
            if (compare > 0) {
                khv = khv.f8304f;
            } else if (compare != 0) {
                return (khs.mo2171b(khv.f8304f) + ((long) khs.mo2170a(khv))) + m17743a(khs, khv.f8303e);
            } else {
                switch (this.f23424a.f8252g.ordinal()) {
                    case 0:
                        return ((long) khs.mo2170a(khv)) + khs.mo2171b(khv.f8304f);
                    case 1:
                        return khs.mo2171b(khv.f8304f);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    private final long m17746b(khs khs, khv khv) {
        while (khv != null) {
            int compare = super.mo3216a().compare(this.f23424a.f8248c, khv.f8299a);
            if (compare < 0) {
                khv = khv.f8303e;
            } else if (compare != 0) {
                return (khs.mo2171b(khv.f8303e) + ((long) khs.mo2170a(khv))) + m17746b(khs, khv.f8304f);
            } else {
                switch (this.f23424a.f8249d.ordinal()) {
                    case 0:
                        return ((long) khs.mo2170a(khv)) + khs.mo2171b(khv.f8303e);
                    case 1:
                        return khs.mo2171b(khv.f8303e);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final long m17742a(khs khs) {
        khv khv = (khv) this.f23426c.f8308a;
        long b = khs.mo2171b(khv);
        if (this.f23424a.f8247b) {
            b -= m17746b(khs, khv);
        }
        if (this.f23424a.f8250e) {
            return b - m17743a(khs, khv);
        }
        return b;
    }

    public final void clear() {
        keb keb = this.f23424a;
        if (keb.f8247b || keb.f8250e) {
            khb.m4876a(mo3526f());
            return;
        }
        khv khv = this.f23425b.f8306h;
        while (true) {
            khv khv2 = this.f23425b;
            if (khv != khv2) {
                khv2 = khv.f8306h;
                khv.f8300b = 0;
                khv.f8303e = null;
                khv.f8304f = null;
                khv.f8305g = null;
                khv.f8306h = null;
                khv = khv2;
            } else {
                kho.m17744a(khv2, khv2);
                this.f23426c.f8308a = null;
                return;
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Comparator mo3216a() {
        return super.mo3216a();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final int mo3226a(java.lang.Object r5) {
        /*
        r4 = this;
        r1 = 0;
        r0 = r4.f23426c;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        r0 = r0.f8308a;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        r0 = (p000.khv) r0;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        r2 = r4.f23424a;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        r2 = r2.m4794a(r5);	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        if (r2 == 0) goto L_0x0011;
    L_0x000f:
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r2 = super.mo3216a();	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
    L_0x0016:
        r3 = r0.f8299a;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        r3 = r2.compare(r5, r3);	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        if (r3 >= 0) goto L_0x0025;
    L_0x001e:
        r0 = r0.f8303e;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        if (r0 != 0) goto L_0x0016;
    L_0x0022:
        r0 = r1;
    L_0x0023:
        r1 = r0;
        goto L_0x0011;
    L_0x0025:
        if (r3 <= 0) goto L_0x002d;
    L_0x0027:
        r0 = r0.f8304f;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        if (r0 != 0) goto L_0x0016;
    L_0x002b:
        r0 = r1;
        goto L_0x0023;
    L_0x002d:
        r0 = r0.f8300b;	 Catch:{ ClassCastException -> 0x0032, NullPointerException -> 0x0030 }
        goto L_0x0023;
    L_0x0030:
        r0 = move-exception;
        goto L_0x0011;
    L_0x0032:
        r0 = move-exception;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: kho.a(java.lang.Object):int");
    }

    /* renamed from: h */
    final Iterator mo3527h() {
        return new khr(this);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ kgx mo3219i() {
        return super.mo3219i();
    }

    /* renamed from: c */
    final int mo3524c() {
        return khx.m4934a(m17742a(khs.f8297b));
    }

    /* renamed from: a */
    static int m17741a(khv khv) {
        if (khv == null) {
            return 0;
        }
        return khv.f8301c;
    }

    /* renamed from: d */
    final Iterator mo3525d() {
        return khb.m4887b(mo3526f());
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ NavigableSet mo3220j() {
        return super.mo3220j();
    }

    /* renamed from: f */
    final Iterator mo3526f() {
        return new khq(this);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Set mo2114g() {
        return super.mo2114g();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ kfu mo3221k() {
        return super.mo3221k();
    }

    /* renamed from: o */
    final khv m17767o() {
        khv khv = (khv) this.f23426c.f8308a;
        if (khv == null) {
            return null;
        }
        keb keb = this.f23424a;
        if (keb.f8247b) {
            Object obj = keb.f8248c;
            khv = khv.m4927a(super.mo3216a(), obj);
            if (khv == null) {
                return null;
            }
            if (this.f23424a.f8249d == kcy.OPEN && super.mo3216a().compare(obj, khv.f8299a) == 0) {
                khv = khv.f8306h;
            }
        } else {
            khv = this.f23425b.f8306h;
        }
        if (khv == this.f23425b || !this.f23424a.m4794a(khv.f8299a)) {
            return null;
        }
        return khv;
    }

    /* renamed from: a */
    public final kgx mo3507a(Object obj, kcy kcy) {
        return new kho(this.f23426c, this.f23424a.m4793a(new keb(super.mo3216a(), false, null, kcy.OPEN, true, obj, kcy)), this.f23425b);
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Iterator iterator() {
        return khb.m4866a((kft) this);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ kfu mo3222l() {
        return super.mo3222l();
    }

    /* renamed from: p */
    final khv m17768p() {
        khv khv = (khv) this.f23426c.f8308a;
        if (khv == null) {
            return null;
        }
        keb keb = this.f23424a;
        if (keb.f8250e) {
            Object obj = keb.f8251f;
            khv = khv.m4930b(super.mo3216a(), obj);
            if (khv == null) {
                return null;
            }
            if (this.f23424a.f8252g == kcy.OPEN && super.mo3216a().compare(obj, khv.f8299a) == 0) {
                khv = khv.f8305g;
            }
        } else {
            khv = this.f23425b.f8305g;
        }
        if (khv == this.f23425b || !this.f23424a.m4794a(khv.f8299a)) {
            return null;
        }
        return khv;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ kfu mo3223m() {
        return super.mo3223m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ kfu mo3224n() {
        return super.mo3224n();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        kgy.m4852a(kct.class, "comparator").m4857a((Object) this, (Object) comparator);
        kgy.m4852a(kho.class, "range").m4857a((Object) this, keb.m4792a(comparator));
        kgy.m4852a(kho.class, "rootReference").m4857a((Object) this, new khw());
        khv khv = new khv(null, 1);
        kgy.m4852a(kho.class, "header").m4857a((Object) this, (Object) khv);
        kho.m17744a(khv, khv);
        kgy.m4855a((kft) this, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: b */
    public final int mo2109b(Object obj, int i) {
        khb.m4859a(i, "occurrences");
        if (i == 0) {
            return mo3226a(obj);
        }
        khv khv = (khv) this.f23426c.f8308a;
        int[] iArr = new int[1];
        try {
            if (!this.f23424a.m4794a(obj) || khv == null) {
                return 0;
            }
            this.f23426c.m4933a(khv, khv.m4931b(super.mo3216a(), obj, i, iArr));
            return iArr[0];
        } catch (ClassCastException e) {
            return 0;
        } catch (NullPointerException e2) {
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo2110c(Object obj, int i) {
        khb.m4859a(i, "count");
        if (this.f23424a.m4794a(obj)) {
            khv khv = (khv) this.f23426c.f8308a;
            if (khv != null) {
                int[] iArr = new int[1];
                this.f23426c.m4933a(khv, khv.m4932c(super.mo3216a(), obj, i, iArr));
                return iArr[0];
            } else if (i <= 0) {
                return 0;
            } else {
                mo2106a(obj, i);
                return 0;
            }
        }
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return 0;
    }

    /* renamed from: a */
    public final boolean mo2107a(Object obj, int i, int i2) {
        khb.m4859a(i2, "newCount");
        khb.m4859a(i, "oldCount");
        jri.m13143a(this.f23424a.m4794a(obj));
        khv khv = (khv) this.f23426c.f8308a;
        if (khv != null) {
            int[] iArr = new int[1];
            this.f23426c.m4933a(khv, khv.m4928a(super.mo3216a(), obj, i, i2, iArr));
            return iArr[0] == i;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                mo2106a(obj, i2);
            }
            return true;
        }
    }

    public final int size() {
        return khx.m4934a(m17742a(khs.f8296a));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ kgx mo3217a(Object obj, kcy kcy, Object obj2, kcy kcy2) {
        return super.mo3217a(obj, kcy, obj2, kcy2);
    }

    /* renamed from: a */
    static void m17744a(khv khv, khv khv2) {
        khv.f8306h = khv2;
        khv2.f8305g = khv;
    }

    /* renamed from: a */
    static void m17745a(khv khv, khv khv2, khv khv3) {
        kho.m17744a(khv, khv2);
        kho.m17744a(khv2, khv3);
    }

    /* renamed from: b */
    public final kgx mo3508b(Object obj, kcy kcy) {
        return new kho(this.f23426c, this.f23424a.m4793a(new keb(super.mo3216a(), true, obj, kcy, false, null, kcy.OPEN)), this.f23425b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.mo3220j().comparator());
        kgy.m4856a((kft) this, objectOutputStream);
    }
}
