package p000;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: ta */
public class ta extends ug {
    /* renamed from: a */
    private td f19598a;
    /* renamed from: b */
    public int f19599b = 1;
    /* renamed from: c */
    public tt f19600c;
    /* renamed from: d */
    public boolean f19601d = false;
    /* renamed from: e */
    public te f19602e = null;
    /* renamed from: r */
    private boolean f19603r = false;
    /* renamed from: s */
    private boolean f19604s = true;
    /* renamed from: t */
    private int f19605t = -1;
    /* renamed from: u */
    private int f19606u = kvl.UNSET_ENUM_VALUE;
    /* renamed from: v */
    private final tb f19607v = new tb();
    /* renamed from: w */
    private final tc f19608w = new tc();
    /* renamed from: x */
    private int f19609x = 2;

    public ta() {
        mo2466a(null);
        if (this.f19599b != 1 || this.f19600c == null) {
            this.f19600c = new tt(this, '\u0000');
            this.f19607v.f9254a = this.f19600c;
            this.f19599b = 1;
            m5985y();
        }
        mo2466a(null);
    }

    /* renamed from: a */
    public final void mo2466a(String str) {
        if (this.f19602e == null) {
            super.mo2466a(str);
        }
    }

    /* renamed from: h */
    public final boolean mo821h() {
        return this.f19599b == 0;
    }

    /* renamed from: i */
    public final boolean mo822i() {
        return this.f19599b == 1;
    }

    /* renamed from: a */
    public final void mo2463a(int i, int i2, uv uvVar, uj ujVar) {
        if (this.f19599b == 0) {
            i2 = i;
        }
        if (m5975o() != 0 && i2 != 0) {
            int i3;
            m14404j();
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m14360a(i3, Math.abs(i2), true, uvVar);
            mo3346a(uvVar, this.f19598a, ujVar);
        }
    }

    /* renamed from: a */
    public final void mo2464a(int i, uj ujVar) {
        boolean z;
        int i2;
        int i3;
        te teVar = this.f19602e;
        if (teVar == null || !teVar.m5836a()) {
            m14355E();
            z = this.f19601d;
            i2 = this.f19605t;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            teVar = this.f19602e;
            z = teVar.f9276c;
            i2 = teVar.f9274a;
        }
        if (z) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = i2;
        for (i2 = 0; i2 < this.f19609x && i4 >= 0 && i4 < i; i2++) {
            ujVar.m5987a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    void mo3346a(uv uvVar, td tdVar, uj ujVar) {
        int i = tdVar.f9266d;
        if (i >= 0 && i < uvVar.m6009a()) {
            ujVar.m5987a(i, Math.max(0, tdVar.f9269g));
        }
    }

    /* renamed from: b */
    public final int mo810b(uv uvVar) {
        return m14373h(uvVar);
    }

    /* renamed from: c */
    public final int mo812c(uv uvVar) {
        return m14374i(uvVar);
    }

    /* renamed from: d */
    public final int mo814d(uv uvVar) {
        return m14375j(uvVar);
    }

    /* renamed from: h */
    private final int m14373h(uv uvVar) {
        if (m5975o() == 0) {
            return 0;
        }
        m14404j();
        tt ttVar = this.f19600c;
        View b = m14365b(this.f19604s ^ 1);
        View a = m14359a(this.f19604s ^ 1);
        boolean z = this.f19604s;
        if (m5975o() == 0 || uvVar.m6009a() == 0 || b == null || a == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(ug.m5921c(b) - ug.m5921c(a)) + 1;
        }
        return Math.min(ttVar.m5864g(), ttVar.m5852a(a) - ttVar.m5859d(b));
    }

    /* renamed from: i */
    private final int m14374i(uv uvVar) {
        if (m5975o() == 0) {
            return 0;
        }
        m14404j();
        tt ttVar = this.f19600c;
        View b = m14365b(this.f19604s ^ 1);
        View a = m14359a(this.f19604s ^ 1);
        boolean z = this.f19604s;
        boolean z2 = this.f19601d;
        if (m5975o() == 0 || uvVar.m6009a() == 0 || b == null || a == null) {
            return 0;
        }
        int max;
        int min = Math.min(ug.m5921c(b), ug.m5921c(a));
        int max2 = Math.max(ug.m5921c(b), ug.m5921c(a));
        if (z2) {
            max = Math.max(0, (uvVar.m6009a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return z ? Math.round((((float) max) * (((float) Math.abs(ttVar.m5852a(a) - ttVar.m5859d(b))) / ((float) (Math.abs(ug.m5921c(b) - ug.m5921c(a)) + 1)))) + ((float) (ttVar.m5862f() - ttVar.m5859d(b)))) : max;
    }

    /* renamed from: j */
    private final int m14375j(uv uvVar) {
        if (m5975o() == 0) {
            return 0;
        }
        m14404j();
        tt ttVar = this.f19600c;
        View b = m14365b(this.f19604s ^ 1);
        View a = m14359a(this.f19604s ^ 1);
        boolean z = this.f19604s;
        if (m5975o() == 0 || uvVar.m6009a() == 0 || b == null || a == null) {
            return 0;
        }
        if (z) {
            return (int) ((((float) (ttVar.m5852a(a) - ttVar.m5859d(b))) / ((float) (Math.abs(ug.m5921c(b) - ug.m5921c(a)) + 1))) * ((float) uvVar.m6009a()));
        }
        return uvVar.m6009a();
    }

    /* renamed from: e */
    public final int mo816e(uv uvVar) {
        return m14373h(uvVar);
    }

    /* renamed from: f */
    public final int mo818f(uv uvVar) {
        return m14374i(uvVar);
    }

    /* renamed from: g */
    public final int mo820g(uv uvVar) {
        return m14375j(uvVar);
    }

    /* renamed from: b */
    final int m14391b(int i) {
        switch (i) {
            case 1:
                if (this.f19599b == 1 || !m14406l()) {
                    return -1;
                }
                return 1;
            case 2:
                if (this.f19599b == 1) {
                    return 1;
                }
                if (m14406l()) {
                    return -1;
                }
                return 1;
            case 17:
                return this.f19599b != 0 ? kvl.UNSET_ENUM_VALUE : -1;
            case 33:
                return this.f19599b != 1 ? kvl.UNSET_ENUM_VALUE : -1;
            case 66:
                return this.f19599b == 0 ? 1 : kvl.UNSET_ENUM_VALUE;
            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                return this.f19599b == 1 ? 1 : kvl.UNSET_ENUM_VALUE;
            default:
                return kvl.UNSET_ENUM_VALUE;
        }
    }

    /* renamed from: j */
    final void m14404j() {
        if (this.f19598a == null) {
            this.f19598a = new td();
        }
    }

    /* renamed from: a */
    private final int m14357a(up upVar, td tdVar, uv uvVar, boolean z) {
        int i = tdVar.f9265c;
        int i2 = tdVar.f9269g;
        if (i2 != kvl.UNSET_ENUM_VALUE) {
            if (i < 0) {
                tdVar.f9269g = i2 + i;
            }
            m14363a(upVar, tdVar);
        }
        i2 = tdVar.f9265c + tdVar.f9270h;
        tc tcVar = this.f19608w;
        while (true) {
            if (!tdVar.f9273k) {
                if (i2 <= 0) {
                    break;
                }
            }
            if (!tdVar.m5835a(uvVar)) {
                break;
            }
            tcVar.f9259a = 0;
            tcVar.f9260b = false;
            tcVar.f9261c = false;
            tcVar.f9262d = false;
            mo3345a(upVar, uvVar, tdVar, tcVar);
            if (!tcVar.f9260b) {
                int i3 = tdVar.f9264b;
                int i4 = tcVar.f9259a;
                tdVar.f9264b = i3 + (tdVar.f9268f * i4);
                if (!tcVar.f9261c || this.f19598a.f9272j != null || !uvVar.f9353g) {
                    tdVar.f9265c -= i4;
                    i2 -= i4;
                }
                i3 = tdVar.f9269g;
                if (i3 != kvl.UNSET_ENUM_VALUE) {
                    tdVar.f9269g = i3 + i4;
                    i3 = tdVar.f9265c;
                    if (i3 < 0) {
                        tdVar.f9269g = i3 + tdVar.f9269g;
                    }
                    m14363a(upVar, tdVar);
                }
                if (z && tcVar.f9262d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - tdVar.f9265c;
    }

    /* renamed from: z */
    private final View m14377z() {
        return m14369e(0, m5975o());
    }

    /* renamed from: d */
    private final View m14368d(up upVar, uv uvVar) {
        return mo3340a(upVar, uvVar, 0, m5975o(), uvVar.m6009a());
    }

    /* renamed from: a */
    private final View m14359a(boolean z) {
        if (this.f19601d) {
            return m14358a(0, m5975o(), z);
        }
        return m14358a(m5975o() - 1, -1, z);
    }

    /* renamed from: b */
    private final View m14365b(boolean z) {
        if (this.f19601d) {
            return m14358a(m5975o() - 1, -1, z);
        }
        return m14358a(0, m5975o(), z);
    }

    /* renamed from: A */
    private final View m14351A() {
        return m14369e(m5975o() - 1, -1);
    }

    /* renamed from: e */
    private final View m14370e(up upVar, uv uvVar) {
        return mo3340a(upVar, uvVar, m5975o() - 1, -1, uvVar.m6009a());
    }

    /* renamed from: e */
    private final View m14369e(int i, int i2) {
        m14404j();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return m5963e(i);
        }
        int i3;
        int d = this.f19600c.m5859d(m5963e(i));
        int f = this.f19600c.m5862f();
        int i4 = d < f ? 16388 : FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (d < f) {
            i3 = 16644;
        } else {
            i3 = 4161;
        }
        if (this.f19599b == 0) {
            return this.h.m6062a(i, i2, i3, i4);
        }
        return this.i.m6062a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private final View m14358a(int i, int i2, boolean z) {
        m14404j();
        int i3 = !z ? DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX : 24579;
        if (this.f19599b == 0) {
            return this.h.m6062a(i, i2, i3, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
        }
        return this.i.m6062a(i, i2, i3, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
    }

    /* renamed from: a */
    View mo3340a(up upVar, uv uvVar, int i, int i2, int i3) {
        int i4;
        View view = null;
        m14404j();
        int f = this.f19600c.m5862f();
        int b = this.f19600c.m5854b();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view2 = null;
        while (i != i2) {
            View view3;
            View e = m5963e(i);
            int c = ug.m5921c(e);
            if (c < 0) {
                view3 = view;
                e = view2;
            } else if (c >= i3) {
                view3 = view;
                e = view2;
            } else if (((uk) e.getLayoutParams()).f9324c.m6029j()) {
                if (view2 == null) {
                    view3 = view;
                } else {
                    view3 = view;
                    e = view2;
                }
            } else if (this.f19600c.m5859d(e) < b && this.f19600c.m5852a(e) >= f) {
                return e;
            } else {
                if (view != null) {
                    view3 = view;
                    e = view2;
                } else {
                    view3 = e;
                    e = view2;
                }
            }
            i += i4;
            view = view3;
            view2 = e;
        }
        return view != null ? view : view2;
    }

    /* renamed from: c */
    public final View mo2467c(int i) {
        int o = m5975o();
        if (o == 0) {
            return null;
        }
        int c = i - ug.m5921c(m5963e(0));
        if (c >= 0 && c < o) {
            View e = m5963e(c);
            if (ug.m5921c(e) == i) {
                return e;
            }
        }
        return super.mo2467c(i);
    }

    /* renamed from: a */
    private final int m14356a(int i, up upVar, uv uvVar, boolean z) {
        int b = this.f19600c.m5854b() - i;
        if (b <= 0) {
            return 0;
        }
        b = -m14367c(-b, upVar, uvVar);
        int i2 = i + b;
        if (!z) {
            return b;
        }
        i2 = this.f19600c.m5854b() - i2;
        if (i2 <= 0) {
            return b;
        }
        this.f19600c.m5853a(i2);
        return b + i2;
    }

    /* renamed from: b */
    private final int m14364b(int i, up upVar, uv uvVar, boolean z) {
        int f = i - this.f19600c.m5862f();
        if (f <= 0) {
            return 0;
        }
        f = -m14367c(f, upVar, uvVar);
        int i2 = i + f;
        if (!z) {
            return f;
        }
        i2 -= this.f19600c.m5862f();
        if (i2 <= 0) {
            return f;
        }
        this.f19600c.m5853a(-i2);
        return f - i2;
    }

    /* renamed from: a */
    public uk mo804a() {
        return new uk(-2, -2);
    }

    /* renamed from: B */
    private final View m14352B() {
        return m5963e(!this.f19601d ? m5975o() - 1 : 0);
    }

    /* renamed from: C */
    private final View m14353C() {
        return m5963e(this.f19601d ? m5975o() - 1 : 0);
    }

    /* renamed from: k */
    private final int m14376k(uv uvVar) {
        if (uvVar.f9347a == -1) {
            return 0;
        }
        return this.f19600c.m5864g();
    }

    /* renamed from: k */
    public final boolean mo2469k() {
        return true;
    }

    /* renamed from: l */
    protected final boolean m14406l() {
        if (jm.m4576j(this.f9309g) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    void mo3345a(up upVar, uv uvVar, td tdVar, tc tcVar) {
        View a = tdVar.m5833a(upVar);
        if (a == null) {
            tcVar.f9260b = true;
            return;
        }
        int s;
        uk ukVar = (uk) a.getLayoutParams();
        boolean z;
        boolean z2;
        if (tdVar.f9272j == null) {
            z = this.f19601d;
            if (tdVar.f9268f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                super.m5935a(a, -1, false);
            } else {
                super.m5935a(a, 0, false);
            }
        } else {
            z = this.f19601d;
            if (tdVar.f9268f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                super.m5935a(a, -1, true);
            } else {
                super.m5935a(a, 0, true);
            }
        }
        uk ukVar2 = (uk) a.getLayoutParams();
        Rect d = this.f9309g.m467d(a);
        int i = d.left;
        int i2 = d.right;
        int i3 = d.top;
        int i4 = d.bottom;
        i = ug.m5916a(this.f9318p, this.f9316n, (i + i2) + (((m5978r() + m5979s()) + ukVar2.leftMargin) + ukVar2.rightMargin), ukVar2.width, mo821h());
        i4 = ug.m5916a(this.f9319q, this.f9317o, (i4 + i3) + (((m5980t() + m5977q()) + ukVar2.topMargin) + ukVar2.bottomMargin), ukVar2.height, mo822i());
        if (m5944a(a, i, i4, ukVar2)) {
            a.measure(i, i4);
        }
        tcVar.f9259a = this.f19600c.m5855b(a);
        if (this.f19599b == 1) {
            if (m14406l()) {
                s = this.f9318p - m5979s();
                i4 = s - this.f19600c.m5857c(a);
            } else {
                i4 = m5978r();
                s = this.f19600c.m5857c(a) + i4;
            }
            if (tdVar.f9268f == -1) {
                i = tdVar.f9264b;
                i2 = i - tcVar.f9259a;
            } else {
                i2 = tdVar.f9264b;
                i = tcVar.f9259a + i2;
            }
        } else {
            i2 = m5980t();
            i = i2 + this.f19600c.m5857c(a);
            if (tdVar.f9268f == -1) {
                s = tdVar.f9264b;
                i4 = s - tcVar.f9259a;
            } else {
                i4 = tdVar.f9264b;
                s = tcVar.f9259a + i4;
            }
        }
        ug.m5918a(a, i4, i2, s, i);
        if (!ukVar.f9324c.m6029j()) {
            if (ukVar.f9324c.m6032m()) {
            }
            tcVar.f9262d = a.hasFocusable();
        }
        tcVar.f9261c = true;
        tcVar.f9262d = a.hasFocusable();
    }

    /* renamed from: a */
    void mo3344a(up upVar, uv uvVar, tb tbVar, int i) {
    }

    /* renamed from: a */
    public View mo2462a(View view, int i, up upVar, uv uvVar) {
        m14355E();
        if (m5975o() == 0) {
            return null;
        }
        int b = m14391b(i);
        if (b == kvl.UNSET_ENUM_VALUE) {
            return null;
        }
        View A;
        View C;
        m14404j();
        m14404j();
        m14360a(b, (int) (((float) this.f19600c.m5864g()) * 0.33333334f), false, uvVar);
        td tdVar = this.f19598a;
        tdVar.f9269g = kvl.UNSET_ENUM_VALUE;
        tdVar.f9263a = false;
        m14357a(upVar, tdVar, uvVar, true);
        if (b == -1) {
            if (this.f19601d) {
                A = m14351A();
            } else {
                A = m14377z();
            }
        } else if (this.f19601d) {
            A = m14377z();
        } else {
            A = m14351A();
        }
        if (b == -1) {
            C = m14353C();
        } else {
            C = m14352B();
        }
        if (!C.hasFocusable()) {
            return A;
        }
        if (A == null) {
            return null;
        }
        return C;
    }

    /* renamed from: a */
    public final void mo2465a(AccessibilityEvent accessibilityEvent) {
        int i = -1;
        super.mo2465a(accessibilityEvent);
        if (m5975o() > 0) {
            int c;
            View a = m14358a(0, m5975o(), false);
            if (a != null) {
                c = ug.m5921c(a);
            } else {
                c = -1;
            }
            accessibilityEvent.setFromIndex(c);
            a = m14358a(m5975o() - 1, -1, false);
            if (a != null) {
                i = ug.m5921c(a);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    /* renamed from: c */
    public void mo813c(up upVar, uv uvVar) {
        if (!(this.f19602e == null && this.f19605t == -1) && uvVar.m6009a() == 0) {
            m5940a(upVar);
            return;
        }
        int i;
        View p;
        int i2;
        te teVar = this.f19602e;
        if (teVar != null && teVar.m5836a()) {
            this.f19605t = this.f19602e.f9274a;
        }
        m14404j();
        this.f19598a.f9263a = false;
        m14355E();
        View p2 = m5976p();
        tb tbVar = this.f19607v;
        if (!tbVar.f9258e || this.f19605t != -1 || this.f19602e != null) {
            Object obj;
            tbVar.m5831b();
            tbVar = this.f19607v;
            tbVar.f9257d = this.f19601d;
            if (uvVar.f9353g) {
                obj = null;
            } else {
                i = this.f19605t;
                if (i == -1) {
                    obj = null;
                } else if (i < 0 || i >= uvVar.m6009a()) {
                    this.f19605t = -1;
                    this.f19606u = kvl.UNSET_ENUM_VALUE;
                    obj = null;
                } else {
                    tbVar.f9255b = this.f19605t;
                    teVar = this.f19602e;
                    if (teVar != null && teVar.m5836a()) {
                        tbVar.f9257d = this.f19602e.f9276c;
                        if (tbVar.f9257d) {
                            tbVar.f9256c = this.f19600c.m5854b() - this.f19602e.f9275b;
                            obj = 1;
                        } else {
                            tbVar.f9256c = this.f19600c.m5862f() + this.f19602e.f9275b;
                            obj = 1;
                        }
                    } else if (this.f19606u == kvl.UNSET_ENUM_VALUE) {
                        p2 = mo2467c(this.f19605t);
                        if (p2 == null) {
                            if (m5975o() > 0) {
                                if (this.f19605t >= ug.m5921c(m5963e(0))) {
                                    r0 = false;
                                } else {
                                    r0 = true;
                                }
                                if (r0 == this.f19601d) {
                                    r0 = true;
                                } else {
                                    r0 = false;
                                }
                                tbVar.f9257d = r0;
                            }
                            tbVar.m5829a();
                            obj = 1;
                        } else if (this.f19600c.m5855b(p2) > this.f19600c.m5864g()) {
                            tbVar.m5829a();
                            obj = 1;
                        } else if (this.f19600c.m5859d(p2) - this.f19600c.m5862f() < 0) {
                            tbVar.f9256c = this.f19600c.m5862f();
                            tbVar.f9257d = false;
                            obj = 1;
                        } else if (this.f19600c.m5854b() - this.f19600c.m5852a(p2) < 0) {
                            tbVar.f9256c = this.f19600c.m5854b();
                            tbVar.f9257d = true;
                            obj = 1;
                        } else {
                            if (tbVar.f9257d) {
                                i = this.f19600c.m5852a(p2) + this.f19600c.m5865h();
                            } else {
                                i = this.f19600c.m5859d(p2);
                            }
                            tbVar.f9256c = i;
                            obj = 1;
                        }
                    } else {
                        r0 = this.f19601d;
                        tbVar.f9257d = r0;
                        if (r0) {
                            tbVar.f9256c = this.f19600c.m5854b() - this.f19606u;
                            obj = 1;
                        } else {
                            tbVar.f9256c = this.f19600c.m5862f() + this.f19606u;
                            obj = 1;
                        }
                    }
                }
            }
            if (obj == null) {
                if (m5975o() != 0) {
                    p = m5976p();
                    if (p != null) {
                        uk ukVar = (uk) p.getLayoutParams();
                        if (ukVar.f9324c.m6029j()) {
                            obj = null;
                        } else if (ukVar.f9324c.m6025f() < 0) {
                            obj = null;
                        } else if (ukVar.f9324c.m6025f() < uvVar.m6009a()) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (obj != null) {
                            tbVar.m5832b(p, ug.m5921c(p));
                            obj = 1;
                        }
                    }
                    if (tbVar.f9257d) {
                        if (this.f19601d) {
                            p2 = m14368d(upVar, uvVar);
                        } else {
                            p2 = m14370e(upVar, uvVar);
                        }
                    } else if (this.f19601d) {
                        p2 = m14370e(upVar, uvVar);
                    } else {
                        p2 = m14368d(upVar, uvVar);
                    }
                    if (p2 != null) {
                        tbVar.m5830a(p2, ug.m5921c(p2));
                        if (uvVar.f9353g) {
                            obj = 1;
                        } else if (mo2468g()) {
                            if (this.f19600c.m5859d(p2) >= this.f19600c.m5854b()) {
                                obj = 1;
                            } else if (this.f19600c.m5852a(p2) >= this.f19600c.m5862f()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            if (obj != null) {
                                if (tbVar.f9257d) {
                                    i = this.f19600c.m5854b();
                                } else {
                                    i = this.f19600c.m5862f();
                                }
                                tbVar.f9256c = i;
                                obj = 1;
                            } else {
                                obj = 1;
                            }
                        } else {
                            obj = 1;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj == null) {
                    tbVar.m5829a();
                    tbVar.f9255b = 0;
                }
            }
            this.f19607v.f9258e = true;
        } else if (p2 != null && (this.f19600c.m5859d(p2) >= this.f19600c.m5854b() || this.f19600c.m5852a(p2) <= this.f19600c.m5862f())) {
            this.f19607v.m5832b(p2, ug.m5921c(p2));
        }
        i = m14376k(uvVar);
        int i3 = this.f19598a.f9271i;
        if (i3 >= 0) {
            i2 = i;
        } else {
            i2 = 0;
        }
        if (i3 >= 0) {
            i = 0;
        }
        int f = this.f19600c.m5862f() + i;
        i = this.f19600c.m5856c() + i2;
        if (uvVar.f9353g) {
            i2 = this.f19605t;
            if (!(i2 == -1 || this.f19606u == kvl.UNSET_ENUM_VALUE)) {
                p = mo2467c(i2);
                if (p != null) {
                    if (this.f19601d) {
                        i2 = (this.f19600c.m5854b() - this.f19600c.m5852a(p)) - this.f19606u;
                    } else {
                        i2 = this.f19606u - (this.f19600c.m5859d(p) - this.f19600c.m5862f());
                    }
                    if (i2 <= 0) {
                        i -= i2;
                    } else {
                        f += i2;
                    }
                }
            }
        }
        tb tbVar2 = this.f19607v;
        if (tbVar2.f9257d) {
            if (this.f19601d) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (this.f19601d) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        mo3344a(upVar, uvVar, tbVar2, i2);
        for (i2 = m5975o() - 1; i2 >= 0; i2--) {
            View e = m5963e(i2);
            ux c = RecyclerView.m428c(e);
            if (!c.m6035p()) {
                if (!c.m6027h() || c.m6029j() || this.f9309g.f682j.f9296b) {
                    m5960d(i2);
                    upVar.m6007c(e);
                    this.f9309g.f679g.m6151c(c);
                } else {
                    m5967f(i2);
                    upVar.m6000a(c);
                }
            }
        }
        this.f19598a.f9273k = m14354D();
        tb tbVar3 = this.f19607v;
        td tdVar;
        if (tbVar3.f9257d) {
            m14366b(tbVar3);
            tdVar = this.f19598a;
            tdVar.f9270h = f;
            m14357a(upVar, tdVar, uvVar, false);
            tdVar = this.f19598a;
            f = tdVar.f9264b;
            i3 = tdVar.f9266d;
            i2 = tdVar.f9265c;
            if (i2 > 0) {
                i += i2;
            }
            m14361a(this.f19607v);
            tdVar = this.f19598a;
            tdVar.f9270h = i;
            tdVar.f9266d += tdVar.f9267e;
            m14357a(upVar, tdVar, uvVar, false);
            tdVar = this.f19598a;
            i = tdVar.f9264b;
            i2 = tdVar.f9265c;
            if (i2 > 0) {
                m14372g(i3, f);
                td tdVar2 = this.f19598a;
                tdVar2.f9270h = i2;
                m14357a(upVar, tdVar2, uvVar, false);
                f = this.f19598a.f9264b;
            }
        } else {
            m14361a(tbVar3);
            tdVar = this.f19598a;
            tdVar.f9270h = i;
            m14357a(upVar, tdVar, uvVar, false);
            tdVar = this.f19598a;
            i = tdVar.f9264b;
            i3 = tdVar.f9266d;
            i2 = tdVar.f9265c;
            if (i2 > 0) {
                f += i2;
            }
            m14366b(this.f19607v);
            tdVar = this.f19598a;
            tdVar.f9270h = f;
            tdVar.f9266d += tdVar.f9267e;
            m14357a(upVar, tdVar, uvVar, false);
            tdVar = this.f19598a;
            f = tdVar.f9264b;
            i2 = tdVar.f9265c;
            if (i2 > 0) {
                m14371f(i3, i);
                td tdVar3 = this.f19598a;
                tdVar3.f9270h = i2;
                m14357a(upVar, tdVar3, uvVar, false);
                i = this.f19598a.f9264b;
            }
        }
        if (m5975o() <= 0) {
            i2 = f;
            f = i;
        } else if (this.f19601d) {
            i2 = m14356a(i, upVar, uvVar, true);
            f += i2;
            i3 = m14364b(f, upVar, uvVar, false);
            i2 = f + i3;
            f = (i + i2) + i3;
        } else {
            i2 = m14364b(f, upVar, uvVar, true);
            i += i2;
            i3 = m14356a(i, upVar, uvVar, false);
            i2 = (f + i2) + i3;
            f = i + i3;
        }
        if (uvVar.f9357k && m5975o() != 0 && !uvVar.f9353g && mo2468g()) {
            List list = upVar.f9337d;
            int size = list.size();
            int c2 = ug.m5921c(m5963e(0));
            int i4 = 0;
            i3 = 0;
            int i5 = 0;
            while (i5 < size) {
                ux uxVar = (ux) list.get(i5);
                if (uxVar.m6029j()) {
                    i = i3;
                    i3 = i4;
                } else {
                    boolean z;
                    int i6;
                    if (uxVar.m6025f() >= c2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z != this.f19601d) {
                        i6 = -1;
                    } else {
                        i6 = 1;
                    }
                    if (i6 == -1) {
                        int i7 = i3;
                        i3 = this.f19600c.m5855b(uxVar.f9369a) + i4;
                        i = i7;
                    } else {
                        i = this.f19600c.m5855b(uxVar.f9369a) + i3;
                        i3 = i4;
                    }
                }
                i5++;
                i4 = i3;
                i3 = i;
            }
            this.f19598a.f9272j = list;
            if (i4 > 0) {
                m14372g(ug.m5921c(m14353C()), i2);
                tdVar3 = this.f19598a;
                tdVar3.f9270h = i4;
                tdVar3.f9265c = 0;
                tdVar3.m5834a(null);
                m14357a(upVar, this.f19598a, uvVar, false);
            }
            if (i3 > 0) {
                m14371f(ug.m5921c(m14352B()), f);
                tdVar3 = this.f19598a;
                tdVar3.f9270h = i3;
                tdVar3.f9265c = 0;
                tdVar3.m5834a(null);
                m14357a(upVar, this.f19598a, uvVar, false);
            }
            this.f19598a.f9272j = null;
        }
        if (uvVar.f9353g) {
            this.f19607v.m5831b();
            return;
        }
        tt ttVar = this.f19600c;
        ttVar.f9291b = ttVar.m5864g();
    }

    /* renamed from: a */
    public void mo807a(uv uvVar) {
        super.mo807a(uvVar);
        this.f19602e = null;
        this.f19605t = -1;
        this.f19606u = kvl.UNSET_ENUM_VALUE;
        this.f19607v.m5831b();
    }

    /* renamed from: a */
    public final void mo806a(Parcelable parcelable) {
        if (parcelable instanceof te) {
            this.f19602e = (te) parcelable;
            m5985y();
        }
    }

    /* renamed from: m */
    public final Parcelable mo823m() {
        te teVar = this.f19602e;
        if (teVar != null) {
            return new te(teVar);
        }
        Parcelable teVar2 = new te();
        if (m5975o() > 0) {
            m14404j();
            boolean z = this.f19601d;
            teVar2.f9276c = z;
            View B;
            if (z) {
                B = m14352B();
                teVar2.f9275b = this.f19600c.m5854b() - this.f19600c.m5852a(B);
                teVar2.f9274a = ug.m5921c(B);
                return teVar2;
            }
            B = m14353C();
            teVar2.f9274a = ug.m5921c(B);
            teVar2.f9275b = this.f19600c.m5859d(B) - this.f19600c.m5862f();
            return teVar2;
        }
        teVar2.f9274a = -1;
        return teVar2;
    }

    /* renamed from: a */
    private final void m14363a(up upVar, td tdVar) {
        if (tdVar.f9263a && !tdVar.f9273k) {
            int i;
            int o;
            int a;
            View e;
            int i2;
            if (tdVar.f9268f == -1) {
                i = tdVar.f9269g;
                o = m5975o();
                if (i >= 0) {
                    a = this.f19600c.m5851a() - i;
                    if (this.f19601d) {
                        for (i = 0; i < o; i++) {
                            e = m5963e(i);
                            if (this.f19600c.m5859d(e) < a || this.f19600c.m5863f(e) < a) {
                                m14362a(upVar, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    i2 = o - 1;
                    for (i = i2; i >= 0; i--) {
                        View e2 = m5963e(i);
                        if (this.f19600c.m5859d(e2) < a || this.f19600c.m5863f(e2) < a) {
                            m14362a(upVar, i2, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            o = tdVar.f9269g;
            if (o >= 0) {
                a = m5975o();
                if (this.f19601d) {
                    i2 = a - 1;
                    for (i = i2; i >= 0; i--) {
                        View e3 = m5963e(i);
                        if (this.f19600c.m5852a(e3) > o || this.f19600c.m5861e(e3) > o) {
                            m14362a(upVar, i2, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < a; i++) {
                    e = m5963e(i);
                    if (this.f19600c.m5852a(e) > o || this.f19600c.m5861e(e) > o) {
                        m14362a(upVar, 0, i);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m14362a(up upVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m5931a(i3, upVar);
                }
                return;
            }
            while (i > i2) {
                m5931a(i, upVar);
                i--;
            }
        }
    }

    /* renamed from: D */
    private final boolean m14354D() {
        return this.f19600c.m5858d() == 0 && this.f19600c.m5851a() == 0;
    }

    /* renamed from: E */
    private final void m14355E() {
        if (this.f19599b == 1 || !m14406l()) {
            this.f19601d = false;
        } else {
            this.f19601d = true;
        }
    }

    /* renamed from: c */
    private final int m14367c(int i, up upVar, uv uvVar) {
        if (m5975o() == 0 || i == 0) {
            return 0;
        }
        int i2;
        this.f19598a.f9263a = true;
        m14404j();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m14360a(i2, abs, true, uvVar);
        td tdVar = this.f19598a;
        int a = m14357a(upVar, tdVar, uvVar, false) + tdVar.f9269g;
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f19600c.m5853a(-i);
        this.f19598a.f9271i = i;
        return i;
    }

    /* renamed from: a */
    public int mo803a(int i, up upVar, uv uvVar) {
        if (this.f19599b == 1) {
            return 0;
        }
        return m14367c(i, upVar, uvVar);
    }

    /* renamed from: b */
    public int mo809b(int i, up upVar, uv uvVar) {
        if (this.f19599b == 0) {
            return 0;
        }
        return m14367c(i, upVar, uvVar);
    }

    /* renamed from: n */
    final boolean mo2470n() {
        if (!(this.f9317o == 1073741824 || this.f9316n == 1073741824)) {
            boolean z;
            int o = m5975o();
            for (int i = 0; i < o; i++) {
                LayoutParams layoutParams = m5963e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo2468g() {
        return this.f19602e == null;
    }

    /* renamed from: a */
    private final void m14360a(int i, int i2, boolean z, uv uvVar) {
        td tdVar;
        int i3 = -1;
        int i4 = 1;
        this.f19598a.f9273k = m14354D();
        this.f19598a.f9270h = m14376k(uvVar);
        td tdVar2 = this.f19598a;
        tdVar2.f9268f = i;
        View B;
        td tdVar3;
        if (i == 1) {
            tdVar2.f9270h += this.f19600c.m5856c();
            B = m14352B();
            tdVar3 = this.f19598a;
            if (this.f19601d) {
                i4 = -1;
            }
            tdVar3.f9267e = i4;
            i4 = ug.m5921c(B);
            tdVar = this.f19598a;
            tdVar3.f9266d = i4 + tdVar.f9267e;
            tdVar.f9264b = this.f19600c.m5852a(B);
            i4 = this.f19600c.m5852a(B) - this.f19600c.m5854b();
        } else {
            B = m14353C();
            tdVar3 = this.f19598a;
            tdVar3.f9270h += this.f19600c.m5862f();
            tdVar3 = this.f19598a;
            if (this.f19601d) {
                i3 = 1;
            }
            tdVar3.f9267e = i3;
            i4 = ug.m5921c(B);
            tdVar = this.f19598a;
            tdVar3.f9266d = i4 + tdVar.f9267e;
            tdVar.f9264b = this.f19600c.m5859d(B);
            i4 = (-this.f19600c.m5859d(B)) + this.f19600c.m5862f();
        }
        tdVar = this.f19598a;
        tdVar.f9265c = i2;
        if (z) {
            tdVar.f9265c -= i4;
        }
        tdVar.f9269g = i4;
    }

    /* renamed from: f */
    private final void m14371f(int i, int i2) {
        int i3;
        this.f19598a.f9265c = this.f19600c.m5854b() - i2;
        td tdVar = this.f19598a;
        if (this.f19601d) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        tdVar.f9267e = i3;
        tdVar.f9266d = i;
        tdVar.f9268f = 1;
        tdVar.f9264b = i2;
        tdVar.f9269g = kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: a */
    private final void m14361a(tb tbVar) {
        m14371f(tbVar.f9255b, tbVar.f9256c);
    }

    /* renamed from: g */
    private final void m14372g(int i, int i2) {
        int i3;
        this.f19598a.f9265c = i2 - this.f19600c.m5862f();
        td tdVar = this.f19598a;
        tdVar.f9266d = i;
        if (this.f19601d) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        tdVar.f9267e = i3;
        tdVar.f9268f = -1;
        tdVar.f9264b = i2;
        tdVar.f9269g = kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: b */
    private final void m14366b(tb tbVar) {
        m14372g(tbVar.f9255b, tbVar.f9256c);
    }
}
