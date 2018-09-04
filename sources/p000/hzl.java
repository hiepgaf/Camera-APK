package p000;

import android.os.AsyncTask;

/* renamed from: hzl */
final class hzl extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ huq f6844a;
    /* renamed from: b */
    public final /* synthetic */ hzn f6845b;

    hzl(huq huq, hzn hzn) {
        this.f6844a = huq;
        this.f6845b = hzn;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.f6844a.mo1826a().m15094b()) {
            this.f6845b.mo1789b().mo1807a(new hzm(this));
        } else {
            this.f6845b.mo1788a();
            this.f6844a.mo1832c();
        }
        return null;
    }
}
