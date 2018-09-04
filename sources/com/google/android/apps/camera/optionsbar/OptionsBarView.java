package com.google.android.apps.camera.optionsbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.VectorDrawable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.bli;
import p000.emn;
import p000.fzg;
import p000.fzh;
import p000.fzi;
import p000.fzj;
import p000.fzk;
import p000.fzl;
import p000.fzm;
import p000.fzn;
import p000.fzo;
import p000.fzp;
import p000.fzr;
import p000.fzs;
import p000.fzt;
import p000.fzw;
import p000.fzz;
import p000.gbj;
import p000.gbk;
import p000.gbl;
import p000.gbo;
import p000.gbp;
import p000.go;
import p000.hft;
import p000.hgo;
import p000.hhf;
import p000.hhg;
import p000.hii;
import p000.hir;
import p000.jqk;

/* compiled from: PG */
public class OptionsBarView extends hft implements fzl {
    /* renamed from: i */
    private static final String f20395i = OptionsBarView.class.getSimpleName();
    /* renamed from: a */
    public final Map f20396a;
    /* renamed from: b */
    public final List f20397b;
    /* renamed from: c */
    public AnimatorSet f20398c;
    /* renamed from: d */
    public final fzh f20399d;
    /* renamed from: e */
    public fzw f20400e;
    /* renamed from: f */
    public Animator f20401f;
    /* renamed from: g */
    public FrameLayout f20402g;
    /* renamed from: h */
    public boolean f20403h;
    /* renamed from: j */
    private final Map f20404j;
    /* renamed from: k */
    private final hii f20405k;
    /* renamed from: l */
    private final fzz f20406l;
    /* renamed from: m */
    private final List f20407m;
    /* renamed from: n */
    private int f20408n;
    /* renamed from: o */
    private boolean f20409o;

    public OptionsBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20408n = go.aD;
        this.f20409o = false;
        this.f20403h = true;
        this.f20396a = new HashMap();
        this.f20397b = new ArrayList();
        this.f20404j = new HashMap();
        this.f20399d = new fzh(context, this);
        this.f20405k = new hii();
        ViewGroup viewGroup = this.f20399d;
        this.f20406l = new fzz(viewGroup, this, viewGroup.f4843e);
        this.f20407m = new ArrayList();
        this.f20398c = new AnimatorSet();
        m15074d();
    }

    public OptionsBarView(Context context, fzh fzh, hii hii) {
        super(context);
        this.f20408n = go.aD;
        this.f20409o = false;
        this.f20403h = true;
        this.f20396a = new HashMap();
        this.f20397b = new ArrayList();
        this.f20399d = fzh;
        this.f20404j = new HashMap();
        this.f20405k = hii;
        this.f20406l = new fzz(fzh, this, fzh.f4843e);
        this.f20407m = new ArrayList();
        this.f20398c = new AnimatorSet();
        m15074d();
    }

    /* renamed from: a */
    public final void m15079a(fzm fzm, fzp fzp, fzt fzt) {
        synchronized (this.f20399d) {
            if (fzm.m2433b(fzp)) {
                this.f20404j.put(fzm, fzp);
                fzh fzh = this.f20399d;
                boolean a = hii.m3173a(this.f20405k.f6228a);
                View space = new Space(fzh.getContext());
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                space.setLayoutParams(layoutParams);
                fzh.m2426a(space, a);
                ImageButton fzg = new fzg(fzh.getContext());
                fzg.setLayoutParams(fzh.f4844f);
                fzg.setImageResource(fzm.m2432a(fzp));
                fzg.setContentDescription(fzh.getContext().getResources().getString(fzm.f4857b));
                fzg.m10911a(fzh.isEnabled());
                fzg.setOnClickListener(new fzk(fzh, fzm));
                fzh.f4840b.put(fzm.f4856a, fzg);
                fzh.m2426a((View) fzg, a);
                if (fzp == fzp.SELECTED) {
                    a = true;
                } else {
                    a = false;
                }
                fzg.setSelected(a);
                fzg.f16662b.add(new fzi(fzh, fzm));
                fzg.f16661a.add(new fzj(fzh, fzm));
                if (fzt != null) {
                    fzt.mo1730a(fzg);
                }
                if (fzm.f4856a == fzo.MICROVIDEO && (fzp == fzp.MICROVIDEO_ON || fzp == fzp.MICROVIDEO_AUTO)) {
                    fzh.m2427a(fzg);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m15083a(fzs fzs) {
        this.f20407m.add(fzs);
    }

    /* renamed from: a */
    public final void m15076a() {
        if (this.f20408n == go.aD) {
            Animator animator = this.f20401f;
            View view = this.f20400e;
            if (animator == null || view == null) {
                bli.m873e(f20395i, "closeOptionsBar called on a closed options bar");
                return;
            }
            this.f20400e = null;
            this.f20408n = go.aG;
            animator.addListener(new gbl(this, view));
            animator.start();
            for (gbj gbj : this.f20397b) {
                gbj.f5022a.f17826k.m10934a(false);
            }
        } else if (this.f20408n == go.aE) {
            this.f20408n = go.aF;
        }
    }

    /* renamed from: a */
    public final void m15080a(fzo fzo) {
        synchronized (this.f20399d) {
            fzh fzh = this.f20399d;
            ImageButton imageButton = (fzg) fzh.f4840b.get(fzo);
            if (imageButton != null) {
                imageButton.setEnabled(false);
                if (fzo == fzo.MICROVIDEO) {
                    fzh.m2428a(imageButton, (int) ScriptIntrinsicBLAS.RsBlas_csyrk);
                } else {
                    imageButton.setImageAlpha(ScriptIntrinsicBLAS.RsBlas_csyrk);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m15085b() {
        synchronized (this.f20399d) {
            this.f20409o = true;
            setEnabled(false);
            this.f20399d.setEnabled(false);
        }
    }

    /* renamed from: b */
    public final void m15086b(fzo fzo) {
        synchronized (this.f20399d) {
            fzh fzh = this.f20399d;
            ImageButton imageButton = (ImageButton) fzh.f4840b.get(fzo);
            if (imageButton != null) {
                imageButton.setEnabled(true);
                if (fzo == fzo.MICROVIDEO) {
                    fzh.m2428a(imageButton, (int) Illuminant.kOther);
                } else {
                    imageButton.setImageAlpha(Illuminant.kOther);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m15087c() {
        synchronized (this.f20399d) {
            this.f20409o = false;
            setEnabled(true);
            this.f20399d.setEnabled(true);
        }
        ViewTreeObserver viewTreeObserver = this.f20399d.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.dispatchOnGlobalLayout();
        }
    }

    /* renamed from: a */
    public final AnimatorListenerAdapter m15075a(boolean z) {
        return new gbp(this, z);
    }

    /* renamed from: d */
    private final void m15074d() {
        this.f20399d.setGravity(48);
        addView(this.f20399d, new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void mo2800a(fzm fzm) {
        synchronized (this.f20399d) {
            if (this.f20408n != go.aD) {
                return;
            }
            fzo fzo = fzm.f4856a;
            View view = (View) this.f20399d.f4840b.get(fzo);
            if (view == null) {
                return;
            }
            for (fzs a : this.f20407m) {
                a.mo1436a(fzo);
            }
            if (fzm.f4858c.isEmpty()) {
                return;
            }
            fzp fzp = (fzp) this.f20404j.get(fzm);
            if (fzp == null) {
                String str = f20395i;
                String valueOf = String.valueOf(fzo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("Category ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" does not have a selected option available.");
                bli.m863a(str, stringBuilder.toString());
                return;
            }
            String str2 = f20395i;
            String valueOf2 = String.valueOf(fzo);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            stringBuilder2.append("Expanding options for category: ");
            stringBuilder2.append(valueOf2);
            bli.m863a(str2, stringBuilder2.toString());
            View fzw = new fzw(getContext(), fzm.f4858c, fzp, new gbk(this, fzm));
            LinearLayout[] linearLayoutArr = new LinearLayout[]{fzw};
            hii.m3172a(hir.PORTRAIT, this.f20405k.f6228a, linearLayoutArr);
            addView(fzw, new FrameLayout.LayoutParams(-1, -1));
            fzw.setAlpha(0.0f);
            this.f20408n = go.aE;
            fzz fzz = this.f20406l;
            Animator a2 = fzz.m2441a((View) jqk.m13102c(fzw));
            Animator animator = fzz.f4939c;
            View ironView = fzz.f4941e.getIronView();
            if (ironView != null) {
                animator = new AnimatorSet();
                animator.play(fzz.f4939c).with(fzz.m2443b(ironView));
            }
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(animator).before(a2).with(fzz.m2446b(view, true)).with(fzz.m2445a(view, true));
            fzz = this.f20406l;
            a2 = fzz.m2443b((View) jqk.m13102c(fzw));
            animator = fzz.f4940d;
            View ironView2 = fzz.f4941e.getIronView();
            if (ironView2 != null) {
                animator = new AnimatorSet();
                animator.play(fzz.f4940d).with(fzz.m2441a(ironView2));
            }
            Animator animatorSet2 = new AnimatorSet();
            animatorSet2.play(a2).before(animator).with(fzz.m2446b(view, false)).with(fzz.m2445a(view, false));
            this.f20401f = animatorSet2;
            animatorSet.addListener(new gbo(this));
            animatorSet.start();
            this.f20400e = fzw;
            for (gbj gbj : this.f20397b) {
                switch (fzo.ordinal()) {
                    case 2:
                        hgo hgo = gbj.f5022a;
                        if (!(hgo.f17820e || ((Boolean) hgo.f17821f.mo2860b()).booleanValue())) {
                            gbj.f5022a.f17826k.m10933a(gbj.f5022a.f17816a.getResources().getString(R.string.raw_output_tutorial_title), gbj.f5022a.f17816a.getResources().getString(R.string.raw_output_tutorial_body), new hhg(gbj));
                            break;
                        }
                    case 5:
                        if (gbj.f5022a.f17818c.mo2084b() && !gbj.f5022a.m11817d()) {
                            gbj.f5022a.f17826k.m10933a(gbj.f5022a.f17816a.getResources().getString(R.string.micro_tutorial_title), gbj.f5022a.f17816a.getResources().getString(R.string.micro_tutorial_body), new hhf(gbj));
                            break;
                        }
                    default:
                        break;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f20409o || super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void m15082a(fzo fzo, fzr fzr) {
        this.f20399d.f4841c.put(fzo, fzr);
    }

    /* renamed from: a */
    public final void m15081a(fzo fzo, emn emn) {
        this.f20399d.f4842d.put(fzo, emn);
    }

    /* renamed from: a */
    public final void m15078a(fzm fzm, fzp fzp) {
        boolean z = true;
        if (fzm.m2433b(fzp)) {
            synchronized (this.f20399d) {
                this.f20404j.put(fzm, fzp);
                fzh fzh = this.f20399d;
                ImageButton imageButton = (ImageButton) fzh.f4840b.get(fzm.f4856a);
                if (imageButton != null) {
                    imageButton.setImageResource(fzm.m2432a(fzp));
                    imageButton.setContentDescription(fzh.getContext().getResources().getString(fzm.f4857b));
                    if (fzp != fzp.SELECTED) {
                        z = false;
                    }
                    imageButton.setSelected(z);
                    if (fzm.f4856a == fzo.MICROVIDEO) {
                        if (fzp == fzp.MICROVIDEO_ON || fzp == fzp.MICROVIDEO_AUTO) {
                            fzh.m2427a(imageButton);
                            if (fzh.f4850l) {
                                VectorDrawable vectorDrawable = fzh.f4849k;
                                if (vectorDrawable != null) {
                                    vectorDrawable.setAlpha(Illuminant.kOther);
                                }
                            }
                        } else {
                            fzh.m2429b();
                        }
                    }
                }
                fzw fzw = this.f20400e;
                if (fzw != null) {
                    for (fzn fzn : fzw.f4917b.keySet()) {
                        View view = (View) fzw.f4917b.get(fzn);
                        if (view == null) {
                            break;
                        } else if (fzp == fzn.f4860a) {
                            view.setSelected(true);
                        } else {
                            view.setSelected(false);
                        }
                    }
                }
            }
            return;
        }
        String str = f20395i;
        String valueOf = String.valueOf(fzp);
        String valueOf2 = String.valueOf(fzm.f4856a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length());
        stringBuilder.append("Attempted to set invalid value. ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" is not a valid option for category: ");
        stringBuilder.append(valueOf2);
        bli.m866b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo2801a(hir hir) {
        if (this.f20400e != null) {
            this.f20405k.m3177a(hir, this.f20399d, r0);
        } else {
            this.f20405k.m3177a(hir, this.f20399d);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20399d.getLayoutParams();
        switch (hir.ordinal()) {
            case 0:
            case 1:
                layoutParams.gravity = 8388659;
                return;
            case 2:
                layoutParams.gravity = 8388661;
                return;
            case 3:
                layoutParams.gravity = 8388691;
                return;
            default:
                return;
        }
    }
}
