package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cpj */
final class cpj extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ coy f2540a;

    cpj(coy coy) {
        this.f2540a = coy;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        int i = 0;
        crb[] crbArr = (crb[]) objArr;
        this.f2540a.f12457l.mo1903a("RemoveDeletedTask");
        crb crb = crbArr[0];
        List arrayList = new ArrayList();
        Set hashSet = new HashSet();
        cqm cqm = this.f2540a.f12450e;
        hashSet.addAll(cpn.m1393a(cqm.f12523a, cqk.f2564a, new String[]{"_id"}, "datetaken DESC"));
        cqx cqx = this.f2540a.f12451f;
        hashSet.addAll(cpn.m1393a(cqx.f12545c, cqr.f2568a, new String[]{"_id"}, "datetaken DESC, _id DESC"));
        while (i < crb.f2583d.f2576c) {
            err e = crb.m1424a(i).mo1066e();
            eru g = e.mo1033g();
            if (!(g.f4156i || e == this.f2540a.f12458m || g.mo996a(hashSet))) {
                arrayList.add(g.f4155h);
            }
            i++;
        }
        this.f2540a.f12457l.mo1904b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<Uri> list = (List) obj;
        if (this.f2540a.f12449d.mo376d()) {
            bli.m873e(coy.f12446a, "Activity is destroyed. Canceling load.");
            return;
        }
        this.f2540a.f12457l.mo1903a("RemoveDeleted");
        for (Uri a : list) {
            cre a2 = this.f2540a.f12454i.m1425a(a);
            if (a2 != cre.f2587c) {
                this.f2540a.mo1014b(a2);
            }
        }
        this.f2540a.f12457l.mo1904b();
    }
}
