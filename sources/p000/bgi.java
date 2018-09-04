package p000;

/* compiled from: PG */
/* renamed from: bgi */
final class bgi implements koj {
    /* renamed from: a */
    private final /* synthetic */ bgb f10779a;

    bgi(bgb bgb) {
        this.f10779a = bgb;
    }

    /* renamed from: a */
    private final kpk m7354a(Boolean bool) {
        kpk a;
        synchronized (this.f10779a.f19995d) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.f10779a.f19998g.equals(bgj.STOPPING_RECORD)) {
                this.f10779a.f19998g = bgj.CLOSED;
                long currentTimeMillis = System.currentTimeMillis();
                this.f10779a.f19996e.close();
                if (!bool.booleanValue()) {
                    if (this.f10779a.f19994c.length() <= 0) {
                        if (this.f10779a.f19994c != null) {
                            String str = bgb.f19992a;
                            valueOf = String.valueOf(this.f10779a.f19994c);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                            stringBuilder.append("Delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m869c(str, stringBuilder.toString());
                            if (!this.f10779a.f19994c.delete()) {
                                str = bgb.f19992a;
                                valueOf = String.valueOf(this.f10779a.f19994c);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                                stringBuilder.append("Failed to delete recording file: ");
                                stringBuilder.append(valueOf);
                                bli.m866b(str, stringBuilder.toString());
                            }
                        }
                        a = kow.m13617a(this.f10779a.f19997f);
                    }
                }
                bgb bgb = this.f10779a;
                bgb.m14820a(bgb.f19994c, currentTimeMillis);
                a = kow.m13617a(this.f10779a.f19997f);
            } else {
                valueOf = String.valueOf(this.f10779a.f19998g);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }
}
