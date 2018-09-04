package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* renamed from: bki */
final class bki extends AudioDeviceCallback {
    /* renamed from: a */
    private final /* synthetic */ bkh f1240a;

    bki(bkh bkh) {
        this.f1240a = bkh;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f1240a.m14852c();
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f1240a.m14852c();
    }
}
