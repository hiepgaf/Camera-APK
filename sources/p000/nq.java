package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: nq */
public final class nq extends ContextWrapper {
    /* renamed from: a */
    public int f8937a;
    /* renamed from: b */
    private Theme f8938b;
    /* renamed from: c */
    private LayoutInflater f8939c;
    /* renamed from: d */
    private Resources f8940d;

    public nq() {
        super(null);
    }

    public nq(Context context, int i) {
        super(context);
        this.f8937a = i;
    }

    public nq(Context context, Theme theme) {
        super(context);
        this.f8938b = theme;
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f8940d == null) {
            this.f8940d = super.getResources();
        }
        return this.f8940d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8939c == null) {
            this.f8939c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8939c;
    }

    public final Theme getTheme() {
        Theme theme = this.f8938b;
        if (theme != null) {
            return theme;
        }
        if (this.f8937a == 0) {
            this.f8937a = R.style.Theme.AppCompat.Light;
        }
        m5644a();
        return this.f8938b;
    }

    /* renamed from: a */
    private final void m5644a() {
        if (this.f8938b == null) {
            this.f8938b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8938b.setTo(theme);
            }
        }
        this.f8938b.applyStyle(this.f8937a, true);
    }

    public final void setTheme(int i) {
        if (this.f8937a != i) {
            this.f8937a = i;
            m5644a();
        }
    }
}
