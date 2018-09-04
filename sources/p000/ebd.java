package p000;

import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton;
import com.google.android.apps.camera.ui.tutorialoverlay.TutorialOverlayWrapper;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: ebd */
public final class ebd implements SurfaceTextureListener, hdo {
    /* renamed from: R */
    private static boolean f14882R = false;
    /* renamed from: a */
    public static final String f14883a = bli.m862a("CameraAppUI");
    /* renamed from: A */
    public final cwd f14884A;
    /* renamed from: B */
    public final View f14885B;
    /* renamed from: C */
    public eiu f14886C;
    /* renamed from: D */
    public han f14887D;
    /* renamed from: E */
    public han f14888E;
    /* renamed from: F */
    public han f14889F;
    /* renamed from: G */
    public han f14890G;
    /* renamed from: H */
    public final hek f14891H;
    /* renamed from: I */
    public SurfaceTexture f14892I;
    /* renamed from: J */
    public int f14893J;
    /* renamed from: K */
    public int f14894K;
    /* renamed from: L */
    public final DisplayManager f14895L;
    /* renamed from: M */
    public final WindowManager f14896M;
    /* renamed from: N */
    public final bkw f14897N;
    /* renamed from: O */
    public final ebm f14898O;
    /* renamed from: P */
    public hhx f14899P;
    /* renamed from: Q */
    private final boolean f14900Q;
    /* renamed from: S */
    private final gyz f14901S;
    /* renamed from: T */
    private hcd f14902T;
    /* renamed from: U */
    private hny f14903U;
    /* renamed from: V */
    private final gvt f14904V;
    /* renamed from: W */
    private final gvr f14905W;
    /* renamed from: X */
    private final ilp f14906X;
    /* renamed from: Y */
    private final ilp f14907Y;
    /* renamed from: Z */
    private final gyl f14908Z;
    private ebk aa = ebk.NONE;
    private long ab = -1;
    private final aws ac;
    private final edf ad;
    private final edo ae;
    private final irs af;
    private final cdq ag;
    /* renamed from: b */
    public final cfh f14909b;
    /* renamed from: c */
    public final cjq f14910c;
    /* renamed from: d */
    public final FrameLayout f14911d;
    /* renamed from: e */
    public final FrameLayout f14912e;
    /* renamed from: f */
    public final gwp f14913f;
    /* renamed from: g */
    public ViewfinderCover f14914g;
    /* renamed from: h */
    public final MainActivityLayout f14915h;
    /* renamed from: i */
    public final csp f14916i;
    /* renamed from: j */
    public FrameLayout f14917j;
    /* renamed from: k */
    public ShutterButton f14918k;
    /* renamed from: l */
    public BottomBarController f14919l;
    /* renamed from: m */
    public brp f14920m;
    /* renamed from: n */
    public TutorialOverlayWrapper f14921n;
    /* renamed from: o */
    public DisplayListener f14922o;
    /* renamed from: p */
    public int f14923p;
    /* renamed from: q */
    public PreviewOverlay f14924q;
    /* renamed from: r */
    public CaptureAnimationOverlay f14925r;
    /* renamed from: s */
    public hdm f14926s;
    /* renamed from: t */
    public ToyboxMenuButton f14927t;
    /* renamed from: u */
    public gal f14928u;
    /* renamed from: v */
    public ImageButton f14929v;
    /* renamed from: w */
    public haq f14930w;
    /* renamed from: x */
    public final csg f14931x;
    /* renamed from: y */
    public final OnLayoutChangeListener f14932y = new ebe(this);
    /* renamed from: z */
    public final gyi f14933z;

    public ebd(cfh cfh, MainActivityLayout mainActivityLayout, hes hes, gyi gyi, hek hek, gvr gvr, aws aws, DisplayManager displayManager, WindowManager windowManager, boolean z, gvt gvt, hdm hdm, edf edf, edo edo, cwd cwd, csp csp, BottomBarController bottomBarController, hcd hcd, hny hny, ebq ebq, bkw bkw, irs irs, gyz gyz, gwp gwp, ebm ebm, gal gal, cdq cdq, ilp ilp, ilp ilp2, gyl gyl) {
        iqm b;
        jri.m13152b((Object) cfh);
        jri.m13152b((Object) mainActivityLayout);
        this.f14909b = cfh;
        this.f14915h = mainActivityLayout;
        this.f14900Q = z;
        this.f14933z = gyi;
        this.f14891H = hek;
        this.ac = aws;
        this.f14895L = displayManager;
        this.f14896M = windowManager;
        this.ad = (edf) jri.m13152b((Object) edf);
        this.ae = (edo) jri.m13152b((Object) edo);
        this.f14904V = gvt;
        this.f14911d = hes.f6111a;
        this.f14912e = hes.f6112b;
        this.f14916i = csp;
        this.f14931x = this.f14916i.mo759c();
        this.f14885B = hes.f6119i;
        this.f14905W = gvr;
        this.f14919l = bottomBarController;
        this.f14902T = hcd;
        this.f14903U = hny;
        this.f14926s = hdm;
        this.f14926s.f17675c = this;
        this.f14884A = cwd;
        this.f14901S = gyz;
        this.f14913f = gwp;
        this.f14928u = gal;
        hkg hkg = hes.f6120j;
        this.f14929v = (ImageButton) hkg.m3223a((int) R.id.closeButton);
        this.f14914g = (ViewfinderCover) hkg.m3223a((int) R.id.viewfinder_cover);
        this.f14910c = new cjq();
        this.f14927t = (ToyboxMenuButton) hkg.m3223a((int) R.id.toybox_menu_button);
        this.f14897N = bkw;
        this.af = irs;
        this.f14898O = ebm;
        this.ag = cdq;
        this.f14906X = ilp;
        this.f14907Y = ilp2;
        this.f14908Z = gyl;
        this.f14929v.setOnClickListener(new ebf(this));
        aws.mo373a().mo1879a(this.f14904V.mo1656a(new ebg(ebq, csp)));
        switch (this.f14896M.getDefaultDisplay().getRotation()) {
            case 0:
                b = iqm.m4039b(0);
                break;
            case 1:
                b = iqm.m4039b(90);
                break;
            case 2:
                b = iqm.m4039b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.CLOCKWISE_0;
                break;
        }
        this.f14923p = b.m4041a();
        this.f14922o = new ebh(this);
        this.f14895L.registerDisplayListener(this.f14922o, null);
    }

    /* renamed from: a */
    public final void m9602a(ham ham) {
        this.f14887D.mo1213a(ham);
    }

    /* renamed from: a */
    public final void m9600a() {
        this.f14887D.mo1209a();
    }

    /* renamed from: b */
    public final void m9606b() {
        boolean z = true;
        if (!this.ac.mo375c()) {
            if (this.f14900Q) {
                this.f14909b.mo2735a();
                return;
            }
            this.f14914g.m8433a(this.f14899P);
            this.f14914g.m8431a();
            m9608b(true);
            if (this.f14899P != hhx.PHOTO) {
                z = false;
            }
            m9613d(z);
            this.f14911d.post(new ebj(this));
            this.ad.mo3002s();
            this.ae.mo3002s();
        }
    }

    /* renamed from: c */
    public final void m9609c() {
        this.f14919l.setClickable(true);
        this.f14902T.m3027b(true);
        this.f14919l.setSwitchButtonClickEnabled(true);
        this.f14903U.m11921a(go.bG);
    }

    /* renamed from: d */
    public final void m9612d() {
        this.f14927t.setClickable(true);
    }

    /* renamed from: a */
    private final String m9596a(int i) {
        try {
            return this.f14909b.mo2756k().getResources().getString(i);
        } catch (NotFoundException e) {
            return "";
        }
    }

    /* renamed from: e */
    final void m9614e() {
        bli.m869c(f14883a, "Revealing the viewfinder by hiding the mode cover.");
        this.f14914g.f12343d.start();
        if (this.ab < 0) {
            this.ab = System.currentTimeMillis();
        }
    }

    /* renamed from: f */
    public static boolean m9597f() {
        return false;
    }

    /* renamed from: g */
    public final void m9617g() {
        fha f_ = this.f14909b.mo2764s().f_();
        if (f_ != null) {
            if (!this.f14909b.mo2727B().mo1536a("default_scope", "pref_flash_supported_back_camera", false) && f_.mo1125a()) {
                this.f14909b.mo2727B().mo1540b("default_scope", "pref_flash_supported_back_camera", true);
            }
            if (!this.f14909b.mo2727B().mo1544e("default_scope", "pref_hdr_support_mode_back_camera")) {
                String a;
                if (f_.mo1126b()) {
                    a = m9596a((int) R.string.pref_camera_hdr_supportmode_hdr_plus);
                } else if (f_.mo1127c()) {
                    a = m9596a((int) R.string.pref_camera_hdr_supportmode_hdr);
                } else {
                    a = m9596a((int) R.string.pref_camera_hdr_supportmode_none);
                }
                this.f14909b.mo2727B().mo1532a("default_scope", "pref_hdr_support_mode_back_camera", a);
            }
        }
    }

    /* renamed from: h */
    public final void m9618h() {
        bli.m871d(f14883a, "onNewPreviewFrame");
        m9614e();
    }

    /* renamed from: i */
    public static void m9598i() {
        bli.m871d(f14883a, "onPreviewStarted");
        f14882R = true;
    }

    /* renamed from: a */
    public final void m9604a(boolean z) {
        this.af.mo1592a(z);
    }

    /* renamed from: j */
    public final void m9619j() {
        String str = f14883a;
        String valueOf = String.valueOf(this.aa);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("shutdownPreviewImpl() = ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        if (this.aa != ebk.NONE) {
            this.f14887D.mo1212a(null);
            Object e = this.f14887D.mo1218e();
            jri.m13152b(e);
            try {
                valueOf = f14883a;
                String valueOf2 = String.valueOf(this.aa);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                stringBuilder2.append("Waiting for Destroy via Future for ");
                stringBuilder2.append(valueOf2);
                bli.m871d(valueOf, stringBuilder2.toString());
                e.get(ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS, TimeUnit.MILLISECONDS);
                str = f14883a;
                valueOf = String.valueOf(this.aa);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Got Destroy via Future for ");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                this.aa = ebk.NONE;
            } catch (InterruptedException e2) {
                throw new IllegalStateException("Synchronization close failed on preview switch.");
            } catch (ExecutionException e3) {
                throw new IllegalStateException("Synchronization close failed on preview switch.");
            } catch (TimeoutException e4) {
                throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.");
            }
        }
        this.f14926s.m11769a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14892I = surfaceTexture;
        this.f14893J = i;
        this.f14894K = i2;
        bli.m871d(f14883a, "SurfaceTexture is available");
        haq haq = this.f14930w;
        if (haq != null) {
            haq.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f14892I = null;
        bli.m871d(f14883a, "SurfaceTexture is destroyed");
        haq haq = this.f14930w;
        return haq != null ? haq.onSurfaceTextureDestroyed(surfaceTexture) : false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14892I = surfaceTexture;
        this.f14893J = i;
        this.f14894K = i2;
        haq haq = this.f14930w;
        if (haq != null) {
            haq.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14892I = surfaceTexture;
        haq haq = this.f14930w;
        if (haq != null) {
            haq.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (f14882R) {
            m9614e();
            f14882R = false;
        }
    }

    /* renamed from: a */
    public final void mo1207a(hhx hhx) {
        if (!this.ac.mo375c()) {
            this.f14926s.m11769a();
            if (hhx == hhx.SETTINGS) {
                this.f14909b.mo2731F();
            } else if (hhx == hhx.ORNAMENT) {
                cdq cdq = this.ag;
                Object intent = new Intent();
                intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity");
                intent.setFlags(65536);
                iut iut = iut.BACK;
                iur b = cdq.f1850c.mo1346b(iut);
                kvq kvq = new kvq();
                kvq.f8670b = Boolean.valueOf(((Boolean) cdq.f1854g.mo2860b()).booleanValue());
                kvq.f8669a = Boolean.valueOf(cdq.f1852e.mo1535a("default_scope", "pref_camera_recordlocation_key"));
                kvq.f8671c = ((gpe) cdq.f1855h.mo2860b()).name();
                Object e = cdq.f1851d.m1724a(b, iut).m4051e();
                jri.m13152b(e);
                kvq.f8672d = e.toString();
                e = cdq.f1853f.m1640a(iut, (bez) cdq.f1848a.mo2670b(b).mo2081a(), inc.FPS_30, false).m3881c().m4051e();
                jri.m13152b(e);
                kvq.f8673e = e.toString();
                jri.m13152b(intent);
                Serializable serializable = kvq.f8669a;
                if (serializable != null) {
                    intent.putExtra("settings_save_location", serializable);
                }
                serializable = kvq.f8670b;
                if (serializable != null) {
                    intent.putExtra("settings_camera_sounds", serializable);
                }
                String str = kvq.f8671c;
                if (str != null) {
                    intent.putExtra("settings_volume_key_action", str);
                }
                str = kvq.f8672d;
                if (str != null) {
                    intent.putExtra("settings_back_camera_photo_resolution", str);
                }
                str = kvq.f8673e;
                if (str != null) {
                    intent.putExtra("settings_back_camera_video_resolution", str);
                }
                kvp kvp = new kvp(intent);
                cdq.f1849b.m721b(intent);
                this.f14906X.mo348a(Boolean.valueOf(true));
            } else {
                this.f14914g.m8433a(hhx);
                this.f14914g.m8431a();
                if (hhx == hhx.LENS) {
                    gyl gyl = this.f14908Z;
                    kpk d = kpw.m18056d();
                    iel.m3714a().execute(new gyn(gyl, d));
                    kow.m13622a(d, new ebi(this), iel.m3714a());
                    return;
                }
                this.f14918k.setEnabled(false);
                f14882R = false;
                m9607b(hhx);
            }
        }
    }

    /* renamed from: b */
    public final void m9607b(hhx hhx) {
        hhx hhx2;
        if (this.f14909b.mo2763r() == hhx.VIDEO) {
            hhx2 = hhx.VIDEO;
        } else {
            hhx2 = hhx.PHOTO;
        }
        this.f14899P = hhx2;
        this.f14909b.mo2744a(hhx);
        m9624p();
        if (hhx == hhx.PHOTO) {
            m9608b(true);
            m9613d(true);
        } else if (hhx == hhx.VIDEO) {
            m9608b(true);
            m9613d(false);
        } else if (hhx == hhx.VIDEO_INTENT) {
            m9608b(false);
        } else {
            m9608b(false);
        }
    }

    /* renamed from: k */
    public final void m9620k() {
        this.f14931x.mo770a();
        csh d = this.f14916i.mo760d();
        kwa kwa = d.f2640b;
        if (kwa != null && ((cls) kwa.mo345a()).isVisible()) {
            ((cls) d.f2640b.mo345a()).dismiss();
        }
        m9623o();
        this.f14914g.m8433a(this.f14909b.mo2763r());
        if (this.f14900Q) {
            m9624p();
        }
    }

    /* renamed from: l */
    public final void m9621l() {
        this.f14919l.setCameraSwitchEnabled(true);
    }

    /* renamed from: b */
    public final void m9608b(boolean z) {
        this.f14901S.m2931a(z);
    }

    /* renamed from: a */
    public final void m9601a(ebk ebk, haq haq) {
        boolean z;
        jri.m13152b(this.f14888E);
        jri.m13152b(this.f14889F);
        jri.m13152b(this.f14890G);
        if (ebk != ebk.NONE) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        String str = f14883a;
        String valueOf = String.valueOf(this.aa);
        String valueOf2 = String.valueOf(ebk);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length());
        stringBuilder.append("Switching PreviewContentImpl ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        bli.m871d(str, stringBuilder.toString());
        ebk ebk2 = this.aa;
        if (ebk == ebk2) {
            this.f14930w = haq;
        } else {
            han han;
            this.f14930w = null;
            if (ebk2 != ebk.NONE) {
                if (this.aa == ebk.TEXTURE_VIEW_LEGACY) {
                    this.f14887D.mo1212a(null);
                }
                han = this.f14887D;
                if (han != null) {
                    han.mo1218e();
                }
            }
            this.f14930w = haq;
            jri.m13152b(this.f14888E);
            jri.m13152b(this.f14889F);
            jri.m13152b(this.f14890G);
            switch (ebk.ordinal()) {
                case 1:
                    han han2 = this.f14887D;
                    han = this.f14888E;
                    if (han2 == han) {
                        han = this.f14889F;
                        break;
                    }
                    break;
                case 2:
                    han = this.f14890G;
                    this.f14887D = han;
                    break;
                default:
                    throw new IllegalStateException("Cannot query next content adapter for a NONE implementation ");
            }
            this.f14887D = han;
            this.aa = ebk;
            jri.m13152b(this.f14887D);
            if (ebk == ebk.TEXTURE_VIEW_LEGACY) {
                this.f14887D.mo1212a(this.f14932y);
            }
            this.f14887D.mo1217d();
        }
        haq haq2 = this.f14930w;
        if (haq2 != null) {
            OnGestureListener a = haq2.mo1119a();
            if (a != null) {
                PreviewOverlay previewOverlay = this.f14924q;
                if (a != null) {
                    previewOverlay.f2446a = new GestureDetector(previewOverlay.getContext(), a);
                }
            }
            OnTouchListener k_ = this.f14930w.k_();
            if (k_ != null) {
                this.f14924q.f2447b = k_;
            }
        }
    }

    /* renamed from: m */
    public final void m9622m() {
        this.f14904V.mo1661a(true);
    }

    /* renamed from: c */
    public final void m9611c(boolean z) {
        this.f14902T.m3028c(z);
    }

    /* renamed from: n */
    public static void m9599n() {
    }

    /* renamed from: o */
    public final void m9623o() {
        int i = 8;
        if (this.f14886C != null && !this.f14900Q && this.f14905W.m2840a()) {
            cvx s = this.f14909b.mo2764s();
            eiu eiu = this.f14886C;
            boolean c = s.mo2849c();
            ikd.m12259a();
            Button button = eiu.f3645b;
            if (c && eiu.f3647d) {
                i = 0;
            }
            button.setVisibility(i);
            eiu.f3644a.setVisibility(0);
        }
    }

    /* renamed from: p */
    public final void m9624p() {
        this.f14927t.setVisibility(8);
        this.f14929v.setVisibility(0);
    }

    /* renamed from: q */
    public final void m9625q() {
        this.f14929v.setVisibility(8);
        this.f14927t.setVisibility(0);
    }

    /* renamed from: d */
    public final void m9613d(boolean z) {
        if (!this.f14901S.f5831e) {
            this.f14919l.setProgress(1.0f, z);
        }
    }

    /* renamed from: a */
    public final boolean m9605a(hdz hdz, LayoutInflater layoutInflater) {
        int i;
        boolean z = true;
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f14921n;
        heb heb = new heb(this);
        float f = hdz.f6080c.getResources().getConfiguration().fontScale;
        DisplayMetrics displayMetrics = hdz.f6080c.getResources().getDisplayMetrics();
        if (f > 1.0f) {
            i = 0;
        } else if (displayMetrics.densityDpi <= DisplayMetrics.DENSITY_DEVICE_STABLE) {
            i = hdz.f6081d.m2840a() ^ 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            hdz.f6084g = tutorialOverlayWrapper;
            hdz.f6082e = heb;
            hdz.f6083f = layoutInflater;
            hdz.f6085h = true;
            hdz.m3088b();
        } else {
            z = false;
        }
        if (z) {
            this.f14898O.m1744a(4);
            this.f14913f.mo379g();
            this.f14919l.setClickable(false);
            this.f14902T.m3027b(false);
            this.f14919l.setSwitchButtonClickEnabled(false);
            this.f14903U.m11921a(go.bH);
        }
        return z;
    }

    /* renamed from: c */
    public final void m9610c(hhx hhx) {
        this.f14914g.m8433a(hhx);
        this.f14914g.m8431a();
    }

    /* renamed from: r */
    public final void m9626r() {
        this.f14925r.m1336a(true);
        this.f14919l.setCameraSwitchEnabled(false);
    }

    /* renamed from: s */
    public final void m9627s() {
        this.f14925r.m1336a(false);
        this.f14919l.setCameraSwitchEnabled(true);
    }

    /* renamed from: e */
    public final void m9615e(boolean z) {
        if (z) {
            this.f14901S.m2929a(0.0f, go.bo);
        } else {
            this.f14901S.m2929a(0.0f, go.bn);
        }
    }

    /* renamed from: f */
    public final void m9616f(boolean z) {
        if (!z) {
            m9625q();
        }
    }
}
