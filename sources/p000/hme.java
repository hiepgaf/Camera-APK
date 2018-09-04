package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: hme */
public final class hme implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hlz f6362a;

    public hme(hlz hlz) {
        this.f6362a = hlz;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f6362a.f6346c.f21578d.seekTo(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f6362a.f6346c.aa();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f6362a.f6346c.mo3082Z();
    }
}
