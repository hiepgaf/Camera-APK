package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: su */
public final class su extends ta {
    /* renamed from: a */
    public sx f22570a = new sv();
    /* renamed from: r */
    private boolean f22571r = false;
    /* renamed from: s */
    private int f22572s = -1;
    /* renamed from: t */
    private int[] f22573t;
    /* renamed from: u */
    private View[] f22574u;
    /* renamed from: v */
    private final SparseIntArray f22575v = new SparseIntArray();
    /* renamed from: w */
    private final SparseIntArray f22576w = new SparseIntArray();
    /* renamed from: x */
    private final Rect f22577x = new Rect();

    public su(int i) {
        m16807a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    private final void m16798g(int r9) {
        /*
        r8 = this;
        r3 = 0;
        r0 = r8.f22573t;
        r6 = r8.f22572s;
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r0.length;
        r2 = r6 + 1;
        if (r1 != r2) goto L_0x0012;
    L_0x000c:
        r1 = r1 + -1;
        r1 = r0[r1];
        if (r1 == r9) goto L_0x0016;
    L_0x0012:
        r0 = r6 + 1;
        r0 = new int[r0];
    L_0x0016:
        r0[r3] = r3;
        r2 = r9 / r6;
        r7 = r9 % r6;
        r1 = 1;
        r4 = r1;
        r5 = r3;
    L_0x001f:
        if (r4 > r6) goto L_0x0036;
    L_0x0021:
        r3 = r3 + r7;
        if (r3 <= 0) goto L_0x0034;
    L_0x0024:
        r1 = r6 - r3;
        if (r1 >= r7) goto L_0x0032;
    L_0x0028:
        r1 = r2 + 1;
        r3 = r3 - r6;
    L_0x002b:
        r5 = r5 + r1;
        r0[r4] = r5;
        r1 = r4 + 1;
        r4 = r1;
        goto L_0x001f;
    L_0x0032:
        r1 = r2;
        goto L_0x002b;
    L_0x0034:
        r1 = r2;
        goto L_0x002b;
    L_0x0036:
        r8.f22573t = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.g(int):void");
    }

    /* renamed from: a */
    public final boolean mo808a(uk ukVar) {
        return ukVar instanceof sw;
    }

    /* renamed from: a */
    final void mo3346a(uv uvVar, td tdVar, uj ujVar) {
        int i = this.f22572s;
        for (int i2 = 0; i2 < this.f22572s && tdVar.m5835a(uvVar) && i > 0; i2++) {
            int i3 = tdVar.f9266d;
            ujVar.m5987a(i3, Math.max(0, tdVar.f9269g));
            i -= this.f22570a.mo727a(i3);
            tdVar.f9266d += tdVar.f9267e;
        }
    }

    /* renamed from: z */
    private final void m16799z() {
        View[] viewArr = this.f22574u;
        if (viewArr == null || viewArr.length != this.f22572s) {
            this.f22574u = new View[this.f22572s];
        }
    }

    /* renamed from: a */
    final View mo3340a(up upVar, uv uvVar, int i, int i2, int i3) {
        int i4;
        View view = null;
        m14404j();
        int f = this.c.m5862f();
        int b = this.c.m5854b();
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
                view3 = view2;
                e = view;
            } else if (c >= i3) {
                view3 = view2;
                e = view;
            } else if (m16794b(upVar, uvVar, c) != 0) {
                view3 = view2;
                e = view;
            } else if (((uk) e.getLayoutParams()).f9324c.m6029j()) {
                if (view2 == null) {
                    view3 = e;
                    e = view;
                } else {
                    view3 = view2;
                    e = view;
                }
            } else if (this.c.m5859d(e) < b && this.c.m5852a(e) >= f) {
                return e;
            } else {
                if (view != null) {
                    view3 = view2;
                    e = view;
                } else {
                    view3 = view2;
                }
            }
            i += i4;
            view = e;
            view2 = view3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public final uk mo804a() {
        if (this.b == 0) {
            return new sw(-2, -1);
        }
        return new sw(-1, -2);
    }

    /* renamed from: a */
    public final uk mo805a(Context context, AttributeSet attributeSet) {
        return new sw(context, attributeSet);
    }

    /* renamed from: a */
    public final uk mo3341a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new sw((MarginLayoutParams) layoutParams);
        }
        return new sw(layoutParams);
    }

    /* renamed from: a */
    public final int mo3339a(up upVar, uv uvVar) {
        if (this.b == 1) {
            return this.f22572s;
        }
        if (uvVar.m6009a() <= 0) {
            return 0;
        }
        return m16792a(upVar, uvVar, uvVar.m6009a() - 1) + 1;
    }

    /* renamed from: b */
    public final int mo3347b(up upVar, uv uvVar) {
        if (this.b == 0) {
            return this.f22572s;
        }
        if (uvVar.m6009a() <= 0) {
            return 0;
        }
        return m16792a(upVar, uvVar, uvVar.m6009a() - 1) + 1;
    }

    /* renamed from: e */
    private final int m16797e(int i, int i2) {
        if (this.b == 1 && m14406l()) {
            int[] iArr = this.f22573t;
            int i3 = this.f22572s - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        iArr = this.f22573t;
        return iArr[i + i2] - iArr[i];
    }

    /* renamed from: a */
    private final int m16792a(up upVar, uv uvVar, int i) {
        if (!uvVar.f9353g) {
            return this.f22570a.m5819b(i, this.f22572s);
        }
        int a = upVar.m5996a(i);
        if (a != -1) {
            return this.f22570a.m5819b(a, this.f22572s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. ");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    /* renamed from: b */
    private final int m16794b(up upVar, uv uvVar, int i) {
        if (!uvVar.f9353g) {
            return this.f22570a.mo2461a(i, this.f22572s);
        }
        int i2 = this.f22576w.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = upVar.m5996a(i);
        if (i2 != -1) {
            return this.f22570a.mo2461a(i2, this.f22572s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    /* renamed from: c */
    private final int m16796c(up upVar, uv uvVar, int i) {
        if (!uvVar.f9353g) {
            return this.f22570a.mo727a(i);
        }
        int i2 = this.f22575v.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = upVar.m5996a(i);
        if (i2 != -1) {
            return this.f22570a.mo727a(i2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 1;
    }

    /* renamed from: a */
    final void mo3345a(up upVar, uv uvVar, td tdVar, tc tcVar) {
        int i;
        int i2;
        int e = this.c.m5860e();
        if (m5975o() > 0) {
            i = this.f22573t[this.f22572s];
        } else {
            i = 0;
        }
        if (e != 1073741824) {
            m16791A();
        }
        int i3 = tdVar.f9267e;
        int i4 = this.f22572s;
        if (i3 != 1) {
            i4 = m16794b(upVar, uvVar, tdVar.f9266d) + m16796c(upVar, uvVar, tdVar.f9266d);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.f22572s && tdVar.m5835a(uvVar) && i4 > 0) {
            int i5 = tdVar.f9266d;
            int c = m16796c(upVar, uvVar, i5);
            if (c <= this.f22572s) {
                i4 -= c;
                if (i4 < 0) {
                    break;
                }
                View a = tdVar.m5833a(upVar);
                if (a == null) {
                    break;
                }
                this.f22574u[i2] = a;
                i2++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item at position ");
                stringBuilder.append(i5);
                stringBuilder.append(" requires ");
                stringBuilder.append(c);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(this.f22572s);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i2 == 0) {
            tcVar.f9260b = true;
            return;
        }
        int i6;
        if (i3 != 1) {
            c = -1;
            i4 = i2 - 1;
            i5 = -1;
        } else {
            c = i2;
            i5 = 1;
            i4 = 0;
        }
        int i7 = 0;
        for (i6 = i4; i6 != c; i6 += i5) {
            View view = this.f22574u[i6];
            sw swVar = (sw) view.getLayoutParams();
            swVar.f19597b = m16796c(upVar, uvVar, ug.m5921c(view));
            swVar.f19596a = i7;
            i7 += swVar.f19597b;
        }
        i5 = 0;
        float f = 0.0f;
        i6 = 0;
        while (i6 < i2) {
            View view2 = this.f22574u[i6];
            if (tdVar.f9272j == null) {
                if (i3 == 1) {
                    super.m5935a(view2, -1, false);
                } else {
                    super.m5935a(view2, 0, false);
                }
            } else if (i3 == 1) {
                super.m5935a(view2, -1, true);
            } else {
                super.m5935a(view2, 0, true);
            }
            Rect rect = this.f22577x;
            RecyclerView recyclerView = this.f9309g;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m467d(view2));
            }
            m16795b(view2, e, false);
            i4 = this.c.m5855b(view2);
            if (i4 > i5) {
                i5 = i4;
            }
            float c2 = ((float) this.c.m5857c(view2)) / ((float) ((sw) view2.getLayoutParams()).f19597b);
            if (c2 <= f) {
                c2 = f;
            }
            i6++;
            f = c2;
        }
        if (e == 1073741824) {
            i7 = i5;
        } else {
            m16798g(Math.max(Math.round(((float) this.f22572s) * f), i));
            i5 = 0;
            c = 0;
            while (c < i2) {
                View view3 = this.f22574u[c];
                m16795b(view3, 1073741824, true);
                i4 = this.c.m5855b(view3);
                if (i4 <= i5) {
                    i4 = i5;
                }
                c++;
                i5 = i4;
            }
            i7 = i5;
        }
        for (c = 0; c < i2; c++) {
            View view4 = this.f22574u[c];
            if (this.c.m5855b(view4) != i7) {
                swVar = (sw) view4.getLayoutParams();
                Rect rect2 = swVar.d;
                i = ((rect2.top + rect2.bottom) + swVar.topMargin) + swVar.bottomMargin;
                i5 = ((rect2.right + rect2.left) + swVar.leftMargin) + swVar.rightMargin;
                e = m16797e(swVar.f19596a, swVar.f19597b);
                if (this.b == 1) {
                    i5 = ug.m5916a(e, 1073741824, i5, swVar.width, false);
                    i4 = MeasureSpec.makeMeasureSpec(i7 - i, 1073741824);
                } else {
                    i5 = MeasureSpec.makeMeasureSpec(i7 - i5, 1073741824);
                    i4 = ug.m5916a(e, 1073741824, i, swVar.height, false);
                }
                m16793a(view4, i5, i4, true);
            }
        }
        tcVar.f9259a = i7;
        if (this.b == 1) {
            if (tdVar.f9268f == -1) {
                c = tdVar.f9264b;
                i6 = c - i7;
                i5 = 0;
                i4 = 0;
            } else {
                i6 = tdVar.f9264b;
                c = i6 + i7;
                i5 = 0;
                i4 = 0;
            }
        } else if (tdVar.f9268f == -1) {
            i4 = tdVar.f9264b;
            i5 = i4 - i7;
            i6 = 0;
            c = 0;
        } else {
            i5 = tdVar.f9264b;
            i4 = i5 + i7;
            i6 = 0;
            c = 0;
        }
        i7 = i4;
        int i8 = c;
        c = i5;
        i5 = i8;
        for (i = 0; i < i2; i++) {
            View view5 = this.f22574u[i];
            swVar = (sw) view5.getLayoutParams();
            if (this.b != 1) {
                i6 = this.f22573t[swVar.f19596a] + m5980t();
                i5 = this.c.m5857c(view5) + i6;
            } else if (m14406l()) {
                i7 = this.f22573t[this.f22572s - swVar.f19596a] + m5978r();
                c = i7 - this.c.m5857c(view5);
            } else {
                c = m5978r() + this.f22573t[swVar.f19596a];
                i7 = this.c.m5857c(view5) + c;
            }
            ug.m5918a(view5, c, i6, i7, i5);
            if (!swVar.f9324c.m6029j()) {
                if (!swVar.f9324c.m6032m()) {
                    tcVar.f9262d |= view5.hasFocusable();
                }
            }
            tcVar.f9261c = true;
            tcVar.f9262d |= view5.hasFocusable();
        }
        Arrays.fill(this.f22574u, null);
    }

    /* renamed from: b */
    private final void m16795b(View view, int i, boolean z) {
        int a;
        sw swVar = (sw) view.getLayoutParams();
        Rect rect = swVar.d;
        int i2 = ((rect.top + rect.bottom) + swVar.topMargin) + swVar.bottomMargin;
        int i3 = swVar.rightMargin + ((rect.right + rect.left) + swVar.leftMargin);
        int e = m16797e(swVar.f19596a, swVar.f19597b);
        if (this.b == 1) {
            e = ug.m5916a(e, i, i3, swVar.width, false);
            a = ug.m5916a(this.c.m5864g(), this.f9317o, i2, swVar.height, true);
        } else {
            int a2 = ug.m5916a(e, i, i2, swVar.height, false);
            e = ug.m5916a(this.c.m5864g(), this.f9316n, i3, swVar.width, true);
            a = a2;
        }
        m16793a(view, e, a, z);
    }

    /* renamed from: a */
    private final void m16793a(View view, int i, int i2, boolean z) {
        boolean a;
        uk ukVar = (uk) view.getLayoutParams();
        if (!z) {
            a = m5944a(view, i, i2, ukVar);
        } else if (!this.f9312j) {
            a = true;
        } else if (!ug.m5920b(view.getMeasuredWidth(), i, ukVar.width)) {
            a = true;
        } else if (ug.m5920b(view.getMeasuredHeight(), i2, ukVar.height)) {
            a = false;
        } else {
            a = true;
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    final void mo3344a(up upVar, uv uvVar, tb tbVar, int i) {
        super.mo3344a(upVar, uvVar, tbVar, i);
        m16791A();
        if (uvVar.m6009a() > 0 && !uvVar.f9353g) {
            int b = m16794b(upVar, uvVar, tbVar.f9255b);
            if (i == 1) {
                while (b > 0) {
                    b = tbVar.f9255b;
                    if (b <= 0) {
                        break;
                    }
                    tbVar.f9255b = b - 1;
                    b = m16794b(upVar, uvVar, tbVar.f9255b);
                }
            } else {
                int a = uvVar.m6009a() - 1;
                int i2 = tbVar.f9255b;
                while (i2 < a) {
                    int b2 = m16794b(upVar, uvVar, i2 + 1);
                    if (b2 <= b) {
                        break;
                    }
                    i2++;
                    b = b2;
                }
                tbVar.f9255b = i2;
            }
        }
        m16799z();
    }

    /* renamed from: a */
    public final View mo2462a(View view, int i, up upVar, uv uvVar) {
        View view2;
        RecyclerView recyclerView = this.f9309g;
        if (recyclerView != null) {
            View a = recyclerView.m443a(view);
            if (a == null) {
                view2 = null;
            } else if (this.f9308f.m5767c(a)) {
                view2 = null;
            } else {
                view2 = a;
            }
        } else {
            view2 = null;
        }
        if (view2 == null) {
            return null;
        }
        sw swVar = (sw) view2.getLayoutParams();
        int i2 = swVar.f19596a;
        int i3 = i2 + swVar.f19597b;
        if (super.mo2462a(view, i, upVar, uvVar) == null) {
            return null;
        }
        boolean z;
        int o;
        int i4;
        int i5;
        Object obj;
        if (m14391b(i) != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.d) {
            o = m5975o() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            o = 0;
            i4 = 1;
            i5 = m5975o();
        }
        if (this.b != 1) {
            obj = null;
        } else if (m14406l()) {
            obj = 1;
        } else {
            obj = null;
        }
        int a2 = m16792a(upVar, uvVar, o);
        View view3 = null;
        int i6 = -1;
        int i7 = 0;
        View view4 = null;
        int i8 = -1;
        int i9 = 0;
        int i10 = o;
        while (i10 != i5) {
            o = m16792a(upVar, uvVar, i10);
            View e = m5963e(i10);
            if (e == view2) {
                break;
            }
            View view5;
            int i11;
            if (e.hasFocusable() && o != a2) {
                if (view3 != null) {
                    break;
                }
                o = i9;
                e = view3;
                i9 = i8;
                view5 = view4;
                i11 = i7;
                i7 = i6;
            } else {
                swVar = (sw) e.getLayoutParams();
                int i12 = swVar.f19596a;
                int i13 = i12 + swVar.f19597b;
                if (e.hasFocusable() && i12 == i2 && i13 == i3) {
                    return e;
                }
                Object obj2;
                if (e.hasFocusable() && view3 == null) {
                    obj2 = 1;
                } else if (e.hasFocusable() || view4 != null) {
                    int min = Math.min(i13, i3) - Math.max(i12, i2);
                    if (e.hasFocusable()) {
                        if (min > i7) {
                            obj2 = 1;
                        } else if (min == i7) {
                            if (i12 <= i6) {
                                obj2 = null;
                            } else {
                                obj2 = 1;
                            }
                            if (obj == obj2) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                    } else if (view3 != null) {
                        obj2 = null;
                    } else {
                        int i14;
                        if (!this.f9310h.m6063a(e)) {
                            i14 = 0;
                        } else if (this.f9311i.m6063a(e)) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        if ((i14 ^ 1) == 0) {
                            obj2 = null;
                        } else if (min > i9) {
                            obj2 = 1;
                        } else if (min == i9) {
                            if (i12 <= i8) {
                                obj2 = null;
                            } else {
                                obj2 = 1;
                            }
                            if (obj == obj2) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                } else {
                    obj2 = 1;
                }
                if (obj2 == null) {
                    o = i9;
                    e = view3;
                    i9 = i8;
                    view5 = view4;
                    i11 = i7;
                    i7 = i6;
                } else if (e.hasFocusable()) {
                    i7 = swVar.f19596a;
                    int i15 = i9;
                    i9 = i8;
                    view5 = view4;
                    i11 = Math.min(i13, i3) - Math.max(i12, i2);
                    o = i15;
                } else {
                    i9 = swVar.f19596a;
                    o = Math.min(i13, i3) - Math.max(i12, i2);
                    view5 = e;
                    i11 = i7;
                    e = view3;
                    i7 = i6;
                }
            }
            i10 += i4;
            i6 = i7;
            i7 = i11;
            view3 = e;
            view4 = view5;
            i8 = i9;
            i9 = o;
        }
        return view3 != null ? view3 : view4;
    }

    /* renamed from: a */
    public final void mo3343a(up upVar, uv uvVar, View view, kk kkVar) {
        boolean z = false;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof sw) {
            sw swVar = (sw) layoutParams;
            int a = m16792a(upVar, uvVar, swVar.f9324c.m6025f());
            int i;
            int i2;
            int i3;
            if (this.b == 0) {
                i = swVar.f19596a;
                i2 = swVar.f19597b;
                i3 = this.f22572s;
                boolean z2 = i3 <= 1 ? false : i2 == i3;
                kkVar.m4987a(kn.m5012a(i, i2, a, 1, z2));
                return;
            }
            i = swVar.f19596a;
            i3 = swVar.f19597b;
            i2 = this.f22572s;
            if (i2 > 1 && i3 == i2) {
                z = true;
            }
            kkVar.m4987a(kn.m5012a(a, 1, i, i3, z));
            return;
        }
        super.m5937a(view, kkVar);
    }

    /* renamed from: b */
    public final void mo811b() {
        this.f22570a.f9236a.clear();
    }

    /* renamed from: c */
    public final void mo3348c() {
        this.f22570a.f9236a.clear();
    }

    /* renamed from: d */
    public final void mo815d() {
        this.f22570a.f9236a.clear();
    }

    /* renamed from: e */
    public final void mo817e() {
        this.f22570a.f9236a.clear();
    }

    /* renamed from: f */
    public final void mo819f() {
        this.f22570a.f9236a.clear();
    }

    /* renamed from: c */
    public final void mo813c(up upVar, uv uvVar) {
        if (uvVar.f9353g) {
            int o = m5975o();
            for (int i = 0; i < o; i++) {
                sw swVar = (sw) m5963e(i).getLayoutParams();
                int f = swVar.f9324c.m6025f();
                this.f22575v.put(f, swVar.f19597b);
                this.f22576w.put(f, swVar.f19596a);
            }
        }
        super.mo813c(upVar, uvVar);
        this.f22575v.clear();
        this.f22576w.clear();
    }

    /* renamed from: a */
    public final void mo807a(uv uvVar) {
        super.mo807a(uvVar);
        this.f22571r = false;
    }

    /* renamed from: a */
    public final int mo803a(int i, up upVar, uv uvVar) {
        m16791A();
        m16799z();
        return super.mo803a(i, upVar, uvVar);
    }

    /* renamed from: b */
    public final int mo809b(int i, up upVar, uv uvVar) {
        m16791A();
        m16799z();
        return super.mo809b(i, upVar, uvVar);
    }

    /* renamed from: a */
    public final void mo3342a(Rect rect, int i, int i2) {
        if (this.f22573t == null) {
            super.mo3342a(rect, i, i2);
        }
        int s = m5979s() + m5978r();
        int t = m5980t() + m5977q();
        int[] iArr;
        if (this.b == 1) {
            t = ug.m5915a(i2, t + rect.height(), jm.m4577k(this.f9309g));
            iArr = this.f22573t;
            s = ug.m5915a(i, s + iArr[iArr.length - 1], jm.m4578l(this.f9309g));
        } else {
            s = ug.m5915a(i, s + rect.width(), jm.m4578l(this.f9309g));
            iArr = this.f22573t;
            t = ug.m5915a(i2, t + iArr[iArr.length - 1], jm.m4577k(this.f9309g));
        }
        m5956c(s, t);
    }

    /* renamed from: a */
    public final void m16807a(int i) {
        if (i != this.f22572s) {
            this.f22571r = true;
            if (i <= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Span count should be at least 1. Provided ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f22572s = i;
            this.f22570a.f9236a.clear();
            m5985y();
        }
    }

    /* renamed from: g */
    public final boolean mo2468g() {
        return this.e == null && !this.f22571r;
    }

    /* renamed from: A */
    private final void m16791A() {
        int s;
        if (this.f19599b == 1) {
            s = (this.f9318p - m5979s()) - m5978r();
        } else {
            s = (this.f9319q - m5977q()) - m5980t();
        }
        m16798g(s);
    }
}
