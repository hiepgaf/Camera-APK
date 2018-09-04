package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: rv */
public final class rv extends ve {
    /* renamed from: m */
    private static TimeInterpolator f22558m;
    /* renamed from: a */
    public ArrayList f22559a = new ArrayList();
    /* renamed from: b */
    public ArrayList f22560b = new ArrayList();
    /* renamed from: c */
    public ArrayList f22561c = new ArrayList();
    /* renamed from: d */
    public ArrayList f22562d = new ArrayList();
    /* renamed from: e */
    public ArrayList f22563e = new ArrayList();
    /* renamed from: f */
    public ArrayList f22564f = new ArrayList();
    /* renamed from: g */
    public ArrayList f22565g = new ArrayList();
    /* renamed from: n */
    private ArrayList f22566n = new ArrayList();
    /* renamed from: o */
    private ArrayList f22567o = new ArrayList();
    /* renamed from: p */
    private ArrayList f22568p = new ArrayList();
    /* renamed from: q */
    private ArrayList f22569q = new ArrayList();

    /* renamed from: a */
    public final boolean mo3330a(ux uxVar) {
        m16780g(uxVar);
        uxVar.f9369a.setAlpha(0.0f);
        this.f22567o.add(uxVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3333a(ux uxVar, ux uxVar2, int i, int i2, int i3, int i4) {
        if (uxVar == uxVar2) {
            return mo3331a(uxVar, i, i2, i3, i4);
        }
        float translationX = uxVar.f9369a.getTranslationX();
        float translationY = uxVar.f9369a.getTranslationY();
        float alpha = uxVar.f9369a.getAlpha();
        m16780g(uxVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        uxVar.f9369a.setTranslationX(translationX);
        uxVar.f9369a.setTranslationY(translationY);
        uxVar.f9369a.setAlpha(alpha);
        if (uxVar2 != null) {
            m16780g(uxVar2);
            uxVar2.f9369a.setTranslationX((float) (-i5));
            uxVar2.f9369a.setTranslationY((float) (-i6));
            uxVar2.f9369a.setAlpha(0.0f);
        }
        this.f22569q.add(new se(uxVar, uxVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo3331a(ux uxVar, int i, int i2, int i3, int i4) {
        View view = uxVar.f9369a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) uxVar.f9369a.getTranslationY());
        m16780g(uxVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m5911f(uxVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f22568p.add(new sf(uxVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: b */
    public final boolean mo3335b(ux uxVar) {
        m16780g(uxVar);
        this.f22566n.add(uxVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3332a(ux uxVar, List list) {
        return !list.isEmpty() || super.mo3332a(uxVar, list);
    }

    /* renamed from: a */
    private static void m16776a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((ux) list.get(size)).f9369a.animate().cancel();
        }
    }

    /* renamed from: a */
    final void m16781a() {
        if (!mo3337c()) {
            m5909e();
        }
    }

    /* renamed from: c */
    public final void mo3336c(ux uxVar) {
        int size;
        View view = uxVar.f9369a;
        view.animate().cancel();
        for (size = this.f22568p.size() - 1; size >= 0; size--) {
            if (((sf) this.f22568p.get(size)).f9196a == uxVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5911f(uxVar);
                this.f22568p.remove(size);
            }
        }
        m16777a(this.f22569q, uxVar);
        if (this.f22566n.remove(uxVar)) {
            view.setAlpha(1.0f);
            m5911f(uxVar);
        }
        if (this.f22567o.remove(uxVar)) {
            view.setAlpha(1.0f);
            m5911f(uxVar);
        }
        for (size = this.f22561c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.f22561c.get(size);
            m16777a(list, uxVar);
            if (list.isEmpty()) {
                this.f22561c.remove(size);
            }
        }
        for (int size2 = this.f22560b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f22560b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((sf) arrayList.get(size3)).f9196a == uxVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5911f(uxVar);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f22560b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.f22559a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.f22559a.get(size);
            if (arrayList.remove(uxVar)) {
                view.setAlpha(1.0f);
                m5911f(uxVar);
                if (arrayList.isEmpty()) {
                    this.f22559a.remove(size);
                }
            }
        }
        this.f22564f.remove(uxVar);
        this.f22562d.remove(uxVar);
        this.f22565g.remove(uxVar);
        this.f22563e.remove(uxVar);
        m16781a();
    }

    /* renamed from: b */
    public final void mo3334b() {
        int size;
        for (size = this.f22568p.size() - 1; size >= 0; size--) {
            sf sfVar = (sf) this.f22568p.get(size);
            View view = sfVar.f9196a.f9369a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5911f(sfVar.f9196a);
            this.f22568p.remove(size);
        }
        for (size = this.f22566n.size() - 1; size >= 0; size--) {
            m5911f((ux) this.f22566n.get(size));
            this.f22566n.remove(size);
        }
        for (size = this.f22567o.size() - 1; size >= 0; size--) {
            ux uxVar = (ux) this.f22567o.get(size);
            uxVar.f9369a.setAlpha(1.0f);
            m5911f(uxVar);
            this.f22567o.remove(size);
        }
        for (size = this.f22569q.size() - 1; size >= 0; size--) {
            m16778a((se) this.f22569q.get(size));
        }
        this.f22569q.clear();
        if (mo3337c()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.f22560b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f22560b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    sf sfVar2 = (sf) arrayList.get(size3);
                    View view2 = sfVar2.f9196a.f9369a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5911f(sfVar2.f9196a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f22560b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f22559a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f22559a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ux uxVar2 = (ux) arrayList.get(size3);
                    uxVar2.f9369a.setAlpha(1.0f);
                    m5911f(uxVar2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f22559a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f22561c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f22561c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    m16778a((se) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.f22561c.remove(arrayList);
                    }
                }
            }
            rv.m16776a(this.f22564f);
            rv.m16776a(this.f22563e);
            rv.m16776a(this.f22562d);
            rv.m16776a(this.f22565g);
            m5909e();
        }
    }

    /* renamed from: a */
    private final void m16777a(List list, ux uxVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            se seVar = (se) list.get(size);
            if (m16779a(seVar, uxVar) && seVar.f9190a == null && seVar.f9191b == null) {
                list.remove(seVar);
            }
        }
    }

    /* renamed from: a */
    private final void m16778a(se seVar) {
        ux uxVar = seVar.f9190a;
        if (uxVar != null) {
            m16779a(seVar, uxVar);
        }
        uxVar = seVar.f9191b;
        if (uxVar != null) {
            m16779a(seVar, uxVar);
        }
    }

    /* renamed from: a */
    private final boolean m16779a(se seVar, ux uxVar) {
        if (seVar.f9191b == uxVar) {
            seVar.f9191b = null;
        } else if (seVar.f9190a != uxVar) {
            return false;
        } else {
            seVar.f9190a = null;
        }
        uxVar.f9369a.setAlpha(1.0f);
        uxVar.f9369a.setTranslationX(0.0f);
        uxVar.f9369a.setTranslationY(0.0f);
        m5911f(uxVar);
        return true;
    }

    /* renamed from: c */
    public final boolean mo3337c() {
        return (this.f22567o.isEmpty() && this.f22569q.isEmpty() && this.f22568p.isEmpty() && this.f22566n.isEmpty() && this.f22563e.isEmpty() && this.f22564f.isEmpty() && this.f22562d.isEmpty() && this.f22565g.isEmpty() && this.f22560b.isEmpty() && this.f22559a.isEmpty() && this.f22561c.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    private final void m16780g(ux uxVar) {
        if (f22558m == null) {
            f22558m = new ValueAnimator().getInterpolator();
        }
        uxVar.f9369a.animate().setInterpolator(f22558m);
        mo3336c(uxVar);
    }

    /* renamed from: d */
    public final void mo3338d() {
        int isEmpty = this.f22566n.isEmpty() ^ 1;
        int isEmpty2 = this.f22568p.isEmpty() ^ 1;
        int isEmpty3 = this.f22569q.isEmpty() ^ 1;
        int isEmpty4 = this.f22567o.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            ArrayList arrayList;
            Runnable rwVar;
            ArrayList arrayList2 = this.f22566n;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ux uxVar = (ux) arrayList2.get(i);
                View view = uxVar.f9369a;
                ViewPropertyAnimator animate = view.animate();
                this.f22564f.add(uxVar);
                animate.setDuration(this.f9300j).alpha(0.0f).setListener(new rz(this, uxVar, animate, view)).start();
                i = i2;
            }
            this.f22566n.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f22568p);
                this.f22560b.add(arrayList);
                this.f22568p.clear();
                rwVar = new rw(this, arrayList);
                if (isEmpty != 0) {
                    jm.m4557a(((sf) arrayList.get(0)).f9196a.f9369a, rwVar, this.f9300j);
                } else {
                    rwVar.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f22569q);
                this.f22561c.add(arrayList);
                this.f22569q.clear();
                rwVar = new rx(this, arrayList);
                if (isEmpty != 0) {
                    jm.m4557a(((se) arrayList.get(0)).f9190a.f9369a, rwVar, this.f9300j);
                } else {
                    rwVar.run();
                }
            }
            if (isEmpty4 != 0) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f22567o);
                this.f22559a.add(arrayList3);
                this.f22567o.clear();
                Runnable ryVar = new ry(this, arrayList3);
                if (isEmpty == 0 && isEmpty2 == 0 && isEmpty3 == 0) {
                    ryVar.run();
                    return;
                }
                long j;
                long j2;
                long j3;
                if (isEmpty != 0) {
                    j = this.f9300j;
                } else {
                    j = 0;
                }
                if (isEmpty2 != 0) {
                    j2 = this.f9301k;
                } else {
                    j2 = 0;
                }
                if (isEmpty3 != 0) {
                    j3 = this.f9302l;
                } else {
                    j3 = 0;
                }
                jm.m4557a(((ux) arrayList3.get(0)).f9369a, ryVar, Math.max(j2, j3) + j);
            }
        }
    }
}
