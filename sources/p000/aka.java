package p000;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: aka */
public final class aka {
    /* renamed from: a */
    public final adl f506a;
    /* renamed from: b */
    public final List f507b;
    /* renamed from: c */
    public final adw f508c;

    public aka(adl adl, adw adw) {
        this(adl, Collections.emptyList(), adw);
    }

    private aka(adl adl, List list, adw adw) {
        this.f506a = (adl) aqe.m585a((Object) adl, "Argument must not be null");
        this.f507b = (List) aqe.m585a((Object) list, "Argument must not be null");
        this.f508c = (adw) aqe.m585a((Object) adw, "Argument must not be null");
    }
}
