package p000;

import java.util.concurrent.Callable;

/* renamed from: bks */
final /* synthetic */ class bks implements Callable {
    /* renamed from: a */
    private final iot f1243a;

    bks(iot iot) {
        this.f1243a = iot;
    }

    public final Object call() {
        iot iot = this.f1243a;
        if (iot.f7254k != null || iot.f7255l != null) {
            return new ios(iot);
        }
        throw new IllegalArgumentException("Either Output video file path or descriptor is required");
    }
}
