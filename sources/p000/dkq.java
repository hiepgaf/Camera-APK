package p000;

/* compiled from: PG */
/* renamed from: dkq */
final class dkq implements iqt {
    /* renamed from: a */
    private final /* synthetic */ dkp f13545a;

    dkq(dkp dkp) {
        this.f13545a = dkp;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        gom gom = (gom) obj;
        synchronized (this.f13545a.j) {
            if (this.f13545a.m == dii.CAMCORDER_OPENED) {
                inc inc;
                switch (gom.ordinal()) {
                    case 0:
                        inc = inc.FPS_AUTO;
                        break;
                    case 1:
                        inc = inc.FPS_30;
                        break;
                    case 2:
                        inc = inc.FPS_60;
                        break;
                    default:
                        String valueOf = String.valueOf(gom);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        stringBuilder.append("Unsupported FPS option ");
                        stringBuilder.append(valueOf);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.f13545a.m17065a(inc);
                return;
            }
            String str = dkp.f23456c;
            valueOf = String.valueOf(this.f13545a.m);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("Do nothing on FpsOption update. mState=");
            stringBuilder.append(valueOf);
            bli.m873e(str, stringBuilder.toString());
        }
    }
}
