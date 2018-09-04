package p000;

import android.util.Log;
import com.google.lens.sdk.LensApi;
import com.google.lens.sdk.LensApi.LensAvailabilityCallback;
import com.google.lens.sdk.LensApi.LensFeature;

/* compiled from: PG */
/* renamed from: ksy */
public final class ksy implements hqr {
    /* renamed from: a */
    private final LensAvailabilityCallback f19284a;
    @LensFeature
    /* renamed from: b */
    private final int f19285b;

    public ksy(LensAvailabilityCallback lensAvailabilityCallback, @LensFeature int i) {
        this.f19284a = lensAvailabilityCallback;
        this.f19285b = i;
    }

    /* renamed from: a */
    public final void mo1774a(hra hra) {
        int i = this.f19285b;
        switch (i) {
            case 0:
                i = hra.f21619c;
                break;
            case 1:
                i = hra.f21620d;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Invalid lens feature: ");
                stringBuilder.append(i);
                Log.w("LensApi", stringBuilder.toString());
                i = 1;
                break;
        }
        this.f19284a.mo1697a(LensApi.m1384a(i));
    }
}
