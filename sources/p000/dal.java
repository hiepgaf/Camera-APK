package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* renamed from: dal */
public final /* synthetic */ class dal implements koi {
    /* renamed from: a */
    private final dak f13035a;
    /* renamed from: b */
    private final int f13036b;
    /* renamed from: c */
    private final boolean f13037c;

    public dal(dak dak, int i, boolean z) {
        this.f13035a = dak;
        this.f13036b = i;
        this.f13037c = z;
    }

    /* renamed from: a */
    public final kpk mo1128a() {
        Object a;
        dak dak = this.f13035a;
        int i = this.f13036b;
        boolean z = this.f13037c;
        ebd ebd = dak.f2905a;
        if (ebd.f14891H != null) {
            iqm b;
            boolean z2;
            switch (ebd.f14896M.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4039b(0);
                    break;
                case 1:
                    b = iqm.m4039b(90);
                    break;
                case 2:
                    b = iqm.m4039b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            if (b.m4041a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a = ebd.f14891H.m3095a(i, z, z2);
        } else {
            a = null;
        }
        return kow.m13617a(a);
    }
}
