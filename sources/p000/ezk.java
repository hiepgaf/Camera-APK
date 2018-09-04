package p000;

import android.annotation.TargetApi;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ezk */
public class ezk {
    /* renamed from: a */
    public final boolean f4381a;
    /* renamed from: b */
    public final boolean f4382b;
    /* renamed from: c */
    public final boolean f4383c;

    public ezk() {
        this.f4381a = false;
        this.f4382b = false;
        this.f4383c = false;
    }

    public ezk(ery ery) {
        boolean z = false;
        float f = (((float) ery.f4179c) * 360.0f) / ((float) ery.f4181e);
        boolean z2 = ery.f4178b ? !ery.f4183g ? f < 70.0f ? (((float) ery.f4180d) * 180.0f) / ((float) ery.f4182f) >= 70.0f : true : false : false;
        this.f4381a = z2;
        if (!ery.f4183g && f == 360.0f) {
            z = true;
        }
        this.f4382b = z;
        this.f4383c = ery.f4184h;
    }
}
