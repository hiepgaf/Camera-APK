package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fgi */
public final class fgi implements kwk {
    /* renamed from: a */
    private final kwk f15980a;

    private fgi(kwk kwk) {
        this.f15980a = kwk;
    }

    /* renamed from: a */
    public static fgi m10325a(kwk kwk) {
        return new fgi(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        iqp iqp;
        Object a;
        fgu fgu = (fgu) this.f15980a.mo345a();
        iqp iqp2 = fgu.f4547a;
        if (iqp2 != null) {
            ipz b = ipz.m4019b(iqp2);
            List<iqp> list = fgu.f4548b;
            Collection arrayList = new ArrayList();
            for (iqp iqp3 : list) {
                if (iqp3.m4046a() != 0 && ipz.m4019b(iqp3).m4027b(b).equals(b)) {
                    arrayList.add(iqp3);
                }
            }
            arrayList.add(new iqp(0, 0));
            iqp3 = (iqp) Collections.max(arrayList, iqq.f7332a);
        } else {
            iqp3 = null;
        }
        if (iqp3 == null) {
            a = fds.m10234a();
        } else {
            a = fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.JPEG_THUMBNAIL_QUALITY, Byte.valueOf((byte) 90)), new fin(CaptureRequest.JPEG_THUMBNAIL_SIZE, ion.m3939a(iqp3))}));
        }
        return (fis) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
