package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ex */
public abstract class ex implements Cloneable {
    /* renamed from: p */
    private static final int[] f4300p = new int[]{2, 1, 3, 4};
    /* renamed from: q */
    private static final eu f4301q = new eu((byte) 0);
    /* renamed from: s */
    private static ThreadLocal f4302s = new ThreadLocal();
    /* renamed from: a */
    public long f4303a = -1;
    /* renamed from: b */
    public long f4304b = -1;
    /* renamed from: c */
    public TimeInterpolator f4305c = null;
    /* renamed from: d */
    public ArrayList f4306d = new ArrayList();
    /* renamed from: e */
    public ArrayList f4307e = new ArrayList();
    /* renamed from: f */
    public fm f4308f = new fm();
    /* renamed from: g */
    public fm f4309g = new fm();
    /* renamed from: h */
    public fh f4310h = null;
    /* renamed from: i */
    public int[] f4311i = f4300p;
    /* renamed from: j */
    public ArrayList f4312j;
    /* renamed from: k */
    public ArrayList f4313k;
    /* renamed from: l */
    public ArrayList f4314l = new ArrayList();
    /* renamed from: m */
    public ax f4315m;
    /* renamed from: n */
    public fb f4316n;
    /* renamed from: o */
    public eu f4317o = f4301q;
    /* renamed from: r */
    private String f4318r = getClass().getName();
    /* renamed from: t */
    private int f4319t = 0;
    /* renamed from: u */
    private boolean f4320u = false;
    /* renamed from: v */
    private boolean f4321v = false;
    /* renamed from: w */
    private ArrayList f4322w = null;
    /* renamed from: x */
    private ArrayList f4323x = new ArrayList();

    /* renamed from: a */
    public abstract void mo1221a(fl flVar);

    /* renamed from: b */
    public abstract void mo1223b(fl flVar);

    /* renamed from: a */
    public ex mo1366a(fc fcVar) {
        if (this.f4322w == null) {
            this.f4322w = new ArrayList();
        }
        this.f4322w.add(fcVar);
        return this;
    }

    /* renamed from: a */
    public ex mo1365a(View view) {
        this.f4307e.add(view);
        return this;
    }

    /* renamed from: a */
    private static void m2144a(fm fmVar, View view, fl flVar) {
        fmVar.f4617a.put(view, flVar);
        int id = view.getId();
        if (id >= 0) {
            if (fmVar.f4618b.indexOfKey(id) >= 0) {
                fmVar.f4618b.put(id, null);
            } else {
                fmVar.f4618b.put(id, view);
            }
        }
        String p = jm.m4582p(view);
        if (p != null) {
            if (fmVar.f4620d.containsKey(p)) {
                fmVar.f4620d.put(p, null);
            } else {
                fmVar.f4620d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                in inVar = fmVar.f4619c;
                if (inVar.f7118b) {
                    inVar.m3870b();
                }
                if (il.m3810a(inVar.f7119c, inVar.f7121e, itemIdAtPosition) >= 0) {
                    Object obj;
                    inVar = fmVar.f4619c;
                    int a = il.m3810a(inVar.f7119c, inVar.f7121e, itemIdAtPosition);
                    if (a < 0) {
                        obj = null;
                    } else if (inVar.f7120d[a] != in.f7117a) {
                        obj = inVar.f7120d[a];
                    } else {
                        obj = null;
                    }
                    View view2 = (View) obj;
                    if (view2 != null) {
                        jm.m4561a(view2, false);
                        fmVar.f4619c.m3867a(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                jm.m4561a(view, true);
                fmVar.f4619c.m3867a(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: c */
    private final void m2146c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                fl flVar = new fl();
                flVar.f4608b = view;
                if (z) {
                    mo1223b(flVar);
                } else {
                    mo1221a(flVar);
                }
                flVar.f4609c.add(this);
                mo1376c(flVar);
                if (z) {
                    ex.m2144a(this.f4308f, view, flVar);
                } else {
                    ex.m2144a(this.f4309g, view, flVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m2146c(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: c */
    void mo1376c(fl flVar) {
        Object obj = null;
        if (this.f4315m != null && !flVar.f4607a.isEmpty()) {
            String[] c = this.f4315m.m7121c();
            if (c != null) {
                for (Object containsKey : c) {
                    if (!flVar.f4607a.containsKey(containsKey)) {
                        break;
                    }
                }
                obj = 1;
                if (obj == null) {
                    this.f4315m.m7119a();
                }
            }
        }
    }

    /* renamed from: a */
    final void m2156a(ViewGroup viewGroup, boolean z) {
        int i;
        int i2 = 0;
        m2161a(z);
        if (this.f4306d.size() > 0) {
            i = 0;
        } else if (this.f4307e.size() > 0) {
            i = 0;
        } else {
            m2146c(viewGroup, z);
            return;
        }
        while (i < this.f4306d.size()) {
            View findViewById = viewGroup.findViewById(((Integer) this.f4306d.get(i)).intValue());
            if (findViewById != null) {
                fl flVar = new fl();
                flVar.f4608b = findViewById;
                if (z) {
                    mo1223b(flVar);
                } else {
                    mo1221a(flVar);
                }
                flVar.f4609c.add(this);
                mo1376c(flVar);
                if (z) {
                    ex.m2144a(this.f4308f, findViewById, flVar);
                } else {
                    ex.m2144a(this.f4309g, findViewById, flVar);
                }
            }
            i++;
        }
        while (i2 < this.f4307e.size()) {
            findViewById = (View) this.f4307e.get(i2);
            fl flVar2 = new fl();
            flVar2.f4608b = findViewById;
            if (z) {
                mo1223b(flVar2);
            } else {
                mo1221a(flVar2);
            }
            flVar2.f4609c.add(this);
            mo1376c(flVar2);
            if (z) {
                ex.m2144a(this.f4308f, findViewById, flVar2);
            } else {
                ex.m2144a(this.f4309g, findViewById, flVar2);
            }
            i2++;
        }
    }

    /* renamed from: a */
    final void m2161a(boolean z) {
        if (z) {
            this.f4308f.f4617a.clear();
            this.f4308f.f4618b.clear();
            this.f4308f.f4619c.m3865a();
            return;
        }
        this.f4309g.f4617a.clear();
        this.f4309g.f4618b.clear();
        this.f4309g.f4619c.m3865a();
    }

    /* renamed from: b */
    public ex mo1372b() {
        try {
            ex exVar = (ex) super.clone();
            exVar.f4323x = new ArrayList();
            exVar.f4308f = new fm();
            exVar.f4309g = new fm();
            exVar.f4312j = null;
            exVar.f4313k = null;
            return exVar;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public /* synthetic */ Object clone() {
        return mo1372b();
    }

    /* renamed from: a */
    public Animator mo1220a(ViewGroup viewGroup, fl flVar, fl flVar2) {
        return null;
    }

    /* renamed from: a */
    protected void mo1368a(ViewGroup viewGroup, fm fmVar, fm fmVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ih d = ex.m2147d();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            fl flVar;
            fl flVar2 = (fl) arrayList.get(i2);
            fl flVar3 = (fl) arrayList2.get(i2);
            if (flVar2 == null) {
                flVar = flVar2;
            } else if (flVar2.f4609c.contains(this)) {
                flVar = flVar2;
            } else {
                flVar = null;
            }
            if (!(flVar3 == null || flVar3.f4609c.contains(this))) {
                flVar3 = null;
            }
            if (flVar != null || flVar3 != null) {
                Object obj = flVar == null ? 1 : flVar3 != null ? !mo1425a(flVar, flVar3) ? null : 1 : 1;
                if (obj != null) {
                    Animator a = mo1220a(viewGroup, flVar, flVar3);
                    if (a != null) {
                        fl flVar4;
                        Object obj2;
                        View view;
                        if (flVar3 != null) {
                            Object obj3;
                            View view2 = flVar3.f4608b;
                            String[] a2 = mo1222a();
                            Animator animator;
                            if (view2 == null) {
                                flVar2 = null;
                                animator = a;
                            } else if (a2 == null) {
                                flVar2 = null;
                                animator = a;
                            } else if (a2.length > 0) {
                                flVar = new fl();
                                flVar.f4608b = view2;
                                flVar2 = (fl) fmVar2.f4617a.get(view2);
                                if (flVar2 != null) {
                                    for (Object obj4 : a2) {
                                        Map map = flVar.f4607a;
                                        map.put(obj4, flVar2.f4607a.get(obj4));
                                    }
                                }
                                int size2 = d.size();
                                for (i = 0; i < size2; i++) {
                                    fa faVar = (fa) d.get((Animator) d.m4356b(i));
                                    if (faVar.f4398c != null && faVar.f4396a == view2 && faVar.f4397b.equals(this.f4318r) && faVar.f4398c.equals(flVar)) {
                                        obj3 = null;
                                        flVar2 = flVar;
                                        break;
                                    }
                                }
                                flVar2 = flVar;
                                animator = a;
                            } else {
                                flVar2 = null;
                                animator = a;
                            }
                            flVar4 = flVar2;
                            obj2 = obj3;
                            view = view2;
                        } else {
                            view = flVar.f4608b;
                            flVar4 = null;
                            Animator animator2 = a;
                        }
                        if (obj2 != null) {
                            ax axVar = this.f4315m;
                            if (axVar != null) {
                                long d2 = axVar.m7122d();
                                sparseIntArray.put(this.f4323x.size(), (int) d2);
                                j = Math.min(d2, j);
                            }
                            d.put(obj2, new fa(view, this.f4318r, this, fo.m2350a(viewGroup), flVar4));
                            this.f4323x.add(obj2);
                        }
                    }
                }
            }
        }
        if (j != 0) {
            for (i = 0; i < sparseIntArray.size(); i++) {
                Animator animator3 = (Animator) this.f4323x.get(sparseIntArray.keyAt(i));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i)) - j) + animator3.getStartDelay());
            }
        }
    }

    /* renamed from: c */
    protected final void m2170c() {
        this.f4319t--;
        if (this.f4319t == 0) {
            int i;
            View view;
            ArrayList arrayList = this.f4322w;
            if (arrayList == null) {
                i = 0;
            } else if (arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4322w.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((fc) arrayList.get(i2)).mo1274a(this);
                }
                i = 0;
            } else {
                i = 0;
            }
            while (i < this.f4308f.f4619c.m3871c()) {
                view = (View) this.f4308f.f4619c.m3868b(i);
                if (view != null) {
                    jm.m4561a(view, false);
                }
                i++;
            }
            for (i = 0; i < this.f4309g.f4619c.m3871c(); i++) {
                view = (View) this.f4309g.f4619c.m3868b(i);
                if (view != null) {
                    jm.m4561a(view, false);
                }
            }
            this.f4321v = true;
        }
    }

    /* renamed from: a */
    final fl m2153a(View view, boolean z) {
        ArrayList arrayList;
        while (true) {
            ex exVar = this.f4310h;
            if (exVar == null) {
                break;
            }
            this = exVar;
        }
        if (z) {
            arrayList = this.f4312j;
        } else {
            arrayList = this.f4313k;
        }
        if (arrayList == null) {
            return null;
        }
        fl flVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            flVar = (fl) arrayList.get(i);
            if (flVar != null) {
                if (flVar.f4608b == view) {
                    break;
                }
                i++;
            } else {
                return null;
            }
        }
        i = -1;
        if (i >= 0) {
            ArrayList arrayList2;
            if (z) {
                arrayList2 = this.f4313k;
            } else {
                arrayList2 = this.f4312j;
            }
            flVar = (fl) arrayList2.get(i);
        } else {
            flVar = null;
        }
        return flVar;
    }

    /* renamed from: d */
    static ih m2147d() {
        ih ihVar = (ih) f4302s.get();
        if (ihVar != null) {
            return ihVar;
        }
        ihVar = new ih();
        f4302s.set(ihVar);
        return ihVar;
    }

    /* renamed from: a */
    public String[] mo1222a() {
        return null;
    }

    /* renamed from: b */
    public final fl m2167b(View view, boolean z) {
        fm fmVar;
        while (true) {
            ex exVar = this.f4310h;
            if (exVar == null) {
                break;
            }
            this = exVar;
        }
        if (z) {
            fmVar = this.f4308f;
        } else {
            fmVar = this.f4309g;
        }
        return (fl) fmVar.f4617a.get(view);
    }

    /* renamed from: a */
    public boolean mo1425a(fl flVar, fl flVar2) {
        if (flVar == null) {
            return false;
        }
        if (flVar2 == null) {
            return false;
        }
        String[] a = mo1222a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!ex.m2145a(flVar, flVar2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : flVar.f4607a.keySet()) {
            if (ex.m2145a(flVar, flVar2, a2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    final boolean m2169b(View view) {
        int id = view.getId();
        if ((this.f4306d.size() == 0 && this.f4307e.size() == 0) || this.f4306d.contains(Integer.valueOf(id)) || this.f4307e.contains(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2145a(fl flVar, fl flVar2, String str) {
        Object obj = flVar.f4607a.get(str);
        Object obj2 = flVar2.f4607a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return obj.equals(obj2) ^ 1;
    }

    /* renamed from: c */
    public void mo1375c(View view) {
        if (!this.f4321v) {
            ih d = ex.m2147d();
            int size = d.size();
            ga a = fo.m2350a(view);
            for (int i = size - 1; i >= 0; i--) {
                fa faVar = (fa) d.m4358d(i);
                if (faVar.f4396a != null && a.equals(faVar.f4399d)) {
                    df.m1596a((Animator) d.m4356b(i));
                }
            }
            ArrayList arrayList = this.f4322w;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4322w.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((fc) arrayList.get(i2)).mo1273a();
                }
            }
            this.f4320u = true;
        }
    }

    /* renamed from: b */
    public ex mo1374b(fc fcVar) {
        ArrayList arrayList = this.f4322w;
        if (arrayList != null) {
            arrayList.remove(fcVar);
            if (this.f4322w.size() == 0) {
                this.f4322w = null;
            }
        }
        return this;
    }

    /* renamed from: d */
    public ex mo1378d(View view) {
        this.f4307e.remove(view);
        return this;
    }

    /* renamed from: e */
    public void mo1380e(View view) {
        if (this.f4320u) {
            if (!this.f4321v) {
                ih d = ex.m2147d();
                int size = d.size();
                ga a = fo.m2350a(view);
                for (int i = size - 1; i >= 0; i--) {
                    fa faVar = (fa) d.m4358d(i);
                    if (faVar.f4396a != null && a.equals(faVar.f4399d)) {
                        df.m1610b((Animator) d.m4356b(i));
                    }
                }
                ArrayList arrayList = this.f4322w;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList = (ArrayList) this.f4322w.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((fc) arrayList.get(i2)).mo1275b();
                    }
                }
            }
            this.f4320u = false;
        }
    }

    /* renamed from: e */
    protected void mo1379e() {
        m2176f();
        ih d = ex.m2147d();
        ArrayList arrayList = this.f4323x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Animator animator = (Animator) arrayList.get(i);
            if (d.containsKey(animator)) {
                m2176f();
                if (animator != null) {
                    animator.addListener(new ey(this, d));
                    if (animator == null) {
                        m2170c();
                        i = i2;
                    } else {
                        long j = this.f4304b;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        j = this.f4303a;
                        if (j >= 0) {
                            animator.setStartDelay(j);
                        }
                        TimeInterpolator timeInterpolator = this.f4305c;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new ez(this));
                        animator.start();
                        i = i2;
                    }
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        this.f4323x.clear();
        m2170c();
    }

    /* renamed from: a */
    public ex mo1363a(long j) {
        this.f4304b = j;
        return this;
    }

    /* renamed from: a */
    public void mo1371a(fb fbVar) {
        this.f4316n = fbVar;
    }

    /* renamed from: a */
    public ex mo1364a(TimeInterpolator timeInterpolator) {
        this.f4305c = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public void mo1370a(eu euVar) {
        if (euVar == null) {
            this.f4317o = f4301q;
        } else {
            this.f4317o = euVar;
        }
    }

    /* renamed from: a */
    public void mo1369a(ax axVar) {
        this.f4315m = axVar;
    }

    /* renamed from: b */
    public ex mo1373b(long j) {
        this.f4303a = j;
        return this;
    }

    /* renamed from: f */
    protected final void m2176f() {
        if (this.f4319t == 0) {
            ArrayList arrayList = this.f4322w;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4322w.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fc) arrayList.get(i)).mo1276c();
                }
            }
            this.f4321v = false;
        }
        this.f4319t++;
    }

    public String toString() {
        return mo1367a("");
    }

    /* renamed from: a */
    String mo1367a(String str) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        String stringBuilder2 = stringBuilder.toString();
        if (this.f4304b != -1) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("dur(");
            stringBuilder3.append(this.f4304b);
            stringBuilder3.append(") ");
            stringBuilder2 = stringBuilder3.toString();
        }
        if (this.f4303a != -1) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("dly(");
            stringBuilder3.append(this.f4303a);
            stringBuilder3.append(") ");
            stringBuilder2 = stringBuilder3.toString();
        }
        if (this.f4305c != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("interp(");
            stringBuilder3.append(this.f4305c);
            stringBuilder3.append(") ");
            stringBuilder2 = stringBuilder3.toString();
        }
        if (this.f4306d.size() <= 0 && this.f4307e.size() <= 0) {
            return stringBuilder2;
        }
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("tgts(");
        stringBuilder2 = stringBuilder3.toString();
        if (this.f4306d.size() > 0) {
            String str2 = stringBuilder2;
            for (int i2 = 0; i2 < this.f4306d.size(); i2++) {
                StringBuilder stringBuilder4;
                if (i2 > 0) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(str2);
                    stringBuilder4.append(", ");
                    str2 = stringBuilder4.toString();
                }
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append(this.f4306d.get(i2));
                str2 = stringBuilder4.toString();
            }
            stringBuilder2 = str2;
        }
        if (this.f4307e.size() > 0) {
            while (i < this.f4307e.size()) {
                if (i > 0) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(", ");
                    stringBuilder2 = stringBuilder3.toString();
                }
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(this.f4307e.get(i));
                stringBuilder2 = stringBuilder3.toString();
                i++;
            }
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(")");
        return stringBuilder5.toString();
    }
}
