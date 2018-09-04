package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bkh */
public final class bkh implements bkg {
    /* renamed from: a */
    private final bkm f20112a;
    /* renamed from: b */
    private final AudioManager f20113b;
    /* renamed from: c */
    private final ilp f20114c;
    /* renamed from: d */
    private final AudioDeviceCallback f20115d;
    /* renamed from: e */
    private final HandlerThread f20116e;
    /* renamed from: f */
    private final Handler f20117f;
    /* renamed from: g */
    private boolean f20118g;
    /* renamed from: h */
    private boolean f20119h = false;
    /* renamed from: i */
    private final Object f20120i = new Object();

    public bkh(bkm bkm, AudioManager audioManager, ilp ilp) {
        this.f20112a = bkm;
        this.f20113b = audioManager;
        this.f20114c = ilp;
        this.f20115d = new bki(this);
        this.f20116e = new HandlerThread("AudioDeviceChangeListener");
        this.f20116e.start();
        this.f20117f = new Handler(this.f20116e.getLooper());
        this.f20118g = false;
    }

    public final void close() {
        synchronized (this.f20120i) {
            if (this.f20118g) {
                Log.w("AudioDeviceChangeListener", "Already closed");
                return;
            }
            mo2689b();
            this.f20118g = true;
            try {
                this.f20116e.quit();
                this.f20116e.join();
            } catch (InterruptedException e) {
                Log.e("AudioDeviceChangeListener", "Could not complete shutting down AudioDeviceChangeListener.");
            }
            Log.d("AudioDeviceChangeListener", "Audio devices listener thread stopped.");
        }
    }

    /* renamed from: a */
    public final void mo2688a() {
        synchronized (this.f20120i) {
            if (this.f20118g) {
                return;
            }
            if (this.f20119h) {
                mo2689b();
            }
            Log.d("AudioDeviceChangeListener", "Start");
            m14852c();
            this.f20113b.registerAudioDeviceCallback(this.f20115d, this.f20117f);
            this.f20119h = true;
        }
    }

    /* renamed from: b */
    public final void mo2689b() {
        synchronized (this.f20120i) {
            if (this.f20118g) {
                return;
            }
            Log.d("AudioDeviceChangeListener", "Stop");
            this.f20113b.unregisterAudioDeviceCallback(this.f20115d);
            this.f20114c.mo348a(Boolean.valueOf(false));
            this.f20119h = false;
        }
    }

    /* renamed from: c */
    final void m14852c() {
        boolean z;
        jri.m13152b(this.f20114c);
        jri.m13152b(this.f20112a);
        ilp ilp = this.f20114c;
        if (this.f20112a.m847a() != null) {
            z = true;
        } else {
            z = false;
        }
        ilp.mo348a(Boolean.valueOf(z));
        String valueOf = String.valueOf(this.f20114c.mo2860b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
        stringBuilder.append("External audio devices updated to: ");
        stringBuilder.append(valueOf);
        Log.d("AudioDeviceChangeListener", stringBuilder.toString());
    }
}
