package p000;

/* compiled from: PG */
/* renamed from: hce */
final class hce implements hch {
    /* renamed from: a */
    private final /* synthetic */ hcd f17637a;

    hce(hcd hcd) {
        this.f17637a = hcd;
    }

    public final void onShutterButtonClick() {
        synchronized (this.f17637a.f5956b) {
            for (hch onShutterButtonClick : this.f17637a.f5957c) {
                onShutterButtonClick.onShutterButtonClick();
            }
        }
    }

    public final void onShutterButtonLongPressRelease() {
        synchronized (this.f17637a.f5956b) {
            for (hch onShutterButtonLongPressRelease : this.f17637a.f5957c) {
                onShutterButtonLongPressRelease.onShutterButtonLongPressRelease();
            }
        }
    }

    public final void onShutterButtonLongPressed() {
        synchronized (this.f17637a.f5956b) {
            for (hch onShutterButtonLongPressed : this.f17637a.f5957c) {
                onShutterButtonLongPressed.onShutterButtonLongPressed();
            }
        }
    }

    public final void onShutterButtonPressedStateChanged(boolean z) {
        synchronized (this.f17637a.f5956b) {
            for (hch onShutterButtonPressedStateChanged : this.f17637a.f5957c) {
                onShutterButtonPressedStateChanged.onShutterButtonPressedStateChanged(z);
            }
        }
    }

    public final void onShutterTouch(hin hin) {
        synchronized (this.f17637a.f5956b) {
            for (hch onShutterTouch : this.f17637a.f5957c) {
                onShutterTouch.onShutterTouch(hin);
            }
        }
    }
}
