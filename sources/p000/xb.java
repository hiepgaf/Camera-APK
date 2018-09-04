package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: xb */
public final class xb {
    /* renamed from: g */
    private static final Set f9493g = new HashSet(Arrays.asList(new String[]{"xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"}));
    /* renamed from: a */
    public wt f9494a;
    /* renamed from: b */
    public wk f9495b;
    /* renamed from: c */
    public OutputStreamWriter f9496c;
    /* renamed from: d */
    public xk f9497d;
    /* renamed from: e */
    public int f9498e = 1;
    /* renamed from: f */
    public int f9499f;

    /* renamed from: a */
    private final void m6219a(String str, boolean z) {
        m6224a(wp.m6158a(str, z));
    }

    /* renamed from: a */
    private static boolean m6220a(ww wwVar) {
        if (wwVar.m6198g() || wwVar.m6194d().m6239b(2) || wwVar.m6194d().m14516b() || "[]".equals(wwVar.f9480a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m6218a(String str, String str2, Set set, int i) {
        Object obj = null;
        if (str2 == null) {
            wo woVar = new wo(str);
            String str3 = woVar.f9467a;
            if (str3 != null && str3.length() > 0) {
                obj = 1;
            }
            if (obj != null) {
                str = woVar.f9467a;
                str2 = we.f9447a.m6127c(String.valueOf(str).concat(":"));
                m6218a(str, str2, set, i);
            } else {
                return;
            }
        }
        if (!set.contains(str)) {
            m6222a();
            m6231c(i);
            m6224a("xmlns:");
            m6224a(str);
            m6224a("=\"");
            m6224a(str2);
            m6223a(34);
            set.add(str);
        }
    }

    /* renamed from: a */
    public final void m6225a(ww wwVar, Set set, int i) {
        Iterator h;
        if (wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            String str = wwVar.f9481b;
            m6218a(str.substring(0, str.length() - 1), wwVar.f9480a, set, i);
        } else if (wwVar.m6194d().m6239b(256)) {
            h = wwVar.m6199h();
            while (h.hasNext()) {
                m6218a(((ww) h.next()).f9480a, null, set, i);
            }
        }
        h = wwVar.m6199h();
        while (h.hasNext()) {
            m6225a((ww) h.next(), set, i);
        }
        h = wwVar.m6200i();
        while (h.hasNext()) {
            ww wwVar2 = (ww) h.next();
            m6218a(wwVar2.f9480a, null, set, i);
            m6225a(wwVar2, set, i);
        }
    }

    /* renamed from: b */
    private final void m6221b(ww wwVar, boolean z, int i) {
        if (z || wwVar.m6197f()) {
            String str;
            m6231c(i);
            if (z) {
                str = "<rdf:";
            } else {
                str = "</rdf:";
            }
            m6224a(str);
            if (wwVar.m6194d().m6239b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                m6224a("Alt");
            } else if (wwVar.m6194d().m6239b(1024)) {
                m6224a("Seq");
            } else {
                m6224a("Bag");
            }
            if (!z || wwVar.m6197f()) {
                m6224a(">");
            } else {
                m6224a("/>");
            }
            m6222a();
        }
    }

    /* renamed from: a */
    public final boolean m6227a(ww wwVar, int i) {
        Iterator h = wwVar.m6199h();
        boolean z = true;
        while (h.hasNext()) {
            ww wwVar2 = (ww) h.next();
            if (xb.m6220a(wwVar2)) {
                m6222a();
                m6231c(i);
                m6224a(wwVar2.f9480a);
                m6224a("=\"");
                m6219a(wwVar2.f9481b, true);
                m6223a(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void m6230b(ww wwVar, int i) {
        Iterator h = wwVar.m6199h();
        while (h.hasNext()) {
            ww wwVar2 = (ww) h.next();
            if (!xb.m6220a(wwVar2)) {
                String str;
                boolean z;
                boolean z2;
                String str2 = wwVar2.f9480a;
                if ("[]".equals(str2)) {
                    str = "rdf:li";
                } else {
                    str = str2;
                }
                m6231c(i);
                m6223a(60);
                m6224a(str);
                Iterator i2 = wwVar2.m6200i();
                Object obj = null;
                boolean z3 = false;
                while (i2.hasNext()) {
                    Object obj2;
                    ww wwVar3 = (ww) i2.next();
                    if (f9493g.contains(wwVar3.f9480a)) {
                        z3 = "rdf:resource".equals(wwVar3.f9480a);
                        m6223a(32);
                        m6224a(wwVar3.f9480a);
                        m6224a("=\"");
                        m6219a(wwVar3.f9481b, true);
                        m6223a(34);
                        z = z3;
                        obj2 = obj;
                    } else {
                        z = z3;
                        int i3 = 1;
                    }
                    obj = obj2;
                    z3 = z;
                }
                int i4;
                if (obj != null) {
                    m6224a(" rdf:parseType=\"Resource\">");
                    m6222a();
                    i4 = i + 1;
                    m6226a(wwVar2, true, i4);
                    Iterator i5 = wwVar2.m6200i();
                    while (i5.hasNext()) {
                        m6226a((ww) i5.next(), false, i4);
                    }
                    z = true;
                    z2 = true;
                } else if (!wwVar2.m6194d().m14516b()) {
                    Boolean bool;
                    Boolean bool2 = Boolean.TRUE;
                    Boolean bool3 = Boolean.TRUE;
                    Boolean bool4;
                    if (wwVar2.m6194d().m6239b(2)) {
                        m6224a(" rdf:resource=\"");
                        m6219a(wwVar2.f9481b, true);
                        m6224a("\"/>");
                        m6222a();
                        bool4 = bool3;
                        r1 = Boolean.FALSE;
                        bool = bool4;
                    } else {
                        String str3 = wwVar2.f9481b;
                        if (str3 == null || str3.length() == 0) {
                            m6224a("/>");
                            m6222a();
                            bool4 = bool3;
                            bool3 = Boolean.FALSE;
                            bool = bool4;
                        } else {
                            m6223a(62);
                            m6219a(wwVar2.f9481b, false);
                            bool = Boolean.FALSE;
                            bool3 = bool2;
                        }
                    }
                    Object[] objArr = new Object[]{r1, bool};
                    z = ((Boolean) objArr[0]).booleanValue();
                    z2 = ((Boolean) objArr[1]).booleanValue();
                } else if (wwVar2.m6194d().m6239b(512)) {
                    m6223a(62);
                    m6222a();
                    i4 = i + 1;
                    m6221b(wwVar2, true, i4);
                    if (wwVar2.m6194d().m6239b(4096)) {
                        wy.m6210b(wwVar2);
                    }
                    m6230b(wwVar2, i + 2);
                    m6221b(wwVar2, false, i4);
                    z = true;
                    z2 = true;
                } else {
                    Iterator h2 = wwVar2.m6199h();
                    Object obj3 = null;
                    obj = null;
                    while (h2.hasNext()) {
                        boolean a = xb.m6220a((ww) h2.next());
                        if (a) {
                            r1 = obj;
                        } else {
                            r1 = 1;
                        }
                        if (a) {
                            obj = 1;
                        } else {
                            obj = obj3;
                        }
                        if (obj == null) {
                            obj3 = obj;
                            obj = r1;
                        } else if (r1 != null) {
                            break;
                        } else {
                            obj3 = obj;
                            obj = r1;
                        }
                    }
                    r1 = obj;
                    obj = obj3;
                    if (!z3 || r1 == null) {
                        if (!wwVar2.m6197f()) {
                            m6224a(" rdf:parseType=\"Resource\"/>");
                            m6222a();
                            z2 = false;
                        } else if (r1 == null) {
                            m6227a(wwVar2, i + 1);
                            m6224a("/>");
                            m6222a();
                            z2 = false;
                        } else if (obj == null) {
                            m6224a(" rdf:parseType=\"Resource\">");
                            m6222a();
                            m6230b(wwVar2, i + 1);
                            z2 = true;
                        } else {
                            m6223a(62);
                            m6222a();
                            i4 = i + 1;
                            m6231c(i4);
                            m6224a("<rdf:Description");
                            m6227a(wwVar2, i + 2);
                            m6224a(">");
                            m6222a();
                            m6230b(wwVar2, i4);
                            m6231c(i4);
                            m6224a("</rdf:Description>");
                            m6222a();
                            z2 = true;
                        }
                        z = z2;
                        z2 = true;
                    } else {
                        throw new wb("Can't mix rdf:resource qualifier and element fields", 202);
                    }
                }
                if (z) {
                    if (z2) {
                        m6231c(i);
                    }
                    m6224a("</");
                    m6224a(str);
                    m6223a(62);
                    m6222a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m6226a(ww wwVar, boolean z, int i) {
        String str;
        Object obj;
        Object obj2;
        String str2 = wwVar.f9480a;
        if (z) {
            str = "rdf:value";
        } else if ("[]".equals(str2)) {
            str = "rdf:li";
        } else {
            str = str2;
        }
        m6231c(i);
        m6223a(60);
        m6224a(str);
        Iterator i2 = wwVar.m6200i();
        Object obj3 = null;
        boolean z2 = false;
        while (i2.hasNext()) {
            boolean z3;
            ww wwVar2 = (ww) i2.next();
            if (f9493g.contains(wwVar2.f9480a)) {
                z2 = "rdf:resource".equals(wwVar2.f9480a);
                if (z) {
                    z3 = z2;
                    obj = obj3;
                } else {
                    m6223a(32);
                    m6224a(wwVar2.f9480a);
                    m6224a("=\"");
                    m6219a(wwVar2.f9481b, true);
                    m6223a(34);
                    z3 = z2;
                    obj = obj3;
                }
            } else {
                z3 = z2;
                int i3 = 1;
            }
            obj3 = obj;
            z2 = z3;
        }
        Iterator h;
        if (obj3 == null || z) {
            if (wwVar.m6194d().m14516b()) {
                if (wwVar.m6194d().m6239b(512)) {
                    m6223a(62);
                    m6222a();
                    i3 = i + 1;
                    m6221b(wwVar, true, i3);
                    if (wwVar.m6194d().m6239b(4096)) {
                        wy.m6210b(wwVar);
                    }
                    h = wwVar.m6199h();
                    while (h.hasNext()) {
                        m6226a((ww) h.next(), false, i + 2);
                    }
                    m6221b(wwVar, false, i3);
                } else if (z2) {
                    r2 = wwVar.m6199h();
                    while (r2.hasNext()) {
                        wwVar2 = (ww) r2.next();
                        if (xb.m6220a(wwVar2)) {
                            m6222a();
                            m6231c(i + 1);
                            m6223a(32);
                            m6224a(wwVar2.f9480a);
                            m6224a("=\"");
                            m6219a(wwVar2.f9481b, true);
                            m6223a(34);
                        } else {
                            throw new wb("Can't mix rdf:resource and complex fields", 202);
                        }
                    }
                    m6224a("/>");
                    m6222a();
                    obj = null;
                    obj2 = 1;
                } else if (wwVar.m6197f()) {
                    m6224a(" rdf:parseType=\"Resource\">");
                    m6222a();
                    r2 = wwVar.m6199h();
                    while (r2.hasNext()) {
                        m6226a((ww) r2.next(), false, i + 1);
                    }
                    obj = 1;
                    obj2 = 1;
                } else {
                    m6224a(" rdf:parseType=\"Resource\"/>");
                    m6222a();
                    obj = null;
                    obj2 = 1;
                }
            } else if (wwVar.m6194d().m6239b(2)) {
                m6224a(" rdf:resource=\"");
                m6219a(wwVar.f9481b, true);
                m6224a("\"/>");
                m6222a();
                obj = null;
                obj2 = 1;
            } else {
                str2 = wwVar.f9481b;
                if (str2 == null || "".equals(str2)) {
                    m6224a("/>");
                    m6222a();
                    obj = null;
                    obj2 = 1;
                } else {
                    m6223a(62);
                    m6219a(wwVar.f9481b, false);
                    obj = 1;
                    obj2 = null;
                }
            }
            if (obj != null) {
                if (obj2 != null) {
                    m6231c(i);
                }
                m6224a("</");
                m6224a(str);
                m6223a(62);
                m6222a();
            }
        } else if (z2) {
            throw new wb("Can't mix rdf:resource and general qualifiers", 202);
        } else {
            m6224a(" rdf:parseType=\"Resource\">");
            m6222a();
            i3 = i + 1;
            m6226a(wwVar, true, i3);
            h = wwVar.m6200i();
            while (h.hasNext()) {
                wwVar2 = (ww) h.next();
                if (!f9493g.contains(wwVar2.f9480a)) {
                    m6226a(wwVar2, false, i3);
                }
            }
        }
        obj = 1;
        obj2 = 1;
        if (obj != null) {
            if (obj2 != null) {
                m6231c(i);
            }
            m6224a("</");
            m6224a(str);
            m6223a(62);
            m6222a();
        }
    }

    /* renamed from: a */
    public final void m6223a(int i) {
        this.f9496c.write(i);
    }

    /* renamed from: a */
    public final void m6224a(String str) {
        this.f9496c.write(str);
    }

    /* renamed from: b */
    public final void m6229b(int i) {
        while (i > 0) {
            this.f9496c.write(32);
            i--;
        }
    }

    /* renamed from: c */
    public final void m6231c(int i) {
        for (int i2 = this.f9497d.f19677e + i; i2 > 0; i2--) {
            this.f9496c.write(this.f9497d.f19676d);
        }
    }

    /* renamed from: a */
    public final void m6222a() {
        this.f9496c.write(this.f9497d.f19675c);
    }

    /* renamed from: b */
    public final void m6228b() {
        m6223a(34);
        String str = this.f9494a.f19668a.f9480a;
        if (str != null) {
            m6219a(str, true);
        }
        m6223a(34);
    }
}
