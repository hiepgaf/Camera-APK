package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: eot */
final class eot extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ kpw f3993a;
    /* renamed from: b */
    public final /* synthetic */ eos f3994b;
    /* renamed from: c */
    private final /* synthetic */ boolean f3995c;

    eot(eos eos, kpw kpw, boolean z) {
        this.f3994b = eos;
        this.f3993a = kpw;
        this.f3995c = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return Boolean.valueOf(eos.m9777a(this.f3994b.f15312d));
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            eos eos = this.f3994b;
            boolean z = this.f3995c;
            eos.f15313e = z;
            if (z) {
                if (eos.f15311c != null) {
                    this.f3993a.mo3557a(Boolean.valueOf(true));
                }
                kow.m13622a(this.f3994b.f15310b.m11858a(), new eou(this), kpq.f8410a);
                return;
            }
            eos.m9786d();
            this.f3993a.mo3557a(Boolean.valueOf(false));
            return;
        }
        this.f3993a.mo3557a(Boolean.valueOf(false));
        bli.m873e(eos.f15307a, "Location services not enabled, ignoring location request");
    }
}
