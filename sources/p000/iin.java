package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: iin */
public final class iin extends hwc {
    /* renamed from: l */
    public final ExecutorService f23351l;
    /* renamed from: m */
    public final ihw f23352m;
    /* renamed from: n */
    private final ihw f23353n;
    /* renamed from: o */
    private final ihw f23354o;
    /* renamed from: p */
    private final ihw f23355p;
    /* renamed from: q */
    private final ihw f23356q;
    /* renamed from: r */
    private final ihw f23357r;
    /* renamed from: s */
    private final ihw f23358s;
    /* renamed from: t */
    private final ihw f23359t;
    /* renamed from: u */
    private final iir f23360u;

    public iin(Context context, Looper looper, hus hus, hut hut, hvx hvx) {
        this(context, looper, hus, hut, hvx, Executors.newCachedThreadPool(), iir.m3759a(context));
    }

    private iin(Context context, Looper looper, hus hus, hut hut, hvx hvx, ExecutorService executorService, iir iir) {
        super(context, looper, 14, hvx, hus, hut);
        this.f23353n = new ihw();
        this.f23354o = new ihw();
        this.f23355p = new ihw();
        this.f23356q = new ihw();
        this.f23352m = new ihw();
        this.f23357r = new ihw();
        this.f23358s = new ihw();
        this.f23359t = new ihw();
        this.f23351l = (ExecutorService) htl.m3431b((Object) executorService);
        this.f23360u = iir;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* renamed from: a */
    protected final void mo3480a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("onPostInitHandler: statusCode ");
            stringBuilder.append(i);
            Log.d("WearableClient", stringBuilder.toString());
        }
        if (i == 0) {
            this.f23353n.m3757a(iBinder);
            this.f23354o.m3757a(iBinder);
            this.f23355p.m3757a(iBinder);
            this.f23356q.m3757a(iBinder);
            this.f23352m.m3757a(iBinder);
            this.f23357r.m3757a(iBinder);
            this.f23358s.m3757a(iBinder);
            this.f23359t.m3757a(iBinder);
        }
        super.mo3480a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final void mo3481a(hvs hvs) {
        int i = 0;
        if (!mo3482h()) {
            try {
                Bundle bundle = this.f6718c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < huc.f6667c) {
                    int i2 = huc.f6667c;
                    StringBuilder stringBuilder = new StringBuilder(80);
                    stringBuilder.append("Android Wear out of date. Requires API version ");
                    stringBuilder.append(i2);
                    stringBuilder.append(" but found ");
                    stringBuilder.append(i);
                    Log.w("WearableClient", stringBuilder.toString());
                    Context context = this.f6718c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    m3509a(hvs, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (NameNotFoundException e) {
                m3509a(hvs, 16, null);
                return;
            }
        }
        super.mo3481a(hvs);
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* renamed from: h */
    public final boolean mo3482h() {
        return this.f23360u.m3764a("com.google.android.wearable.app.cn") ^ 1;
    }

    /* renamed from: m */
    protected final String mo3483m() {
        return !this.f23360u.m3764a("com.google.android.wearable.app.cn") ? "com.google.android.gms" : "com.google.android.wearable.app.cn";
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        return ihu.m12227a(iBinder);
    }
}
