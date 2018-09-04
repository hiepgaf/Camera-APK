package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kth */
final class kth implements ktr {
    /* renamed from: a */
    private static final int[] f19287a = new int[0];
    /* renamed from: b */
    private static final Unsafe f19288b = kul.m5314a();
    /* renamed from: c */
    private final int[] f19289c;
    /* renamed from: d */
    private final Object[] f19290d;
    /* renamed from: e */
    private final int f19291e;
    /* renamed from: f */
    private final int f19292f;
    /* renamed from: g */
    private final kte f19293g;
    /* renamed from: h */
    private final boolean f19294h;
    /* renamed from: i */
    private final boolean f19295i;
    /* renamed from: j */
    private final boolean f19296j;
    /* renamed from: k */
    private final boolean f19297k;
    /* renamed from: l */
    private final int[] f19298l;
    /* renamed from: m */
    private final int f19299m;
    /* renamed from: n */
    private final int f19300n;
    /* renamed from: o */
    private final ksq f19301o;
    /* renamed from: p */
    private final kug f19302p;
    /* renamed from: q */
    private final krp f19303q;
    /* renamed from: r */
    private final kta f19304r;

    private kth(int[] iArr, Object[] objArr, int i, int i2, kte kte, boolean z, int[] iArr2, int i3, int i4, ktk ktk, ksq ksq, kug kug, krp krp, kta kta) {
        this.f19289c = iArr;
        this.f19290d = objArr;
        this.f19291e = i;
        this.f19292f = i2;
        this.f19295i = kte instanceof kry;
        this.f19296j = z;
        boolean z2 = krp == null ? false : kte instanceof ksb;
        this.f19294h = z2;
        this.f19297k = false;
        this.f19298l = iArr2;
        this.f19299m = i3;
        this.f19300n = i4;
        this.f19301o = ksq;
        this.f19302p = kug;
        this.f19303q = krp;
        this.f19293g = kte;
        this.f19304r = kta;
    }

    /* renamed from: a */
    private final boolean m13927a(Object obj, Object obj2, int i) {
        return m13923a(obj, i) == m13923a(obj2, i);
    }

    /* renamed from: a */
    public final boolean mo2297a(Object obj, Object obj2) {
        int length = this.f19289c.length;
        for (int i = 0; i < length; i += 3) {
            boolean z;
            int f = m13941f(i);
            long j = (long) (f & 1048575);
            switch (kth.m13939e(f)) {
                case 0:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5323a(obj, j) == kul.m5323a(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (m13927a(obj, obj2, i)) {
                        if (!ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (m13927a(obj, obj2, i)) {
                        if (!ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (m13927a(obj, obj2, i)) {
                        if (!ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5338h(obj, j) == kul.m5338h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (m13927a(obj, obj2, i)) {
                        if (kul.m5339i(obj, j) == kul.m5339i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (m13927a(obj, obj2, i)) {
                        if (!ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j));
                    break;
                case 50:
                    z = ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long d = (long) (m13938d(i) & 1048575);
                    if (kul.m5338h(obj, d) == kul.m5338h(obj2, d)) {
                        if (!ktt.m5245a(kul.m5340j(obj, j), kul.m5340j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (!z) {
                return false;
            }
        }
        if (!((kry) obj).f23439e.equals(((kry) obj2).f23439e)) {
            return false;
        }
        if (this.f19294h) {
            return ((ksb) obj).f23582g.equals(((ksb) obj2).f23582g);
        }
        return true;
    }

    /* renamed from: a */
    private final Object m13914a(Object obj, int i, Object obj2, kug kug) {
        int i2 = this.f19289c[i];
        Object j = kul.m5340j(obj, (long) (m13941f(i) & 1048575));
        if (j == null) {
            return obj2;
        }
        ksf a = m13917a(i);
        if (a != null) {
            return kth.m13913a(i2, (ksz) j, a, obj2, kug);
        }
        return obj2;
    }

    /* renamed from: a */
    private static Object m13913a(int i, Map map, ksf ksf, Object obj, kug kug) {
        kta.m5163a();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (ksf.mo1772a(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = kuh.m5306b();
                }
                kue b = kqx.m5058b(ksx.m13901a(entry.getKey(), entry.getValue()));
                try {
                    ksx.m13902a(b.f19314a, entry.getKey(), entry.getValue());
                    ((kuh) obj).m5308a((i << 3) | 2, (Object) b.m13980d());
                    it.remove();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    private final ksf m13917a(int i) {
        int i2 = i / 3;
        return (ksf) this.f19290d[(i2 + i2) + 1];
    }

    /* renamed from: b */
    private final ktr m13928b(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        ktr ktr = (ktr) this.f19290d[i3];
        if (ktr != null) {
            return ktr;
        }
        ktr = kto.f8542a.m5174a((Class) this.f19290d[i3 + 1]);
        this.f19290d[i3] = ktr;
        return ktr;
    }

    /* renamed from: a */
    public final int mo2293a(Object obj) {
        int i;
        int i2;
        int f;
        int e;
        int i3;
        Object j;
        if (this.f19296j) {
            Unsafe unsafe = f19288b;
            i = 0;
            i2 = 0;
            while (i2 < this.f19289c.length) {
                f = m13941f(i2);
                e = kth.m13939e(f);
                i3 = this.f19289c[i2];
                long j2 = (long) (f & 1048575);
                if (e < krt.DOUBLE_LIST_PACKED.f8509k || e <= krt.SINT64_LIST_PACKED.f8509k) {
                    switch (e) {
                        case 0:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13818b(i3);
                                break;
                            }
                            break;
                        case 1:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13838f(i3);
                                break;
                            }
                            break;
                        case 2:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13804a(i3, kul.m5339i(obj, j2));
                                break;
                            }
                            break;
                        case 3:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13830c(i3, kul.m5339i(obj, j2));
                                break;
                            }
                            break;
                        case 4:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13819b(i3, kul.m5338h(obj, j2));
                                break;
                            }
                            break;
                        case 5:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13836e(i3);
                                break;
                            }
                            break;
                        case 6:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13833d(i3);
                                break;
                            }
                            break;
                        case 7:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13802a(i3);
                                break;
                            }
                            break;
                        case 8:
                            if (!m13923a(obj, i2)) {
                                j = kul.m5340j(obj, j2);
                                if (!(j instanceof kqx)) {
                                    i += krh.m13806a(i3, (kqx) j);
                                    break;
                                }
                                i += krh.m13805a(i3, (String) j);
                                break;
                            }
                            break;
                        case 9:
                            if (!m13923a(obj, i2)) {
                                i += ktt.m5230a(i3, kul.m5340j(obj, j2), m13928b(i2));
                                break;
                            }
                            break;
                        case 10:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13806a(i3, (kqx) kul.m5340j(obj, j2));
                                break;
                            }
                            break;
                        case 11:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13834d(i3, kul.m5338h(obj, j2));
                                break;
                            }
                            break;
                        case 12:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13803a(i3, kul.m5338h(obj, j2));
                                break;
                            }
                            break;
                        case 13:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13843h(i3);
                                break;
                            }
                            break;
                        case 14:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13844i(i3);
                                break;
                            }
                            break;
                        case 15:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13829c(i3, kul.m5338h(obj, j2));
                                break;
                            }
                            break;
                        case 16:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13820b(i3, kul.m5339i(obj, j2));
                                break;
                            }
                            break;
                        case 17:
                            if (!m13923a(obj, i2)) {
                                i += krh.m13809a(i3, (kte) kul.m5340j(obj, j2), m13928b(i2));
                                break;
                            }
                            break;
                        case 18:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 19:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 20:
                            i += ktt.m5265g(i3, kth.m13916a(obj, j2));
                            break;
                        case 21:
                            i += ktt.m5279l(i3, kth.m13916a(obj, j2));
                            break;
                        case 22:
                            i += ktt.m5262f(i3, kth.m13916a(obj, j2));
                            break;
                        case 23:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 24:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 25:
                            i += ktt.m5231a(i3, kth.m13916a(obj, j2));
                            break;
                        case 26:
                            i += ktt.m5274j(i3, kth.m13916a(obj, j2));
                            break;
                        case 27:
                            i += ktt.m5247b(i3, kth.m13916a(obj, j2), m13928b(i2));
                            break;
                        case 28:
                            i += ktt.m5246b(i3, kth.m13916a(obj, j2));
                            break;
                        case 29:
                            i += ktt.m5277k(i3, kth.m13916a(obj, j2));
                            break;
                        case 30:
                            i += ktt.m5253c(i3, kth.m13916a(obj, j2));
                            break;
                        case 31:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 32:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 33:
                            i += ktt.m5268h(i3, kth.m13916a(obj, j2));
                            break;
                        case 34:
                            i += ktt.m5271i(i3, kth.m13916a(obj, j2));
                            break;
                        case 35:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 36:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 37:
                            f = ktt.m5263f((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 38:
                            f = ktt.m5275j((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 39:
                            f = ktt.m5260e((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 40:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 41:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 42:
                            f = ktt.m5233a((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 43:
                            f = ktt.m5272i((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 44:
                            f = ktt.m5248b((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 45:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 46:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 47:
                            f = ktt.m5266g((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 48:
                            f = ktt.m5269h((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                break;
                            }
                            i += f + (krh.m13846k(i3) + krh.m13847l(f));
                            break;
                        case 49:
                            i += ktt.m5232a(i3, kth.m13916a(obj, j2), m13928b(i2));
                            break;
                        case 50:
                            i += kta.m5161a(kul.m5340j(obj, j2));
                            break;
                        case 51:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13818b(i3);
                                break;
                            }
                            break;
                        case 52:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13838f(i3);
                                break;
                            }
                            break;
                        case 53:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13804a(i3, kth.m13942f(obj, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13830c(i3, kth.m13942f(obj, j2));
                                break;
                            }
                            break;
                        case 55:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13819b(i3, kth.m13940e(obj, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13836e(i3);
                                break;
                            }
                            break;
                        case 57:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13833d(i3);
                                break;
                            }
                            break;
                        case 58:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13802a(i3);
                                break;
                            }
                            break;
                        case 59:
                            if (!m13924a(obj, i3, i2)) {
                                j = kul.m5340j(obj, j2);
                                if (!(j instanceof kqx)) {
                                    i += krh.m13806a(i3, (kqx) j);
                                    break;
                                }
                                i += krh.m13805a(i3, (String) j);
                                break;
                            }
                            break;
                        case 60:
                            if (!m13924a(obj, i3, i2)) {
                                i += ktt.m5230a(i3, kul.m5340j(obj, j2), m13928b(i2));
                                break;
                            }
                            break;
                        case 61:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13806a(i3, (kqx) kul.m5340j(obj, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13834d(i3, kth.m13940e(obj, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13803a(i3, kth.m13940e(obj, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13843h(i3);
                                break;
                            }
                            break;
                        case 65:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13844i(i3);
                                break;
                            }
                            break;
                        case 66:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13829c(i3, kth.m13940e(obj, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13820b(i3, kth.m13942f(obj, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (!m13924a(obj, i3, i2)) {
                                i += krh.m13809a(i3, (kte) kul.m5340j(obj, j2), m13928b(i2));
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    i2 += 3;
                } else {
                    switch (e) {
                        case 0:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13818b(i3);
                            break;
                        case 1:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13838f(i3);
                            break;
                        case 2:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13804a(i3, kul.m5339i(obj, j2));
                            break;
                        case 3:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13830c(i3, kul.m5339i(obj, j2));
                            break;
                        case 4:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13819b(i3, kul.m5338h(obj, j2));
                            break;
                        case 5:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13836e(i3);
                            break;
                        case 6:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13833d(i3);
                            break;
                        case 7:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13802a(i3);
                            break;
                        case 8:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            j = kul.m5340j(obj, j2);
                            if (!(j instanceof kqx)) {
                                i += krh.m13805a(i3, (String) j);
                                break;
                            }
                            i += krh.m13806a(i3, (kqx) j);
                            break;
                        case 9:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += ktt.m5230a(i3, kul.m5340j(obj, j2), m13928b(i2));
                            break;
                        case 10:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13806a(i3, (kqx) kul.m5340j(obj, j2));
                            break;
                        case 11:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13834d(i3, kul.m5338h(obj, j2));
                            break;
                        case 12:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13803a(i3, kul.m5338h(obj, j2));
                            break;
                        case 13:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13843h(i3);
                            break;
                        case 14:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13844i(i3);
                            break;
                        case 15:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13829c(i3, kul.m5338h(obj, j2));
                            break;
                        case 16:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13820b(i3, kul.m5339i(obj, j2));
                            break;
                        case 17:
                            if (!m13923a(obj, i2)) {
                                break;
                            }
                            i += krh.m13809a(i3, (kte) kul.m5340j(obj, j2), m13928b(i2));
                            break;
                        case 18:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 19:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 20:
                            i += ktt.m5265g(i3, kth.m13916a(obj, j2));
                            break;
                        case 21:
                            i += ktt.m5279l(i3, kth.m13916a(obj, j2));
                            break;
                        case 22:
                            i += ktt.m5262f(i3, kth.m13916a(obj, j2));
                            break;
                        case 23:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 24:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 25:
                            i += ktt.m5231a(i3, kth.m13916a(obj, j2));
                            break;
                        case 26:
                            i += ktt.m5274j(i3, kth.m13916a(obj, j2));
                            break;
                        case 27:
                            i += ktt.m5247b(i3, kth.m13916a(obj, j2), m13928b(i2));
                            break;
                        case 28:
                            i += ktt.m5246b(i3, kth.m13916a(obj, j2));
                            break;
                        case 29:
                            i += ktt.m5277k(i3, kth.m13916a(obj, j2));
                            break;
                        case 30:
                            i += ktt.m5253c(i3, kth.m13916a(obj, j2));
                            break;
                        case 31:
                            i += ktt.m5256d(i3, kth.m13916a(obj, j2));
                            break;
                        case 32:
                            i += ktt.m5259e(i3, kth.m13916a(obj, j2));
                            break;
                        case 33:
                            i += ktt.m5268h(i3, kth.m13916a(obj, j2));
                            break;
                        case 34:
                            i += ktt.m5271i(i3, kth.m13916a(obj, j2));
                            break;
                        case 35:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 36:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 37:
                            f = ktt.m5263f((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 38:
                            f = ktt.m5275j((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 39:
                            f = ktt.m5260e((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 40:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 41:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 42:
                            f = ktt.m5233a((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 43:
                            f = ktt.m5272i((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 44:
                            f = ktt.m5248b((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 45:
                            f = ktt.m5254c((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 46:
                            f = ktt.m5257d((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 47:
                            f = ktt.m5266g((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 48:
                            f = ktt.m5269h((List) unsafe.getObject(obj, j2));
                            if (f <= 0) {
                                i += f + (krh.m13846k(i3) + krh.m13847l(f));
                                break;
                            }
                            break;
                        case 49:
                            i += ktt.m5232a(i3, kth.m13916a(obj, j2), m13928b(i2));
                            break;
                        case 50:
                            i += kta.m5161a(kul.m5340j(obj, j2));
                            break;
                        case 51:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13818b(i3);
                            break;
                        case 52:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13838f(i3);
                            break;
                        case 53:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13804a(i3, kth.m13942f(obj, j2));
                            break;
                        case 54:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13830c(i3, kth.m13942f(obj, j2));
                            break;
                        case 55:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13819b(i3, kth.m13940e(obj, j2));
                            break;
                        case 56:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13836e(i3);
                            break;
                        case 57:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13833d(i3);
                            break;
                        case 58:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13802a(i3);
                            break;
                        case 59:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            j = kul.m5340j(obj, j2);
                            if (!(j instanceof kqx)) {
                                i += krh.m13805a(i3, (String) j);
                                break;
                            }
                            i += krh.m13806a(i3, (kqx) j);
                            break;
                        case 60:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += ktt.m5230a(i3, kul.m5340j(obj, j2), m13928b(i2));
                            break;
                        case 61:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13806a(i3, (kqx) kul.m5340j(obj, j2));
                            break;
                        case 62:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13834d(i3, kth.m13940e(obj, j2));
                            break;
                        case 63:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13803a(i3, kth.m13940e(obj, j2));
                            break;
                        case 64:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13843h(i3);
                            break;
                        case 65:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13844i(i3);
                            break;
                        case 66:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13829c(i3, kth.m13940e(obj, j2));
                            break;
                        case 67:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13820b(i3, kth.m13942f(obj, j2));
                            break;
                        case 68:
                            if (!m13924a(obj, i3, i2)) {
                                break;
                            }
                            i += krh.m13809a(i3, (kte) kul.m5340j(obj, j2), m13928b(i2));
                            break;
                        default:
                            break;
                    }
                    i2 += 3;
                }
            }
            kug kug = this.f19302p;
            return ((kry) obj).f23439e.m5307a() + i;
        }
        int i4;
        Unsafe unsafe2 = f19288b;
        i = -1;
        e = 0;
        i2 = 0;
        f = 0;
        while (i2 < this.f19289c.length) {
            int f2 = m13941f(i2);
            int i5 = this.f19289c[i2];
            int e2 = kth.m13939e(f2);
            if (e2 <= 17) {
                i3 = this.f19289c[i2 + 2];
                i4 = 1048575 & i3;
                i3 = 1 << (i3 >>> 20);
                if (i4 != i) {
                    f = unsafe2.getInt(obj, (long) i4);
                    i = i4;
                }
                i4 = i;
                i = f;
                f = i3;
            } else {
                i4 = i;
                i = f;
                f = 0;
            }
            long j3 = (long) (1048575 & f2);
            switch (e2) {
                case 0:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13818b(i5);
                    break;
                case 1:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13838f(i5);
                    break;
                case 2:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13804a(i5, unsafe2.getLong(obj, j3));
                    break;
                case 3:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13830c(i5, unsafe2.getLong(obj, j3));
                    break;
                case 4:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13819b(i5, unsafe2.getInt(obj, j3));
                    break;
                case 5:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13836e(i5);
                    break;
                case 6:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13833d(i5);
                    break;
                case 7:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13802a(i5);
                    break;
                case 8:
                    if ((f & i) == 0) {
                        break;
                    }
                    j = unsafe2.getObject(obj, j3);
                    if (!(j instanceof kqx)) {
                        e += krh.m13805a(i5, (String) j);
                        break;
                    }
                    e += krh.m13806a(i5, (kqx) j);
                    break;
                case 9:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += ktt.m5230a(i5, unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                case 10:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13806a(i5, (kqx) unsafe2.getObject(obj, j3));
                    break;
                case 11:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13834d(i5, unsafe2.getInt(obj, j3));
                    break;
                case 12:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13803a(i5, unsafe2.getInt(obj, j3));
                    break;
                case 13:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13843h(i5);
                    break;
                case 14:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13844i(i5);
                    break;
                case 15:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13829c(i5, unsafe2.getInt(obj, j3));
                    break;
                case 16:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13820b(i5, unsafe2.getLong(obj, j3));
                    break;
                case 17:
                    if ((f & i) == 0) {
                        break;
                    }
                    e += krh.m13809a(i5, (kte) unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                case 18:
                    e += ktt.m5259e(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 19:
                    e += ktt.m5256d(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 20:
                    e += ktt.m5265g(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 21:
                    e += ktt.m5279l(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 22:
                    e += ktt.m5262f(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 23:
                    e += ktt.m5259e(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 24:
                    e += ktt.m5256d(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 25:
                    e += ktt.m5231a(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 26:
                    e += ktt.m5274j(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 27:
                    e += ktt.m5247b(i5, (List) unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                case 28:
                    e += ktt.m5246b(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 29:
                    e += ktt.m5277k(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 30:
                    e += ktt.m5253c(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 31:
                    e += ktt.m5256d(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 32:
                    e += ktt.m5259e(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 33:
                    e += ktt.m5268h(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 34:
                    e += ktt.m5271i(i5, (List) unsafe2.getObject(obj, j3));
                    break;
                case 35:
                    f = ktt.m5257d((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 36:
                    f = ktt.m5254c((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 37:
                    f = ktt.m5263f((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 38:
                    f = ktt.m5275j((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 39:
                    f = ktt.m5260e((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 40:
                    f = ktt.m5257d((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 41:
                    f = ktt.m5254c((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 42:
                    f = ktt.m5233a((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 43:
                    f = ktt.m5272i((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 44:
                    f = ktt.m5248b((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 45:
                    f = ktt.m5254c((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 46:
                    f = ktt.m5257d((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 47:
                    f = ktt.m5266g((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 48:
                    f = ktt.m5269h((List) unsafe2.getObject(obj, j3));
                    if (f <= 0) {
                        break;
                    }
                    e += f + (krh.m13846k(i5) + krh.m13847l(f));
                    break;
                case 49:
                    e += ktt.m5232a(i5, (List) unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                case 50:
                    e += kta.m5161a(unsafe2.getObject(obj, j3));
                    break;
                case 51:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13818b(i5);
                    break;
                case 52:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13838f(i5);
                    break;
                case 53:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13804a(i5, kth.m13942f(obj, j3));
                    break;
                case 54:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13830c(i5, kth.m13942f(obj, j3));
                    break;
                case 55:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13819b(i5, kth.m13940e(obj, j3));
                    break;
                case 56:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13836e(i5);
                    break;
                case 57:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13833d(i5);
                    break;
                case 58:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13802a(i5);
                    break;
                case 59:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    j = unsafe2.getObject(obj, j3);
                    if (!(j instanceof kqx)) {
                        e += krh.m13805a(i5, (String) j);
                        break;
                    }
                    e += krh.m13806a(i5, (kqx) j);
                    break;
                case 60:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += ktt.m5230a(i5, unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                case 61:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13806a(i5, (kqx) unsafe2.getObject(obj, j3));
                    break;
                case 62:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13834d(i5, kth.m13940e(obj, j3));
                    break;
                case 63:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13803a(i5, kth.m13940e(obj, j3));
                    break;
                case 64:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13843h(i5);
                    break;
                case 65:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13844i(i5);
                    break;
                case 66:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13829c(i5, kth.m13940e(obj, j3));
                    break;
                case 67:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13820b(i5, kth.m13942f(obj, j3));
                    break;
                case 68:
                    if (!m13924a(obj, i5, i2)) {
                        break;
                    }
                    e += krh.m13809a(i5, (kte) unsafe2.getObject(obj, j3), m13928b(i2));
                    break;
                default:
                    break;
            }
            i2 += 3;
            f = i;
            i = i4;
        }
        kug = this.f19302p;
        i4 = e + ((kry) obj).f23439e.m5307a();
        if (!this.f19294h) {
            return i4;
        }
        krr krr = ((ksb) obj).f23582g;
        i = 0;
        for (i2 = 0; i2 < krr.f8452a.m5290c(); i2++) {
            Entry a = krr.f8452a.m5287a(i2);
            i += krr.m5115a((krs) a.getKey(), a.getValue());
        }
        for (Entry entry : krr.f8452a.m5292d()) {
            i += krr.m5115a((krs) entry.getKey(), entry.getValue());
        }
        return i4 + i;
    }

    /* renamed from: b */
    public final int mo2298b(Object obj) {
        int i = 0;
        int length = this.f19289c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int f = m13941f(i2);
            int i3 = this.f19289c[i2];
            long j = (long) (1048575 & f);
            Object j2;
            switch (kth.m13939e(f)) {
                case 0:
                    i = (i * 53) + ksd.m5128a(Double.doubleToLongBits(kul.m5336f(obj, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(kul.m5337g(obj, j));
                    break;
                case 2:
                    i = (i * 53) + ksd.m5128a(kul.m5339i(obj, j));
                    break;
                case 3:
                    i = (i * 53) + ksd.m5128a(kul.m5339i(obj, j));
                    break;
                case 4:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 5:
                    i = (i * 53) + ksd.m5128a(kul.m5339i(obj, j));
                    break;
                case 6:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 7:
                    i = (i * 53) + ksd.m5129a(kul.m5323a(obj, j));
                    break;
                case 8:
                    i = ((String) kul.m5340j(obj, j)).hashCode() + (i * 53);
                    break;
                case 9:
                    j2 = kul.m5340j(obj, j);
                    if (j2 != null) {
                        f = j2.hashCode();
                    } else {
                        f = 37;
                    }
                    i = (i * 53) + f;
                    break;
                case 10:
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 12:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 13:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 14:
                    i = (i * 53) + ksd.m5128a(kul.m5339i(obj, j));
                    break;
                case 15:
                    i = (i * 53) + kul.m5338h(obj, j);
                    break;
                case 16:
                    i = (i * 53) + ksd.m5128a(kul.m5339i(obj, j));
                    break;
                case 17:
                    j2 = kul.m5340j(obj, j);
                    if (j2 != null) {
                        f = j2.hashCode();
                    } else {
                        f = 37;
                    }
                    i = (i * 53) + f;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                case 51:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(Double.doubleToLongBits(kth.m13934c(obj, j)));
                    break;
                case 52:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + Float.floatToIntBits(kth.m13937d(obj, j));
                    break;
                case 53:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(kth.m13942f(obj, j));
                    break;
                case 54:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(kth.m13942f(obj, j));
                    break;
                case 55:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 56:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(kth.m13942f(obj, j));
                    break;
                case 57:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 58:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5129a(kth.m13933b(obj, j));
                    break;
                case 59:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = ((String) kul.m5340j(obj, j)).hashCode() + (i * 53);
                    break;
                case 60:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                case 61:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                case 62:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 63:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 64:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 65:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(kth.m13942f(obj, j));
                    break;
                case 66:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m13940e(obj, j);
                    break;
                case 67:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5128a(kth.m13942f(obj, j));
                    break;
                case 68:
                    if (!m13924a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5340j(obj, j).hashCode();
                    break;
                default:
                    break;
            }
        }
        i = ((kry) obj).f23439e.hashCode() + (i * 53);
        if (this.f19294h) {
            return (i * 53) + ((ksb) obj).f23582g.hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m13936c(int i) {
        return (536870912 & i) != 0;
    }

    /* renamed from: a */
    private final boolean m13923a(Object obj, int i) {
        if (this.f19296j) {
            int f;
            f = m13941f(i);
            long j = (long) (1048575 & f);
            switch (kth.m13939e(f)) {
                case 0:
                    if (kul.m5336f(obj, j) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (kul.m5337g(obj, j) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (kul.m5339i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (kul.m5339i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (kul.m5339i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return kul.m5323a(obj, j);
                case 8:
                    Object j2 = kul.m5340j(obj, j);
                    if (j2 instanceof String) {
                        return ((String) j2).isEmpty() ^ 1;
                    }
                    if (j2 instanceof kqx) {
                        return kqx.f8429a.equals(j2) ^ 1;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (kul.m5340j(obj, j) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return kqx.f8429a.equals(kul.m5340j(obj, j)) ^ 1;
                case 11:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (kul.m5339i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (kul.m5338h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (kul.m5339i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (kul.m5340j(obj, j) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        f = m13938d(i);
        if (((1 << (f >>> 20)) & kul.m5338h(obj, (long) (1048575 & f))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m13925a(Object obj, int i, int i2, int i3) {
        if (this.f19296j) {
            return m13923a(obj, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: c */
    public final boolean mo2300c(Object obj) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.f19299m) {
            int i4;
            int i5;
            int i6 = this.f19298l[i3];
            int i7 = this.f19289c[i6];
            int f = m13941f(i6);
            if (this.f19296j) {
                i4 = i;
                i = i2;
                i2 = 0;
            } else {
                i4 = this.f19289c[i6 + 2];
                i5 = 1048575 & i4;
                i4 = 1 << (i4 >>> 20);
                if (i5 != i) {
                    i = f19288b.getInt(obj, (long) i5);
                    i2 = i4;
                    i4 = i5;
                } else {
                    int i8 = i4;
                    i4 = i;
                    i = i2;
                    i2 = i8;
                }
            }
            if ((268435456 & f) != 0 && !m13925a(obj, i6, i, i2)) {
                return false;
            }
            Object obj2;
            switch (kth.m13939e(f)) {
                case 9:
                case 17:
                    if (m13925a(obj, i6, i, i2) && !kth.m13926a(obj, f, m13928b(i6))) {
                        return false;
                    }
                case 27:
                case 49:
                    List list = (List) kul.m5340j(obj, (long) (1048575 & f));
                    if (list.isEmpty()) {
                        obj2 = 1;
                    } else {
                        ktr b = m13928b(i6);
                        i5 = 0;
                        while (i5 < list.size()) {
                            if (b.mo2300c(list.get(i5))) {
                                i5++;
                            } else {
                                obj2 = null;
                            }
                        }
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        break;
                    }
                    return false;
                case 50:
                    ksz ksz = (ksz) kul.m5340j(obj, (long) (1048575 & f));
                    if (ksz.isEmpty()) {
                        obj2 = 1;
                    } else {
                        kta.m5163a();
                        if (null.f8614d == gcb.f5061k) {
                            ktr ktr = null;
                            for (Object next : ksz.values()) {
                                if (ktr == null) {
                                    ktr = kto.f8542a.m5174a(next.getClass());
                                }
                                if (!ktr.mo2300c(next)) {
                                    obj2 = null;
                                }
                            }
                            obj2 = 1;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 != null) {
                        break;
                    }
                    return false;
                case 60:
                case 68:
                    if (m13924a(obj, i7, i6) && !kth.m13926a(obj, f, m13928b(i6))) {
                        return false;
                    }
                default:
                    break;
            }
            i3++;
            i2 = i;
            i = i4;
        }
        if (!this.f19294h || ((ksb) obj).f23582g.m5124b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m13926a(Object obj, int i, ktr ktr) {
        return ktr.mo2300c(kul.m5340j(obj, (long) (1048575 & i)));
    }

    /* renamed from: a */
    private final boolean m13924a(Object obj, int i, int i2) {
        return kul.m5338h(obj, (long) (m13938d(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private static List m13916a(Object obj, long j) {
        return (List) kul.m5340j(obj, j);
    }

    /* renamed from: d */
    public final void mo2301d(Object obj) {
        int i = this.f19299m;
        while (true) {
            int i2 = this.f19300n;
            if (i >= i2) {
                break;
            }
            long f = (long) (m13941f(this.f19298l[i]) & 1048575);
            Object j = kul.m5340j(obj, f);
            if (j != null) {
                ((ksz) j).f8537a = false;
                kul.m5320a(obj, f, j);
            }
            i++;
        }
        int length = this.f19298l.length;
        while (i2 < length) {
            this.f19301o.mo2289a(obj, (long) this.f19298l[i2]);
            i2++;
        }
        kug.m5302b(obj);
        if (this.f19294h) {
            krp.m5111b(obj);
        }
    }

    /* renamed from: a */
    public final void mo2295a(Object obj, ktq ktq, krn krn) {
        int i;
        Throwable th;
        if (krn == null) {
            throw new NullPointerException();
        }
        kug kug = this.f19302p;
        Object obj2 = null;
        krr krr = null;
        while (true) {
            int i2;
            int i3;
            Object b;
            int a = ktq.mo2213a();
            if (a < this.f19291e) {
                i2 = -1;
            } else if (a <= this.f19292f) {
                i2 = (this.f19289c.length / 3) - 1;
                i = 0;
                while (i <= i2) {
                    int i4 = (i2 + i) >>> 1;
                    i3 = i4 * 3;
                    int i5 = this.f19289c[i3];
                    if (a == i5) {
                        i2 = i3;
                    } else if (a < i5) {
                        i2 = i4 - 1;
                    } else {
                        i = i4 + 1;
                    }
                }
                i2 = -1;
            } else {
                i2 = -1;
            }
            Object b2;
            if (i2 >= 0) {
                try {
                    i = m13941f(i2);
                    try {
                        long j;
                        Object obj3;
                        ksf a2;
                        ktr b3;
                        List b4;
                        long j2;
                        switch (kth.m13939e(i)) {
                            case 0:
                                kul.m5316a(obj, (long) (i & 1048575), ktq.mo2228e());
                                m13929b(obj, i2);
                                continue;
                            case 1:
                                kul.m5317a(obj, (long) (i & 1048575), ktq.mo2236i());
                                m13929b(obj, i2);
                                continue;
                            case 2:
                                kul.m5319a(obj, (long) (i & 1048575), ktq.mo2240k());
                                m13929b(obj, i2);
                                continue;
                            case 3:
                                kul.m5319a(obj, (long) (i & 1048575), ktq.mo2255s());
                                m13929b(obj, i2);
                                continue;
                            case 4:
                                kul.m5318a(obj, (long) (i & 1048575), ktq.mo2238j());
                                m13929b(obj, i2);
                                continue;
                            case 5:
                                kul.m5319a(obj, (long) (i & 1048575), ktq.mo2234h());
                                m13929b(obj, i2);
                                continue;
                            case 6:
                                kul.m5318a(obj, (long) (i & 1048575), ktq.mo2232g());
                                m13929b(obj, i2);
                                continue;
                            case 7:
                                kul.m5321a(obj, (long) (i & 1048575), ktq.mo2225c());
                                m13929b(obj, i2);
                                continue;
                            case 8:
                                m13920a(obj, i, ktq);
                                m13929b(obj, i2);
                                continue;
                            case 9:
                                if (!m13923a(obj, i2)) {
                                    kul.m5320a(obj, (long) (i & 1048575), ktq.mo2221b(m13928b(i2), krn));
                                    m13929b(obj, i2);
                                    break;
                                }
                                j = (long) (i & 1048575);
                                obj3 = obj;
                                kul.m5320a(obj3, j, ksd.m5132a(kul.m5340j(obj, j), ktq.mo2221b(m13928b(i2), krn)));
                                continue;
                            case 10:
                                kul.m5320a(obj, (long) (i & 1048575), ktq.mo2226d());
                                m13929b(obj, i2);
                                continue;
                            case 11:
                                kul.m5318a(obj, (long) (i & 1048575), ktq.mo2254r());
                                m13929b(obj, i2);
                                continue;
                            case 12:
                                i3 = ktq.mo2230f();
                                a2 = m13917a(i2);
                                if (a2 == null || a2.mo1772a(i3) != null) {
                                    kul.m5318a(obj, (long) (i & 1048575), i3);
                                    m13929b(obj, i2);
                                    break;
                                }
                                obj2 = ktt.m5235a(a, i3, obj2, kug);
                                continue;
                            case 13:
                                kul.m5318a(obj, (long) (i & 1048575), ktq.mo2242l());
                                m13929b(obj, i2);
                                continue;
                            case 14:
                                kul.m5319a(obj, (long) (i & 1048575), ktq.mo2244m());
                                m13929b(obj, i2);
                                continue;
                            case 15:
                                kul.m5318a(obj, (long) (i & 1048575), ktq.mo2246n());
                                m13929b(obj, i2);
                                continue;
                            case 16:
                                kul.m5319a(obj, (long) (i & 1048575), ktq.mo2248o());
                                m13929b(obj, i2);
                                continue;
                            case 17:
                                if (!m13923a(obj, i2)) {
                                    kul.m5320a(obj, (long) (i & 1048575), ktq.mo2215a(m13928b(i2), krn));
                                    m13929b(obj, i2);
                                    break;
                                }
                                j = (long) (i & 1048575);
                                obj3 = obj;
                                kul.m5320a(obj3, j, ksd.m5132a(kul.m5340j(obj, j), ktq.mo2215a(m13928b(i2), krn)));
                                continue;
                            case 18:
                                ktq.mo2224c(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 19:
                                ktq.mo2233g(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 20:
                                ktq.mo2237i(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 21:
                                ktq.mo2253q(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 22:
                                ktq.mo2235h(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 23:
                                ktq.mo2231f(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 24:
                                ktq.mo2229e(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 25:
                                ktq.mo2216a(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 26:
                                if (!kth.m13936c(i)) {
                                    ktq.mo2247n(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                    break;
                                }
                                ktq.mo2249o(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 27:
                                b3 = m13928b(i2);
                                ktq.mo2223b(this.f19301o.mo2291b(obj, (long) (i & 1048575)), b3, krn);
                                continue;
                            case 28:
                                ktq.mo2222b(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 29:
                                ktq.mo2251p(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 30:
                                b4 = this.f19301o.mo2291b(obj, (long) (i & 1048575));
                                ktq.mo2227d(b4);
                                obj2 = ktt.m5236a(a, b4, m13917a(i2), obj2, kug);
                                continue;
                            case 31:
                                ktq.mo2239j(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 32:
                                ktq.mo2241k(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 33:
                                ktq.mo2243l(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 34:
                                ktq.mo2245m(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 35:
                                ktq.mo2224c(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 36:
                                ktq.mo2233g(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 37:
                                ktq.mo2237i(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 38:
                                ktq.mo2253q(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 39:
                                ktq.mo2235h(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 40:
                                ktq.mo2231f(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 41:
                                ktq.mo2229e(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 42:
                                ktq.mo2216a(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 43:
                                ktq.mo2251p(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 44:
                                b4 = this.f19301o.mo2291b(obj, (long) (i & 1048575));
                                ktq.mo2227d(b4);
                                obj2 = ktt.m5236a(a, b4, m13917a(i2), obj2, kug);
                                continue;
                            case 45:
                                ktq.mo2239j(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 46:
                                ktq.mo2241k(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 47:
                                ktq.mo2243l(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 48:
                                ktq.mo2245m(this.f19301o.mo2291b(obj, (long) (i & 1048575)));
                                continue;
                            case 49:
                                j = (long) (i & 1048575);
                                b3 = m13928b(i2);
                                ktq.mo2217a(this.f19301o.mo2291b(obj, j), b3, krn);
                                continue;
                            case 50:
                                ksz b5;
                                j = (long) (m13941f(i2) & 1048575);
                                ksz j3 = kul.m5340j(obj, j);
                                if (j3 == null) {
                                    b5 = ksz.f8536b.m5160b();
                                    kul.m5320a(obj, j, (Object) b5);
                                } else if ((j3.f8537a ^ 1) != 0) {
                                    b2 = ksz.f8536b.m5160b();
                                    kta.m5162a(b2, j3);
                                    kul.m5320a(obj, j, b2);
                                } else {
                                    b5 = j3;
                                }
                                Map map = b5;
                                kta.m5163a();
                                ktq.mo2218a(map, krn);
                                continue;
                            case 51:
                                kul.m5320a(obj, (long) (i & 1048575), Double.valueOf(ktq.mo2228e()));
                                m13930b(obj, a, i2);
                                continue;
                            case 52:
                                kul.m5320a(obj, (long) (i & 1048575), Float.valueOf(ktq.mo2236i()));
                                m13930b(obj, a, i2);
                                continue;
                            case 53:
                                kul.m5320a(obj, (long) (i & 1048575), Long.valueOf(ktq.mo2240k()));
                                m13930b(obj, a, i2);
                                continue;
                            case 54:
                                kul.m5320a(obj, (long) (i & 1048575), Long.valueOf(ktq.mo2255s()));
                                m13930b(obj, a, i2);
                                continue;
                            case 55:
                                kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(ktq.mo2238j()));
                                m13930b(obj, a, i2);
                                continue;
                            case 56:
                                kul.m5320a(obj, (long) (i & 1048575), Long.valueOf(ktq.mo2234h()));
                                m13930b(obj, a, i2);
                                continue;
                            case 57:
                                kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(ktq.mo2232g()));
                                m13930b(obj, a, i2);
                                continue;
                            case 58:
                                kul.m5320a(obj, (long) (i & 1048575), Boolean.valueOf(ktq.mo2225c()));
                                m13930b(obj, a, i2);
                                continue;
                            case 59:
                                m13920a(obj, i, ktq);
                                m13930b(obj, a, i2);
                                continue;
                            case 60:
                                if (m13924a(obj, a, i2)) {
                                    j2 = (long) (i & 1048575);
                                    obj3 = obj;
                                    kul.m5320a(obj3, j2, ksd.m5132a(kul.m5340j(obj, j2), ktq.mo2221b(m13928b(i2), krn)));
                                } else {
                                    kul.m5320a(obj, (long) (i & 1048575), ktq.mo2221b(m13928b(i2), krn));
                                    m13929b(obj, i2);
                                }
                                m13930b(obj, a, i2);
                                continue;
                            case 61:
                                kul.m5320a(obj, (long) (i & 1048575), ktq.mo2226d());
                                m13930b(obj, a, i2);
                                continue;
                            case 62:
                                kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(ktq.mo2254r()));
                                m13930b(obj, a, i2);
                                continue;
                            case 63:
                                i3 = ktq.mo2230f();
                                a2 = m13917a(i2);
                                if (a2 == null || a2.mo1772a(i3) != null) {
                                    kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(i3));
                                    m13930b(obj, a, i2);
                                    break;
                                }
                                obj2 = ktt.m5235a(a, i3, obj2, kug);
                                continue;
                            case 64:
                                kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(ktq.mo2242l()));
                                m13930b(obj, a, i2);
                                continue;
                            case 65:
                                kul.m5320a(obj, (long) (i & 1048575), Long.valueOf(ktq.mo2244m()));
                                m13930b(obj, a, i2);
                                continue;
                            case 66:
                                kul.m5320a(obj, (long) (i & 1048575), Integer.valueOf(ktq.mo2246n()));
                                m13930b(obj, a, i2);
                                continue;
                            case 67:
                                kul.m5320a(obj, (long) (i & 1048575), Long.valueOf(ktq.mo2248o()));
                                m13930b(obj, a, i2);
                                continue;
                            case 68:
                                j2 = (long) (i & 1048575);
                                kul.m5320a(obj, j2, ktq.mo2215a(m13928b(i2), krn));
                                m13930b(obj, a, i2);
                                continue;
                            default:
                                if (obj2 == null) {
                                    b = kuh.m5306b();
                                } else {
                                    b = obj2;
                                }
                                try {
                                    if (kug.m5303a(b, ktq)) {
                                        obj2 = b;
                                        continue;
                                    } else {
                                        for (i2 = this.f19299m; i2 < this.f19300n; i2++) {
                                            b = m13914a(obj, this.f19298l[i2], b, kug);
                                        }
                                        if (b != null) {
                                            kug.m5301a(obj, (kuh) b);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (ksi e) {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    break;
                                }
                        }
                    } catch (ksi e2) {
                        b = obj2;
                    }
                    if (b == null) {
                        try {
                            b = kug.m5297a(obj);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    try {
                        if (kug.m5303a(b, ktq)) {
                            obj2 = b;
                        } else {
                            for (i2 = this.f19299m; i2 < this.f19300n; i2++) {
                                b = m13914a(obj, this.f19298l[i2], b, kug);
                            }
                            if (b != null) {
                                kug.m5301a(obj, (kuh) b);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    b = obj2;
                }
            } else if (a != LfuScheduler.MAX_PRIORITY) {
                if (this.f19294h) {
                    b2 = krp.m5107a(krn, this.f19293g, a);
                } else {
                    b2 = null;
                }
                if (b2 != null) {
                    krr a3;
                    if (krr == null) {
                        a3 = krp.m5108a(obj);
                    } else {
                        a3 = krr;
                    }
                    krl krl = (krl) b2;
                    krs krs = krl.f8442d;
                    i3 = krs.f8456b;
                    Object valueOf;
                    Object a4;
                    if (krs.f8457c == kuw.ENUM) {
                        int j4 = ktq.mo2238j();
                        ksf ksf = null;
                        if (ksf.mo1772a(j4) == null) {
                            b2 = ktt.m5235a(i3, j4, obj2, kug);
                        } else {
                            valueOf = Integer.valueOf(j4);
                            switch (krl.f8442d.f8457c.ordinal()) {
                                case 9:
                                case 10:
                                    a4 = a3.m5120a(krl.f8442d);
                                    if (a4 != null) {
                                        valueOf = ksd.m5132a(a4, valueOf);
                                        break;
                                    }
                                    break;
                            }
                            a3.m5123b(krl.f8442d, valueOf);
                            b2 = obj2;
                        }
                    } else {
                        switch (krl.f8442d.f8457c.ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(ktq.mo2228e());
                                break;
                            case 1:
                                valueOf = Float.valueOf(ktq.mo2236i());
                                break;
                            case 2:
                                valueOf = Long.valueOf(ktq.mo2240k());
                                break;
                            case 3:
                                valueOf = Long.valueOf(ktq.mo2255s());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(ktq.mo2238j());
                                break;
                            case 5:
                                valueOf = Long.valueOf(ktq.mo2234h());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(ktq.mo2232g());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(ktq.mo2225c());
                                break;
                            case 8:
                                valueOf = ktq.mo2250p();
                                break;
                            case 9:
                                valueOf = ktq.mo2214a(krl.f8441c.getClass(), krn);
                                break;
                            case 10:
                                valueOf = ktq.mo2220b(krl.f8441c.getClass(), krn);
                                break;
                            case 11:
                                valueOf = ktq.mo2226d();
                                break;
                            case 12:
                                valueOf = Integer.valueOf(ktq.mo2254r());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(ktq.mo2242l());
                                break;
                            case 15:
                                valueOf = Long.valueOf(ktq.mo2244m());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(ktq.mo2246n());
                                break;
                            case 17:
                                valueOf = Long.valueOf(ktq.mo2248o());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        switch (krl.f8442d.f8457c.ordinal()) {
                            case 9:
                            case 10:
                                a4 = a3.m5120a(krl.f8442d);
                                if (a4 != null) {
                                    valueOf = ksd.m5132a(a4, valueOf);
                                    break;
                                }
                                break;
                        }
                        a3.m5123b(krl.f8442d, valueOf);
                        b2 = obj2;
                    }
                    krr = a3;
                    obj2 = b2;
                } else {
                    if (obj2 == null) {
                        b = kug.m5297a(obj);
                    } else {
                        b = obj2;
                    }
                    try {
                        if (kug.m5303a(b, ktq)) {
                            obj2 = b;
                        } else {
                            for (i2 = this.f19299m; i2 < this.f19300n; i2++) {
                                b = m13914a(obj, this.f19298l[i2], b, kug);
                            }
                            if (b != null) {
                                kug.m5301a(obj, (kuh) b);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            } else {
                for (i2 = this.f19299m; i2 < this.f19300n; i2++) {
                    obj2 = m13914a(obj, this.f19298l[i2], obj2, kug);
                }
                if (obj2 != null) {
                    kug.m5301a(obj, (kuh) obj2);
                    return;
                }
                return;
            }
        }
        obj2 = b;
        for (i = this.f19299m; i < this.f19300n; i++) {
            obj2 = m13914a(obj, this.f19298l[i], obj2, kug);
        }
        if (obj2 != null) {
            kug.m5301a(obj, (kuh) obj2);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo2299b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.f19289c.length; i += 3) {
                int f = m13941f(i);
                long j = (long) (1048575 & f);
                int i2 = this.f19289c[i];
                switch (kth.m13939e(f)) {
                    case 0:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5316a(obj, j, kul.m5336f(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 1:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5317a(obj, j, kul.m5337g(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 2:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5319a(obj, j, kul.m5339i(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 3:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5319a(obj, j, kul.m5339i(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 4:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 5:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5319a(obj, j, kul.m5339i(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 6:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 7:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5321a(obj, j, kul.m5323a(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 8:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5320a(obj, j, kul.m5340j(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 9:
                        m13931b(obj, obj2, i);
                        break;
                    case 10:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5320a(obj, j, kul.m5340j(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 11:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 12:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 13:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 14:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5319a(obj, j, kul.m5339i(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 15:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5318a(obj, j, kul.m5338h(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 16:
                        if (!m13923a(obj2, i)) {
                            break;
                        }
                        kul.m5319a(obj, j, kul.m5339i(obj2, j));
                        m13929b(obj, i);
                        break;
                    case 17:
                        m13931b(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f19301o.mo2290a(obj, obj2, j);
                        break;
                    case 50:
                        ktt.m5242a(obj, obj2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m13924a(obj2, i2, i)) {
                            break;
                        }
                        kul.m5320a(obj, j, kul.m5340j(obj2, j));
                        m13930b(obj, i2, i);
                        break;
                    case 60:
                        m13935c(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m13924a(obj2, i2, i)) {
                            break;
                        }
                        kul.m5320a(obj, j, kul.m5340j(obj2, j));
                        m13930b(obj, i2, i);
                        break;
                    case 68:
                        m13935c(obj, obj2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.f19296j) {
                ktt.m5244a(this.f19302p, obj, obj2);
                if (this.f19294h) {
                    ktt.m5243a(this.f19303q, obj, obj2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    private final void m13931b(Object obj, Object obj2, int i) {
        long f = (long) (m13941f(i) & 1048575);
        if (m13923a(obj2, i)) {
            Object j = kul.m5340j(obj, f);
            Object j2 = kul.m5340j(obj2, f);
            if (j != null && j2 != null) {
                kul.m5320a(obj, f, ksd.m5132a(j, j2));
                m13929b(obj, i);
            } else if (j2 != null) {
                kul.m5320a(obj, f, j2);
                m13929b(obj, i);
            }
        }
    }

    /* renamed from: c */
    private final void m13935c(Object obj, Object obj2, int i) {
        int f = m13941f(i);
        int i2 = this.f19289c[i];
        long j = (long) (f & 1048575);
        if (m13924a(obj2, i2, i)) {
            Object j2 = kul.m5340j(obj, j);
            Object j3 = kul.m5340j(obj2, j);
            if (j2 != null && j3 != null) {
                kul.m5320a(obj, j, ksd.m5132a(j2, j3));
                m13930b(obj, i2, i);
            } else if (j3 != null) {
                kul.m5320a(obj, j, j3);
                m13930b(obj, i2, i);
            }
        }
    }

    /* renamed from: a */
    public final Object mo2294a() {
        return ((kry) this.f19293g).mo3571a(go.bY, null);
    }

    /* renamed from: a */
    static kth m13918a(ktc ktc, ktk ktk, ksq ksq, kug kug, krp krp, kta kta) {
        if (ktc instanceof ktp) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            char charAt;
            int i5;
            int i6;
            int[] iArr;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            char c;
            ktp ktp = (ktp) ktc;
            if (ktp.mo2303b() == go.cc) {
                z = true;
            } else {
                z = false;
            }
            String str = ktp.f19310b;
            int length = str.length();
            char charAt2 = str.charAt(0);
            if (charAt2 >= '?') {
                i = charAt2 & 8191;
                i2 = 1;
                i3 = 13;
                while (true) {
                    i4 = i2 + 1;
                    charAt = str.charAt(i2);
                    if (charAt < '?') {
                        break;
                    }
                    i |= (charAt & 8191) << i3;
                    i3 += 13;
                    i2 = i4;
                }
                i5 = (charAt << i3) | i;
            } else {
                i4 = 1;
                char c2 = charAt2;
            }
            i2 = i4 + 1;
            i3 = str.charAt(i4);
            if (i3 >= 55296) {
                i = i3 & 8191;
                i3 = 13;
                while (true) {
                    i4 = i2 + 1;
                    charAt = str.charAt(i2);
                    if (charAt < '?') {
                        break;
                    }
                    i |= (charAt & 8191) << i3;
                    i3 += 13;
                    i2 = i4;
                }
                i3 = (charAt << i3) | i;
                i6 = i4;
            } else {
                i6 = i2;
            }
            if (i3 == 0) {
                iArr = f19287a;
                i4 = 0;
                i7 = 0;
                i2 = 0;
                i8 = 0;
                i3 = 0;
                i9 = 0;
                i10 = i6;
                i11 = 0;
            } else {
                int i12;
                int i13;
                char charAt3;
                i2 = i6 + 1;
                i11 = str.charAt(i6);
                if (i11 >= 55296) {
                    i = i11 & 8191;
                    i3 = 13;
                    while (true) {
                        i4 = i2 + 1;
                        charAt = str.charAt(i2);
                        if (charAt < '?') {
                            break;
                        }
                        i |= (charAt & 8191) << i3;
                        i3 += 13;
                        i2 = i4;
                    }
                    i11 = i | (charAt << i3);
                } else {
                    i4 = i2;
                }
                i2 = i4 + 1;
                charAt2 = str.charAt(i4);
                if (charAt2 >= '?') {
                    i = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i4 = i2 + 1;
                        charAt = str.charAt(i2);
                        if (charAt < '?') {
                            break;
                        }
                        i |= (charAt & 8191) << i3;
                        i3 += 13;
                        i2 = i4;
                    }
                    i10 = (charAt << i3) | i;
                } else {
                    c = charAt2;
                    i4 = i2;
                }
                i2 = i4 + 1;
                i4 = str.charAt(i4);
                if (i4 >= 55296) {
                    i = i4 & 8191;
                    i3 = 13;
                    while (true) {
                        i4 = i2 + 1;
                        charAt = str.charAt(i2);
                        if (charAt < '?') {
                            break;
                        }
                        i |= (charAt & 8191) << i3;
                        i3 += 13;
                        i2 = i4;
                    }
                    i12 = (charAt << i3) | i;
                    i3 = i4;
                    i4 = i12;
                } else {
                    i3 = i2;
                }
                i2 = i3 + 1;
                i7 = str.charAt(i3);
                if (i7 >= 55296) {
                    i = i7 & 8191;
                    i3 = 13;
                    while (true) {
                        i7 = i2 + 1;
                        charAt = str.charAt(i2);
                        if (charAt < '?') {
                            break;
                        }
                        i |= (charAt & 8191) << i3;
                        i3 += 13;
                        i2 = i7;
                    }
                    i12 = (charAt << i3) | i;
                    i3 = i7;
                    i7 = i12;
                } else {
                    i3 = i2;
                }
                i2 = i3 + 1;
                charAt2 = str.charAt(i3);
                if (charAt2 >= '?') {
                    i = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i13 = i2 + 1;
                        charAt = str.charAt(i2);
                        if (charAt < '?') {
                            break;
                        }
                        i |= (charAt & 8191) << i3;
                        i3 += 13;
                        i2 = i13;
                    }
                    i2 = i | (charAt << i3);
                    i3 = i13;
                } else {
                    char c3 = charAt2;
                    i3 = i2;
                    charAt = c3;
                }
                i13 = i3 + 1;
                i = str.charAt(i3);
                if (i >= 55296) {
                    char charAt4;
                    i &= 8191;
                    i3 = 13;
                    while (true) {
                        i8 = i13 + 1;
                        charAt4 = str.charAt(i13);
                        if (charAt4 < '?') {
                            break;
                        }
                        i |= (charAt4 & 8191) << i3;
                        i3 += 13;
                        i13 = i8;
                    }
                    i |= charAt4 << i3;
                    i13 = i8;
                }
                i8 = i13 + 1;
                charAt2 = str.charAt(i13);
                if (charAt2 >= '?') {
                    i13 = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i6 = i8 + 1;
                        charAt3 = str.charAt(i8);
                        if (charAt3 < '?') {
                            break;
                        }
                        i13 |= (charAt3 & 8191) << i3;
                        i3 += 13;
                        i8 = i6;
                    }
                    i9 = (charAt3 << i3) | i13;
                } else {
                    char c4 = charAt2;
                    i6 = i8;
                }
                i8 = i6 + 1;
                charAt2 = str.charAt(i6);
                if (charAt2 >= '?') {
                    i13 = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i6 = i8 + 1;
                        charAt3 = str.charAt(i8);
                        if (charAt3 < '?') {
                            break;
                        }
                        i13 |= (charAt3 & 8191) << i3;
                        i3 += 13;
                        i8 = i6;
                    }
                    i8 = i13 | (charAt3 << i3);
                } else {
                    i6 = i8;
                    charAt3 = charAt2;
                }
                iArr = new int[((i8 + i) + i9)];
                i3 = (i11 + i11) + i10;
                i9 = i11;
                i10 = i6;
                i11 = i;
            }
            Unsafe unsafe = f19288b;
            Object[] objArr = ktp.f19311c;
            Class cls = ktp.f19309a.getClass();
            int[] iArr2 = new int[(i2 * 3)];
            Object[] objArr2 = new Object[(i2 + i2)];
            i6 = i8 + i11;
            int i14 = 0;
            int i15 = 0;
            int i16 = i6;
            int i17 = i8;
            int i18 = i3;
            int i19 = i10;
            while (i19 < length) {
                int i20;
                int i21;
                int i22;
                int i23;
                i10 = i19 + 1;
                charAt2 = str.charAt(i19);
                if (charAt2 >= '?') {
                    i11 = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i20 = i10 + 1;
                        c = str.charAt(i10);
                        if (c < '?') {
                            break;
                        }
                        i11 |= (c & 8191) << i3;
                        i3 += 13;
                        i10 = i20;
                    }
                    i21 = (c << i3) | i11;
                } else {
                    char c5 = charAt2;
                    i20 = i10;
                }
                i10 = i20 + 1;
                charAt2 = str.charAt(i20);
                if (charAt2 >= '?') {
                    i11 = charAt2 & 8191;
                    i3 = 13;
                    while (true) {
                        i20 = i10 + 1;
                        c = str.charAt(i10);
                        if (c < '?') {
                            break;
                        }
                        i11 |= (c & 8191) << i3;
                        i3 += 13;
                        i10 = i20;
                    }
                    i22 = (c << i3) | i11;
                } else {
                    char c6 = charAt2;
                    i20 = i10;
                }
                int i24 = i22 & Illuminant.kOther;
                if ((i22 & 1024) != 0) {
                    i3 = i14 + 1;
                    iArr[i14] = i15;
                    i14 = i3;
                }
                Object obj;
                Field a;
                if (i24 > krt.MAP.f8509k) {
                    i10 = i20 + 1;
                    i3 = str.charAt(i20);
                    if (i3 >= 55296) {
                        i11 = i3 & 8191;
                        i3 = 13;
                        while (true) {
                            i20 = i10 + 1;
                            c = str.charAt(i10);
                            if (c < '?') {
                                break;
                            }
                            i11 |= (c & 8191) << i3;
                            i3 += 13;
                            i10 = i20;
                        }
                        i3 = (c << i3) | i11;
                    } else {
                        i20 = i10;
                    }
                    if (!(i24 == krt.MESSAGE.f8509k + 51 || i24 == krt.GROUP.f8509k + 51)) {
                        if (i24 != krt.ENUM.f8509k + 51) {
                            i11 = i18;
                        } else if ((i5 & 1) != 1) {
                            i11 = i18;
                        }
                        i10 = i3 + i3;
                        obj = objArr[i10];
                        if (obj instanceof Field) {
                            a = kth.m13915a(cls, (String) obj);
                            objArr[i10] = a;
                        } else {
                            a = (Field) obj;
                        }
                        i18 = (int) unsafe.objectFieldOffset(a);
                        i10++;
                        obj = objArr[i10];
                        if (obj instanceof Field) {
                            a = kth.m13915a(cls, (String) obj);
                            objArr[i10] = a;
                        } else {
                            a = (Field) obj;
                        }
                        i23 = i11;
                        i19 = i20;
                        i20 = 0;
                        i10 = (int) unsafe.objectFieldOffset(a);
                    }
                    i10 = i15 / 3;
                    i11 = i18 + 1;
                    objArr2[(i10 + i10) + 1] = objArr[i18];
                    i10 = i3 + i3;
                    obj = objArr[i10];
                    if (obj instanceof Field) {
                        a = kth.m13915a(cls, (String) obj);
                        objArr[i10] = a;
                    } else {
                        a = (Field) obj;
                    }
                    i18 = (int) unsafe.objectFieldOffset(a);
                    i10++;
                    obj = objArr[i10];
                    if (obj instanceof Field) {
                        a = kth.m13915a(cls, (String) obj);
                        objArr[i10] = a;
                    } else {
                        a = (Field) obj;
                    }
                    i23 = i11;
                    i19 = i20;
                    i20 = 0;
                    i10 = (int) unsafe.objectFieldOffset(a);
                } else {
                    i11 = i18 + 1;
                    Field a2 = kth.m13915a(cls, (String) objArr[i18]);
                    if (i24 == krt.MESSAGE.f8509k || i24 == krt.GROUP.f8509k) {
                        i3 = i15 / 3;
                        objArr2[(i3 + i3) + 1] = a2.getType();
                        i10 = i11;
                        i11 = i17;
                    } else if (i24 == krt.MESSAGE_LIST.f8509k || i24 == krt.GROUP_LIST.f8509k) {
                        i10 = i15 / 3;
                        i3 = i11 + 1;
                        objArr2[(i10 + i10) + 1] = objArr[i11];
                        i11 = i17;
                        i10 = i3;
                    } else if (i24 == krt.ENUM.f8509k || i24 == krt.ENUM_LIST.f8509k || i24 == krt.ENUM_LIST_PACKED.f8509k) {
                        if ((i5 & 1) == 1) {
                            i10 = i15 / 3;
                            i3 = i11 + 1;
                            objArr2[(i10 + i10) + 1] = objArr[i11];
                            i11 = i17;
                            i10 = i3;
                        } else {
                            i10 = i11;
                            i11 = i17;
                        }
                    } else if (i24 == krt.MAP.f8509k) {
                        i3 = i17 + 1;
                        iArr[i17] = i15;
                        i10 = i15 / 3;
                        i17 = i10 + i10;
                        i10 = i11 + 1;
                        objArr2[i17] = objArr[i11];
                        if ((i22 & DepthmapTask.MAX_REFERENCE_SIZE_HR_PX) != 0) {
                            i11 = i10 + 1;
                            objArr2[i17 + 1] = objArr[i10];
                            i10 = i11;
                            i11 = i3;
                        } else {
                            i11 = i3;
                        }
                    } else {
                        i10 = i11;
                        i11 = i17;
                    }
                    i23 = (int) unsafe.objectFieldOffset(a2);
                    if ((i5 & 1) != 1) {
                        i17 = i11;
                        i19 = i20;
                        i20 = 0;
                        i18 = i23;
                        i23 = i10;
                        i10 = 0;
                    } else if (i24 <= krt.GROUP.f8509k) {
                        i18 = i20 + 1;
                        charAt2 = str.charAt(i20);
                        if (charAt2 >= '?') {
                            char charAt5;
                            i20 = charAt2 & 8191;
                            i3 = 13;
                            while (true) {
                                i17 = i18 + 1;
                                charAt5 = str.charAt(i18);
                                if (charAt5 < '?') {
                                    break;
                                }
                                i20 |= (charAt5 & 8191) << i3;
                                i3 += 13;
                                i18 = i17;
                            }
                            i20 = (charAt5 << i3) | i20;
                        } else {
                            char c7 = charAt2;
                            i17 = i18;
                        }
                        i18 = (i20 / 32) + (i9 + i9);
                        obj = objArr[i18];
                        if (obj instanceof Field) {
                            a = (Field) obj;
                        } else {
                            a = kth.m13915a(cls, (String) obj);
                            objArr[i18] = a;
                        }
                        i20 %= 32;
                        i18 = i23;
                        i19 = i17;
                        i17 = i11;
                        i23 = i10;
                        i10 = (int) unsafe.objectFieldOffset(a);
                    } else {
                        i17 = i11;
                        i19 = i20;
                        i20 = 0;
                        i18 = i23;
                        i23 = i10;
                        i10 = 0;
                    }
                }
                if (i24 < 18) {
                    i11 = i16;
                } else if (i24 <= 49) {
                    i3 = i16 + 1;
                    iArr[i16] = i18;
                    i11 = i3;
                } else {
                    i11 = i16;
                }
                int i25 = i15 + 1;
                iArr2[i15] = i21;
                i21 = i25 + 1;
                if ((i22 & 512) != 0) {
                    i16 = 536870912;
                } else {
                    i16 = 0;
                }
                if ((i22 & 256) != 0) {
                    i3 = 268435456;
                } else {
                    i3 = 0;
                }
                iArr2[i25] = ((i3 | i16) | (i24 << 20)) | i18;
                i3 = i21 + 1;
                iArr2[i21] = i10 | (i20 << 20);
                i15 = i3;
                i16 = i11;
                i18 = i23;
            }
            return new kth(iArr2, objArr2, i4, i7, ktp.f19309a, z, iArr, i8, i6, ktk, ksq, kug, krp, kta);
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    private static boolean m13933b(Object obj, long j) {
        return ((Boolean) kul.m5340j(obj, j)).booleanValue();
    }

    /* renamed from: c */
    private static double m13934c(Object obj, long j) {
        return ((Double) kul.m5340j(obj, j)).doubleValue();
    }

    /* renamed from: d */
    private static float m13937d(Object obj, long j) {
        return ((Float) kul.m5340j(obj, j)).floatValue();
    }

    /* renamed from: e */
    private static int m13940e(Object obj, long j) {
        return ((Integer) kul.m5340j(obj, j)).intValue();
    }

    /* renamed from: f */
    private static long m13942f(Object obj, long j) {
        return ((Long) kul.m5340j(obj, j)).longValue();
    }

    /* renamed from: d */
    private final int m13938d(int i) {
        return this.f19289c[i + 2];
    }

    /* renamed from: a */
    private final void m13920a(Object obj, int i, ktq ktq) {
        if (kth.m13936c(i)) {
            kul.m5320a(obj, (long) (i & 1048575), ktq.mo2252q());
        } else if (this.f19295i) {
            kul.m5320a(obj, (long) (i & 1048575), ktq.mo2250p());
        } else {
            kul.m5320a(obj, (long) (i & 1048575), ktq.mo2226d());
        }
    }

    /* renamed from: a */
    private static Field m13915a(Class cls, String str) {
        Field declaredField;
        try {
            declaredField = cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                declaredField = declaredFields[i];
                if (!str.equals(declaredField.getName())) {
                    i++;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            length = String.valueOf(str).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 40) + String.valueOf(name).length()) + String.valueOf(arrays).length());
            stringBuilder.append("Field ");
            stringBuilder.append(str);
            stringBuilder.append(" for ");
            stringBuilder.append(name);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(arrays);
            throw new RuntimeException(stringBuilder.toString());
        }
        return declaredField;
    }

    /* renamed from: b */
    private final void m13929b(Object obj, int i) {
        if (!this.f19296j) {
            int d = m13938d(i);
            long j = (long) (1048575 & d);
            kul.m5318a(obj, j, (1 << (d >>> 20)) | kul.m5338h(obj, j));
        }
    }

    /* renamed from: b */
    private final void m13930b(Object obj, int i, int i2) {
        kul.m5318a(obj, (long) (m13938d(i2) & 1048575), i);
    }

    /* renamed from: e */
    private static int m13939e(int i) {
        return (267386880 & i) >>> 20;
    }

    /* renamed from: f */
    private final int m13941f(int i) {
        return this.f19289c[i + 1];
    }

    /* renamed from: b */
    private final void m13932b(Object obj, kvb kvb) {
        Iterator it;
        Entry entry;
        if (this.f19294h) {
            krr krr = ((ksb) obj).f23582g;
            if (krr.f8452a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = krr.m5125c();
                entry = (Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.f19289c.length;
        Unsafe unsafe = f19288b;
        int i = 0;
        int i2 = -1;
        Entry entry2 = entry;
        int i3 = 0;
        while (i < length) {
            int i4;
            Entry entry3;
            int i5;
            int f = m13941f(i);
            int i6 = this.f19289c[i];
            int e = kth.m13939e(f);
            if (this.f19296j) {
                i4 = 0;
                entry3 = entry2;
                i5 = i2;
                i2 = i3;
            } else if (e <= 17) {
                int i7 = this.f19289c[i + 2];
                i4 = 1048575 & i7;
                if (i4 != i2) {
                    i3 = unsafe.getInt(obj, (long) i4);
                } else {
                    i4 = i2;
                }
                i2 = 1 << (i7 >>> 20);
                entry3 = entry2;
                i5 = i4;
                i4 = i2;
                i2 = i3;
            } else {
                i4 = 0;
                entry3 = entry2;
                i5 = i2;
                i2 = i3;
            }
            while (entry3 != null && krp.m5106a(entry3) <= i6) {
                krp.m5110a(kvb, entry3);
                if (it.hasNext()) {
                    entry3 = (Entry) it.next();
                } else {
                    entry3 = null;
                }
            }
            long j = (long) (1048575 & f);
            switch (e) {
                case 0:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5373a(i6, kul.m5336f(obj, j));
                    break;
                case 1:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5374a(i6, kul.m5337g(obj, j));
                    break;
                case 2:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5384b(i6, unsafe.getLong(obj, j));
                    break;
                case 3:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5391e(i6, unsafe.getLong(obj, j));
                    break;
                case 4:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5386c(i6, unsafe.getInt(obj, j));
                    break;
                case 5:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5376a(i6, unsafe.getLong(obj, j));
                    break;
                case 6:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5383b(i6, unsafe.getInt(obj, j));
                    break;
                case 7:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5381a(i6, kul.m5323a(obj, j));
                    break;
                case 8:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kth.m13919a(i6, unsafe.getObject(obj, j), kvb);
                    break;
                case 9:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5385b(i6, unsafe.getObject(obj, j), m13928b(i));
                    break;
                case 10:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5380a(i6, (kqx) unsafe.getObject(obj, j));
                    break;
                case 11:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5392f(i6, unsafe.getInt(obj, j));
                    break;
                case 12:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5375a(i6, unsafe.getInt(obj, j));
                    break;
                case 13:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5388d(i6, unsafe.getInt(obj, j));
                    break;
                case 14:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5387c(i6, unsafe.getLong(obj, j));
                    break;
                case 15:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5390e(i6, unsafe.getInt(obj, j));
                    break;
                case 16:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5389d(i6, unsafe.getLong(obj, j));
                    break;
                case 17:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.m5378a(i6, unsafe.getObject(obj, j), m13928b(i));
                    break;
                case 18:
                    ktt.m5252b(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 19:
                    ktt.m5264f(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 20:
                    ktt.m5270h(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 21:
                    ktt.m5282n(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 22:
                    ktt.m5267g(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 23:
                    ktt.m5261e(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 24:
                    ktt.m5258d(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 25:
                    ktt.m5240a(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 26:
                    ktt.m5250b(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb);
                    break;
                case 27:
                    ktt.m5251b(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, m13928b(i));
                    break;
                case 28:
                    ktt.m5238a(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb);
                    break;
                case 29:
                    ktt.m5281m(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 30:
                    ktt.m5255c(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 31:
                    ktt.m5273i(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 32:
                    ktt.m5276j(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 33:
                    ktt.m5278k(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 34:
                    ktt.m5280l(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 35:
                    ktt.m5252b(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 36:
                    ktt.m5264f(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 37:
                    ktt.m5270h(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 38:
                    ktt.m5282n(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 39:
                    ktt.m5267g(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 40:
                    ktt.m5261e(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 41:
                    ktt.m5258d(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 42:
                    ktt.m5240a(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 43:
                    ktt.m5281m(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 44:
                    ktt.m5255c(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 45:
                    ktt.m5273i(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 46:
                    ktt.m5276j(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 47:
                    ktt.m5278k(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 48:
                    ktt.m5280l(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 49:
                    ktt.m5239a(this.f19289c[i], (List) unsafe.getObject(obj, j), kvb, m13928b(i));
                    break;
                case 50:
                    kth.m13922a(kvb, i6, unsafe.getObject(obj, j));
                    break;
                case 51:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5373a(i6, kth.m13934c(obj, j));
                    break;
                case 52:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5374a(i6, kth.m13937d(obj, j));
                    break;
                case 53:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5384b(i6, kth.m13942f(obj, j));
                    break;
                case 54:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5391e(i6, kth.m13942f(obj, j));
                    break;
                case 55:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5386c(i6, kth.m13940e(obj, j));
                    break;
                case 56:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5376a(i6, kth.m13942f(obj, j));
                    break;
                case 57:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5383b(i6, kth.m13940e(obj, j));
                    break;
                case 58:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5381a(i6, kth.m13933b(obj, j));
                    break;
                case 59:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kth.m13919a(i6, unsafe.getObject(obj, j), kvb);
                    break;
                case 60:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5385b(i6, unsafe.getObject(obj, j), m13928b(i));
                    break;
                case 61:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5380a(i6, (kqx) unsafe.getObject(obj, j));
                    break;
                case 62:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5392f(i6, kth.m13940e(obj, j));
                    break;
                case 63:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5375a(i6, kth.m13940e(obj, j));
                    break;
                case 64:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5388d(i6, kth.m13940e(obj, j));
                    break;
                case 65:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5387c(i6, kth.m13942f(obj, j));
                    break;
                case 66:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5390e(i6, kth.m13940e(obj, j));
                    break;
                case 67:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5389d(i6, kth.m13942f(obj, j));
                    break;
                case 68:
                    if (!m13924a(obj, i6, i)) {
                        break;
                    }
                    kvb.m5378a(i6, unsafe.getObject(obj, j), m13928b(i));
                    break;
                default:
                    break;
            }
            i += 3;
            i3 = i2;
            i2 = i5;
            entry2 = entry3;
        }
        entry = entry2;
        while (entry != null) {
            krp.m5110a(kvb, entry);
            if (it.hasNext()) {
                entry = (Entry) it.next();
            } else {
                entry = null;
            }
        }
        kth.m13921a(this.f19302p, obj, kvb);
    }

    /* renamed from: a */
    private static void m13922a(kvb kvb, int i, Object obj) {
        if (obj != null) {
            kta.m5163a();
            for (Entry entry : ((ksz) obj).entrySet()) {
                kvb.f8633a.mo3288h(i, 2);
                kvb.f8633a.mo3293p(ksx.m13901a(entry.getKey(), entry.getValue()));
                ksx.m13902a(kvb.f8633a, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    private static void m13919a(int i, Object obj, kvb kvb) {
        if (obj instanceof String) {
            kvb.m5379a(i, (String) obj);
        } else {
            kvb.m5380a(i, (kqx) obj);
        }
    }

    /* renamed from: a */
    public final void mo2296a(Object obj, kvb kvb) {
        Iterator it;
        Entry entry;
        int length;
        int f;
        int i;
        Entry entry2;
        if (go.cd == go.ce) {
            kth.m13921a(this.f19302p, obj, kvb);
            if (this.f19294h) {
                krr krr = ((ksb) obj).f23582g;
                if (krr.f8452a.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    if (krr.f8454c) {
                        it = new ksm(krr.f8452a.m5289b().iterator());
                    } else {
                        it = krr.f8452a.m5289b().iterator();
                    }
                    entry = (Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            length = this.f19289c.length - 3;
            while (length >= 0) {
                f = m13941f(length);
                i = this.f19289c[length];
                entry2 = entry;
                while (entry2 != null && krp.m5106a(entry2) > i) {
                    krp.m5110a(kvb, entry2);
                    if (it.hasNext()) {
                        entry2 = (Entry) it.next();
                    } else {
                        entry2 = null;
                    }
                }
                switch (kth.m13939e(f)) {
                    case 0:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5373a(i, kul.m5336f(obj, (long) (1048575 & f)));
                        break;
                    case 1:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5374a(i, kul.m5337g(obj, (long) (1048575 & f)));
                        break;
                    case 2:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5384b(i, kul.m5339i(obj, (long) (1048575 & f)));
                        break;
                    case 3:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5391e(i, kul.m5339i(obj, (long) (1048575 & f)));
                        break;
                    case 4:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5386c(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 5:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5376a(i, kul.m5339i(obj, (long) (1048575 & f)));
                        break;
                    case 6:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5383b(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 7:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5381a(i, kul.m5323a(obj, (long) (1048575 & f)));
                        break;
                    case 8:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kth.m13919a(i, kul.m5340j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 9:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5385b(i, kul.m5340j(obj, (long) (1048575 & f)), m13928b(length));
                        break;
                    case 10:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5380a(i, (kqx) kul.m5340j(obj, (long) (1048575 & f)));
                        break;
                    case 11:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5392f(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 12:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5375a(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 13:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5388d(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 14:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5387c(i, kul.m5339i(obj, (long) (1048575 & f)));
                        break;
                    case 15:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5390e(i, kul.m5338h(obj, (long) (1048575 & f)));
                        break;
                    case 16:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5389d(i, kul.m5339i(obj, (long) (1048575 & f)));
                        break;
                    case 17:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5378a(i, kul.m5340j(obj, (long) (1048575 & f)), m13928b(length));
                        break;
                    case 18:
                        ktt.m5252b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 19:
                        ktt.m5264f(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 20:
                        ktt.m5270h(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 21:
                        ktt.m5282n(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 22:
                        ktt.m5267g(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 23:
                        ktt.m5261e(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 24:
                        ktt.m5258d(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 25:
                        ktt.m5240a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 26:
                        ktt.m5250b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 27:
                        ktt.m5251b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, m13928b(length));
                        break;
                    case 28:
                        ktt.m5238a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 29:
                        ktt.m5281m(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 30:
                        ktt.m5255c(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 31:
                        ktt.m5273i(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 32:
                        ktt.m5276j(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 33:
                        ktt.m5278k(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 34:
                        ktt.m5280l(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 35:
                        ktt.m5252b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 36:
                        ktt.m5264f(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 37:
                        ktt.m5270h(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 38:
                        ktt.m5282n(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 39:
                        ktt.m5267g(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 40:
                        ktt.m5261e(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 41:
                        ktt.m5258d(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 42:
                        ktt.m5240a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 43:
                        ktt.m5281m(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 44:
                        ktt.m5255c(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 45:
                        ktt.m5273i(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 46:
                        ktt.m5276j(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 47:
                        ktt.m5278k(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 48:
                        ktt.m5280l(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 49:
                        ktt.m5239a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & f)), kvb, m13928b(length));
                        break;
                    case 50:
                        kth.m13922a(kvb, i, kul.m5340j(obj, (long) (1048575 & f)));
                        break;
                    case 51:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5373a(i, kth.m13934c(obj, (long) (1048575 & f)));
                        break;
                    case 52:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5374a(i, kth.m13937d(obj, (long) (1048575 & f)));
                        break;
                    case 53:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5384b(i, kth.m13942f(obj, (long) (1048575 & f)));
                        break;
                    case 54:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5391e(i, kth.m13942f(obj, (long) (1048575 & f)));
                        break;
                    case 55:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5386c(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 56:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5376a(i, kth.m13942f(obj, (long) (1048575 & f)));
                        break;
                    case 57:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5383b(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 58:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5381a(i, kth.m13933b(obj, (long) (1048575 & f)));
                        break;
                    case 59:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kth.m13919a(i, kul.m5340j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 60:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5385b(i, kul.m5340j(obj, (long) (1048575 & f)), m13928b(length));
                        break;
                    case 61:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5380a(i, (kqx) kul.m5340j(obj, (long) (1048575 & f)));
                        break;
                    case 62:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5392f(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 63:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5375a(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 64:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5388d(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 65:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5387c(i, kth.m13942f(obj, (long) (1048575 & f)));
                        break;
                    case 66:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5390e(i, kth.m13940e(obj, (long) (1048575 & f)));
                        break;
                    case 67:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5389d(i, kth.m13942f(obj, (long) (1048575 & f)));
                        break;
                    case 68:
                        if (!m13924a(obj, i, length)) {
                            break;
                        }
                        kvb.m5378a(i, kul.m5340j(obj, (long) (1048575 & f)), m13928b(length));
                        break;
                    default:
                        break;
                }
                length -= 3;
                entry = entry2;
            }
            while (entry != null) {
                krp.m5110a(kvb, entry);
                if (it.hasNext()) {
                    entry = (Entry) it.next();
                } else {
                    entry = null;
                }
            }
        } else if (this.f19296j) {
            if (this.f19294h) {
                krr krr2 = ((ksb) obj).f23582g;
                if (krr2.f8452a.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = krr2.m5125c();
                    entry = (Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            f = this.f19289c.length;
            length = 0;
            while (length < f) {
                i = m13941f(length);
                int i2 = this.f19289c[length];
                entry2 = entry;
                while (entry2 != null && krp.m5106a(entry2) <= i2) {
                    krp.m5110a(kvb, entry2);
                    if (it.hasNext()) {
                        entry2 = (Entry) it.next();
                    } else {
                        entry2 = null;
                    }
                }
                switch (kth.m13939e(i)) {
                    case 0:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5373a(i2, kul.m5336f(obj, (long) (1048575 & i)));
                        break;
                    case 1:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5374a(i2, kul.m5337g(obj, (long) (1048575 & i)));
                        break;
                    case 2:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5384b(i2, kul.m5339i(obj, (long) (1048575 & i)));
                        break;
                    case 3:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5391e(i2, kul.m5339i(obj, (long) (1048575 & i)));
                        break;
                    case 4:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5386c(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 5:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5376a(i2, kul.m5339i(obj, (long) (1048575 & i)));
                        break;
                    case 6:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5383b(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 7:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5381a(i2, kul.m5323a(obj, (long) (1048575 & i)));
                        break;
                    case 8:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kth.m13919a(i2, kul.m5340j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 9:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5385b(i2, kul.m5340j(obj, (long) (1048575 & i)), m13928b(length));
                        break;
                    case 10:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5380a(i2, (kqx) kul.m5340j(obj, (long) (1048575 & i)));
                        break;
                    case 11:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5392f(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 12:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5375a(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 13:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5388d(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 14:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5387c(i2, kul.m5339i(obj, (long) (1048575 & i)));
                        break;
                    case 15:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5390e(i2, kul.m5338h(obj, (long) (1048575 & i)));
                        break;
                    case 16:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5389d(i2, kul.m5339i(obj, (long) (1048575 & i)));
                        break;
                    case 17:
                        if (!m13923a(obj, length)) {
                            break;
                        }
                        kvb.m5378a(i2, kul.m5340j(obj, (long) (1048575 & i)), m13928b(length));
                        break;
                    case 18:
                        ktt.m5252b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 19:
                        ktt.m5264f(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 20:
                        ktt.m5270h(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 21:
                        ktt.m5282n(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 22:
                        ktt.m5267g(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 23:
                        ktt.m5261e(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 24:
                        ktt.m5258d(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 25:
                        ktt.m5240a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 26:
                        ktt.m5250b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 27:
                        ktt.m5251b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, m13928b(length));
                        break;
                    case 28:
                        ktt.m5238a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 29:
                        ktt.m5281m(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 30:
                        ktt.m5255c(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 31:
                        ktt.m5273i(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 32:
                        ktt.m5276j(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 33:
                        ktt.m5278k(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 34:
                        ktt.m5280l(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 35:
                        ktt.m5252b(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 36:
                        ktt.m5264f(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 37:
                        ktt.m5270h(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 38:
                        ktt.m5282n(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 39:
                        ktt.m5267g(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 40:
                        ktt.m5261e(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 41:
                        ktt.m5258d(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 42:
                        ktt.m5240a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 43:
                        ktt.m5281m(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 44:
                        ktt.m5255c(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 45:
                        ktt.m5273i(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 46:
                        ktt.m5276j(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 47:
                        ktt.m5278k(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 48:
                        ktt.m5280l(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 49:
                        ktt.m5239a(this.f19289c[length], (List) kul.m5340j(obj, (long) (1048575 & i)), kvb, m13928b(length));
                        break;
                    case 50:
                        kth.m13922a(kvb, i2, kul.m5340j(obj, (long) (1048575 & i)));
                        break;
                    case 51:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5373a(i2, kth.m13934c(obj, (long) (1048575 & i)));
                        break;
                    case 52:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5374a(i2, kth.m13937d(obj, (long) (1048575 & i)));
                        break;
                    case 53:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5384b(i2, kth.m13942f(obj, (long) (1048575 & i)));
                        break;
                    case 54:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5391e(i2, kth.m13942f(obj, (long) (1048575 & i)));
                        break;
                    case 55:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5386c(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 56:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5376a(i2, kth.m13942f(obj, (long) (1048575 & i)));
                        break;
                    case 57:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5383b(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 58:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5381a(i2, kth.m13933b(obj, (long) (1048575 & i)));
                        break;
                    case 59:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kth.m13919a(i2, kul.m5340j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 60:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5385b(i2, kul.m5340j(obj, (long) (1048575 & i)), m13928b(length));
                        break;
                    case 61:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5380a(i2, (kqx) kul.m5340j(obj, (long) (1048575 & i)));
                        break;
                    case 62:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5392f(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 63:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5375a(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 64:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5388d(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 65:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5387c(i2, kth.m13942f(obj, (long) (1048575 & i)));
                        break;
                    case 66:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5390e(i2, kth.m13940e(obj, (long) (1048575 & i)));
                        break;
                    case 67:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5389d(i2, kth.m13942f(obj, (long) (1048575 & i)));
                        break;
                    case 68:
                        if (!m13924a(obj, i2, length)) {
                            break;
                        }
                        kvb.m5378a(i2, kul.m5340j(obj, (long) (1048575 & i)), m13928b(length));
                        break;
                    default:
                        break;
                }
                length += 3;
                entry = entry2;
            }
            while (entry != null) {
                krp.m5110a(kvb, entry);
                if (it.hasNext()) {
                    entry = (Entry) it.next();
                } else {
                    entry = null;
                }
            }
            kth.m13921a(this.f19302p, obj, kvb);
        } else {
            m13932b(obj, kvb);
        }
    }

    /* renamed from: a */
    private static void m13921a(kug kug, Object obj, kvb kvb) {
        ((kry) obj).f23439e.m5309a(kvb);
    }
}
