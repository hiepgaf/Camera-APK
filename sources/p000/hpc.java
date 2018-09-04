package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: hpc */
final class hpc implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hox f6423a;

    hpc(hox hox) {
        this.f6423a = hox;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            boolean z2;
            if (((Float) this.f6423a.f17978q.mo2860b()).floatValue() != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            jri.m13144a(z2, (Object) "max zoom value hasn't been initialized properly");
            int max = this.f6423a.f17965c.getMax();
            hox hox = this.f6423a;
            float f = hox.f17963a;
            this.f6423a.f17971j.mo348a(Float.valueOf((float) (Math.pow((double) (((Float) hox.f17978q.mo2860b()).floatValue() / this.f6423a.f17963a), (double) (((float) i) / ((float) max))) * ((double) f))));
            hox = this.f6423a;
            hox.f17966d.m1344a(((Float) hox.f17971j.mo2860b()).floatValue());
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f6423a.f17964b.ak();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f6423a.f17964b.mo2704g();
    }
}
