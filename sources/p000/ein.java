package p000;

import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: ein */
class ein extends eik {
    /* renamed from: a */
    private final /* synthetic */ eil f23176a;

    ein(eil eil) {
        this.f23176a = eil;
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a("videoChart", "enter VideoRecording");
        eil eil = this.f23176a;
        eil.f23175k = true;
        eil.f23173i.f4984b.m15085b();
        if (this.f23176a.f23174j.f17673a.m5503c()) {
            OptionsBarView optionsBarView = this.f23176a.f23173i.f4984b;
            if (optionsBarView.f20403h || optionsBarView.f20398c.isRunning() || optionsBarView.f20398c.isStarted()) {
                optionsBarView.f20398c.cancel();
                FrameLayout frameLayout = optionsBarView.f20402g;
                if (frameLayout != null) {
                    frameLayout.setAlpha(0.0f);
                }
                optionsBarView.setAlpha(0.0f);
                optionsBarView.setVisibility(4);
                optionsBarView.f20403h = false;
            }
            this.f23176a.f23171g.m1332a(false);
        } else {
            this.f23176a.f23173i.m2462b();
        }
        this.f23176a.f23168d.startRecording();
        this.f23176a.f23169e.m3025a(hbf.VIDEO_RECORDING);
        this.f23176a.f23172h.mo1755b();
        this.f23176a.f23170f.m11618a(false);
        hnu.f6384a = false;
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a("videoChart", "exit VideoRecording");
        eil eil = this.f23176a;
        eil.f23175k = false;
        eil.f23173i.m2458a();
        this.f23176a.f23173i.f4984b.m15087c();
        this.f23176a.f23171g.m1332a(true);
        this.f23176a.f23168d.stopRecording();
        hcd hcd = this.f23176a.f23169e;
        hcd.m3025a(hbf.VIDEO_IDLE);
        hcd.f5955a.animateToScale(1.0f);
        this.f23176a.f23172h.mo1759d();
        this.f23176a.f23170f.m11618a(true);
        hnu.f6384a = true;
    }

    /* renamed from: A */
    public void mo1560A() {
    }
}
