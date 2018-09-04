package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: vr */
final class vr implements OnClickListener {
    /* renamed from: a */
    private final oa f9423a = new oa(this.f9424b.f9146a.getContext(), this.f9424b.f9149d);
    /* renamed from: b */
    private final /* synthetic */ ru f9424b;

    vr(ru ruVar) {
        this.f9424b = ruVar;
    }

    public final void onClick(View view) {
        ru ruVar = this.f9424b;
        Callback callback = ruVar.f9150e;
        if (callback != null && ruVar.f9151f) {
            callback.onMenuItemSelected(0, this.f9423a);
        }
    }
}
