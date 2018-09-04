package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* compiled from: PG */
/* renamed from: hly */
final class hly implements OnPreparedListener {
    /* renamed from: a */
    private final /* synthetic */ hlw f6343a;

    hly(hlw hlw) {
        this.f6343a = hlw;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        gqj gqj = this.f6343a.f21591a;
        if (gqj.f21586j) {
            gqj.mo3090X();
        } else {
            gqj.mo3089V();
        }
    }
}
