package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bpo */
public final class bpo implements bpn {
    /* renamed from: a */
    private final Context f11186a;
    /* renamed from: b */
    private final iqz f11187b;

    static {
        bsj bsj = new bsj("camera.dbg.bugtoast");
    }

    public bpo(Context context, bsn bsn, ira ira) {
        this.f11186a = context;
        this.f11187b = ira.mo511a("ShotFailureHdlr");
    }

    /* renamed from: a */
    public final void mo559a() {
        Throwable bpm = new bpm();
        this.f11187b.mo517c("Shot Canceled!", bpm);
        bap.m775a(this.f11186a, bpm, "com.android.camera.silentfeedback.SILENT_FEEDBACK");
    }
}
