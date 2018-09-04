package p000;

/* compiled from: PG */
/* renamed from: bfz */
final class bfz implements koj {
    /* renamed from: a */
    private final /* synthetic */ bft f10766a;

    bfz(bft bft) {
        this.f10766a = bft;
    }

    /* renamed from: a */
    private final kpk m7339a(Boolean bool) {
        kpk a;
        synchronized (this.f10766a.f19972g) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.f10766a.f19975j.equals(bga.STOPPING_RECORD)) {
                this.f10766a.f19975j = bga.CLOSED;
                hke hke = this.f10766a.f19971f;
                long currentTimeMillis = System.currentTimeMillis();
                this.f10766a.f19973h.close();
                if (!bool.booleanValue()) {
                    if (this.f10766a.f19969d.length() <= 0) {
                        String str = bft.f19962a;
                        valueOf = String.valueOf(this.f10766a.f19969d);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        stringBuilder.append("Delete recording file: ");
                        stringBuilder.append(valueOf);
                        bli.m869c(str, stringBuilder.toString());
                        if (!this.f10766a.f19969d.delete()) {
                            str = bft.f19962a;
                            valueOf = String.valueOf(this.f10766a.f19969d);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            stringBuilder.append("Failed to delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m866b(str, stringBuilder.toString());
                        }
                        a = kow.m13617a(this.f10766a.f19974i);
                    }
                }
                bft bft = this.f10766a;
                bft.m14803a(bft.f19969d, currentTimeMillis);
                a = kow.m13617a(this.f10766a.f19974i);
            } else {
                valueOf = String.valueOf(this.f10766a.f19975j);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }
}
