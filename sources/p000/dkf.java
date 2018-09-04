package p000;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* compiled from: PG */
/* renamed from: dkf */
final class dkf implements OnAudioFocusChangeListener {
    dkf() {
    }

    public final void onAudioFocusChange(int i) {
        String str = dke.f13512a;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("onAudioFocusChange: ");
        stringBuilder.append(i);
        bli.m871d(str, stringBuilder.toString());
    }
}
