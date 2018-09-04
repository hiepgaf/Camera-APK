package p000;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: mo */
final class mo extends kh {
    /* renamed from: a */
    private final /* synthetic */ mn f22480a;

    mo(mn mnVar) {
        this.f22480a = mnVar;
    }

    /* renamed from: b */
    public final void mo2167b() {
        this.f22480a.f19388a.f19367g.setVisibility(8);
        mg mgVar = this.f22480a.f19388a;
        PopupWindow popupWindow = mgVar.f19368h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (mgVar.f19367g.getParent() instanceof View) {
            jm.m4543B((View) this.f22480a.f19388a.f19367g.getParent());
        }
        this.f22480a.f19388a.f19367g.removeAllViews();
        this.f22480a.f19388a.f19370j.m4770a(null);
        this.f22480a.f19388a.f19370j = null;
    }
}
