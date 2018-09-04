package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: zz */
public final class zz implements zy {
    /* renamed from: a */
    public final zy f19776a;
    /* renamed from: b */
    private final Handler f19777b = new Handler(Looper.getMainLooper());

    private zz(zy zyVar) {
        this.f19776a = zyVar;
    }

    /* renamed from: a */
    public static zz m14622a(Handler handler, zy zyVar) {
        if (handler == null || zyVar == null) {
            return null;
        }
        return new zz(zyVar);
    }

    /* renamed from: a */
    public final void mo672a(int i) {
        this.f19777b.post(new aab(this, i));
    }

    /* renamed from: a */
    public final void mo674a(aah aah) {
        this.f19777b.post(new aaa(this, aah));
    }

    /* renamed from: a */
    public final void mo673a(int i, String str) {
        this.f19777b.post(new aac(this, i, str));
    }

    /* renamed from: b */
    public final void mo678b(int i, String str) {
        this.f19777b.post(new aad(this, i, str));
    }

    /* renamed from: a */
    public final void mo676a(zs zsVar, String str) {
        this.f19777b.post(new aae(this, zsVar, str));
    }
}
