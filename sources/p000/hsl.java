package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;
import com.google.android.apps.refocus.viewer.RefocusBokehSeekBar;

/* renamed from: hsl */
public final /* synthetic */ class hsl implements Runnable {
    /* renamed from: a */
    private final RGBZFocusControls f6582a;
    /* renamed from: b */
    private final hsp f6583b;

    public hsl(RGBZFocusControls rGBZFocusControls, hsp hsp) {
        this.f6582a = rGBZFocusControls;
        this.f6583b = hsp;
    }

    public final void run() {
        float B_;
        RGBZFocusControls rGBZFocusControls = this.f6582a;
        hsp hsp = this.f6583b;
        rGBZFocusControls.m8439a();
        RefocusBokehSeekBar refocusBokehSeekBar = (RefocusBokehSeekBar) rGBZFocusControls.getRootView().findViewById(R.id.refocus_bokeh_seekbar);
        hst hst = rGBZFocusControls.f12358e;
        if (hst == null) {
            bli.m863a(RGBZFocusControls.f12354a, "clingView is null.");
        } else {
            refocusBokehSeekBar.f2468c = hst;
            refocusBokehSeekBar.m1350a();
        }
        huj huj = new huj(rGBZFocusControls, hsp);
        refocusBokehSeekBar.f2467b = huj;
        hsp = huj.f6678a;
        if (hsp != null) {
            B_ = hsp.B_();
        } else {
            B_ = 0.0f;
        }
        refocusBokehSeekBar.f2466a = B_;
        refocusBokehSeekBar.setProgress((int) (refocusBokehSeekBar.f2466a * 100.0f));
        refocusBokehSeekBar.m1350a();
        rGBZFocusControls.getRootView().findViewById(R.id.done_button).setOnClickListener(new hsm(rGBZFocusControls));
    }
}
