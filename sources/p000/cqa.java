package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;

/* compiled from: PG */
/* renamed from: cqa */
public final class cqa extends cpp {
    /* renamed from: c */
    private cqo f20774c;

    public cqa(Context context, hfz hfz, cqo cqo, cqf cqf) {
        super(context, hfz);
        jri.m13152b((Object) cqo);
        this.f20774c = cqo;
    }

    /* renamed from: a */
    public final void mo1002a() {
        this.b.mo1002a();
        mo1004a(this.f20774c);
    }

    /* renamed from: a */
    public final View mo999a(View view, cre cre, cpx cpx) {
        err e = cre.mo1066e();
        err err = this.f20774c;
        if (e == err) {
            return err.mo1041a(kbg.m4744b(view), this.b, false, cpx);
        }
        return this.b.mo999a(view, cre, cpx);
    }

    /* renamed from: b */
    public final void mo1014b(cre cre) {
        if (cre == cre.f2587c || cre.mo1066e() == this.f20774c) {
            throw new UnsupportedOperationException("cannot remove fixed last item node");
        }
        this.b.mo1014b(cre);
    }

    /* renamed from: f */
    public final AsyncTask mo1024f(int i) {
        if (i != this.b.mo1019d() - 1) {
            return this.b.mo1024f(i);
        }
        cqf.m1406a(this.a, this.f20774c);
        return null;
    }

    /* renamed from: a */
    public final void mo1005a(cre cre, err err) {
        if (cre == cre.f2587c || cre.mo1066e() == this.f20774c) {
            throw new UnsupportedOperationException("cannot update fixed last item");
        }
        this.b.mo1005a(cre, err);
    }
}
