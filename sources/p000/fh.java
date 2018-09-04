package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fh */
public final class fh extends ex {
    /* renamed from: p */
    public ArrayList f16005p;
    /* renamed from: q */
    public boolean f16006q;
    /* renamed from: r */
    public int f16007r;
    /* renamed from: s */
    public boolean f16008s;
    /* renamed from: t */
    private int f16009t;

    public fh() {
        this.f16005p = new ArrayList();
        this.f16006q = true;
        this.f16008s = false;
        this.f16009t = 0;
    }

    public fh(byte b) {
        this();
        this.f16006q = false;
        m10353a(new eo(2)).m10353a(new ee()).m10353a(new eo(1));
    }

    /* renamed from: a */
    public final /* synthetic */ ex mo1366a(fc fcVar) {
        return (fh) super.mo1366a(fcVar);
    }

    /* renamed from: a */
    public final /* synthetic */ ex mo1365a(View view) {
        for (int i = 0; i < this.f16005p.size(); i++) {
            ((ex) this.f16005p.get(i)).mo1365a(view);
        }
        return (fh) super.mo1365a(view);
    }

    /* renamed from: a */
    public final fh m10353a(ex exVar) {
        this.f16005p.add(exVar);
        exVar.f4310h = this;
        if (this.b >= 0) {
            exVar.mo1363a(this.b);
        }
        if ((this.f16009t & 1) != 0) {
            exVar.mo1364a(this.f4305c);
        }
        if ((this.f16009t & 2) != 0) {
            exVar.mo1369a(this.f4315m);
        }
        if ((this.f16009t & 4) != 0) {
            exVar.mo1370a(this.f4317o);
        }
        if ((this.f16009t & 8) != 0) {
            exVar.mo1371a(this.f4316n);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo1221a(fl flVar) {
        if (m2169b(flVar.f4608b)) {
            ArrayList arrayList = this.f16005p;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ex exVar = (ex) arrayList.get(i);
                if (exVar.m2169b(flVar.f4608b)) {
                    exVar.mo1221a(flVar);
                    flVar.f4609c.add(exVar);
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    /* renamed from: c */
    final void mo1376c(fl flVar) {
        super.mo1376c(flVar);
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            ((ex) this.f16005p.get(i)).mo1376c(flVar);
        }
    }

    /* renamed from: b */
    public final void mo1223b(fl flVar) {
        if (m2169b(flVar.f4608b)) {
            ArrayList arrayList = this.f16005p;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ex exVar = (ex) arrayList.get(i);
                if (exVar.m2169b(flVar.f4608b)) {
                    exVar.mo1223b(flVar);
                    flVar.f4609c.add(exVar);
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    /* renamed from: b */
    public final ex mo1372b() {
        fh fhVar = (fh) super.mo1372b();
        fhVar.f16005p = new ArrayList();
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            fhVar.m10353a(((ex) this.f16005p.get(i)).mo1372b());
        }
        return fhVar;
    }

    public final /* synthetic */ Object clone() {
        return mo1372b();
    }

    /* renamed from: a */
    protected final void mo1368a(ViewGroup viewGroup, fm fmVar, fm fmVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f4303a;
        int size = this.f16005p.size();
        int i = 0;
        while (i < size) {
            ex exVar = (ex) this.f16005p.get(i);
            if (j > 0 && (this.f16006q || i == 0)) {
                long j2 = exVar.f4303a;
                if (j2 > 0) {
                    exVar.mo1373b(j2 + j);
                } else {
                    exVar.mo1373b(j);
                }
            }
            exVar.mo1368a(viewGroup, fmVar, fmVar2, arrayList, arrayList2);
            i++;
        }
    }

    /* renamed from: a */
    public final ex m10348a(int i) {
        if (i < 0 || i >= this.f16005p.size()) {
            return null;
        }
        return (ex) this.f16005p.get(i);
    }

    /* renamed from: c */
    public final void mo1375c(View view) {
        super.mo1375c(view);
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            ((ex) this.f16005p.get(i)).mo1375c(view);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ ex mo1374b(fc fcVar) {
        return (fh) super.mo1374b(fcVar);
    }

    /* renamed from: d */
    public final /* synthetic */ ex mo1378d(View view) {
        for (int i = 0; i < this.f16005p.size(); i++) {
            ((ex) this.f16005p.get(i)).mo1378d(view);
        }
        return (fh) super.mo1378d(view);
    }

    /* renamed from: e */
    public final void mo1380e(View view) {
        super.mo1380e(view);
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            ((ex) this.f16005p.get(i)).mo1380e(view);
        }
    }

    /* renamed from: e */
    protected final void mo1379e() {
        if (this.f16005p.isEmpty()) {
            m2176f();
            m2170c();
            return;
        }
        fc fjVar = new fj(this);
        ArrayList arrayList = this.f16005p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((ex) arrayList.get(i)).mo1366a(fjVar);
            i = i2;
        }
        this.f16007r = this.f16005p.size();
        if (this.f16006q) {
            ArrayList arrayList2 = this.f16005p;
            int size2 = arrayList2.size();
            i = 0;
            while (i < size2) {
                i2 = i + 1;
                ((ex) arrayList2.get(i)).mo1379e();
                i = i2;
            }
            return;
        }
        for (int i3 = 1; i3 < this.f16005p.size(); i3++) {
            ((ex) this.f16005p.get(i3 - 1)).mo1366a(new fi((ex) this.f16005p.get(i3)));
        }
        ex exVar = (ex) this.f16005p.get(0);
        if (exVar != null) {
            exVar.mo1379e();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ ex mo1363a(long j) {
        super.mo1363a(j);
        if (this.b >= 0) {
            int size = this.f16005p.size();
            for (int i = 0; i < size; i++) {
                ((ex) this.f16005p.get(i)).mo1363a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo1371a(fb fbVar) {
        super.mo1371a(fbVar);
        this.f16009t |= 8;
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            ((ex) this.f16005p.get(i)).mo1371a(fbVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ ex mo1364a(TimeInterpolator timeInterpolator) {
        this.f16009t |= 1;
        ArrayList arrayList = this.f16005p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ex) this.f16005p.get(i)).mo1364a(timeInterpolator);
            }
        }
        return (fh) super.mo1364a(timeInterpolator);
    }

    /* renamed from: a */
    public final void mo1370a(eu euVar) {
        super.mo1370a(euVar);
        this.f16009t |= 4;
        for (int i = 0; i < this.f16005p.size(); i++) {
            ((ex) this.f16005p.get(i)).mo1370a(euVar);
        }
    }

    /* renamed from: a */
    public final void mo1369a(ax axVar) {
        super.mo1369a(axVar);
        this.f16009t |= 2;
        int size = this.f16005p.size();
        for (int i = 0; i < size; i++) {
            ((ex) this.f16005p.get(i)).mo1369a(axVar);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ ex mo1373b(long j) {
        return (fh) super.mo1373b(j);
    }

    /* renamed from: a */
    final String mo1367a(String str) {
        String a = super.mo1367a(str);
        int i = 0;
        while (i < this.f16005p.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            ex exVar = (ex) this.f16005p.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(exVar.mo1367a(stringBuilder2.toString()));
            i++;
            a = stringBuilder.toString();
        }
        return a;
    }
}
