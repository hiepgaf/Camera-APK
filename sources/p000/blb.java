package p000;

import android.content.UriMatcher;

/* compiled from: PG */
/* renamed from: blb */
public final class blb {
    /* renamed from: a */
    public ccp f1259a;
    /* renamed from: b */
    public final /* synthetic */ cgn f1260b;

    public blb(cgn cgn, ccp ccp) {
        this.f1260b = cgn;
        this.f1259a = (ccp) ktm.m13962a((Object) ccp);
    }

    /* renamed from: a */
    public final UriMatcher m859a() {
        String a = ccq.m8006a(this.f1259a);
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(a, "type/*", 1);
        uriMatcher.addURI(a, "data/*", 2);
        uriMatcher.addURI(a, "icon/#/badge", 3);
        uriMatcher.addURI(a, "icon/#/interact", 4);
        uriMatcher.addURI(a, "icon/#/dialog", 5);
        uriMatcher.addURI(a, "delete/#", 6);
        uriMatcher.addURI(a, "processing", 7);
        uriMatcher.addURI(a, "processing/#", 8);
        return (UriMatcher) ktm.m13963a(uriMatcher, "Cannot return null from a non-@Nullable @Provides method");
    }
}
