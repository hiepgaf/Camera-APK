package p000;

import android.annotation.TargetApi;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgv */
public final class bgv implements bgt {
    /* renamed from: a */
    private final Range f10832a;
    /* renamed from: b */
    private final kbg f10833b;
    /* renamed from: c */
    private final boolean f10834c;

    public bgv(Range range, kbg kbg, boolean z) {
        this.f10832a = range;
        this.f10833b = kbg;
        this.f10834c = z;
    }

    /* renamed from: a */
    public final Range mo436a() {
        if (this.f10834c && this.f10833b.mo2084b()) {
            return (Range) this.f10833b.mo2081a();
        }
        return this.f10832a;
    }

    /* renamed from: b */
    public final Range mo437b() {
        if (this.f10834c && this.f10833b.mo2084b()) {
            return (Range) this.f10833b.mo2081a();
        }
        return this.f10832a;
    }
}
