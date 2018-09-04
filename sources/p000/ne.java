package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ne */
public final class ne extends lt implements pw {
    /* renamed from: o */
    private static final Interpolator f19398o = new AccelerateInterpolator();
    /* renamed from: p */
    private static final Interpolator f19399p = new DecelerateInterpolator();
    /* renamed from: A */
    private final kg f19400A = new ng(this);
    /* renamed from: B */
    private final ki f19401B = new ki(this);
    /* renamed from: a */
    public Context f19402a;
    /* renamed from: b */
    public ActionBarOverlayLayout f19403b;
    /* renamed from: c */
    public ActionBarContainer f19404c;
    /* renamed from: d */
    public ru f19405d;
    /* renamed from: e */
    public ActionBarContextView f19406e;
    /* renamed from: f */
    public View f19407f;
    /* renamed from: g */
    public nh f19408g;
    /* renamed from: h */
    public nn f19409h;
    /* renamed from: i */
    public no f19410i;
    /* renamed from: j */
    public boolean f19411j = true;
    /* renamed from: k */
    public boolean f19412k;
    /* renamed from: l */
    public boolean f19413l;
    /* renamed from: m */
    public nx f19414m;
    /* renamed from: n */
    public boolean f19415n;
    /* renamed from: q */
    private Context f19416q;
    /* renamed from: r */
    private boolean f19417r;
    /* renamed from: s */
    private boolean f19418s;
    /* renamed from: t */
    private ArrayList f19419t = new ArrayList();
    /* renamed from: u */
    private boolean f19420u;
    /* renamed from: v */
    private int f19421v = 0;
    /* renamed from: w */
    private boolean f19422w;
    /* renamed from: x */
    private boolean f19423x = true;
    /* renamed from: y */
    private boolean f19424y;
    /* renamed from: z */
    private final kg f19425z = new nf(this);

    public ne(Activity activity, boolean z) {
        ArrayList arrayList = new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m14142a(decorView);
        if (!z) {
            this.f19407f = decorView.findViewById(16908290);
        }
    }

    public ne(Dialog dialog) {
        ArrayList arrayList = new ArrayList();
        m14142a(dialog.getWindow().getDecorView());
    }

    /* renamed from: e */
    public final void m14158e(boolean z) {
        if (z) {
            if (!this.f19422w) {
                this.f19422w = true;
                if (this.f19403b != null) {
                    ActionBarOverlayLayout.m6798h();
                }
                m14145h(false);
            }
        } else if (this.f19422w) {
            this.f19422w = false;
            if (this.f19403b != null) {
                ActionBarOverlayLayout.m6798h();
            }
            m14145h(false);
        }
        if (jm.m4590x(this.f19404c)) {
            kd a;
            kd a2;
            long duration;
            if (z) {
                a = this.f19405d.m5796a(4, 100);
                a2 = this.f19406e.m5696a(0, 200);
            } else {
                a2 = this.f19405d.m5796a(0, 200);
                a = this.f19406e.m5696a(8, 100);
            }
            nx nxVar = new nx();
            nxVar.f8984a.add(a);
            View view = (View) a.f8211a.get();
            if (view != null) {
                duration = view.animate().getDuration();
            } else {
                duration = 0;
            }
            view = (View) a2.f8211a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            nxVar.f8984a.add(a2);
            nxVar.m5657c();
        } else if (z) {
            this.f19405d.m5801b(4);
            this.f19406e.setVisibility(0);
        } else {
            this.f19405d.m5801b(0);
            this.f19406e.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m14143a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo2378b() {
        ru ruVar = this.f19405d;
        if (ruVar != null) {
            boolean z;
            Toolbar toolbar = ruVar.f9146a;
            vn vnVar = toolbar.f728s;
            if (vnVar == null) {
                z = false;
            } else if (vnVar.f19650a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                toolbar.m498a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2373a(boolean z) {
        if (z != this.f19418s) {
            this.f19418s = z;
            int size = this.f19419t.size();
            for (int i = 0; i < size; i++) {
                ((lv) this.f19419t.get(i)).m5568a();
            }
        }
    }

    /* renamed from: f */
    public final void mo2392f(boolean z) {
        this.f19411j = z;
    }

    /* renamed from: c */
    public final int mo2379c() {
        return this.f19405d.f9147b;
    }

    /* renamed from: d */
    public final Context mo2381d() {
        if (this.f19416q == null) {
            TypedValue typedValue = new TypedValue();
            this.f19402a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f19416q = new ContextThemeWrapper(this.f19402a, i);
            } else {
                this.f19416q = this.f19402a;
            }
        }
        return this.f19416q;
    }

    /* renamed from: l */
    public final void mo2393l() {
        if (!this.f19413l) {
            this.f19413l = true;
            m14145h(true);
        }
    }

    /* renamed from: a */
    private final void m14142a(View view) {
        int i;
        ru ruVar;
        this.f19403b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        View view2 = this.f19403b;
        if (view2 != null) {
            view2.f10052g = this;
            if (view2.getWindowToken() != null) {
                view2.f10052g.mo2391a(view2.f10046a);
                i = view2.f10051f;
                if (i != 0) {
                    view2.onWindowSystemUiVisibilityChanged(i);
                    jm.m4543B(view2);
                }
            }
        }
        view2 = view.findViewById(R.id.action_bar);
        if (view2 instanceof ru) {
            ruVar = (ru) view2;
        } else if (view2 instanceof Toolbar) {
            ruVar = ((Toolbar) view2).m510g();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't make a decor toolbar out of ");
            stringBuilder.append(view2 != null ? view2.getClass().getSimpleName() : "null");
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f19405d = ruVar;
        this.f19406e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.f19404c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        ruVar = this.f19405d;
        if (ruVar == null || this.f19406e == null || this.f19404c == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(getClass().getSimpleName());
            stringBuilder2.append(" can only be used ");
            stringBuilder2.append("with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder2.toString());
        }
        this.f19402a = ruVar.f9146a.getContext();
        if ((this.f19405d.f9147b & 4) != 0) {
            this.f19417r = true;
        }
        nm a = nm.m5621a(this.f19402a);
        i = a.f8934a.getApplicationInfo().targetSdkVersion;
        m14144g(a.m5623b());
        TypedArray obtainStyledAttributes = this.f19402a.obtainStyledAttributes(null, ni.f8899a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(ni.f8911m, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f19403b;
            if (actionBarOverlayLayout.f10048c) {
                this.f19415n = true;
                actionBarOverlayLayout.m6804a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        i = obtainStyledAttributes.getDimensionPixelSize(ni.f8909k, 0);
        if (i != 0) {
            jm.m4549a(this.f19404c, (float) i);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void mo2384f() {
        m14144g(nm.m5621a(this.f19402a).m5623b());
    }

    /* renamed from: m */
    public final void mo2394m() {
        nx nxVar = this.f19414m;
        if (nxVar != null) {
            nxVar.m5655a();
            this.f19414m = null;
        }
    }

    /* renamed from: a */
    public final boolean mo2375a(int i, KeyEvent keyEvent) {
        nh nhVar = this.f19408g;
        if (nhVar == null) {
            return false;
        }
        Menu menu = nhVar.f19426a;
        if (menu == null) {
            return false;
        }
        int i2;
        boolean z;
        if (keyEvent == null) {
            i2 = -1;
        } else {
            i2 = keyEvent.getDeviceId();
        }
        if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
            z = true;
        } else {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final void mo2391a(int i) {
        this.f19421v = i;
    }

    /* renamed from: b */
    public final void mo2377b(boolean z) {
        if (!this.f19417r) {
            mo2380c(z);
        }
    }

    /* renamed from: c */
    public final void mo2380c(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m14141a(i, 4);
    }

    /* renamed from: a */
    private final void m14141a(int i, int i2) {
        ru ruVar = this.f19405d;
        int i3 = ruVar.f9147b;
        if ((i2 & 4) != 0) {
            this.f19417r = true;
        }
        ruVar.m5798a((i3 & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: j */
    public final void mo2388j() {
        m14141a(2, 2);
    }

    /* renamed from: g */
    private final void m14144g(boolean z) {
        this.f19420u = z;
        if (this.f19420u) {
            this.f19404c.f629a = null;
            this.f19405d.f9148c = null;
        } else {
            this.f19405d.f9148c = null;
            this.f19404c.f629a = null;
        }
        Toolbar toolbar = this.f19405d.f9146a;
        toolbar.f729t = false;
        toolbar.requestLayout();
        this.f19403b.f10049d = false;
    }

    /* renamed from: k */
    public final void mo2389k() {
        this.f19405d.m5799a(null);
    }

    /* renamed from: d */
    public final void mo2382d(boolean z) {
        this.f19424y = z;
        if (!z) {
            nx nxVar = this.f19414m;
            if (nxVar != null) {
                nxVar.m5655a();
            }
        }
    }

    /* renamed from: a */
    public final void mo2372a(CharSequence charSequence) {
        this.f19405d.m5800a(charSequence);
    }

    /* renamed from: b */
    public final void mo2376b(CharSequence charSequence) {
        this.f19405d.m5802b(charSequence);
    }

    /* renamed from: n */
    public final void mo2395n() {
        if (this.f19413l) {
            this.f19413l = false;
            m14145h(true);
        }
    }

    /* renamed from: a */
    public final nn mo2390a(no noVar) {
        nh nhVar = this.f19408g;
        if (nhVar != null) {
            nhVar.mo2400b();
        }
        this.f19403b.m6804a(false);
        this.f19406e.m6793b();
        nn nhVar2 = new nh(this, this.f19406e.getContext(), noVar);
        if (!nhVar2.m14170a()) {
            return null;
        }
        this.f19408g = nhVar2;
        nhVar2.mo2408h();
        this.f19406e.m6790a(nhVar2);
        m14158e(true);
        this.f19406e.sendAccessibilityEvent(32);
        return nhVar2;
    }

    /* renamed from: h */
    private final void m14145h(boolean z) {
        nx nxVar;
        float f;
        nx nxVar2;
        kd b;
        View view;
        if (ne.m14143a(false, this.f19413l, this.f19422w)) {
            if (!this.f19423x) {
                View view2;
                this.f19423x = true;
                nxVar = this.f19414m;
                if (nxVar != null) {
                    nxVar.m5655a();
                }
                this.f19404c.setVisibility(0);
                if (this.f19421v == 0 && (this.f19424y || z)) {
                    this.f19404c.setTranslationY(0.0f);
                    f = (float) (-this.f19404c.getHeight());
                    if (z) {
                        int[] iArr = new int[]{0, 0};
                        this.f19404c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f19404c.setTranslationY(f);
                    nxVar2 = new nx();
                    b = jm.m4547a(this.f19404c).m4773b(0.0f);
                    b.m4771a(this.f19401B);
                    nxVar2.m5653a(b);
                    if (this.f19411j) {
                        view = this.f19407f;
                        if (view != null) {
                            view.setTranslationY(f);
                            nxVar2.m5653a(jm.m4547a(this.f19407f).m4773b(0.0f));
                        }
                    }
                    nxVar2.m5652a(f19399p);
                    nxVar2.m5656b();
                    nxVar2.m5654a(this.f19400A);
                    this.f19414m = nxVar2;
                    nxVar2.m5657c();
                } else {
                    this.f19404c.setAlpha(1.0f);
                    this.f19404c.setTranslationY(0.0f);
                    if (this.f19411j) {
                        view2 = this.f19407f;
                        if (view2 != null) {
                            view2.setTranslationY(0.0f);
                        }
                    }
                    this.f19400A.mo2167b();
                }
                view2 = this.f19403b;
                if (view2 != null) {
                    jm.m4543B(view2);
                }
            }
        } else if (this.f19423x) {
            this.f19423x = false;
            nxVar = this.f19414m;
            if (nxVar != null) {
                nxVar.m5655a();
            }
            if (this.f19421v == 0 && (this.f19424y || z)) {
                this.f19404c.setAlpha(1.0f);
                this.f19404c.m410a(true);
                nxVar2 = new nx();
                f = (float) (-this.f19404c.getHeight());
                if (z) {
                    int[] iArr2 = new int[]{0, 0};
                    this.f19404c.getLocationInWindow(iArr2);
                    f -= (float) iArr2[1];
                }
                b = jm.m4547a(this.f19404c).m4773b(f);
                b.m4771a(this.f19401B);
                nxVar2.m5653a(b);
                if (this.f19411j) {
                    view = this.f19407f;
                    if (view != null) {
                        nxVar2.m5653a(jm.m4547a(view).m4773b(f));
                    }
                }
                nxVar2.m5652a(f19398o);
                nxVar2.m5656b();
                nxVar2.m5654a(this.f19425z);
                this.f19414m = nxVar2;
                nxVar2.m5657c();
                return;
            }
            this.f19425z.mo2167b();
        }
    }
}
