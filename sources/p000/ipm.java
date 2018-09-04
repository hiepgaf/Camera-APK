package p000;

import android.media.AudioRecord;
import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: ipm */
public final /* synthetic */ class ipm implements Callable {
    /* renamed from: a */
    private final ios f7293a;

    public ipm(ios ios) {
        this.f7293a = ios;
    }

    public final Object call() {
        ios ios = this.f7293a;
        iow iow = ios.f18448g;
        if (iow != null) {
            String valueOf;
            StringBuilder stringBuilder;
            synchronized (iow.f18486a) {
                if (iow.f18499n != ipa.READY) {
                    String valueOf2 = String.valueOf(iow.f18499n);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    stringBuilder2.append("illegal state as ");
                    stringBuilder2.append(valueOf2);
                    Log.e("AudioEncoder", stringBuilder2.toString());
                } else {
                    iow.f18498m = new ioy(iow, "AudioEncoder");
                    iow.f18497l = new ioz(iow, "AudioEncoder");
                    iow.f18495j = 0;
                    iow.f18488c.startRecording();
                    valueOf = String.valueOf(iow.f18488c.getRoutedDevice());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    stringBuilder.append("actual audio recording input: ");
                    stringBuilder.append(valueOf);
                    Log.d("AudioEncoder", stringBuilder.toString());
                    iow.f18489d.start();
                    iow.f18497l.start();
                    iow.f18498m.start();
                    iow.f18499n = ipa.STARTED;
                }
            }
            iov iov = ios.f18452k;
            if (iov != null) {
                AudioRecord audioRecord = ios.f18451j;
                synchronized (iov.f18482e) {
                    if (iov.f18481d) {
                    } else {
                        if (iov.f18480c != null) {
                            iov.m12342a();
                        }
                        valueOf = String.valueOf(audioRecord);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                        stringBuilder.append("Start, with routing = ");
                        stringBuilder.append(valueOf);
                        Log.d("AudioDeviceSelector", stringBuilder.toString());
                        iov.f18480c = audioRecord;
                        iov.m12343a(audioRecord);
                        audioRecord.addOnRoutingChangedListener(iov.f18478a, iov.f18479b);
                    }
                }
            }
        }
        return null;
    }
}
