package p000;

import android.app.NotificationManager;
import android.app.NotificationManager.Policy;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dke */
public final class dke implements dkd {
    /* renamed from: a */
    public static final String f13512a = bli.m862a("CdrVideoSound");
    /* renamed from: b */
    private final AudioManager f13513b;
    /* renamed from: c */
    private final gpn f13514c;
    /* renamed from: d */
    private final OnAudioFocusChangeListener f13515d = new dkf();
    /* renamed from: e */
    private final NotificationManager f13516e;
    /* renamed from: f */
    private boolean f13517f;
    /* renamed from: g */
    private Policy f13518g;
    /* renamed from: h */
    private Policy f13519h;

    public dke(AudioManager audioManager, gpn gpn, NotificationManager notificationManager) {
        this.f13513b = audioManager;
        this.f13514c = gpn;
        this.f13516e = notificationManager;
    }

    /* renamed from: a */
    public final void mo1161a() {
        if (!this.f13517f) {
            this.f13513b.requestAudioFocus(new Builder(2).setOnAudioFocusChangeListener(this.f13515d, new Handler()).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(1).build()).build());
            if (this.f13516e.getCurrentInterruptionFilter() == 1) {
                try {
                    this.f13518g = this.f13516e.getNotificationPolicy();
                    this.f13516e.setNotificationPolicy(new Policy(128, 0, 0));
                    this.f13519h = this.f13516e.getNotificationPolicy();
                    this.f13516e.setInterruptionFilter(2);
                    this.f13517f = true;
                    return;
                } catch (SecurityException e) {
                    String str = f13512a;
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    stringBuilder.append("Error: ");
                    stringBuilder.append(valueOf);
                    bli.m866b(str, stringBuilder.toString());
                    return;
                }
            }
            this.f13517f = false;
        }
    }

    /* renamed from: b */
    public final void mo1162b() {
        this.f13514c.mo1548a(R.raw.video_start);
    }

    /* renamed from: c */
    public final void mo1163c() {
        this.f13514c.mo1548a(R.raw.video_stop);
    }

    /* renamed from: d */
    public final void mo1164d() {
        if (this.f13517f && this.f13516e.getNotificationPolicy().equals(this.f13519h) && this.f13516e.getCurrentInterruptionFilter() == 2) {
            try {
                this.f13516e.setInterruptionFilter(1);
                this.f13516e.setNotificationPolicy(this.f13518g);
                this.f13517f = false;
            } catch (SecurityException e) {
                String str = f13512a;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
                stringBuilder.append("Error: ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
            }
            this.f13513b.abandonAudioFocus(this.f13515d);
        }
    }
}
