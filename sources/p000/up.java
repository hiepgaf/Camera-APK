package p000;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.CompareFunctions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: up */
public final class up {
    /* renamed from: a */
    public final ArrayList f9334a = new ArrayList();
    /* renamed from: b */
    public ArrayList f9335b = null;
    /* renamed from: c */
    public final ArrayList f9336c = new ArrayList();
    /* renamed from: d */
    public final List f9337d = Collections.unmodifiableList(this.f9334a);
    /* renamed from: e */
    public final /* synthetic */ RecyclerView f9338e;
    /* renamed from: f */
    private int f9339f = 2;
    /* renamed from: g */
    private int f9340g = 2;
    /* renamed from: h */
    private un f9341h;

    public up(RecyclerView recyclerView) {
        this.f9338e = recyclerView;
    }

    /* renamed from: a */
    final void m6001a(ux uxVar, boolean z) {
        RecyclerView.m427b(uxVar);
        if (uxVar.m6021b(16384)) {
            uxVar.m6015a(0, 16384);
            jm.m4559a(uxVar.f9369a, null);
        }
        if (z) {
            RecyclerView recyclerView = this.f9338e;
            uq uqVar = recyclerView.f684l;
            tx txVar = recyclerView.f682j;
            if (recyclerView.f656A != null) {
                recyclerView.f679g.m6152d(uxVar);
            }
        }
        uxVar.f9383o = null;
        un b = m6002b();
        int i = uxVar.f9374f;
        ArrayList arrayList = b.m5995a(i).f9330a;
        if (((uo) b.f9328a.get(i)).f9331b > arrayList.size()) {
            uxVar.m6034o();
            arrayList.add(uxVar);
        }
    }

    /* renamed from: a */
    public final void m5998a() {
        this.f9334a.clear();
        m6006c();
    }

    /* renamed from: a */
    public final int m5996a(int i) {
        if (i < 0 || i >= this.f9338e.f656A.m6009a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid position ");
            stringBuilder.append(i);
            stringBuilder.append(". State ");
            stringBuilder.append("item count is ");
            stringBuilder.append(this.f9338e.f656A.m6009a());
            stringBuilder.append(this.f9338e.m471g());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        RecyclerView recyclerView = this.f9338e;
        if (recyclerView.f656A.f9353g) {
            return recyclerView.f677e.m5842a(i, 0);
        }
        return i;
    }

    /* renamed from: b */
    public final un m6002b() {
        if (this.f9341h == null) {
            this.f9341h = new un();
        }
        return this.f9341h;
    }

    /* renamed from: a */
    final void m5999a(View view) {
        ux c = RecyclerView.m428c(view);
        c.f9379k = null;
        c.f9380l = false;
        c.m6022c();
        m6000a(c);
    }

    /* renamed from: c */
    public final void m6006c() {
        for (int size = this.f9336c.size() - 1; size >= 0; size--) {
            m6003b(size);
        }
        this.f9336c.clear();
        if (RecyclerView.f655b) {
            this.f9338e.f698z.m5986a();
        }
    }

    /* renamed from: b */
    public final void m6003b(int i) {
        m6001a((ux) this.f9336c.get(i), true);
        this.f9336c.remove(i);
    }

    /* renamed from: b */
    public final void m6004b(View view) {
        ux c = RecyclerView.m428c(view);
        if (c.m6031l()) {
            this.f9338e.removeDetachedView(view, false);
        }
        if (c.m6030k()) {
            c.m6036q();
        } else if (c.m6037r()) {
            c.m6022c();
        }
        m6000a(c);
    }

    /* renamed from: a */
    final void m6000a(ux uxVar) {
        boolean z = true;
        int i = 0;
        boolean z2;
        if (uxVar.m6030k() || uxVar.f9369a.getParent() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder.append(uxVar.m6030k());
            stringBuilder.append(" isAttached:");
            if (uxVar.f9369a.getParent() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            stringBuilder.append(z2);
            stringBuilder.append(this.f9338e.m471g());
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (uxVar.m6031l()) {
            r1 = new StringBuilder();
            r1.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            r1.append(uxVar);
            r1.append(this.f9338e.m471g());
            throw new IllegalArgumentException(r1.toString());
        } else if (uxVar.m6035p()) {
            r1 = new StringBuilder();
            r1.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            r1.append(this.f9338e.m471g());
            throw new IllegalArgumentException(r1.toString());
        } else {
            boolean z3;
            if ((uxVar.f9378j & 16) != 0) {
                z3 = false;
            } else if (jm.m4588v(uxVar.f9369a)) {
                z3 = true;
            } else {
                z3 = false;
            }
            tx txVar = this.f9338e.f682j;
            if (uxVar.m6028i()) {
                if (this.f9340g <= 0) {
                    z2 = false;
                } else if (uxVar.m6021b(526)) {
                    z2 = false;
                } else {
                    int size = this.f9336c.size();
                    if (size >= this.f9340g && size > 0) {
                        m6003b(0);
                        size--;
                    }
                    if (RecyclerView.f655b && size > 0 && !this.f9338e.f698z.m5989a(uxVar.f9371c)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!this.f9338e.f698z.m5989a(((ux) this.f9336c.get(i2)).f9371c)) {
                                break;
                            }
                            i2--;
                        }
                        size = i2 + 1;
                    }
                    this.f9336c.add(size, uxVar);
                    z2 = true;
                }
                if (z2) {
                    z = false;
                    boolean z4 = z2;
                } else {
                    m6001a(uxVar, true);
                    i = z2;
                }
            } else {
                z = false;
            }
            this.f9338e.f679g.m6152d(uxVar);
            if (i == 0 && !r1 && r3) {
                uxVar.f9383o = null;
            }
        }
    }

    /* renamed from: c */
    final void m6007c(View view) {
        ux c = RecyclerView.m428c(view);
        if (!c.m6021b(12) && c.m6032m()) {
            boolean z;
            ub ubVar = this.f9338e.f696x;
            if (ubVar == null) {
                z = true;
            } else if (ubVar.mo3332a(c, c.m6026g())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f9335b == null) {
                    this.f9335b = new ArrayList();
                }
                c.m6018a(this, true);
                this.f9335b.add(c);
                return;
            }
        }
        if (!c.m6027h() || c.m6029j() || this.f9338e.f682j.f9296b) {
            c.m6018a(this, false);
            this.f9334a.add(c);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        stringBuilder.append(this.f9338e.m471g());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    final ux m5997a(int i, long j) {
        if (i < 0 || i >= this.f9338e.f656A.m6009a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid item position ");
            stringBuilder.append(i);
            stringBuilder.append("(");
            stringBuilder.append(i);
            stringBuilder.append("). Item count:");
            stringBuilder.append(this.f9338e.f656A.m6009a());
            stringBuilder.append(this.f9338e.m471g());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        ArrayList arrayList;
        int size;
        int i2;
        ux uxVar;
        RecyclerView recyclerView;
        int a;
        Object obj;
        int size2;
        int size3;
        View view;
        ux c;
        tx txVar;
        long a2;
        Object obj2;
        Object obj3;
        LayoutParams layoutParams;
        uk ukVar;
        boolean z;
        if (this.f9338e.f656A.f9353g) {
            arrayList = this.f9335b;
            if (arrayList != null) {
                size = arrayList.size();
                if (size != 0) {
                    for (i2 = 0; i2 < size; i2++) {
                        uxVar = (ux) this.f9335b.get(i2);
                        if (!uxVar.m6037r() && uxVar.m6025f() == i) {
                            uxVar.m6014a(32);
                            break;
                        }
                    }
                    recyclerView = this.f9338e;
                    if (recyclerView.f682j.f9296b) {
                        a = recyclerView.f677e.m5842a(i, 0);
                        if (a <= 0) {
                            uxVar = null;
                        } else if (a < this.f9338e.f682j.mo728a()) {
                            long a3 = this.f9338e.f682j.mo729a(a);
                            for (i2 = 0; i2 < size; i2++) {
                                uxVar = (ux) this.f9335b.get(i2);
                                if (!uxVar.m6037r() && uxVar.f9373e == a3) {
                                    uxVar.m6014a(32);
                                    break;
                                }
                            }
                            uxVar = null;
                        } else {
                            uxVar = null;
                        }
                    } else {
                        uxVar = null;
                    }
                } else {
                    uxVar = null;
                }
            } else {
                uxVar = null;
            }
            if (uxVar != null) {
                obj = 1;
            } else {
                obj = null;
            }
        } else {
            obj = null;
            uxVar = null;
        }
        if (uxVar == null) {
            StringBuilder stringBuilder2;
            size2 = this.f9334a.size();
            for (size = 0; size < size2; size++) {
                uxVar = (ux) this.f9334a.get(size);
                if (!uxVar.m6037r() && uxVar.m6025f() == i && !uxVar.m6027h() && (this.f9338e.f656A.f9353g || !uxVar.m6029j())) {
                    uxVar.m6014a(32);
                    break;
                }
            }
            rp rpVar = this.f9338e.f678f;
            size3 = rpVar.f9141c.size();
            for (size = 0; size < size3; size++) {
                view = (View) rpVar.f9141c.get(size);
                ux c2 = RecyclerView.m428c(view);
                if (c2.m6025f() == i && !c2.m6027h() && !c2.m6029j()) {
                    break;
                }
            }
            view = null;
            if (view == null) {
                size2 = this.f9336c.size();
                for (size = 0; size < size2; size++) {
                    uxVar = (ux) this.f9336c.get(size);
                    if (!uxVar.m6027h() && uxVar.m6025f() == i) {
                        this.f9336c.remove(size);
                        break;
                    }
                }
                uxVar = null;
            } else {
                c = RecyclerView.m428c(view);
                rpVar = this.f9338e.f678f;
                size3 = rpVar.f9139a.m5777a(view);
                if (size3 < 0) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("view is not a child, cannot hide ");
                    stringBuilder2.append(view);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else if (rpVar.f9140b.m5774c(size3)) {
                    rpVar.f9140b.m5771a(size3);
                    rpVar.m5769d(view);
                    size2 = this.f9338e.f678f.m5764b(view);
                    if (size2 == -1) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("layout index should not be -1 after unhiding a view:");
                        stringBuilder.append(c);
                        stringBuilder.append(this.f9338e.m471g());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    this.f9338e.f678f.m5759a(size2);
                    m6007c(view);
                    c.m6014a(8224);
                    uxVar = c;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("trying to unhide a view that was not hidden");
                    stringBuilder2.append(view);
                    throw new RuntimeException(stringBuilder2.toString());
                }
            }
            if (uxVar != null) {
                boolean z2;
                if (uxVar.m6029j()) {
                    z2 = this.f9338e.f656A.f9353g;
                } else {
                    size = uxVar.f9371c;
                    if (size < 0 || size >= this.f9338e.f682j.mo728a()) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Inconsistency detected. Invalid view holder adapter position");
                        stringBuilder2.append(uxVar);
                        stringBuilder2.append(this.f9338e.m471g());
                        throw new IndexOutOfBoundsException(stringBuilder2.toString());
                    }
                    RecyclerView recyclerView2 = this.f9338e;
                    if (recyclerView2.f656A.f9353g || recyclerView2.f682j.mo732b(uxVar.f9371c) == uxVar.f9374f) {
                        txVar = this.f9338e.f682j;
                        if (!txVar.f9296b) {
                            z2 = true;
                        } else if (uxVar.f9373e != txVar.mo729a(uxVar.f9371c)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    obj = 1;
                } else {
                    uxVar.m6014a(4);
                    if (uxVar.m6030k()) {
                        this.f9338e.removeDetachedView(uxVar.f9369a, false);
                        uxVar.m6036q();
                    } else if (uxVar.m6037r()) {
                        uxVar.m6022c();
                    }
                    m6000a(uxVar);
                    uxVar = null;
                }
            }
        }
        if (uxVar == null) {
            size2 = this.f9338e.f677e.m5842a(i, 0);
            if (size2 < 0 || size2 >= this.f9338e.f682j.mo728a()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Inconsistency detected. Invalid item position ");
                stringBuilder.append(i);
                stringBuilder.append("(offset:");
                stringBuilder.append(size2);
                stringBuilder.append(").");
                stringBuilder.append("state:");
                stringBuilder.append(this.f9338e.f656A.m6009a());
                stringBuilder.append(this.f9338e.m471g());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            uo uoVar;
            size3 = this.f9338e.f682j.mo732b(size2);
            txVar = this.f9338e.f682j;
            if (txVar.f9296b) {
                a2 = txVar.mo729a(size2);
                for (size = this.f9334a.size() - 1; size >= 0; size--) {
                    uxVar = (ux) this.f9334a.get(size);
                    if (uxVar.f9373e == a2 && !uxVar.m6037r()) {
                        if (size3 == uxVar.f9374f) {
                            uxVar.m6014a(32);
                            if (!uxVar.m6029j()) {
                                c = uxVar;
                            } else if (this.f9338e.f656A.f9353g) {
                                c = uxVar;
                            } else {
                                uxVar.m6015a(2, 14);
                                c = uxVar;
                            }
                            if (c != null) {
                                c.f9371c = size2;
                                obj = 1;
                            }
                        } else {
                            this.f9334a.remove(size);
                            this.f9338e.removeDetachedView(uxVar.f9369a, false);
                            m5999a(uxVar.f9369a);
                        }
                    }
                }
                size = this.f9336c.size() - 1;
                while (size >= 0) {
                    uxVar = (ux) this.f9336c.get(size);
                    if (uxVar.f9373e != a2) {
                        size--;
                    } else {
                        if (size3 == uxVar.f9374f) {
                            this.f9336c.remove(size);
                            c = uxVar;
                        } else {
                            m6003b(size);
                            c = null;
                        }
                        if (c != null) {
                            c.f9371c = size2;
                            obj = 1;
                        }
                    }
                }
                c = null;
                if (c != null) {
                    c.f9371c = size2;
                    obj = 1;
                }
            } else {
                c = uxVar;
            }
            if (c == null) {
                uoVar = (uo) m6002b().f9328a.get(size3);
                if (uoVar == null) {
                    c = null;
                } else if (uoVar.f9330a.isEmpty()) {
                    c = null;
                } else {
                    arrayList = uoVar.f9330a;
                    c = (ux) arrayList.remove(arrayList.size() - 1);
                }
                if (c != null) {
                    c.m6034o();
                }
            }
            if (c == null) {
                a2 = RecyclerView.m432h();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.f9341h.m5995a(size3).f9332c;
                    if (j2 == 0) {
                        obj2 = 1;
                    } else if (j2 + a2 >= j) {
                        obj2 = null;
                    } else {
                        obj2 = 1;
                    }
                    if (obj2 == null) {
                        return null;
                    }
                }
                ViewGroup viewGroup = this.f9338e;
                c = viewGroup.f682j.m5868a(viewGroup, size3);
                if (RecyclerView.f655b) {
                    recyclerView = RecyclerView.m426b(c.f9369a);
                    if (recyclerView != null) {
                        c.f9370b = new WeakReference(recyclerView);
                    }
                }
                long h = RecyclerView.m432h();
                uoVar = this.f9341h.m5995a(size3);
                uoVar.f9332c = un.m5994a(uoVar.f9332c, h - a2);
                obj3 = obj;
            } else {
                obj3 = obj;
            }
        } else {
            obj3 = obj;
            c = uxVar;
        }
        if (!(obj3 == null || this.f9338e.f656A.f9353g || !c.m6021b(8192))) {
            c.m6015a(0, 8192);
            if (this.f9338e.f656A.f9356j) {
                ub.m5898d(c);
                recyclerView = this.f9338e;
                ub ubVar = recyclerView.f696x;
                uv uvVar = recyclerView.f656A;
                c.m6026g();
                ue f = ub.m5899f();
                View view2 = c.f9369a;
                f.f9304a = view2.getLeft();
                f.f9305b = view2.getTop();
                view2.getRight();
                view2.getBottom();
                this.f9338e.m453a(c, f);
            }
        }
        if (this.f9338e.f656A.f9353g && (c.f9378j & 1) != 0) {
            c.f9375g = i;
            obj = null;
        } else if ((c.f9378j & 1) == 0 || c.m6033n() || c.m6027h()) {
            i2 = this.f9338e.f677e.m5842a(i, 0);
            c.f9383o = this.f9338e;
            a = c.f9374f;
            a3 = RecyclerView.m432h();
            if (j != Long.MAX_VALUE) {
                a2 = this.f9341h.m5995a(a).f9333d;
                if (a2 == 0) {
                    obj2 = 1;
                } else if (a2 + a3 >= j) {
                    obj2 = null;
                } else {
                    obj2 = 1;
                }
                if (obj2 == null) {
                    obj = null;
                }
            }
            tx txVar2 = this.f9338e.f682j;
            c.f9371c = i2;
            if (txVar2.f9296b) {
                c.f9373e = txVar2.mo729a(i2);
            }
            c.m6015a(1, (int) CompareFunctions.ALWAYS);
            Trace.beginSection("RV OnBindView");
            c.m6026g();
            txVar2.mo731a(c, i2);
            c.m6020b();
            layoutParams = c.f9369a.getLayoutParams();
            if (layoutParams instanceof uk) {
                ((uk) layoutParams).f9326e = true;
            }
            Trace.endSection();
            long h2 = RecyclerView.m432h();
            uo a4 = this.f9341h.m5995a(c.f9374f);
            a4.f9333d = un.m5994a(a4.f9333d, h2 - a3);
            if (this.f9338e.m474k()) {
                view = c.f9369a;
                if (jm.m4574h(view) == 0) {
                    jm.m4568c(view, 1);
                }
                if (!jm.m4585s(view)) {
                    c.m6014a(16384);
                    jm.m4559a(view, this.f9338e.f661F.f19647d);
                }
            }
            if (this.f9338e.f656A.f9353g) {
                c.f9375g = i;
                i2 = 1;
            } else {
                i2 = 1;
            }
        } else {
            obj = null;
        }
        layoutParams = c.f9369a.getLayoutParams();
        if (layoutParams == null) {
            ukVar = (uk) this.f9338e.generateDefaultLayoutParams();
            c.f9369a.setLayoutParams(ukVar);
        } else if (this.f9338e.checkLayoutParams(layoutParams)) {
            ukVar = (uk) layoutParams;
        } else {
            ukVar = (uk) this.f9338e.generateLayoutParams(layoutParams);
            c.f9369a.setLayoutParams(ukVar);
        }
        ukVar.f9324c = c;
        if (obj3 == null) {
            z = false;
        } else if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        ukVar.f9327f = z;
        return c;
    }

    /* renamed from: b */
    public final void m6005b(ux uxVar) {
        if (uxVar.f9380l) {
            this.f9335b.remove(uxVar);
        } else {
            this.f9334a.remove(uxVar);
        }
        uxVar.f9379k = null;
        uxVar.f9380l = false;
        uxVar.m6022c();
    }

    /* renamed from: d */
    public final void m6008d() {
        int i;
        ug ugVar = this.f9338e.f683k;
        if (ugVar != null) {
            i = ugVar.f9314l;
        } else {
            i = 0;
        }
        this.f9340g = i + this.f9339f;
        for (i = this.f9336c.size() - 1; i >= 0 && this.f9336c.size() > this.f9340g; i--) {
            m6003b(i);
        }
    }
}
