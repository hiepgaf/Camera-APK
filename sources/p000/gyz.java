package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: gyz */
public final class gyz {
    /* renamed from: a */
    public final BottomBarController f5827a;
    /* renamed from: b */
    public gyr f5828b;
    /* renamed from: c */
    public ViewfinderCover f5829c;
    /* renamed from: d */
    public gza f5830d;
    /* renamed from: e */
    public boolean f5831e;
    /* renamed from: f */
    public hhx f5832f;
    /* renamed from: g */
    public final boolean f5833g;
    /* renamed from: h */
    public final kbg f5834h;
    /* renamed from: i */
    private final aws f5835i;
    /* renamed from: j */
    private final hdm f5836j;
    /* renamed from: k */
    private final hcd f5837k;
    /* renamed from: l */
    private final hny f5838l;
    /* renamed from: m */
    private final ArrayList f5839m = new ArrayList();
    /* renamed from: n */
    private int f5840n;
    /* renamed from: o */
    private final HashMap f5841o = new HashMap();

    public gyz(het het, WindowManager windowManager, ilp ilp, irs irs, BottomBarController bottomBarController, aws aws, hdm hdm, hcd hcd, hny hny, kbg kbg) {
        this.f5830d = new gza(this, windowManager, ilp);
        this.f5829c = (ViewfinderCover) het.f6125e;
        this.f5827a = bottomBarController;
        this.f5835i = aws;
        this.f5836j = hdm;
        this.f5837k = hcd;
        this.f5838l = hny;
        this.f5834h = kbg;
        this.f5839m.add(hhx.PHOTO);
        this.f5839m.add(hhx.VIDEO);
        this.f5840n = 0;
        this.f5841o.put(hhx.PHOTO, Integer.valueOf(0));
        this.f5841o.put(hhx.VIDEO, Integer.valueOf(1));
        this.f5832f = (hhx) this.f5839m.get(this.f5840n);
        this.f5833g = this.f5834h.mo2084b();
        bottomBarController.addListener(new gyw(this, irs));
    }

    /* renamed from: d */
    private final void m2927d() {
        this.f5827a.setClickable(true);
        this.f5837k.m3027b(true);
        this.f5827a.setSwitchButtonClickEnabled(true);
        this.f5838l.m11921a(go.bG);
    }

    /* renamed from: a */
    final hhx m2928a(int i) {
        if (i != go.bn || m2935b()) {
            return (i != go.bo || m2932a()) ? null : (hhx) this.f5839m.get(this.f5840n - 1);
        } else {
            return (hhx) this.f5839m.get(this.f5840n + 1);
        }
    }

    /* renamed from: a */
    public final boolean m2932a() {
        return this.f5840n == 0;
    }

    /* renamed from: b */
    public final boolean m2935b() {
        return this.f5840n == this.f5839m.size() + -1;
    }

    /* renamed from: b */
    final boolean m2936b(int i) {
        if (i == go.bo) {
            if (!m2932a()) {
            }
            return false;
        }
        if (!(i == go.bn && m2935b())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    final void m2937c() {
        m2927d();
        m2931a(true);
        gyr gyr = this.f5828b;
        if (gyr != null) {
            gyr.mo2733M();
        }
    }

    /* renamed from: a */
    final void m2930a(hhx hhx) {
        this.f5827a.setClickable(false);
        this.f5837k.m3027b(false);
        this.f5827a.setSwitchButtonClickEnabled(false);
        this.f5838l.m11921a(go.bH);
        gyr gyr = this.f5828b;
        if (gyr != null && gyr.mo2763r() == hhx.PHOTO && hhx == hhx.VIDEO) {
            this.f5828b.mo2750b(hhx);
        }
    }

    /* renamed from: b */
    public final void m2934b(hhx hhx) {
        if (hhx != null) {
            this.f5832f = hhx;
            this.f5840n = ((Integer) this.f5841o.get(hhx)).intValue();
        }
        gza gza = this.f5830d;
        if (gza != null) {
            gza.f5845d = 0;
            gza.f5842a = 0.0f;
            gza.f5843b = 0.0f;
            gyz gyz = gza.f5844c;
            gyz.m2927d();
            gyz.m2931a(true);
        }
    }

    /* renamed from: a */
    public final void m2931a(boolean z) {
        this.f5830d.f5846e = z;
        this.f5827a.setSwitchButtonClickEnabled(z);
        this.f5836j.m11770a(z);
    }

    /* renamed from: a */
    public final void m2929a(float f, int i) {
        if (m2936b(i)) {
            hhx a = m2928a(i);
            if (a != null && this.f5841o.containsKey(a)) {
                int intValue = ((Integer) this.f5841o.get(a)).intValue();
                int i2 = this.f5840n;
                if (intValue < i2) {
                    intValue = go.bo;
                } else if (intValue > i2) {
                    intValue = go.bn;
                } else {
                    return;
                }
                m2931a(false);
                this.f5829c.m8431a();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 1.0f});
                ofFloat.setDuration(250);
                ofFloat.addUpdateListener(new gys(this, intValue));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) ((1.0f - f) * 250.0f), 0});
                ofInt.setDuration(250);
                ofInt.addUpdateListener(new gyt(this, a, intValue));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
                animatorSet.addListener(new gyx(this, a));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public final void m2933b(float f, int i) {
        if (f == 0.0f) {
            this.f5829c.setVisibility(8);
            this.f5831e = false;
        } else if (m2936b(i)) {
            hhx a = m2928a(i);
            if (a != null) {
                m2931a(false);
                this.f5829c.m8431a();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
                ofFloat.setDuration(250);
                ofFloat.addUpdateListener(new gyu(this, i));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) ((1.0f - f) * 250.0f), ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS});
                ofInt.setDuration(250);
                ofInt.addUpdateListener(new gyv(this, a, i));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
                animatorSet.addListener(new gyy(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: c */
    final void m2938c(hhx hhx) {
        gyr gyr = this.f5828b;
        if (!(gyr == null || hhx == null)) {
            this.f5832f = gyr.mo2763r();
            if (!this.f5835i.mo375c()) {
                m2931a(false);
                if (this.f5832f != hhx) {
                    this.f5828b.mo2744a(hhx);
                    this.f5840n = ((Integer) jri.m13152b((Integer) this.f5841o.get(hhx))).intValue();
                    this.f5832f = hhx;
                    if (this.f5833g) {
                        ((gzf) this.f5834h.mo2081a()).m2947c();
                    }
                }
            } else if (!this.f5833g) {
                if (this.f5832f == hhx.PHOTO) {
                    this.f5827a.setProgress(1.0f, true);
                    return;
                } else {
                    this.f5827a.setProgress(1.0f, false);
                    return;
                }
            } else {
                return;
            }
        }
        this.f5831e = false;
    }
}
