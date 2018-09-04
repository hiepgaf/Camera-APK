package p000;

import android.widget.ImageButton;

/* renamed from: hgt */
final /* synthetic */ class hgt implements Runnable {
    /* renamed from: a */
    private final hgo f6191a;

    hgt(hgo hgo) {
        this.f6191a = hgo;
    }

    public final void run() {
        hgo hgo = this.f6191a;
        hgo.f17819d.m2694b("ext_mic_tutorial_dismiss");
        ImageButton imageButton = (ImageButton) hgo.f17825j.get();
        if (imageButton != null) {
            imageButton.performClick();
        }
    }
}
