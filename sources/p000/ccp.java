package p000;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* renamed from: ccp */
public final class ccp {
    /* renamed from: a */
    public final ProviderInfo f1841a;
    /* renamed from: b */
    public final Context f1842b;

    public ccp(ContentProvider contentProvider, ProviderInfo providerInfo) {
        this.f1841a = providerInfo;
        this.f1842b = contentProvider.getContext();
    }
}
