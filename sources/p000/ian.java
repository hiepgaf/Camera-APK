package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: ian */
final class ian extends iak {
    /* renamed from: a */
    private final ici f21645a;

    public ian(ici ici) {
        this.f21645a = ici;
    }

    /* renamed from: a */
    public final void mo3120a(int i, Bundle bundle, int i2, Intent intent) {
        this.f21645a.mo3123a(new ift(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
    }
}
