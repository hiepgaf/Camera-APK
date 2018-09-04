package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: enf */
public final class enf implements eof, eoh, eoj, eok, eol {
    /* renamed from: a */
    public final List f15297a = new ArrayList();
    /* renamed from: b */
    public enw f15298b;
    /* renamed from: c */
    private final List f15299c = new ArrayList();
    /* renamed from: d */
    private int f15300d = 0;
    /* renamed from: e */
    private int f15301e = 0;
    /* renamed from: f */
    private enw f15302f;
    /* renamed from: g */
    private enw f15303g;

    /* renamed from: a */
    public final enw m9761a(enw enw) {
        for (eol a : this.f15297a) {
            enw.mo1236a(a);
        }
        this.f15299c.add(enw);
        return enw;
    }

    /* renamed from: a */
    public final eol m9762a(eol eol) {
        this.f15297a.add(eol);
        for (enw a : this.f15299c) {
            a.mo1236a(eol);
        }
        return eol;
    }

    /* renamed from: g */
    public final void mo379g() {
        boolean z;
        this.f15301e--;
        if (this.f15301e >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (this.f15301e == 0) {
            m9763b(this.f15303g);
            for (eol eol : this.f15297a) {
                if (eol instanceof enk) {
                    ((enk) eol).mo1241a();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo380h() {
        boolean z;
        this.f15301e++;
        if (this.f15301e > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (this.f15301e == 1) {
            this.f15303g = m9761a(new eni());
        }
    }

    /* renamed from: i */
    public final void mo381i() {
        boolean z;
        this.f15300d++;
        if (this.f15300d > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (this.f15300d == 1) {
            this.f15302f = m9761a(new enh());
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        boolean z;
        this.f15300d--;
        if (this.f15300d >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (this.f15300d == 0) {
            m9763b(this.f15302f);
            for (eol eol : this.f15297a) {
                if (eol instanceof enn) {
                    ((enn) eol).mo1243c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9763b(enw enw) {
        this.f15299c.remove(enw);
    }
}
