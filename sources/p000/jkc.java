package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.FrameWarper;

/* compiled from: PG */
/* renamed from: jkc */
final class jkc implements Runnable {
    /* renamed from: a */
    private final FrameWarper f7890a;

    public jkc(FrameWarper frameWarper) {
        this.f7890a = frameWarper;
    }

    public final void run() {
        this.f7890a.dispose();
    }
}
