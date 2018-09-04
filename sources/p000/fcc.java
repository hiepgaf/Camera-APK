package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcc */
public final class fcc extends fiw {
    /* renamed from: a */
    private final fbz f15858a;

    fcc(fbz fbz) {
        this.f15858a = fbz;
    }

    public final void a_(iwp iwp) {
        int intValue = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_MODE))).intValue();
        Object obj = (gie) gie.f5209c.get(Integer.valueOf(intValue));
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("unknown metadata value: ");
            stringBuilder.append(intValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        gie gie = (gie) jri.m13152b(obj);
        int intValue2 = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE))).intValue();
        Object obj2 = (gif) gif.f5217b.get(Integer.valueOf(intValue2));
        if (obj2 == null) {
            StringBuilder stringBuilder2 = new StringBuilder(35);
            stringBuilder2.append("unknown metadata value: ");
            stringBuilder2.append(intValue2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        this.f15858a.m10189a(fbx.m2232c().m2237a(gie).m2238a((gif) jri.m13152b(obj2)).m2236a());
    }
}
