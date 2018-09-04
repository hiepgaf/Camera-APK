package p000;

/* compiled from: PG */
/* renamed from: cyu */
final class cyu extends hci {
    /* renamed from: a */
    private final /* synthetic */ chx f20827a;
    /* renamed from: b */
    private final /* synthetic */ cyd f20828b;

    cyu(cyd cyd, chx chx) {
        this.f20828b = cyd;
        this.f20827a = chx;
    }

    public final void onShutterButtonClick() {
        cyd cyd = this.f20828b;
        if (cyd.f22772w == null) {
            Object obj;
            if (cyd.f22771v == null) {
                obj = "closed";
            } else {
                obj = "starting";
            }
            String str = cyd.f22726c;
            String valueOf = String.valueOf(obj);
            String str2 = "Not taking picture since Camera is ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
            return;
        }
        cyd.m17002w();
    }

    public final void onShutterButtonLongPressRelease() {
        this.f20827a.mo1109a(chw.SHUTTER_BUTTON, true);
    }

    public final void onShutterButtonLongPressed() {
        this.f20827a.mo1108a(chw.SHUTTER_BUTTON);
    }

    public final void onShutterButtonPressedStateChanged(boolean z) {
        this.f20828b.f22735I = z;
    }
}
