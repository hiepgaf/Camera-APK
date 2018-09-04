package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: cha */
public final class cha implements kwk {
    /* renamed from: a */
    private final kwk f11932a;
    /* renamed from: b */
    private final kwk f11933b;
    /* renamed from: c */
    private final kwk f11934c;
    /* renamed from: d */
    private final kwk f11935d;
    /* renamed from: e */
    private final kwk f11936e;
    /* renamed from: f */
    private final kwk f11937f;
    /* renamed from: g */
    private final kwk f11938g;
    /* renamed from: h */
    private final kwk f11939h;

    public cha(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        this.f11932a = kwk;
        this.f11933b = kwk2;
        this.f11934c = kwk3;
        this.f11935d = kwk4;
        this.f11936e = kwk5;
        this.f11937f = kwk6;
        this.f11938g = kwk7;
        this.f11939h = kwk8;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11932a;
        kwk kwk2 = this.f11933b;
        kwk kwk3 = this.f11934c;
        kwk kwk4 = this.f11935d;
        kwk kwk5 = this.f11936e;
        kwk kwk6 = this.f11937f;
        kwk kwk7 = this.f11938g;
        kwk kwk8 = this.f11939h;
        Context context = (Context) kwk.mo345a();
        Handler handler = (Handler) kwk2.mo345a();
        irh irh = (irh) kwk3.mo345a();
        kwk4.mo345a();
        ire ire = (ire) kwk5.mo345a();
        cbu cbu = (cbu) kwk6.mo345a();
        return (cgu) ktm.m13963a(new cgu(handler, aay.m28a(context, go.f5567e), irh, ire, (DevicePolicyManager) cbu.m1099a(cbu.f1837a, "device_policy"), (Executor) kwk7.mo345a(), (Semaphore) kwk8.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
