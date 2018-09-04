package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wt */
public final class wt implements wd {
    /* renamed from: a */
    public ww f19668a;

    public wt() {
        this.f19668a = new ww(null, null, null);
    }

    private wt(ww wwVar) {
        this.f19668a = wwVar;
    }

    /* renamed from: a */
    public final void mo2522a(String str, String str2, xj xjVar, String str3, xj xjVar2) {
        tz.m5885c(str);
        tz.m5880a(str2);
        if ((xjVar.f9510a & -7681) != 0) {
            throw new wb("Only array form flags allowed for arrayOptions", 103);
        }
        xj a = wy.m6206a(xjVar, null);
        xd a2 = tz.m5878a(str, str2);
        ww a3 = wy.m6205a(this.f19668a, a2, false, null);
        if (a3 != null) {
            if (!a3.m6194d().m6239b(512)) {
                throw new wb("The named property is not an array", 102);
            }
        } else if (a.m6239b(512)) {
            a3 = wy.m6205a(this.f19668a, a2, true, a);
            if (a3 == null) {
                throw new wb("Failure creating array node", 102);
            }
        } else {
            throw new wb("Explicit arrayOptions required to create new array", 103);
        }
        ww wwVar = new ww("[]", null);
        xj a4 = wy.m6206a(xjVar2, (Object) str3);
        int c = a3.m6192c() + 1;
        if (c > 0) {
            a3.m6186a(c, wwVar);
            wt.m14479a(wwVar, (Object) str3, a4);
            return;
        }
        throw new wb("Array index out of bounds", 104);
    }

    public final Object clone() {
        return new wt((ww) this.f19668a.clone());
    }

    /* renamed from: a */
    public final void mo2515a(String str, String str2) {
        try {
            tz.m5885c(str);
            tz.m5884b(str2);
            ww a = wy.m6205a(this.f19668a, tz.m5878a(str, str2), false, null);
            if (a != null) {
                wy.m6207a(a);
            }
        } catch (wb e) {
        }
    }

    /* renamed from: b */
    public final boolean mo2525b(String str, String str2) {
        try {
            tz.m5885c(str);
            tz.m5884b(str2);
            if (wy.m6205a(this.f19668a, tz.m5878a(str, str2), false, null) != null) {
                return true;
            }
            return false;
        } catch (wb e) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m14478a(int i, ww wwVar) {
        Object obj = wwVar.f9481b;
        switch (i) {
            case 1:
                return new Boolean(tz.m5886d(obj));
            case 2:
                return new Integer(tz.m5889g(obj));
            case 3:
                return new Long(tz.m5890h(obj));
            case 4:
                return new Double(tz.m5888f(obj));
            case 5:
                return tz.m5887e(obj);
            case 6:
                return tz.m5887e(obj).mo2496a();
            case 7:
                return tz.m5891i(obj);
            default:
                if (obj != null || wwVar.m6194d().m14516b()) {
                    return obj;
                }
                return "";
        }
    }

    /* renamed from: c */
    public final xm mo2526c(String str, String str2) {
        tz.m5885c(str);
        tz.m5880a(str2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 13);
        stringBuilder.append(str2);
        stringBuilder.append('[');
        stringBuilder.append(1);
        stringBuilder.append(']');
        String stringBuilder2 = stringBuilder.toString();
        tz.m5885c(str);
        tz.m5884b(stringBuilder2);
        ww a = wy.m6205a(this.f19668a, tz.m5878a(str, stringBuilder2), false, null);
        if (a != null) {
            return new wu(wt.m14478a(0, a));
        }
        return null;
    }

    /* renamed from: d */
    public final xm mo2528d(String str, String str2) {
        tz.m5885c(str);
        tz.m5884b(str2);
        ww a = wy.m6205a(this.f19668a, tz.m5878a(str, str2), false, null);
        if (a != null) {
            return new wu(wt.m14478a(0, a));
        }
        return null;
    }

    /* renamed from: e */
    public final byte[] mo2529e(String str, String str2) {
        return (byte[]) m14480b(str, str2, 7);
    }

    /* renamed from: f */
    public final Boolean mo2530f(String str, String str2) {
        return (Boolean) m14480b(str, str2, 1);
    }

    /* renamed from: g */
    public final Calendar mo2531g(String str, String str2) {
        return (Calendar) m14480b(str, str2, 6);
    }

    /* renamed from: h */
    public final Double mo2532h(String str, String str2) {
        return (Double) m14480b(str, str2, 4);
    }

    /* renamed from: i */
    public final Integer mo2533i(String str, String str2) {
        return (Integer) m14480b(str, str2, 2);
    }

    /* renamed from: b */
    private final Object m14480b(String str, String str2, int i) {
        tz.m5885c(str);
        tz.m5884b(str2);
        ww a = wy.m6205a(this.f19668a, tz.m5878a(str, str2), false, null);
        if (a == null) {
            return null;
        }
        if (i == 0 || !a.m6194d().m14516b()) {
            return wt.m14478a(i, a);
        }
        throw new wb("Property must be simple when a value type is requested", 102);
    }

    /* renamed from: j */
    public final String mo2534j(String str, String str2) {
        return (String) m14480b(str, str2, 0);
    }

    /* renamed from: a */
    public final wc mo2514a() {
        return new wc(this);
    }

    /* renamed from: a */
    public final void mo2520a(String str, String str2, String str3, String str4, String str5) {
        tz.m5885c(str);
        tz.m5880a(str2);
        if (str4.length() == 0) {
            throw new wb("Empty specific language", 4);
        }
        String d = wp.m6165d(str3);
        String d2 = wp.m6165d(str4);
        ww a = wy.m6205a(this.f19668a, tz.m5878a(str, str2), true, new xj(7680));
        if (a == null) {
            throw new wb("Failed to find or create array node", 102);
        }
        Object obj;
        ww wwVar;
        if (!a.m6194d().m6239b(4096)) {
            if (a.m6197f() || !a.m6194d().m6239b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                throw new wb("Specified property is no alt-text array", 102);
            }
            a.m6194d().m14519d();
        }
        Iterator h = a.m6199h();
        while (h.hasNext()) {
            ww wwVar2 = (ww) h.next();
            if (wwVar2.m6198g() && "xml:lang".equals(wwVar2.m6189b(1).f9480a)) {
                if ("x-default".equals(wwVar2.m6189b(1).f9481b)) {
                    obj = 1;
                    wwVar = wwVar2;
                    break;
                }
            }
            throw new wb("Language qualifier must be first", 102);
        }
        obj = null;
        wwVar = null;
        if (wwVar != null && a.m6192c() > 1) {
            a.m6193c(wwVar);
            a.m6186a(1, wwVar);
        }
        if (a.m6194d().m6239b(4096)) {
            Object[] objArr;
            Object obj2;
            int i;
            Object obj3;
            if (a.m6197f()) {
                Iterator h2 = a.m6199h();
                int i2 = 0;
                Object obj4 = null;
                ww wwVar3 = null;
                while (h2.hasNext()) {
                    wwVar2 = (ww) h2.next();
                    if (wwVar2.m6194d().m14516b()) {
                        throw new wb("Alt-text array item is not simple", 102);
                    } else if (wwVar2.m6198g() && "xml:lang".equals(wwVar2.m6189b(1).f9480a)) {
                        String str6 = wwVar2.m6189b(1).f9481b;
                        if (d2.equals(str6)) {
                            objArr = new Object[]{new Integer(1), wwVar2};
                            break;
                        }
                        if (d != null && str6.startsWith(d)) {
                            if (obj4 == null) {
                                obj4 = wwVar2;
                            }
                            wwVar2 = wwVar3;
                            obj2 = obj4;
                            i = i2 + 1;
                        } else if ("x-default".equals(str6)) {
                            obj2 = obj4;
                            i = i2;
                        } else {
                            wwVar2 = wwVar3;
                            obj2 = obj4;
                            i = i2;
                        }
                        i2 = i;
                        obj4 = obj2;
                        wwVar3 = wwVar2;
                    } else {
                        throw new wb("Alt-text array item has no language qualifier", 102);
                    }
                }
                if (i2 == 1) {
                    objArr = new Object[]{new Integer(2), obj4};
                } else if (i2 > 1) {
                    objArr = new Object[]{new Integer(3), obj4};
                } else if (wwVar3 != null) {
                    objArr = new Object[]{new Integer(4), wwVar3};
                } else {
                    objArr = new Object[]{new Integer(5), a.m6183a(1)};
                }
            } else {
                objArr = new Object[]{new Integer(0), null};
            }
            i = ((Integer) objArr[0]).intValue();
            wwVar2 = (ww) objArr[1];
            boolean equals = "x-default".equals(d2);
            switch (i) {
                case 0:
                    wy.m6208a(a, "x-default", str5);
                    if (!equals) {
                        wy.m6208a(a, d2, str5);
                        obj3 = 1;
                        break;
                    }
                    obj3 = 1;
                    break;
                case 1:
                    if (!equals) {
                        if (!(obj == null || wwVar == wwVar2 || wwVar == null || !wwVar.f9481b.equals(wwVar2.f9481b))) {
                            wwVar.f9481b = str5;
                        }
                        wwVar2.f9481b = str5;
                        obj3 = obj;
                        break;
                    }
                    Iterator h3 = a.m6199h();
                    while (h3.hasNext()) {
                        wwVar2 = (ww) h3.next();
                        if (wwVar2 != wwVar) {
                            String str7 = wwVar2.f9481b;
                            if (wwVar == null) {
                                obj2 = null;
                            } else {
                                obj2 = wwVar.f9481b;
                            }
                            if (str7.equals(obj2)) {
                                wwVar2.f9481b = str5;
                            }
                        }
                    }
                    if (wwVar == null) {
                        obj3 = obj;
                        break;
                    }
                    wwVar.f9481b = str5;
                    obj3 = obj;
                    break;
                case 2:
                    if (!(obj == null || wwVar == wwVar2 || wwVar == null || !wwVar.f9481b.equals(wwVar2.f9481b))) {
                        wwVar.f9481b = str5;
                    }
                    wwVar2.f9481b = str5;
                    obj3 = obj;
                    break;
                case 3:
                    wy.m6208a(a, d2, str5);
                    if (!equals) {
                        obj3 = obj;
                        break;
                    } else {
                        obj3 = 1;
                        break;
                    }
                case 4:
                    if (wwVar != null && a.m6192c() == 1) {
                        wwVar.f9481b = str5;
                    }
                    wy.m6208a(a, d2, str5);
                    obj3 = obj;
                    break;
                case 5:
                    wy.m6208a(a, d2, str5);
                    if (!equals) {
                        obj3 = obj;
                        break;
                    } else {
                        obj3 = 1;
                        break;
                    }
                default:
                    throw new wb("Unexpected result from ChooseLocalizedText", 9);
            }
            if (obj3 == null && a.m6192c() == 1) {
                wy.m6208a(a, "x-default", str5);
                return;
            }
            return;
        }
        throw new wb("Localized text array is not alt-text", 102);
    }

    /* renamed from: a */
    private static void m14479a(ww wwVar, Object obj, xj xjVar) {
        String str = null;
        wwVar.m6194d().m14514a(xjVar);
        if (!wwVar.m6194d().m14516b()) {
            String valueOf = obj != null ? obj instanceof Boolean ? !((Boolean) obj).booleanValue() ? "False" : "True" : obj instanceof Integer ? String.valueOf(((Integer) obj).intValue()) : obj instanceof Long ? String.valueOf(((Long) obj).longValue()) : obj instanceof Double ? String.valueOf(((Double) obj).doubleValue()) : obj instanceof vz ? tz.m5877a((vz) obj) : obj instanceof GregorianCalendar ? tz.m5877a(wa.m6097a((GregorianCalendar) obj)) : obj instanceof byte[] ? new String(wi.m6130b((byte[]) obj)) : obj.toString() : null;
            if (valueOf != null) {
                str = wp.m6166e(valueOf);
            }
            if (wwVar.m6194d().m6239b(32) && "xml:lang".equals(wwVar.f9480a)) {
                wwVar.f9481b = wp.m6165d(str);
            } else {
                wwVar.f9481b = str;
            }
        } else if (obj == null || obj.toString().length() <= 0) {
            wwVar.f9483d = null;
        } else {
            throw new wb("Composite nodes can't have values", 102);
        }
    }

    /* renamed from: a */
    public final void mo2518a(String str, String str2, Object obj) {
        mo2519a(str, str2, obj, null);
    }

    /* renamed from: a */
    public final void mo2519a(String str, String str2, Object obj, xj xjVar) {
        tz.m5885c(str);
        tz.m5884b(str2);
        xj a = wy.m6206a(xjVar, obj);
        ww a2 = wy.m6205a(this.f19668a, tz.m5878a(str, str2), true, a);
        if (a2 != null) {
            wt.m14479a(a2, obj, a);
            return;
        }
        throw new wb("Specified property does not exist", 102);
    }

    /* renamed from: a */
    public final void mo2524a(String str, String str2, byte[] bArr) {
        mo2519a(str, str2, bArr, null);
    }

    /* renamed from: a */
    public final void mo2523a(String str, String str2, boolean z) {
        Object obj;
        if (z) {
            obj = "True";
        } else {
            obj = "False";
        }
        mo2519a(str, str2, obj, null);
    }

    /* renamed from: a */
    public final void mo2521a(String str, String str2, vz vzVar) {
        mo2519a(str, str2, vzVar, null);
    }

    /* renamed from: a */
    public final void mo2516a(String str, String str2, double d) {
        mo2519a(str, str2, new Double(d), null);
    }

    /* renamed from: a */
    public final void mo2517a(String str, String str2, int i) {
        mo2519a(str, str2, new Integer(i), null);
    }
}
