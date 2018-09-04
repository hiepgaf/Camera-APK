package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.apps.refocus.viewer.RefocusBokehSeekBar;

/* compiled from: PG */
/* renamed from: hss */
public final class hss implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ RefocusBokehSeekBar f6589a;

    public hss(RefocusBokehSeekBar refocusBokehSeekBar) {
        this.f6589a = refocusBokehSeekBar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            RefocusBokehSeekBar refocusBokehSeekBar = this.f6589a;
            refocusBokehSeekBar.f2466a = ((float) i) / 100.0f;
            huj huj = refocusBokehSeekBar.f2467b;
            if (huj != null) {
                huj.f6679b.m8441a(true, refocusBokehSeekBar.f2466a);
            }
            this.f6589a.m1350a();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
