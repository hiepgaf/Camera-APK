package p000;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: eaw */
final class eaw extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f3474a;
    /* renamed from: b */
    private final /* synthetic */ String f3475b;
    /* renamed from: c */
    private final /* synthetic */ long f3476c;
    /* renamed from: d */
    private final /* synthetic */ String f3477d;
    /* renamed from: e */
    private final /* synthetic */ eaq f3478e;

    eaw(eaq eaq, AtomicReference atomicReference, String str, long j, String str2) {
        this.f3478e = eaq;
        this.f3474a = atomicReference;
        this.f3475b = str;
        this.f3476c = j;
        this.f3477d = str2;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f3478e.m9590a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        eay eay = (eay) obj;
        gkr gkr = (gkr) this.f3474a.get();
        InputStream byteArrayInputStream = new ByteArrayInputStream(eay.f3480a);
        int i = eay.f3481b;
        kpk a = gkr.mo1479a(byteArrayInputStream, new glz(iqp.m4043a(i, i), ixx.JPEG));
        this.f3478e.f14868g.dismiss();
        this.f3478e.dismiss();
        a.mo1985a(new eax(this.f3474a), new ikd());
    }

    protected final void onPreExecute() {
        this.f3474a.set(this.f3478e.f14864c.m2590a(this.f3475b, this.f3476c, kau.f19138a));
        this.f3478e.f14863b.mo1504a((gkr) this.f3474a.get());
        ((gkr) this.f3474a.get()).mo2872a(iqp.m4043a(0, 0), glw.RENDER_PHOTO);
        eaq eaq = this.f3478e;
        eaq.f14868g = ProgressDialog.show(eaq.getActivity(), null, this.f3477d, true, false);
    }
}
