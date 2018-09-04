package p000;

import com.google.common.logging.nano.eventprotos$CameraEvent;

/* renamed from: gry */
final /* synthetic */ class gry implements Runnable {
    /* renamed from: a */
    private final grx f5657a;
    /* renamed from: b */
    private final eventprotos$CameraEvent f5658b;

    gry(grx grx, eventprotos$CameraEvent eventprotos_cameraevent) {
        this.f5657a = grx;
        this.f5658b = eventprotos_cameraevent;
    }

    public final void run() {
        grx grx = this.f5657a;
        grx.f17273a.mo774a(this.f5658b);
    }
}
