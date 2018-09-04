package p000;

import android.annotation.TargetApi;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgu */
public final class bgu implements bgt {
    /* renamed from: a */
    private final inp f10831a;

    public bgu(inp inp) {
        this.f10831a = inp;
    }

    /* renamed from: a */
    public final Range mo436a() {
        return Range.create(Integer.valueOf(30), Integer.valueOf(this.f10831a.mo1891a().f7142f));
    }

    /* renamed from: b */
    public final Range mo437b() {
        Comparable valueOf = Integer.valueOf(this.f10831a.mo1891a().f7142f);
        return Range.create(valueOf, valueOf);
    }
}
