package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ccb */
public final class ccb {
    /* renamed from: a */
    private final Context f1840a;

    public ccb(Context context) {
        this.f1840a = context;
    }

    /* renamed from: a */
    public final Object m1103a(String str) {
        try {
            System.currentTimeMillis();
            return this.f1840a.getSystemService(str);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            String str2 = "Unable to create or provide ";
            throw new RuntimeException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
        }
    }
}
