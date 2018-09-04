package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;
import java.util.List;

/* renamed from: iip */
public final class iip extends ihr {
    /* renamed from: a */
    public ieg f21730a;
    /* renamed from: b */
    public final IntentFilter[] f21731b;

    iip(IntentFilter[] intentFilterArr) {
        this.f21731b = (IntentFilter[]) htl.m3431b((Object) intentFilterArr);
    }

    /* renamed from: a */
    public final void m16061a() {
        iip.m16060a(null);
        iip.m16060a(null);
        iip.m16060a(null);
        iip.m16060a(this.f21730a);
        this.f21730a = null;
        iip.m16060a(null);
        iip.m16060a(null);
        iip.m16060a(null);
        iip.m16060a(null);
    }

    /* renamed from: a */
    public final void mo1858a(DataHolder dataHolder) {
        dataHolder.close();
    }

    /* renamed from: a */
    public final void mo1859a(zzbz zzbz) {
        ieg ieg = this.f21730a;
        if (ieg != null) {
            ieg.m3708a(new iiq(zzbz));
        }
    }

    /* renamed from: a */
    public final void mo1860a(zzcc zzcc) {
    }

    /* renamed from: a */
    public final void mo1861a(zzh zzh) {
    }

    /* renamed from: a */
    public final void mo1862a(zzk zzk) {
    }

    /* renamed from: a */
    public final void mo1863a(zzo zzo) {
    }

    /* renamed from: a */
    public final void mo1864a(zzs zzs) {
    }

    /* renamed from: a */
    public final void mo1865a(List list) {
    }

    /* renamed from: b */
    public final void mo1866b(zzcc zzcc) {
    }

    /* renamed from: a */
    private static void m16060a(ieg ieg) {
        if (ieg != null) {
            ieg.f6970a = null;
        }
    }
}
