package p000;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: all */
public final class all implements ajz {
    /* renamed from: a */
    private final Context f9880a;

    public all(Context context) {
        this.f9880a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        if (aeh.m189a(i, i2)) {
            Object obj2;
            Long l = (Long) adp.m6303a(anf.f10085a);
            if (l == null) {
                obj2 = null;
            } else if (l.longValue() != -1) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            if (obj2 != null) {
                adl arf = new arf(uri);
                Context context = this.f9880a;
                return new aka(arf, aeo.m6335a(context, uri, new aeq(context.getContentResolver())));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo89a(Object obj) {
        Uri uri = (Uri) obj;
        return aeh.m190a(uri) && aeh.m191b(uri);
    }
}
