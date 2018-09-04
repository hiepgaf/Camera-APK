package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: abi */
public class abi {
    /* renamed from: a */
    public abn f124a = new abj();
    /* renamed from: b */
    private Handler f125b;

    public abi(Handler handler) {
        this.f125b = handler;
    }

    public abi(abn abn, Handler handler) {
        this.f125b = handler;
        this.f124a = abn;
    }

    /* renamed from: a */
    public void mo2578a(int i) {
        this.f125b.post(new abk(this, i));
    }

    /* renamed from: a */
    public void mo2580a(RuntimeException runtimeException, String str, int i, int i2) {
        this.f125b.post(new abl(this, runtimeException, str, i, i2));
    }

    /* renamed from: a */
    public void mo2579a(RuntimeException runtimeException) {
        this.f125b.post(new abm(this, runtimeException));
    }
}
