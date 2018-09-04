package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* compiled from: PG */
/* renamed from: iov */
public final class iov implements iqo {
    /* renamed from: a */
    public final OnRoutingChangedListener f18478a = new bko(this);
    /* renamed from: b */
    public final Handler f18479b;
    /* renamed from: c */
    public AudioRouting f18480c;
    /* renamed from: d */
    public boolean f18481d;
    /* renamed from: e */
    public final Object f18482e = new Object();
    /* renamed from: f */
    private final bkm f18483f;
    /* renamed from: g */
    private final ilp f18484g;
    /* renamed from: h */
    private final HandlerThread f18485h;

    public iov(bkm bkm, ilp ilp) {
        this.f18483f = bkm;
        this.f18484g = ilp;
        this.f18485h = new HandlerThread("AudioDeviceSelector");
        this.f18485h.start();
        this.f18479b = new Handler(this.f18485h.getLooper());
        this.f18481d = false;
    }

    /* renamed from: a */
    public final void m12343a(AudioRouting audioRouting) {
        if (audioRouting != null && ((Boolean) this.f18484g.mo2860b()).booleanValue()) {
            AudioDeviceInfo a = this.f18483f.m847a();
            if (a != null) {
                String str;
                boolean preferredDevice = audioRouting.setPreferredDevice(a);
                String a2 = bkm.m846a(a);
                if (preferredDevice) {
                    str = " be used";
                } else {
                    str = " not be used";
                }
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(a2).length() + 39) + String.valueOf(str).length());
                stringBuilder.append("External audio device ");
                stringBuilder.append(a2);
                stringBuilder.append(" is found and can");
                stringBuilder.append(str);
                Log.d("AudioDeviceSelector", stringBuilder.toString());
            }
        }
    }

    public final void close() {
        synchronized (this.f18482e) {
            if (this.f18481d) {
                Log.w("AudioDeviceSelector", "Already closed");
                return;
            }
            m12342a();
            this.f18481d = true;
            try {
                this.f18485h.quit();
                this.f18485h.join();
                Log.d("AudioDeviceSelector", "Audio devices routing changed thread stopped.");
            } catch (Throwable e) {
                throw new RuntimeException("Unable to stop audio routing changed thread AudioDeviceSelector", e);
            }
        }
    }

    /* renamed from: a */
    public final void m12342a() {
        synchronized (this.f18482e) {
            if (this.f18481d) {
                return;
            }
            Log.d("AudioDeviceSelector", "Stop");
            AudioRouting audioRouting = this.f18480c;
            if (audioRouting != null) {
                audioRouting.removeOnRoutingChangedListener(this.f18478a);
            }
            this.f18480c = null;
        }
    }
}
