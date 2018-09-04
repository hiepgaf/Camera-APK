package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: eat */
final class eat implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ eaq f3471a;

    eat(eaq eaq) {
        this.f3471a = eaq;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        eaq eaq = this.f3471a;
        eaq.f14866e = ((float) i) / 1000.0f;
        eaq.m9593b();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
