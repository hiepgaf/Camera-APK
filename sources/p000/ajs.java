package p000;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: ajs */
public final class ajs implements ajz {
    /* renamed from: a */
    private final Context f9842a;

    public ajs(Context context) {
        this.f9842a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        return new aka(new arf(uri), new aju(this.f9842a, uri));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo89a(Object obj) {
        return aeh.m190a((Uri) obj);
    }
}
