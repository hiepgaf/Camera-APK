package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: mv */
public class mv extends Dialog implements me {
    /* renamed from: a */
    private mf f19393a;

    public mv(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        m14104a().mo2332a(null);
        m14104a().mo2336a();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m14104a().mo2334a(view, layoutParams);
    }

    public View findViewById(int i) {
        return m14104a().mo2331a(i);
    }

    /* renamed from: a */
    public final mf m14104a() {
        if (this.f19393a == null) {
            this.f19393a = new mg(getContext(), getWindow(), this);
        }
        return this.f19393a;
    }

    public void invalidateOptionsMenu() {
        m14104a().mo2345e();
    }

    protected void onCreate(Bundle bundle) {
        m14104a().mo2344d();
        super.onCreate(bundle);
        m14104a().mo2332a(bundle);
    }

    protected void onStop() {
        super.onStop();
        m14104a().mo2351k();
    }

    /* renamed from: b */
    public final void mo2369b() {
    }

    /* renamed from: c */
    public final void mo2370c() {
    }

    /* renamed from: d */
    public final nn mo2371d() {
        return null;
    }

    public void setContentView(int i) {
        m14104a().mo2343c(i);
    }

    public void setContentView(View view) {
        m14104a().mo2333a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m14104a().mo2340b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m14104a().mo2335a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m14104a().mo2335a(charSequence);
    }
}
