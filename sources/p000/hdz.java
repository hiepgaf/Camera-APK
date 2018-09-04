package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.tutorialoverlay.TutorialOverlayWrapper;

/* compiled from: PG */
/* renamed from: hdz */
public abstract class hdz {
    /* renamed from: a */
    private final int f6078a;
    /* renamed from: b */
    private final hea f6079b;
    /* renamed from: c */
    public final Context f6080c;
    /* renamed from: d */
    public final gvr f6081d;
    /* renamed from: e */
    public heb f6082e;
    /* renamed from: f */
    public LayoutInflater f6083f;
    /* renamed from: g */
    public TutorialOverlayWrapper f6084g;
    /* renamed from: h */
    public boolean f6085h;

    public hdz(Context context, int i, hea hea) {
        this.f6080c = context;
        this.f6078a = i;
        this.f6079b = hea;
        this.f6081d = new gvr((AccessibilityManager) cbu.m1099a(context, "accessibility"));
    }

    /* renamed from: a */
    public abstract void mo1233a(View view);

    /* renamed from: a */
    public final void m3086a() {
        mo1775c();
        hea hea = this.f6079b;
        if (hea != null) {
            hea.mo1142a();
        }
    }

    /* renamed from: b */
    public final void m3088b() {
        if (this.f6085h) {
            TutorialOverlayWrapper tutorialOverlayWrapper = this.f6084g;
            if (tutorialOverlayWrapper != null && this.f6083f != null) {
                tutorialOverlayWrapper = (TutorialOverlayWrapper) jqk.m13102c(tutorialOverlayWrapper);
                LayoutInflater layoutInflater = (LayoutInflater) jqk.m13102c(this.f6083f);
                tutorialOverlayWrapper.removeAllViews();
                tutorialOverlayWrapper.setVisibility(0);
                tutorialOverlayWrapper.f2427a = 0;
                mo1233a(layoutInflater.inflate(this.f6078a, (ViewGroup) layoutInflater.inflate(R.layout.tutorials_placeholder, tutorialOverlayWrapper).findViewById(R.id.tutorials_placeholder)));
            }
        }
    }

    /* renamed from: c */
    public void mo1775c() {
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f6084g;
        if (tutorialOverlayWrapper != null) {
            tutorialOverlayWrapper.m1333a();
        }
        this.f6085h = false;
        heb heb = this.f6082e;
        if (heb != null) {
            heb.f6086a.f14898O.m1744a(0);
            heb.f6086a.f14913f.mo380h();
            heb.f6086a.m9609c();
            this.f6082e = null;
        }
    }
}
