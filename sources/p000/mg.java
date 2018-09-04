package p000;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.LogLevel;

/* compiled from: PG */
/* renamed from: mg */
public final class mg extends mf implements Factory2, oq {
    /* renamed from: q */
    private static final int[] f19342q = new int[]{16842836};
    /* renamed from: A */
    private TextView f19343A;
    /* renamed from: B */
    private View f19344B;
    /* renamed from: C */
    private boolean f19345C;
    /* renamed from: D */
    private boolean f19346D;
    /* renamed from: E */
    private boolean f19347E;
    /* renamed from: F */
    private boolean f19348F;
    /* renamed from: G */
    private boolean f19349G;
    /* renamed from: H */
    private boolean f19350H;
    /* renamed from: I */
    private boolean f19351I;
    /* renamed from: J */
    private mt[] f19352J;
    /* renamed from: K */
    private boolean f19353K;
    /* renamed from: L */
    private int f19354L = -100;
    /* renamed from: M */
    private boolean f19355M;
    /* renamed from: N */
    private mq f19356N;
    /* renamed from: O */
    private final Runnable f19357O = new mh(this);
    /* renamed from: P */
    private boolean f19358P;
    /* renamed from: Q */
    private Rect f19359Q;
    /* renamed from: R */
    private Rect f19360R;
    /* renamed from: S */
    private mw f19361S;
    /* renamed from: b */
    public final Context f19362b;
    /* renamed from: c */
    public final Window f19363c;
    /* renamed from: d */
    public final me f19364d;
    /* renamed from: e */
    public rt f19365e;
    /* renamed from: f */
    public nn f19366f;
    /* renamed from: g */
    public ActionBarContextView f19367g;
    /* renamed from: h */
    public PopupWindow f19368h;
    /* renamed from: i */
    public Runnable f19369i;
    /* renamed from: j */
    public kd f19370j = null;
    /* renamed from: k */
    public boolean f19371k = true;
    /* renamed from: l */
    public boolean f19372l;
    /* renamed from: m */
    public mt f19373m;
    /* renamed from: n */
    public boolean f19374n;
    /* renamed from: o */
    public boolean f19375o;
    /* renamed from: p */
    public int f19376p;
    /* renamed from: r */
    private final Callback f19377r;
    /* renamed from: s */
    private final Callback f19378s;
    /* renamed from: t */
    private lt f19379t;
    /* renamed from: u */
    private MenuInflater f19380u;
    /* renamed from: v */
    private CharSequence f19381v;
    /* renamed from: w */
    private mm f19382w;
    /* renamed from: x */
    private mu f19383x;
    /* renamed from: y */
    private boolean f19384y;
    /* renamed from: z */
    private ViewGroup f19385z;

    mg(Context context, Window window, me meVar) {
        this.f19362b = context;
        this.f19363c = window;
        this.f19364d = meVar;
        this.f19377r = this.f19363c.getCallback();
        Callback callback = this.f19377r;
        if (callback instanceof mp) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f19378s = new mp(this, callback);
        this.f19363c.setCallback(this.f19378s);
        vk a = vk.m6046a(context, null, f19342q);
        Drawable c = a.m6054c(0);
        if (c != null) {
            this.f19363c.setBackgroundDrawable(c);
        }
        a.f9419b.recycle();
    }

    /* renamed from: a */
    public final void mo2334a(View view, LayoutParams layoutParams) {
        m14055p();
        ((ViewGroup) this.f19385z.findViewById(16908290)).addView(view, layoutParams);
        this.f19377r.onContentChanged();
    }

    /* renamed from: a */
    public final boolean mo2336a() {
        boolean z;
        int i;
        int i2 = this.f19354L;
        if (i2 == -100) {
            i2 = mf.f8825a;
        }
        switch (i2) {
            case 0:
                if (((UiModeManager) this.f19362b.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    m14054o();
                    mq mqVar = this.f19356N;
                    mqVar.f8829b = mqVar.f8828a.m5618a();
                    if (!mqVar.f8829b) {
                        z = true;
                        break;
                    }
                    i = 2;
                    break;
                }
            case LogLevel.kLogNever /*-100*/:
                i = -1;
                break;
            default:
                i = i2;
                break;
        }
        if (i == -1) {
            z = false;
        } else {
            Resources resources = this.f19362b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i3 = configuration.uiMode & 48;
            if (i == 2) {
                i = 32;
            } else {
                i = 16;
            }
            if (i3 == i) {
                z = false;
            } else if (m14058s()) {
                ((Activity) this.f19362b).recreate();
                z = true;
            } else {
                Configuration configuration2 = new Configuration(configuration);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                configuration2.uiMode = i | (configuration2.uiMode & -49);
                resources.updateConfiguration(configuration2, displayMetrics);
                z = true;
            }
        }
        if (i2 == 0) {
            m14054o();
            mq mqVar2 = this.f19356N;
            mqVar2.m5592a();
            if (mqVar2.f8830c == null) {
                mqVar2.f8830c = new mr(mqVar2);
            }
            if (mqVar2.f8831d == null) {
                mqVar2.f8831d = new IntentFilter();
                mqVar2.f8831d.addAction("android.intent.action.TIME_SET");
                mqVar2.f8831d.addAction("android.intent.action.TIMEZONE_CHANGED");
                mqVar2.f8831d.addAction("android.intent.action.TIME_TICK");
            }
            mqVar2.f8832e.f19362b.registerReceiver(mqVar2.f8830c, mqVar2.f8831d);
        }
        this.f19355M = true;
        return z;
    }

    /* renamed from: a */
    final void m14063a(int i, mt mtVar, Menu menu) {
        if (menu == null) {
            if (mtVar == null && i >= 0) {
                mt[] mtVarArr = this.f19352J;
                if (i < mtVarArr.length) {
                    mtVar = mtVarArr[i];
                }
            }
            if (mtVar != null) {
                menu = mtVar.f8841h;
            }
        }
        if ((mtVar == null || mtVar.f8846m) && !this.f19374n) {
            this.f19377r.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    final void m14069a(op opVar) {
        if (!this.f19351I) {
            this.f19351I = true;
            this.f19365e.mo293b();
            Callback callback = this.f19363c.getCallback();
            if (!(callback == null || this.f19374n)) {
                callback.onPanelClosed(108, opVar);
            }
            this.f19351I = false;
        }
    }

    /* renamed from: a */
    final void m14068a(mt mtVar, boolean z) {
        if (z && mtVar.f8834a == 0) {
            rt rtVar = this.f19365e;
            if (rtVar != null && rtVar.mo296f()) {
                m14069a(mtVar.f8841h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f19362b.getSystemService("window");
        if (windowManager != null && mtVar.f8846m) {
            View view = mtVar.f8838e;
            if (view != null) {
                windowManager.removeView(view);
                if (z) {
                    m14063a(mtVar.f8834a, mtVar, null);
                }
            }
        }
        mtVar.f8844k = false;
        mtVar.f8845l = false;
        mtVar.f8846m = false;
        mtVar.f8839f = null;
        mtVar.f8848o = true;
        if (this.f19373m == mtVar) {
            this.f19373m = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final android.view.View m14051a(java.lang.String r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.f19361S;
        if (r0 != 0) goto L_0x0028;
    L_0x0005:
        r0 = r5.f19362b;
        r2 = p000.ni.aj;
        r0 = r0.obtainStyledAttributes(r2);
        r2 = p000.ni.an;
        r2 = r0.getString(r2);
        if (r2 == 0) goto L_0x0021;
    L_0x0015:
        r0 = p000.mw.class;
        r0 = r0.getName();
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0144;
    L_0x0021:
        r0 = new mw;
        r0.<init>();
        r5.f19361S = r0;
    L_0x0028:
        r2 = r5.f19361S;
        r3 = p000.mw.m5608n(r7, r8);
        r0 = r6.hashCode();
        switch(r0) {
            case -1946472170: goto L_0x0138;
            case -1455429095: goto L_0x012c;
            case -1346021293: goto L_0x0120;
            case -938935918: goto L_0x0115;
            case -937446323: goto L_0x010a;
            case -658531749: goto L_0x00fe;
            case -339785223: goto L_0x00f3;
            case 776382189: goto L_0x00e8;
            case 1125864064: goto L_0x00dd;
            case 1413872058: goto L_0x00d1;
            case 1601505219: goto L_0x00c6;
            case 1666676343: goto L_0x00bb;
            case 2001146706: goto L_0x00b0;
            default: goto L_0x0035;
        };
    L_0x0035:
        r0 = -1;
    L_0x0036:
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x00a8;
            case 2: goto L_0x00a0;
            case 3: goto L_0x0098;
            case 4: goto L_0x0090;
            case 5: goto L_0x0088;
            case 6: goto L_0x0080;
            case 7: goto L_0x0078;
            case 8: goto L_0x0070;
            case 9: goto L_0x0068;
            case 10: goto L_0x0060;
            case 11: goto L_0x0058;
            case 12: goto L_0x0050;
            default: goto L_0x0039;
        };
    L_0x0039:
        r0 = 0;
    L_0x003a:
        if (r0 != 0) goto L_0x0042;
    L_0x003c:
        if (r7 == r3) goto L_0x0042;
    L_0x003e:
        r0 = r2.m5609a(r3, r6, r8);
    L_0x0042:
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        p000.mw.m5595a(r0, r8);
    L_0x0047:
        return r0;
    L_0x0048:
        r0 = p000.mw.m5607m(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0050:
        r0 = p000.mw.m5605k(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0058:
        r0 = p000.mw.m5604j(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0060:
        r0 = p000.mw.m5602h(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0068:
        r0 = p000.mw.m5596b(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0070:
        r0 = p000.mw.m5598d(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0078:
        r0 = p000.mw.m5603i(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0080:
        r0 = p000.mw.m5597c(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0088:
        r0 = p000.mw.m5600f(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0090:
        r0 = p000.mw.m5606l(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x0098:
        r0 = p000.mw.m5599e(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x00a0:
        r0 = r2.mo131a(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x00a8:
        r0 = p000.mw.m5601g(r3, r8);
        r2.m5611a(r0, r6);
        goto L_0x003a;
    L_0x00b0:
        r0 = "Button";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00b8:
        r0 = 2;
        goto L_0x0036;
    L_0x00bb:
        r0 = "EditText";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00c3:
        r0 = 3;
        goto L_0x0036;
    L_0x00c6:
        r0 = "CheckBox";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00ce:
        r0 = 6;
        goto L_0x0036;
    L_0x00d1:
        r0 = "AutoCompleteTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00d9:
        r0 = 9;
        goto L_0x0036;
    L_0x00dd:
        r0 = "ImageView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00e5:
        r0 = 1;
        goto L_0x0036;
    L_0x00e8:
        r0 = "RadioButton";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00f0:
        r0 = 7;
        goto L_0x0036;
    L_0x00f3:
        r0 = "Spinner";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00fb:
        r0 = 4;
        goto L_0x0036;
    L_0x00fe:
        r0 = "SeekBar";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0106:
        r0 = 12;
        goto L_0x0036;
    L_0x010a:
        r0 = "ImageButton";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0112:
        r0 = 5;
        goto L_0x0036;
    L_0x0115:
        r0 = "TextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x011d:
        r0 = r1;
        goto L_0x0036;
    L_0x0120:
        r0 = "MultiAutoCompleteTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0128:
        r0 = 10;
        goto L_0x0036;
    L_0x012c:
        r0 = "CheckedTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0134:
        r0 = 8;
        goto L_0x0036;
    L_0x0138:
        r0 = "RatingBar";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0140:
        r0 = 11;
        goto L_0x0036;
    L_0x0144:
        r0 = java.lang.Class.forName(r2);	 Catch:{ all -> 0x015c }
        r3 = 0;
        r3 = new java.lang.Class[r3];	 Catch:{ all -> 0x015c }
        r0 = r0.getDeclaredConstructor(r3);	 Catch:{ all -> 0x015c }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x015c }
        r0 = r0.newInstance(r3);	 Catch:{ all -> 0x015c }
        r0 = (p000.mw) r0;	 Catch:{ all -> 0x015c }
        r5.f19361S = r0;	 Catch:{ all -> 0x015c }
        goto L_0x0028;
    L_0x015c:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Failed to instantiate custom view inflater ";
        r3.append(r4);
        r3.append(r2);
        r2 = ". Falling back to default.";
        r3.append(r2);
        r2 = "AppCompatDelegate";
        r3 = r3.toString();
        android.util.Log.i(r2, r3, r0);
        r0 = new mw;
        r0.<init>();
        r5.f19361S = r0;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.a(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: a */
    final boolean m14071a(KeyEvent keyEvent) {
        boolean z = false;
        this.f19363c.getDecorView();
        jm.m4566b();
        if (keyEvent.getKeyCode() == 82 && this.f19377r.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2;
        if (keyEvent.getAction() != 0) {
            mt e;
            switch (keyCode) {
                case 4:
                    z2 = this.f19353K;
                    this.f19353K = false;
                    e = m14083e(0);
                    if (e != null && e.f8846m) {
                        if (!z2) {
                            m14068a(e, true);
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    }
                    nn nnVar = this.f19366f;
                    if (nnVar != null) {
                        nnVar.mo2400b();
                        z2 = true;
                    } else {
                        lt c = mo2342c();
                        if (c == null) {
                            z2 = false;
                        } else if (c.mo2378b()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                    break;
                case 82:
                    if (this.f19366f != null) {
                        z = true;
                        break;
                    }
                    e = m14083e(0);
                    rt rtVar = this.f19365e;
                    if (rtVar == null || !rtVar.mo292a() || ViewConfiguration.get(this.f19362b).hasPermanentMenuKey()) {
                        z2 = e.f8846m;
                        if (z2 || e.f8845l) {
                            m14068a(e, true);
                        } else if (e.f8844k) {
                            if (e.f8849p) {
                                e.f8844k = false;
                                z2 = m14073a(e, keyEvent);
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                m14052b(e, keyEvent);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else if (this.f19365e.mo296f()) {
                        z2 = this.f19365e.mo294d();
                    } else if (this.f19374n) {
                        z2 = false;
                    } else if (m14073a(e, keyEvent)) {
                        z2 = this.f19365e.mo298i();
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z = true;
                        break;
                    }
                    AudioManager audioManager = (AudioManager) this.f19362b.getSystemService("audio");
                    if (audioManager == null) {
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        z = true;
                        break;
                    }
                    audioManager.playSoundEffect(0);
                    z = true;
                    break;
                    break;
            }
            if (z) {
                return true;
            }
        }
        switch (keyCode) {
            case 4:
                if ((keyEvent.getFlags() & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f19353K = z2;
                break;
            case 82:
                if (keyEvent.getRepeatCount() != 0) {
                    z = true;
                    break;
                }
                mt e2 = m14083e(0);
                if (!e2.f8846m) {
                    m14073a(e2, keyEvent);
                    z = true;
                    break;
                }
                z = true;
                break;
        }
        if (z) {
            return true;
        }
        return jm.m4562a();
    }

    /* renamed from: d */
    final void m14082d(int i) {
        mt e = m14083e(i);
        if (e.f8841h != null) {
            Bundle bundle = new Bundle();
            e.f8841h.m14253b(bundle);
            if (bundle.size() > 0) {
                e.f8850q = bundle;
            }
            e.f8841h.m14266l();
            e.f8841h.clear();
        }
        e.f8849p = true;
        e.f8848o = true;
        if (i != 108) {
            if (i != 0) {
                return;
            }
        }
        if (this.f19365e != null) {
            e = m14083e(0);
            if (e != null) {
                e.f8844k = false;
                m14073a(e, null);
            }
        }
    }

    /* renamed from: l */
    public final void m14092l() {
        kd kdVar = this.f19370j;
        if (kdVar != null) {
            kdVar.m4772a();
        }
    }

    /* renamed from: o */
    private final void m14054o() {
        if (this.f19356N == null) {
            Context context = this.f19362b;
            if (nc.f8867a == null) {
                Context applicationContext = context.getApplicationContext();
                nc.f8867a = new nc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f19356N = new mq(this, nc.f8867a);
        }
    }

    /* renamed from: p */
    private final void m14055p() {
        if (!this.f19384y) {
            TypedArray obtainStyledAttributes = this.f19362b.obtainStyledAttributes(ni.aj);
            if (obtainStyledAttributes.hasValue(ni.ao)) {
                View view;
                if (obtainStyledAttributes.getBoolean(ni.av, false)) {
                    mo2341b(1);
                } else if (obtainStyledAttributes.getBoolean(ni.ao, false)) {
                    mo2341b(108);
                }
                if (obtainStyledAttributes.getBoolean(ni.ap, false)) {
                    mo2341b(109);
                }
                if (obtainStyledAttributes.getBoolean(ni.aq, false)) {
                    mo2341b(10);
                }
                this.f19349G = obtainStyledAttributes.getBoolean(ni.al, false);
                obtainStyledAttributes.recycle();
                this.f19363c.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f19362b);
                View view2;
                if (this.f19350H) {
                    if (this.f19348F) {
                        view2 = (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, null);
                    } else {
                        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple, null);
                    }
                    jm.m4560a(view2, new mi(this));
                    view = view2;
                } else if (this.f19349G) {
                    view2 = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, null);
                    this.f19347E = false;
                    this.f19372l = false;
                    view = view2;
                } else if (this.f19372l) {
                    Context nqVar;
                    TypedValue typedValue = new TypedValue();
                    this.f19362b.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        nqVar = new nq(this.f19362b, typedValue.resourceId);
                    } else {
                        nqVar = this.f19362b;
                    }
                    view2 = (ViewGroup) LayoutInflater.from(nqVar).inflate(R.layout.abc_screen_toolbar, null);
                    this.f19365e = (rt) view2.findViewById(R.id.decor_content_parent);
                    this.f19365e.mo290a(this.f19363c.getCallback());
                    if (this.f19347E) {
                        this.f19365e.mo288a(109);
                    }
                    if (this.f19345C) {
                        this.f19365e.mo288a(2);
                    }
                    if (this.f19346D) {
                        this.f19365e.mo288a(5);
                        view = view2;
                    } else {
                        view = view2;
                    }
                } else {
                    view = null;
                }
                if (view == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
                    stringBuilder.append(this.f19372l);
                    stringBuilder.append(", windowActionBarOverlay: ");
                    stringBuilder.append(this.f19347E);
                    stringBuilder.append(", android:windowIsFloating: ");
                    stringBuilder.append(this.f19349G);
                    stringBuilder.append(", windowActionModeOverlay: ");
                    stringBuilder.append(this.f19348F);
                    stringBuilder.append(", windowNoTitle: ");
                    stringBuilder.append(this.f19350H);
                    stringBuilder.append(" }");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                CharSequence title;
                if (this.f19365e == null) {
                    this.f19343A = (TextView) view.findViewById(R.id.title);
                }
                vx.m6077b(view);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f19363c.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f19363c.setContentView(view);
                contentFrameLayout.f649h = new rs(this);
                this.f19385z = view;
                Callback callback = this.f19377r;
                if (callback instanceof Activity) {
                    title = ((Activity) callback).getTitle();
                } else {
                    title = this.f19381v;
                }
                if (!TextUtils.isEmpty(title)) {
                    rt rtVar = this.f19365e;
                    if (rtVar != null) {
                        rtVar.mo291a(title);
                    } else {
                        lt ltVar = this.f19379t;
                        if (ltVar != null) {
                            ltVar.mo2376b(title);
                        } else {
                            TextView textView = this.f19343A;
                            if (textView != null) {
                                textView.setText(title);
                            }
                        }
                    }
                }
                contentFrameLayout = (ContentFrameLayout) this.f19385z.findViewById(16908290);
                View decorView = this.f19363c.getDecorView();
                contentFrameLayout.f648g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                if (jm.m4590x(contentFrameLayout)) {
                    contentFrameLayout.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.f19362b.obtainStyledAttributes(ni.aj);
                if (contentFrameLayout.f642a == null) {
                    contentFrameLayout.f642a = new TypedValue();
                }
                obtainStyledAttributes2.getValue(10, contentFrameLayout.f642a);
                if (contentFrameLayout.f643b == null) {
                    contentFrameLayout.f643b = new TypedValue();
                }
                obtainStyledAttributes2.getValue(11, contentFrameLayout.f643b);
                if (obtainStyledAttributes2.hasValue(ni.at)) {
                    if (contentFrameLayout.f644c == null) {
                        contentFrameLayout.f644c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(6, contentFrameLayout.f644c);
                }
                if (obtainStyledAttributes2.hasValue(ni.au)) {
                    if (contentFrameLayout.f645d == null) {
                        contentFrameLayout.f645d = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(8, contentFrameLayout.f645d);
                }
                if (obtainStyledAttributes2.hasValue(ni.ar)) {
                    if (contentFrameLayout.f646e == null) {
                        contentFrameLayout.f646e = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(9, contentFrameLayout.f646e);
                }
                if (obtainStyledAttributes2.hasValue(ni.as)) {
                    if (contentFrameLayout.f647f == null) {
                        contentFrameLayout.f647f = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(7, contentFrameLayout.f647f);
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.f19384y = true;
                mt e = m14083e(0);
                if (!this.f19374n) {
                    if (e == null || e.f8841h == null) {
                        m14053g(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: a */
    final mt m14061a(Menu menu) {
        int length;
        mt[] mtVarArr = this.f19352J;
        if (mtVarArr != null) {
            length = mtVarArr.length;
        } else {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            mt mtVar = mtVarArr[i];
            if (mtVar != null && mtVar.f8841h == menu) {
                return mtVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final View mo2331a(int i) {
        m14055p();
        return this.f19363c.findViewById(i);
    }

    /* renamed from: q */
    private final Context m14056q() {
        Context d;
        lt c = mo2342c();
        if (c != null) {
            d = c.mo2381d();
        } else {
            d = null;
        }
        if (d == null) {
            return this.f19362b;
        }
        return d;
    }

    /* renamed from: b */
    public final MenuInflater mo2338b() {
        if (this.f19380u == null) {
            Context context;
            m14057r();
            lt ltVar = this.f19379t;
            if (ltVar == null) {
                context = this.f19362b;
            } else {
                context = ltVar.mo2381d();
            }
            this.f19380u = new nu(context);
        }
        return this.f19380u;
    }

    /* renamed from: e */
    public final mt m14083e(int i) {
        Object obj = this.f19352J;
        if (obj == null || obj.length <= i) {
            Object obj2 = new mt[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f19352J = obj2;
            obj = obj2;
        }
        mt mtVar = obj[i];
        if (mtVar != null) {
            return mtVar;
        }
        mtVar = new mt(i);
        obj[i] = mtVar;
        return mtVar;
    }

    /* renamed from: c */
    public final lt mo2342c() {
        m14057r();
        return this.f19379t;
    }

    /* renamed from: r */
    private final void m14057r() {
        m14055p();
        if (this.f19372l && this.f19379t == null) {
            Callback callback = this.f19377r;
            if (callback instanceof Activity) {
                this.f19379t = new ne((Activity) callback, this.f19347E);
            } else if (callback instanceof Dialog) {
                this.f19379t = new ne((Dialog) callback);
            }
            lt ltVar = this.f19379t;
            if (ltVar != null) {
                ltVar.mo2377b(this.f19358P);
            }
        }
    }

    /* renamed from: d */
    public final void mo2344d() {
        LayoutInflater from = LayoutInflater.from(this.f19362b);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof mg)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: e */
    public final void mo2345e() {
        lt c = mo2342c();
        if (c != null) {
            c.mo2383e();
        }
        m14053g(0);
    }

    /* renamed from: g */
    private final void m14053g(int i) {
        this.f19376p |= 1 << i;
        if (!this.f19375o) {
            jm.m4556a(this.f19363c.getDecorView(), this.f19357O);
            this.f19375o = true;
        }
    }

    /* renamed from: f */
    public final void mo2346f() {
        if (this.f19372l && this.f19384y) {
            lt c = mo2342c();
            if (c != null) {
                c.mo2384f();
            }
        }
        qq a = qq.m5725a();
        Context context = this.f19362b;
        synchronized (a.f9072a) {
            in inVar = (in) a.f9073b.get(context);
            if (inVar != null) {
                inVar.m3865a();
            }
        }
        mo2336a();
    }

    /* renamed from: a */
    public final void mo2332a(Bundle bundle) {
        Callback callback = this.f19377r;
        if ((callback instanceof Activity) && NavUtils.getParentActivityName((Activity) callback) != null) {
            lt ltVar = this.f19379t;
            if (ltVar == null) {
                this.f19358P = true;
            } else {
                ltVar.mo2377b(true);
            }
        }
        if (bundle != null && this.f19354L == -100) {
            this.f19354L = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m14051a(str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: g */
    public final void mo2347g() {
        if (this.f19375o) {
            this.f19363c.getDecorView().removeCallbacks(this.f19357O);
        }
        this.f19374n = true;
        lt ltVar = this.f19379t;
        if (ltVar != null) {
            ltVar.mo2385g();
        }
        mq mqVar = this.f19356N;
        if (mqVar != null) {
            mqVar.m5592a();
        }
    }

    /* renamed from: a */
    public final boolean mo2337a(op opVar, MenuItem menuItem) {
        Callback callback = this.f19363c.getCallback();
        if (!(callback == null || this.f19374n)) {
            mt a = m14061a(opVar.mo3318d());
            if (a != null) {
                return callback.onMenuItemSelected(a.f8834a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo2352m() {
        rt rtVar = this.f19365e;
        if (rtVar == null || !rtVar.mo292a() || (ViewConfiguration.get(this.f19362b).hasPermanentMenuKey() && !this.f19365e.mo295e())) {
            mt e = m14083e(0);
            e.f8848o = true;
            m14068a(e, false);
            m14052b(e, null);
            return;
        }
        Callback callback = this.f19363c.getCallback();
        if (this.f19365e.mo296f()) {
            this.f19365e.mo294d();
            if (!this.f19374n) {
                callback.onPanelClosed(108, m14083e(0).f8841h);
            }
        } else if (callback != null && !this.f19374n) {
            if (this.f19375o && (this.f19376p & 1) != 0) {
                this.f19363c.getDecorView().removeCallbacks(this.f19357O);
                this.f19357O.run();
            }
            mt e2 = m14083e(0);
            Menu menu = e2.f8841h;
            if (menu != null && !e2.f8849p && callback.onPreparePanel(0, e2.f8840g, menu)) {
                callback.onMenuOpened(108, e2.f8841h);
                this.f19365e.mo298i();
            }
        }
    }

    /* renamed from: h */
    public final void mo2348h() {
        m14055p();
    }

    /* renamed from: i */
    public final void mo2349i() {
        lt c = mo2342c();
        if (c != null) {
            c.mo2382d(true);
        }
    }

    /* renamed from: b */
    public final void mo2339b(Bundle bundle) {
        int i = this.f19354L;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: j */
    public final void mo2350j() {
        mo2336a();
    }

    /* renamed from: k */
    public final void mo2351k() {
        lt c = mo2342c();
        if (c != null) {
            c.mo2382d(false);
        }
        mq mqVar = this.f19356N;
        if (mqVar != null) {
            mqVar.m5592a();
        }
    }

    /* renamed from: b */
    private final void m14052b(mt mtVar, KeyEvent keyEvent) {
        int i = -1;
        if (!mtVar.f8846m && !this.f19374n) {
            if (mtVar.f8834a != 0 || (this.f19362b.getResources().getConfiguration().screenLayout & 15) != 4) {
                Callback callback = this.f19363c.getCallback();
                if (callback == null || callback.onMenuOpened(mtVar.f8834a, mtVar.f8841h)) {
                    WindowManager windowManager = (WindowManager) this.f19362b.getSystemService("window");
                    if (windowManager != null && m14073a(mtVar, keyEvent)) {
                        LayoutParams layoutParams;
                        ViewGroup viewGroup = mtVar.f8838e;
                        View view;
                        if (viewGroup == null || mtVar.f8848o) {
                            boolean z;
                            if (viewGroup == null) {
                                Context q = m14056q();
                                TypedValue typedValue = new TypedValue();
                                Theme newTheme = q.getResources().newTheme();
                                newTheme.setTo(q.getTheme());
                                newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                }
                                newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                } else {
                                    newTheme.applyStyle(R.style.Theme.AppCompat.CompactMenu, true);
                                }
                                Context nqVar = new nq(q, 0);
                                nqVar.getTheme().setTo(newTheme);
                                mtVar.f8843j = nqVar;
                                TypedArray obtainStyledAttributes = nqVar.obtainStyledAttributes(ni.aj);
                                mtVar.f8835b = obtainStyledAttributes.getResourceId(ni.am, 0);
                                mtVar.f8837d = obtainStyledAttributes.getResourceId(ni.ak, 0);
                                obtainStyledAttributes.recycle();
                                mtVar.f8838e = new ms(this, mtVar.f8843j);
                                mtVar.f8836c = 81;
                                if (mtVar.f8838e == null) {
                                    return;
                                }
                            } else if (mtVar.f8848o && viewGroup.getChildCount() > 0) {
                                mtVar.f8838e.removeAllViews();
                            }
                            view = mtVar.f8840g;
                            if (view != null) {
                                mtVar.f8839f = view;
                                z = true;
                            } else if (mtVar.f8841h == null) {
                                z = false;
                            } else {
                                ExpandedMenuView expandedMenuView;
                                if (this.f19383x == null) {
                                    this.f19383x = new mu(this);
                                }
                                pf pfVar = this.f19383x;
                                if (mtVar.f8841h != null) {
                                    if (mtVar.f8842i == null) {
                                        mtVar.f8842i = new om(mtVar.f8843j);
                                        pe peVar = mtVar.f8842i;
                                        peVar.f19475e = pfVar;
                                        mtVar.f8841h.m14246a(peVar);
                                    }
                                    Object obj = mtVar.f8842i;
                                    viewGroup = mtVar.f8838e;
                                    if (obj.f19473c == null) {
                                        obj.f19473c = (ExpandedMenuView) obj.f19471a.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
                                        if (obj.f19476f == null) {
                                            obj.f19476f = new on(obj);
                                        }
                                        obj.f19473c.setAdapter(obj.f19476f);
                                        obj.f19473c.setOnItemClickListener(obj);
                                    }
                                    expandedMenuView = obj.f19473c;
                                } else {
                                    expandedMenuView = null;
                                }
                                mtVar.f8839f = expandedMenuView;
                                if (mtVar.f8839f != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                if (mtVar.f8839f == null) {
                                    z = false;
                                } else if (mtVar.f8840g != null) {
                                    z = true;
                                } else if (mtVar.f8842i.m14236b().getCount() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    LayoutParams layoutParams2;
                                    layoutParams = mtVar.f8839f.getLayoutParams();
                                    if (layoutParams == null) {
                                        layoutParams2 = new LayoutParams(-2, -2);
                                    } else {
                                        layoutParams2 = layoutParams;
                                    }
                                    mtVar.f8838e.setBackgroundResource(mtVar.f8835b);
                                    ViewParent parent = mtVar.f8839f.getParent();
                                    if (parent != null && (parent instanceof ViewGroup)) {
                                        ((ViewGroup) parent).removeView(mtVar.f8839f);
                                    }
                                    mtVar.f8838e.addView(mtVar.f8839f, layoutParams2);
                                    if (mtVar.f8839f.hasFocus()) {
                                        i = -2;
                                    } else {
                                        mtVar.f8839f.requestFocus();
                                        i = -2;
                                    }
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        view = mtVar.f8840g;
                        if (view == null) {
                            i = -2;
                        } else {
                            layoutParams = view.getLayoutParams();
                            if (layoutParams == null) {
                                i = -2;
                            } else if (layoutParams.width != -1) {
                                i = -2;
                            }
                        }
                        mtVar.f8845l = false;
                        layoutParams = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams.gravity = mtVar.f8836c;
                        layoutParams.windowAnimations = mtVar.f8837d;
                        windowManager.addView(mtVar.f8838e, layoutParams);
                        mtVar.f8846m = true;
                        return;
                    }
                    return;
                }
                m14068a(mtVar, true);
            }
        }
    }

    /* renamed from: a */
    final boolean m14072a(mt mtVar, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if (!mtVar.f8844k) {
            if (!m14073a(mtVar, keyEvent)) {
                return false;
            }
        }
        op opVar = mtVar.f8841h;
        if (opVar != null) {
            return opVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: a */
    final boolean m14073a(mt mtVar, KeyEvent keyEvent) {
        if (this.f19374n) {
            return false;
        }
        if (mtVar.f8844k) {
            return true;
        }
        rt rtVar;
        mt mtVar2 = this.f19373m;
        if (!(mtVar2 == null || mtVar2 == mtVar)) {
            m14068a(mtVar2, false);
        }
        Callback callback = this.f19363c.getCallback();
        if (callback != null) {
            mtVar.f8840g = callback.onCreatePanelView(mtVar.f8834a);
        }
        int i = mtVar.f8834a;
        boolean z = i == 0 ? true : i == 108;
        if (z) {
            rtVar = this.f19365e;
            if (rtVar != null) {
                rtVar.mo297g();
            }
        }
        if (mtVar.f8840g == null) {
            if (z) {
                if (!(this.f19379t instanceof my)) {
                }
            }
            op opVar = mtVar.f8841h;
            if (opVar == null || mtVar.f8849p) {
                if (opVar == null) {
                    Context context;
                    Context context2 = this.f19362b;
                    i = mtVar.f8834a;
                    if (i != 0 && i != 108) {
                        context = context2;
                    } else if (this.f19365e != null) {
                        Theme newTheme;
                        Theme theme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme2 = context2.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context2.getResources().newTheme();
                            newTheme.setTo(theme2);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            newTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (newTheme == null) {
                                newTheme = context2.getResources().newTheme();
                                newTheme.setTo(theme2);
                            }
                            newTheme.applyStyle(typedValue.resourceId, true);
                            theme = newTheme;
                        } else {
                            theme = newTheme;
                        }
                        if (theme != null) {
                            context = new nq(context2, 0);
                            context.getTheme().setTo(theme);
                        } else {
                            context = context2;
                        }
                    } else {
                        context = context2;
                    }
                    op opVar2 = new op(context);
                    opVar2.mo3313a((oq) this);
                    mtVar.m5593a(opVar2);
                    if (mtVar.f8841h == null) {
                        return false;
                    }
                }
                if (z && this.f19365e != null) {
                    if (this.f19382w == null) {
                        this.f19382w = new mm(this);
                    }
                    this.f19365e.mo289a(mtVar.f8841h, this.f19382w);
                }
                mtVar.f8841h.m14266l();
                if (callback.onCreatePanelMenu(mtVar.f8834a, mtVar.f8841h)) {
                    mtVar.f8849p = false;
                } else {
                    mtVar.m5593a(null);
                    if (!z) {
                        return false;
                    }
                    rtVar = this.f19365e;
                    if (rtVar == null) {
                        return false;
                    }
                    rtVar.mo289a(null, this.f19382w);
                    return false;
                }
            }
            mtVar.f8841h.m14266l();
            Bundle bundle = mtVar.f8850q;
            if (bundle != null) {
                mtVar.f8841h.m14244a(bundle);
                mtVar.f8850q = null;
            }
            if (callback.onPreparePanel(0, mtVar.f8840g, mtVar.f8841h)) {
                boolean z2;
                if (keyEvent == null) {
                    i = -1;
                } else {
                    i = keyEvent.getDeviceId();
                }
                if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mtVar.f8847n = z2;
                mtVar.f8841h.setQwertyMode(mtVar.f8847n);
                mtVar.f8841h.m14265k();
            } else {
                if (z) {
                    rtVar = this.f19365e;
                    if (rtVar != null) {
                        rtVar.mo289a(null, this.f19382w);
                    }
                }
                mtVar.f8841h.m14265k();
                return false;
            }
        }
        mtVar.f8844k = true;
        mtVar.f8845l = false;
        this.f19373m = mtVar;
        return true;
    }

    /* renamed from: b */
    public final boolean mo2341b(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f19350H && i == 108) {
            return false;
        }
        if (this.f19372l && i == 1) {
            this.f19372l = false;
        }
        switch (i) {
            case 1:
                m14059t();
                this.f19350H = true;
                return true;
            case 2:
                m14059t();
                this.f19345C = true;
                return true;
            case 5:
                m14059t();
                this.f19346D = true;
                return true;
            case 10:
                m14059t();
                this.f19348F = true;
                return true;
            case 108:
                m14059t();
                this.f19372l = true;
                return true;
            case 109:
                m14059t();
                this.f19347E = true;
                return true;
            default:
                return this.f19363c.requestFeature(i);
        }
    }

    /* renamed from: c */
    public final void mo2343c(int i) {
        m14055p();
        ViewGroup viewGroup = (ViewGroup) this.f19385z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f19362b).inflate(i, viewGroup);
        this.f19377r.onContentChanged();
    }

    /* renamed from: a */
    public final void mo2333a(View view) {
        m14055p();
        ViewGroup viewGroup = (ViewGroup) this.f19385z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f19377r.onContentChanged();
    }

    /* renamed from: b */
    public final void mo2340b(View view, LayoutParams layoutParams) {
        m14055p();
        ViewGroup viewGroup = (ViewGroup) this.f19385z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f19377r.onContentChanged();
    }

    /* renamed from: a */
    public final void mo2335a(CharSequence charSequence) {
        this.f19381v = charSequence;
        rt rtVar = this.f19365e;
        if (rtVar != null) {
            rtVar.mo291a(charSequence);
            return;
        }
        lt ltVar = this.f19379t;
        if (ltVar != null) {
            ltVar.mo2376b(charSequence);
            return;
        }
        TextView textView = this.f19343A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: n */
    final boolean m14094n() {
        if (this.f19384y) {
            View view = this.f19385z;
            if (view != null && jm.m4590x(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    private final boolean m14058s() {
        if (this.f19355M) {
            Context context = this.f19362b;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f19362b;
                    if ((packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (Throwable e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    final nn m14062a(no noVar) {
        m14092l();
        nn nnVar = this.f19366f;
        if (nnVar != null) {
            nnVar.mo2400b();
        }
        me meVar = this.f19364d;
        if (!(meVar == null || this.f19374n)) {
            try {
                meVar.mo2371d();
            } catch (AbstractMethodError e) {
            }
        }
        if (this.f19367g == null) {
            if (this.f19349G) {
                Context nqVar;
                TypedValue typedValue = new TypedValue();
                Theme theme = this.f19362b.getTheme();
                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Theme newTheme = this.f19362b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    nqVar = new nq(this.f19362b, 0);
                    nqVar.getTheme().setTo(newTheme);
                } else {
                    nqVar = this.f19362b;
                }
                this.f19367g = new ActionBarContextView(nqVar);
                this.f19368h = new PopupWindow(nqVar, null, R.attr.actionModePopupWindowStyle);
                this.f19368h.setWindowLayoutType(2);
                this.f19368h.setContentView(this.f19367g);
                this.f19368h.setWidth(-1);
                nqVar.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                this.f19367g.d = TypedValue.complexToDimensionPixelSize(typedValue.data, nqVar.getResources().getDisplayMetrics());
                this.f19368h.setHeight(-2);
                this.f19369i = new mj(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f19385z.findViewById(R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.f736a = LayoutInflater.from(m14056q());
                    this.f19367g = (ActionBarContextView) viewStubCompat.m513a();
                }
            }
        }
        if (this.f19367g != null) {
            m14092l();
            this.f19367g.m6793b();
            nnVar = new nr(this.f19367g.getContext(), this.f19367g, noVar);
            if (noVar.mo2356a(nnVar, nnVar.mo2404d())) {
                nnVar.mo2408h();
                this.f19367g.m6790a(nnVar);
                this.f19366f = nnVar;
                if (m14094n()) {
                    this.f19367g.setAlpha(0.0f);
                    this.f19370j = jm.m4547a(this.f19367g).m4768a(1.0f);
                    this.f19370j.m4770a(new ml(this));
                } else {
                    this.f19367g.setAlpha(1.0f);
                    this.f19367g.setVisibility(0);
                    this.f19367g.sendAccessibilityEvent(32);
                    if (this.f19367g.getParent() instanceof View) {
                        jm.m4543B((View) this.f19367g.getParent());
                    }
                }
                if (this.f19368h != null) {
                    this.f19363c.getDecorView().post(this.f19369i);
                }
            } else {
                this.f19366f = null;
            }
        }
        if (this.f19366f != null) {
            meVar = this.f19364d;
            if (meVar != null) {
                meVar.mo2370c();
            }
        }
        return this.f19366f;
    }

    /* renamed from: t */
    private final void m14059t() {
        if (this.f19384y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: f */
    public final int m14085f(int i) {
        int i2;
        View view;
        int i3 = 1;
        int i4 = 0;
        ActionBarContextView actionBarContextView = this.f19367g;
        if (actionBarContextView == null) {
            i2 = 0;
        } else if (actionBarContextView.getLayoutParams() instanceof MarginLayoutParams) {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f19367g.getLayoutParams();
            if (this.f19367g.isShown()) {
                if (this.f19359Q == null) {
                    this.f19359Q = new Rect();
                    this.f19360R = new Rect();
                }
                Rect rect = this.f19359Q;
                Rect rect2 = this.f19360R;
                rect.set(0, i, 0, 0);
                vx.m6075a(this.f19385z, rect, rect2);
                if (rect2.top == 0) {
                    i5 = i;
                } else {
                    i5 = 0;
                }
                if (marginLayoutParams.topMargin != i5) {
                    marginLayoutParams.topMargin = i;
                    view = this.f19344B;
                    if (view == null) {
                        this.f19344B = new View(this.f19362b);
                        this.f19344B.setBackgroundColor(this.f19362b.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.f19385z.addView(this.f19344B, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f19344B.setLayoutParams(layoutParams);
                            i5 = 1;
                        } else {
                            i5 = 1;
                        }
                    }
                } else {
                    i5 = 0;
                }
                if (this.f19344B == null) {
                    i3 = 0;
                }
                if (!(this.f19348F || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f19367g.setLayoutParams(marginLayoutParams);
                i2 = i5;
            } else {
                i2 = i5;
            }
        } else {
            i2 = 0;
        }
        view = this.f19344B;
        if (view != null) {
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }
}
