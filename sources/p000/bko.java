package p000;

import android.media.AudioRouting;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bko */
public final class bko implements OnRoutingChangedListener {
    /* renamed from: a */
    private final /* synthetic */ iov f1242a;

    public bko(iov iov) {
        this.f1242a = iov;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        String valueOf = String.valueOf(audioRouting);
        String a = bkm.m846a(audioRouting.getRoutedDevice());
        String a2 = bkm.m846a(audioRouting.getPreferredDevice());
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 67) + String.valueOf(a).length()) + String.valueOf(a2).length());
        stringBuilder.append("onRoutingChanged, routing = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", routed device = ");
        stringBuilder.append(a);
        stringBuilder.append(", preferred device = ");
        stringBuilder.append(a2);
        Log.d("AudioDeviceSelector", stringBuilder.toString());
        this.f1242a.m12343a(audioRouting);
    }
}
