package p000;

/* compiled from: PG */
/* renamed from: djk */
final class djk implements kov {
    /* renamed from: a */
    private final /* synthetic */ dix f13492a;

    djk(dix dix) {
        this.f13492a = dix;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        synchronized (this.f13492a.f13471l) {
            String str = dix.f13456a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("Failed when calling CamcorderRecordingSession#stopRecording: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            this.f13492a.f13480u.m2637a(null, hci.m11747a(), false);
            for (djm b : this.f13492a.f13475p) {
                b.mo1148b().m17780a(th);
            }
            this.f13492a.f13475p.clear();
            dix dix = this.f13492a;
            dix.m9128f();
            dix.m9129g();
            if (this.f13492a.f13479t == djn.CLOSED) {
                return;
            }
            boolean z;
            if (this.f13492a.f13479t == djn.STOPPING_RECORDING) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            this.f13492a.f13479t = djn.NO_RECORDING;
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        hku hku = (hku) obj;
        synchronized (this.f13492a.f13471l) {
            this.f13492a.m9124b(hku);
            hkv hkv = this.f13492a.f13467h;
            hkv.f6315a.mo1659a(hip.VIDEO);
            hkv.f6315a.mo1660a(hkv.f6316b);
            if (this.f13492a.f13479t == djn.CLOSED) {
                return;
            }
            boolean z;
            if (this.f13492a.f13479t == djn.STOPPING_RECORDING) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            this.f13492a.f13479t = djn.NO_RECORDING;
        }
    }
}
