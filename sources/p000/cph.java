package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* renamed from: cph */
final class cph extends AsyncTask {
    /* renamed from: a */
    private final long f2535a;
    /* renamed from: b */
    private final kpw f2536b;
    /* renamed from: c */
    private final /* synthetic */ coy f2537c;

    public cph(coy coy, long j, kpw kpw) {
        this.f2537c = coy;
        this.f2535a = j;
        this.f2536b = kpw;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f2537c.f12457l.mo1903a("LoadNewFilmstripItemsTask.doInBackground");
        List arrayList = new ArrayList();
        if (!this.f2537c.f12459n.get()) {
            String str = coy.f12446a;
            long j = this.f2535a;
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("updating media metadata with photos newer than time: ");
            stringBuilder.append(j);
            bli.m871d(str, stringBuilder.toString());
            cpo cpo = this.f2537c.f12450e;
            arrayList.addAll(cpn.m1392a(cpo.f12523a, cqk.f2564a, cqk.f2565b, this.f2535a, "datetaken DESC", cpo));
            cpo = this.f2537c.f12451f;
            arrayList.addAll(cpn.m1392a(cpo.f12545c, cqr.f2568a, cqr.f2569b, this.f2535a, "datetaken DESC, _id DESC", cpo));
            Collections.sort(arrayList, new cqh(new Date()));
        }
        this.f2537c.f12457l.mo1904b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<err> list = (List) obj;
        this.f2537c.f12457l.mo1903a("LoadNewFilmstripItemsTask.onPostExecute");
        if (this.f2537c.f12449d.mo376d()) {
            bli.m873e(coy.f12446a, "Activity is destroyed. Canceling load.");
        } else if (list != null) {
            String str;
            String str2 = coy.f12446a;
            int size = list.size();
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("new photos query return num items: ");
            stringBuilder.append(size);
            bli.m871d(str2, stringBuilder.toString());
            if (!list.isEmpty()) {
                long a = cpy.m8600a((err) list.get(0));
                str = coy.f12446a;
                long j = this.f2537c.f12456k;
                StringBuilder stringBuilder2 = new StringBuilder(75);
                stringBuilder2.append("updating last item time (old:new) ");
                stringBuilder2.append(j);
                stringBuilder2.append(":");
                stringBuilder2.append(a);
                bli.m871d(str, stringBuilder2.toString());
                coy coy = this.f2537c;
                coy.f12456k = Math.max(coy.f12456k, a);
            }
            for (err err : list) {
                Uri uri = err.mo1033g().f4155h;
                Uri d = this.f2537c.f12452g.mo1645d(uri);
                if (d == null || this.f2537c.mo997a(uri) == crb.f2579a) {
                    String str3 = coy.f12446a;
                    str = String.valueOf(uri);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 24);
                    stringBuilder3.append("updating with new item: ");
                    stringBuilder3.append(str);
                    bli.m871d(str3, stringBuilder3.toString());
                    this.f2537c.mo1009a(err, cov.m8503a(err) ^ 1);
                } else {
                    str2 = coy.f12446a;
                    str = String.valueOf(d);
                    StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 25);
                    stringBuilder4.append("skipping session source: ");
                    stringBuilder4.append(str);
                    bli.m871d(str2, stringBuilder4.toString());
                }
            }
            knk knk = this.f2536b;
            if (knk != null) {
                knk.mo3557a(null);
            }
        } else {
            bli.m873e(coy.f12446a, "null data returned from new photos query");
        }
        this.f2537c.f12457l.mo1904b();
    }
}
