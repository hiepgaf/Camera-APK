package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: eau */
final class eau implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ eaq f3472a;

    eau(eaq eaq) {
        this.f3472a = eaq;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        eaq eaq = this.f3472a;
        eaq.f14867f = (float) Math.toRadians((double) i);
        eaq.m9593b();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
