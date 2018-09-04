package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: hva */
public class hva {
    /* renamed from: a */
    public final huh f6700a;
    /* renamed from: b */
    public final icd f6701b;
    /* renamed from: c */
    public final Looper f6702c;
    /* renamed from: d */
    public final int f6703d;
    /* renamed from: e */
    public final huq f6704e;
    /* renamed from: f */
    private final Context f6705f;
    /* renamed from: g */
    private final hui f6706g;
    /* renamed from: h */
    private final Account f6707h;
    /* renamed from: i */
    private final idv f6708i;

    private hva(Context context, huh huh, hvb hvb) {
        htl.m3432b((Object) context, (Object) "Null context is not permitted.");
        htl.m3432b((Object) huh, (Object) "Api must not be null.");
        htl.m3432b((Object) hvb, (Object) "Settings must not be null; use Settings.createDefault() instead.");
        this.f6705f = context.getApplicationContext();
        this.f6700a = huh;
        this.f6706g = null;
        this.f6702c = hvb.f6711c;
        this.f6701b = new icd(this.f6700a, null);
        this.f6704e = new iea(this);
        this.f6708i = idv.m3685a(this.f6705f);
        this.f6703d = this.f6708i.f6950e.getAndIncrement();
        hzv hzv = hvb.f6709a;
        this.f6707h = hvb.f6710b;
        Handler handler = this.f6708i.f6953h;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* renamed from: a */
    public hzs mo1819a(Context context, Handler handler) {
        return new hzs(context, handler);
    }

    @Deprecated
    public hva(Context context, huh huh, hzv hzv) {
        hvc hvc = new hvc();
        htl.m3432b((Object) hzv, (Object) "StatusExceptionMapper must not be null.");
        hvc.f6712a = hzv;
        this(context, huh, hvc.m3499a());
    }

    /* renamed from: a */
    public huo mo1818a(Looper looper, ief ief) {
        hur hur = new hur(this.f6705f);
        hur.f6681a = this.f6707h;
        return this.f6700a.m3470a().mo3107a(this.f6705f, looper, hur.m3487b(), null, ief, ief);
    }

    /* renamed from: a */
    public final ich m3498a(int i, ich ich) {
        ich.m12071d();
        idv idv = this.f6708i;
        ibz icb = new icb(ich);
        Handler handler = idv.f6953h;
        handler.sendMessage(handler.obtainMessage(4, new hzp(icb, idv.f6951f.get(), this)));
        return ich;
    }
}
