package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.android.GoogleCamera.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: fzg */
public final class fzg extends him {
    /* renamed from: a */
    public final List f16661a = khb.m4885b();
    /* renamed from: b */
    public final List f16662b = khb.m4885b();
    /* renamed from: c */
    private final List f16663c = khb.m4885b();
    /* renamed from: d */
    private final List f16664d = khb.m4885b();
    /* renamed from: e */
    private boolean f16665e = true;
    /* renamed from: f */
    private boolean f16666f = true;
    /* renamed from: g */
    private boolean f16667g = true;
    /* renamed from: h */
    private kbg f16668h = kau.f19138a;

    public fzg(Context context) {
        super(context, null, 0, R.style.options_bar_rightside_option);
    }

    /* renamed from: a */
    private final void m10909a() {
        boolean z;
        if (!this.f16667g) {
            z = false;
        } else if (!this.f16666f) {
            z = false;
        } else if (this.f16665e) {
            z = true;
        } else {
            z = false;
        }
        for (fzr a : this.f16662b) {
            a.mo1433a(z);
        }
    }

    protected final void dispatchVisibilityChanged(View view, int i) {
        super.dispatchVisibilityChanged(view, i);
        m10910a(i);
    }

    /* renamed from: a */
    private final void m10910a(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16667g = z;
        for (fzv a : this.f16663c) {
            a.m2439a();
        }
        m10909a();
    }

    public final void dispatchWindowVisibilityChanged(int i) {
        super.dispatchWindowVisibilityChanged(i);
        m10910a(i);
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (emn a : this.f16661a) {
            a.mo1144a(configuration);
        }
    }

    /* renamed from: a */
    public final void m10911a(boolean z) {
        ikd.m12259a();
        this.f16665e = z;
        m10909a();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f16668h.mo2084b() || ((Boolean) this.f16668h.mo2081a()).booleanValue() != z) {
            this.f16668h = kbg.m4745c(Boolean.valueOf(z));
            this.f16666f = z;
            for (fzu a : this.f16664d) {
                a.m2438a();
            }
            m10909a();
        }
    }
}
