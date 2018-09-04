package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* renamed from: gas */
public final /* synthetic */ class gas implements Runnable {
    /* renamed from: a */
    private final gal f5009a;
    /* renamed from: b */
    private final boolean f5010b;

    public gas(gal gal, boolean z) {
        this.f5009a = gal;
        this.f5010b = z;
    }

    public final void run() {
        gal gal = this.f5009a;
        boolean z = this.f5010b;
        OptionsBarView optionsBarView = gal.f4984b;
        int a = z ? R.drawable.ic_hdr_auto_checkmark_active_24dp : gal.f4991i.m2432a(fzp.HDR_AUTO);
        fzh fzh = optionsBarView.f20399d;
        fzo fzo = fzo.HDR;
        if (fzh.f4840b.containsKey(fzo)) {
            ((fzg) fzh.f4840b.get(fzo)).setImageResource(a);
        }
    }
}
