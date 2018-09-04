package p000;

import com.google.lens.sdk.LensApi.LensAvailabilityCallback;
import com.google.lens.sdk.LensApi.LensAvailabilityStatus;

/* compiled from: PG */
/* renamed from: gyo */
final class gyo implements LensAvailabilityCallback {
    /* renamed from: a */
    private final /* synthetic */ long f17567a;
    /* renamed from: b */
    private final /* synthetic */ gyl f17568b;

    gyo(gyl gyl, long j) {
        this.f17568b = gyl;
        this.f17567a = j;
    }

    /* renamed from: a */
    public final void mo1697a(@LensAvailabilityStatus int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String str = gyl.f5803a;
        long j = this.f17567a;
        StringBuilder stringBuilder = new StringBuilder(75);
        stringBuilder.append("onAvailabilityStatusFetched in ");
        stringBuilder.append(currentTimeMillis - j);
        stringBuilder.append("ms, status = ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
        knk knk = this.f17568b.f5807e;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        knk.mo3557a(Boolean.valueOf(z));
    }
}
