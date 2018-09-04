package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;

/* compiled from: PG */
/* renamed from: hkx */
public final class hkx extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ VideoPlayerActivity f6328a;

    public hkx(VideoPlayerActivity videoPlayerActivity) {
        this.f6328a = videoPlayerActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f6328a.finish();
    }
}
