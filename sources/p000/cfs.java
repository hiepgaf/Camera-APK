package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cfs */
final class cfs extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ List f1922a;
    /* renamed from: b */
    private final /* synthetic */ cre f1923b;
    /* renamed from: c */
    private final /* synthetic */ Uri f1924c;
    /* renamed from: d */
    private final /* synthetic */ cfr f1925d;

    cfs(cfr cfr, List list, cre cre, Uri uri) {
        this.f1925d = cfr;
        this.f1922a = list;
        this.f1923b = cre;
        this.f1924c = uri;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        List arrayList = new ArrayList(this.f1922a.size());
        for (Uri a : this.f1922a) {
            arrayList.add(new cot(this.f1925d.f11822a.f20259J.m8618a(a)));
        }
        if (arrayList.isEmpty()) {
            bli.m866b(cfk.f20249a, "onSessionDone called with an empty burst");
            return null;
        }
        cov a2 = cov.m8502a(arrayList);
        gev b = this.f1925d.f11822a.aX;
        cfk cfk = this.f1925d.f11822a;
        return new cou(b, cfk.f20278d, cfk.f20280f, cfk.f20255F, a2, cfk.f20288n);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        err err = (cou) obj;
        if (err != null) {
            if (this.f1923b != cre.f2587c && this.f1925d.f11822a.f20262M.mo767k() && this.f1925d.f11822a.f20253D.mo1074a(this.f1923b.mo1066e())) {
                err.f20768a = this.f1925d.f11822a.f20288n.mo1644c(this.f1924c);
            }
            this.f1925d.m8142a(this.f1923b, err);
        }
    }
}
