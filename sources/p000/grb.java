package p000;

import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: grb */
public final class grb extends InstrumentationSession {
    /* renamed from: c */
    private static grb f17230c;
    /* renamed from: a */
    public long f17231a;
    /* renamed from: b */
    public long f17232b;

    private grb(iya iya) {
        super(iya, "CameraApp");
    }

    /* renamed from: a */
    public static grb m11380a() {
        if (f17230c == null) {
            f17230c = new grb(new iya());
        }
        return f17230c;
    }
}
