package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: iam */
final class iam extends iak {
    /* renamed from: a */
    private final /* synthetic */ Context f21642a;
    /* renamed from: b */
    private final /* synthetic */ Uri f21643b;
    /* renamed from: c */
    private final /* synthetic */ iaj f21644c;

    iam(Context context, Uri uri, iaj iaj) {
        this.f21642a = context;
        this.f21643b = uri;
        this.f21644c = iaj;
    }

    /* renamed from: a */
    public final void mo3120a(int i, Bundle bundle, int i2, Intent intent) {
        this.f21642a.revokeUriPermission(this.f21643b, 1);
        this.f21644c.mo3120a(i, bundle, i2, intent);
    }
}
