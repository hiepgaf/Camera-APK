package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cpi */
final class cpi extends AsyncTask {
    /* renamed from: a */
    private final boolean f2538a;
    /* renamed from: b */
    private final /* synthetic */ coy f2539b;

    cpi(coy coy, boolean z) {
        this.f2539b = coy;
        this.f2538a = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        this.f2539b.f12457l.mo1903a("MetadataUpdateTask");
        List arrayList = new ArrayList();
        for (Uri a : uriArr) {
            cre a2 = this.f2539b.f12454i.m1425a(a);
            if (a2 != cre.f2587c) {
                err e = a2.mo1066e();
                coy coy = this.f2539b;
                cqf cqf = coy.f12453h;
                if (cqf.m1406a(coy.f12448c, e) || this.f2538a) {
                    arrayList.add(a2);
                }
            }
        }
        this.f2539b.f12457l.mo1904b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<cre> list = (List) obj;
        if (this.f2539b.f12449d.mo376d()) {
            bli.m873e(coy.f12446a, "Activity is destroyed. Canceling load.");
            return;
        }
        this.f2539b.f12457l.mo1903a("MetadataUpdateTask#onPostExecute");
        List arrayList = new ArrayList();
        for (cre e : list) {
            arrayList.add(Integer.valueOf(this.f2539b.mo997a(e.mo1066e().mo1033g().f4155h)));
        }
        this.f2539b.f12447b.mo667a(new csk(arrayList, list));
        cqc cqc = this.f2539b.f12455j;
        if (cqc != null) {
            cfk cfk = cqc.f2556a;
            if (!cfk.f20274Y) {
                cre a = cfk.f20253D.mo1070a();
                if (list.contains(a)) {
                    cfk cfk2 = cqc.f2556a;
                    if (a == cre.f2587c) {
                        bli.m873e(cfk.f20249a, "Current data ID not found.");
                        cfk2.f20263N.m1439a(null);
                        cfk2.f20300z.m1446c(false);
                        cfk2.f20300z.m1447d(false);
                        cfk2.f20300z.m1443a(false);
                        cfk2.f20300z.m1445b(false);
                        cfk2.f20300z.m1444b();
                        cfk2.m14964I();
                    } else {
                        err e2 = a.mo1066e();
                        cfk2.m14985a(e2);
                        cfk2.m14971P();
                        cfk2.f20263N.m1439a(e2);
                        if (cfk2.f20298x) {
                            cfk2.f20300z.m1446c(false);
                            cfk2.f20300z.m1447d(false);
                        } else {
                            if (!cfk2.f20290p.getAndSet(true)) {
                                cfk2.f20289o.mo1903a("NFC#init");
                                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk2.f20280f);
                                if (defaultAdapter != null) {
                                    defaultAdapter.setBeamPushUris(null, (Activity) cfk2.f20292r.get());
                                    defaultAdapter.setBeamPushUrisCallback(new cfq(cfk2), (Activity) cfk2.f20292r.get());
                                    cfk2.f20289o.mo1904b();
                                }
                            }
                            Uri uri = e2.mo1033g().f4155h;
                            if (uri.equals(Uri.EMPTY)) {
                                cfk2.f20291q[0] = null;
                            } else {
                                cfk2.f20291q[0] = uri;
                            }
                        }
                        int a2 = cfk2.f20256G.mo998a(a);
                        if (!cfk2.f20256G.mo1023e(a2)) {
                            cfk2.f20256G.mo1024f(a2);
                        }
                    }
                }
            }
            this.f2539b.f12457l.mo1904b();
        }
    }
}
