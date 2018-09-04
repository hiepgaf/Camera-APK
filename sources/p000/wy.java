package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wy */
public final class wy {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9491a;

    public wy(RecyclerView recyclerView) {
        this.f9491a = recyclerView;
    }

    /* renamed from: a */
    static void m6208a(ww wwVar, String str, String str2) {
        ww wwVar2 = new ww("[]", str2, null);
        ww wwVar3 = new ww("xml:lang", str, null);
        wwVar2.m6191b(wwVar3);
        if ("x-default".equals(wwVar3.f9481b)) {
            wwVar.m6186a(1, wwVar2);
        } else {
            wwVar.m6187a(wwVar2);
        }
    }

    /* renamed from: a */
    static void m6207a(ww wwVar) {
        ww wwVar2 = wwVar.f9482c;
        if (wwVar.m6194d().m6239b(32)) {
            wwVar2.m6195d(wwVar);
        } else {
            wwVar2.m6193c(wwVar);
        }
        if (!wwVar2.m6197f() && wwVar2.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            wwVar2.f9482c.m6193c(wwVar2);
        }
    }

    /* renamed from: a */
    static ww m6204a(ww wwVar, String str, boolean z) {
        if (!(wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE) || wwVar.m6194d().m6239b(256))) {
            if (!wwVar.f9486g) {
                throw new wb("Named children only allowed for schemas and structs", 102);
            } else if (wwVar.m6194d().m6239b(512)) {
                throw new wb("Named children not allowed for arrays", 102);
            } else if (z) {
                wwVar.m6194d().m14520d(true);
            }
        }
        ww a = wwVar.m6184a(str);
        if (a != null || !z) {
            return a;
        }
        a = new ww(str, new xj());
        a.f9486g = true;
        wwVar.m6187a(a);
        return a;
    }

    /* renamed from: b */
    private static int m6209b(ww wwVar, String str, boolean z) {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt <= 0) {
                throw new wb("Array index must be larger than zero", 102);
            }
            if (z && parseInt == wwVar.m6192c() + 1) {
                ww wwVar2 = new ww("[]", null);
                wwVar2.f9486g = true;
                wwVar.m6187a(wwVar2);
            }
            return parseInt;
        } catch (NumberFormatException e) {
            throw new wb("Array index not digits.", 102);
        }
    }

    /* renamed from: a */
    public static ww m6205a(ww wwVar, xd xdVar, boolean z, xj xjVar) {
        if (xdVar == null || xdVar.m6232a() == 0) {
            throw new wb("Empty XMPPath", 102);
        }
        ww a = wy.m6203a(wwVar, xdVar.m6233a(0).f9506a, null, z);
        if (a == null) {
            return null;
        }
        ww wwVar2;
        if (a.f9486g) {
            a.f9486g = false;
            wwVar2 = a;
        } else {
            wwVar2 = null;
        }
        int i = 1;
        ww wwVar3 = a;
        ww wwVar4 = wwVar2;
        while (i < xdVar.m6232a()) {
            xe a2 = xdVar.m6233a(i);
            int i2 = a2.f9507b;
            if (i2 == 1) {
                a = wy.m6204a(wwVar3, a2.f9506a, z);
            } else if (i2 == 2) {
                String substring = a2.f9506a.substring(1);
                a = wwVar3.m6190b(substring);
                if (a == null && z) {
                    a = new ww(substring, null);
                    a.f9486g = true;
                    wwVar3.m6191b(a);
                }
            } else if (wwVar3.m6194d().m6239b(512)) {
                int b;
                if (i2 == 3) {
                    b = wy.m6209b(wwVar3, a2.f9506a, z);
                } else if (i2 == 4) {
                    try {
                        b = wwVar3.m6192c();
                    } catch (wb e) {
                        if (wwVar4 != null) {
                            wy.m6207a(wwVar4);
                        }
                        throw e;
                    }
                } else if (i2 == 6) {
                    String[] f = wp.m6167f(a2.f9506a);
                    r6 = f[0];
                    String str = f[1];
                    b = -1;
                    i2 = 1;
                    while (i2 <= wwVar3.m6192c() && r0 < 0) {
                        ww a3 = wwVar3.m6183a(i2);
                        if (a3.m6194d().m6239b(256)) {
                            for (int i3 = 1; i3 <= a3.m6192c(); i3++) {
                                ww a4 = a3.m6183a(i3);
                                if (r6.equals(a4.f9480a) && str.equals(a4.f9481b)) {
                                    b = i2;
                                    break;
                                }
                            }
                            i2++;
                        } else {
                            throw new wb("Field selector must be used on array of struct", 102);
                        }
                    }
                } else if (i2 != 5) {
                    throw new wb("Unknown array indexing step in FollowXPathStep", 9);
                } else {
                    String[] f2 = wp.m6167f(a2.f9506a);
                    String str2 = f2[0];
                    r6 = f2[1];
                    i2 = a2.f9509d;
                    if ("xml:lang".equals(str2)) {
                        b = wy.m6202a(wwVar3, wp.m6165d(r6));
                        if (b < 0 && (i2 & 4096) > 0) {
                            wwVar2 = new ww("[]", null);
                            wwVar2.m6191b(new ww("xml:lang", "x-default", null));
                            wwVar3.m6186a(1, wwVar2);
                            b = 1;
                        }
                    } else {
                        for (i2 = 1; i2 < wwVar3.m6192c(); i2++) {
                            Iterator i4 = wwVar3.m6183a(i2).m6200i();
                            while (i4.hasNext()) {
                                wwVar2 = (ww) i4.next();
                                if (str2.equals(wwVar2.f9480a) && r6.equals(wwVar2.f9481b)) {
                                    b = i2;
                                    break;
                                }
                            }
                        }
                        b = -1;
                    }
                }
                a = b > 0 ? b <= wwVar3.m6192c() ? wwVar3.m6183a(b) : null : null;
            } else {
                throw new wb("Indexing applied to non-array", 102);
            }
            if (a == null) {
                if (z) {
                    wy.m6207a(wwVar4);
                }
                return null;
            }
            if (a.f9486g) {
                a.f9486g = false;
                if (i == 1 && xdVar.m6233a(i).f9508c && xdVar.m6233a(i).f9509d != 0) {
                    a.m6194d().m6238a(xdVar.m6233a(i).f9509d, true);
                } else if (i < xdVar.m6232a() - 1 && xdVar.m6233a(i).f9507b == 1 && !a.m6194d().m14516b()) {
                    a.m6194d().m14520d(true);
                }
                if (wwVar4 == null) {
                    wwVar2 = a;
                } else {
                    wwVar2 = wwVar4;
                }
            } else {
                wwVar2 = wwVar4;
            }
            i++;
            wwVar3 = a;
            wwVar4 = wwVar2;
        }
        if (wwVar4 != null) {
            wwVar3.m6194d().m14514a(xjVar);
            wwVar3.f9485f = wwVar3.m6194d();
        }
        return wwVar3;
    }

    /* renamed from: a */
    public static ww m6203a(ww wwVar, String str, String str2, boolean z) {
        ww a = wwVar.m6184a(str);
        if (a != null || !z) {
            return a;
        }
        xj xjVar = new xj();
        xjVar.m6238a(kvl.UNSET_ENUM_VALUE, true);
        ww wwVar2 = new ww(str, xjVar);
        wwVar2.f9486g = true;
        String b = we.f9447a.m6126b(str);
        if (b == null) {
            if (str2 == null || str2.length() == 0) {
                throw new wb("Unregistered schema namespace URI", 101);
            }
            b = we.f9447a.m6124a(str, str2);
        }
        wwVar2.f9481b = b;
        wwVar.m6187a(wwVar2);
        return wwVar2;
    }

    /* renamed from: a */
    static int m6202a(ww wwVar, String str) {
        if (wwVar.m6194d().m6239b(512)) {
            for (int i = 1; i <= wwVar.m6192c(); i++) {
                ww a = wwVar.m6183a(i);
                if (a.m6198g() && "xml:lang".equals(a.m6189b(1).f9480a) && str.equals(a.m6189b(1).f9481b)) {
                    return i;
                }
            }
            return -1;
        }
        throw new wb("Language item must be used on array", 102);
    }

    /* renamed from: b */
    static void m6210b(ww wwVar) {
        if (wwVar.m6194d().m6239b(4096)) {
            for (int i = 2; i <= wwVar.m6192c(); i++) {
                ww a = wwVar.m6183a(i);
                if (a.m6198g() && "x-default".equals(a.m6189b(1).f9481b)) {
                    try {
                        wwVar.m6188b().remove(i - 1);
                        wwVar.m6185a();
                        wwVar.m6186a(1, a);
                    } catch (wb e) {
                    }
                    if (i == 2) {
                        wwVar.m6183a(2).f9481b = a.f9481b;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m6212a(ux uxVar, ue ueVar, ue ueVar2) {
        RecyclerView recyclerView = this.f9491a;
        uxVar.m6019a(false);
        if (recyclerView.f696x.mo2489a(uxVar, ueVar, ueVar2)) {
            recyclerView.m477n();
        }
    }

    /* renamed from: b */
    public final void m6213b(ux uxVar, ue ueVar, ue ueVar2) {
        this.f9491a.f676d.m6005b(uxVar);
        RecyclerView recyclerView = this.f9491a;
        recyclerView.m452a(uxVar);
        uxVar.m6019a(false);
        if (recyclerView.f696x.mo2491b(uxVar, ueVar, ueVar2)) {
            recyclerView.m477n();
        }
    }

    /* renamed from: a */
    public final void m6211a(ux uxVar) {
        RecyclerView recyclerView = this.f9491a;
        ug ugVar = recyclerView.f683k;
        View view = uxVar.f9369a;
        up upVar = recyclerView.f676d;
        rp rpVar = ugVar.f9308f;
        int a = rpVar.f9139a.m5777a(view);
        if (a >= 0) {
            if (rpVar.f9140b.m5775d(a)) {
                rpVar.m5769d(view);
            }
            rpVar.f9139a.m5779b(a);
        }
        upVar.m6004b(view);
    }

    /* renamed from: a */
    public static xj m6206a(xj xjVar, Object obj) {
        if (xjVar == null) {
            xjVar = new xj();
        }
        if (xjVar.m6239b(4096)) {
            xjVar.m14521e();
        }
        if (xjVar.m6239b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
            xjVar.m14522f();
        }
        if (xjVar.m6239b(1024)) {
            xjVar.m14517c();
        }
        if (!xjVar.m14516b() || obj == null || obj.toString().length() <= 0) {
            xjVar.mo2541a(xjVar.f9510a);
            return xjVar;
        }
        throw new wb("Structs and arrays can't have values", 103);
    }
}
