package p000;

import android.annotation.TargetApi;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: guj */
public final class guj implements emy, eof, eoh, eol, gui {
    /* renamed from: a */
    public static final String f17361a = bli.m862a("SysUiFlag");
    /* renamed from: b */
    public final Window f17362b;
    /* renamed from: c */
    public boolean f17363c = false;
    /* renamed from: d */
    public int f17364d = 1797;
    /* renamed from: e */
    public OnSystemUiVisibilityChangeListener f17365e = new gul(this);

    public guj(ikd ikd, Window window) {
        this.f17362b = window;
        ikd.execute(new guk(this, window));
    }

    /* renamed from: a */
    public final void mo1651a(int i) {
        String str = f17361a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Applying sys ui flag: ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
        this.f17364d = i;
        this.f17362b.getDecorView().setSystemUiVisibility(i);
    }

    /* renamed from: g */
    public final void mo379g() {
        this.f17363c = true;
    }

    /* renamed from: h */
    public final void mo380h() {
        this.f17363c = false;
        m11548a();
    }

    /* renamed from: a */
    public final void mo1652a(boolean z) {
        String str = f17361a;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("onWindowFocusChanged() ");
        stringBuilder.append(z);
        bli.m863a(str, stringBuilder.toString());
        if (!this.f17363c && z) {
            m11548a();
        }
    }

    /* renamed from: a */
    public final void m11548a() {
        if (this.f17364d != -1 && !this.f17363c) {
            String str = f17361a;
            int i = this.f17364d;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Reapplying sys ui flag: ");
            stringBuilder.append(i);
            bli.m863a(str, stringBuilder.toString());
            this.f17362b.getDecorView().setSystemUiVisibility(this.f17364d);
        }
    }
}
