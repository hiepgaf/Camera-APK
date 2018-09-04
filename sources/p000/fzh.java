package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.view.ViewMagnet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fzh */
public final class fzh extends LinearLayout {
    /* renamed from: a */
    public final fzl f4839a;
    /* renamed from: b */
    public final Map f4840b;
    /* renamed from: c */
    public final Map f4841c;
    /* renamed from: d */
    public final Map f4842d;
    /* renamed from: e */
    public final ViewMagnet f4843e;
    /* renamed from: f */
    public final LayoutParams f4844f;
    /* renamed from: g */
    public final Animator f4845g;
    /* renamed from: h */
    public final Animator f4846h;
    /* renamed from: i */
    public ImageButton f4847i;
    /* renamed from: j */
    public AnimatedVectorDrawable f4848j;
    /* renamed from: k */
    public VectorDrawable f4849k;
    /* renamed from: l */
    public boolean f4850l = false;
    /* renamed from: m */
    private final View f4851m;
    /* renamed from: n */
    private final hil f4852n;
    /* renamed from: o */
    private boolean f4853o = false;

    public fzh(Context context, fzl fzl) {
        super(context);
        this.f4839a = fzl;
        this.f4840b = new HashMap();
        this.f4841c = new HashMap();
        this.f4842d = new HashMap();
        this.f4845g = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_in_animator);
        this.f4846h = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_out_animator);
        this.f4844f = fzh.m2424a(context);
        View view = new View(context, null, 0, R.style.options_bar_left_placeholder);
        view.setLayoutParams(fzh.m2424a(context));
        this.f4851m = view;
        this.f4843e = new ViewMagnet(this.f4851m);
        this.f4852n = new hil(this, this.f4843e);
        setBackgroundColor(context.getResources().getColor(R.color.optionsbar_background_closed, null));
        m2425a();
    }

    /* renamed from: a */
    final void m2425a() {
        addView(this.f4851m, 0);
        this.f4843e.setPositioned();
    }

    /* renamed from: a */
    public final void m2426a(View view, boolean z) {
        if (z) {
            addView(view, 0);
        } else {
            addView(view);
        }
    }

    /* renamed from: b */
    public final void m2429b() {
        if (!(this.f4849k == null || this.f4848j == null)) {
            m2430c();
        }
        this.f4853o = false;
        this.f4847i = null;
        this.f4848j = null;
        this.f4849k = null;
    }

    /* renamed from: a */
    private static LayoutParams m2424a(Context context) {
        return new LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.optionsbar_category_width), context.getResources().getDimensionPixelSize(R.dimen.optionsbar_category_height), 0.0f);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4852n.f6232a = getDisplay().getRotation();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4852n.m3180b();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4843e.setPositioned();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (fzg a : this.f4840b.values()) {
            a.m10911a(z);
        }
    }

    /* renamed from: a */
    public final void m2428a(ImageButton imageButton, int i) {
        if (this.f4853o) {
            ((LayerDrawable) imageButton.getDrawable()).getDrawable(0).setAlpha(i);
        } else {
            imageButton.setAlpha(i);
        }
    }

    /* renamed from: a */
    public final void m2427a(ImageButton imageButton) {
        this.f4853o = true;
        this.f4847i = imageButton;
        this.f4848j = (AnimatedVectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(0);
        this.f4849k = (VectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(1);
        if (!this.f4850l) {
            this.f4849k.setAlpha(0);
        }
    }

    /* renamed from: c */
    public final void m2430c() {
        if (this.f4847i != null && this.f4850l) {
            this.f4845g.cancel();
            this.f4846h.setTarget(this.f4849k);
            this.f4846h.start();
            this.f4850l = false;
        }
    }
}
