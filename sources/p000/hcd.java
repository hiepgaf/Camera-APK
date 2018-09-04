package p000;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hcd */
public final class hcd {
    /* renamed from: a */
    public final ShutterButton f5955a;
    /* renamed from: b */
    public final Object f5956b;
    /* renamed from: c */
    public final List f5957c;
    /* renamed from: d */
    public hbf f5958d;
    /* renamed from: e */
    private final hbh f5959e;
    /* renamed from: f */
    private final hch f5960f = new hce(this);

    public hcd(ShutterButton shutterButton, boolean z) {
        this.f5955a = shutterButton;
        this.f5958d = shutterButton.getMode();
        this.f5957c = new ArrayList();
        this.f5956b = new Object();
        this.f5959e = new hbh(shutterButton, false);
        shutterButton.setListener(this.f5960f);
        m3023a(new hcf(this));
    }

    /* renamed from: a */
    public final iqo m3023a(hch hch) {
        synchronized (this.f5956b) {
            this.f5957c.add(hch);
        }
        return new hcg(this, hch);
    }

    /* renamed from: a */
    public final void m3026a(boolean z) {
        this.f5955a.runPressedStateAnimation(z, this.f5959e);
    }

    /* renamed from: a */
    public final void m3025a(hbf hbf) {
        switch (hbf.ordinal()) {
            case 0:
            case 2:
            case 5:
                this.f5958d = hbf;
                break;
        }
        this.f5955a.setMode(hbf, this.f5959e);
    }

    /* renamed from: b */
    public final void m3027b(boolean z) {
        this.f5955a.setClickEnabled(z);
    }

    /* renamed from: c */
    public final void m3028c(boolean z) {
        if (this.f5955a.isEnabled() != z) {
            this.f5955a.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void m3024a() {
        m3025a(hbf.VIDEO_IDLE);
        this.f5955a.setVisibility(0);
    }
}
