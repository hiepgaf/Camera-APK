package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dwr */
final class dwr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ dwd f3330a;

    dwr(dwd dwd) {
        this.f3330a = dwd;
    }

    public final void run() {
        dwd dwd = this.f3330a;
        dwd.f23057n.f2459a = false;
        dwd.f23059p.setText(R.string.refocus_instructions);
    }
}
