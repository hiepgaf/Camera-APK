package p000;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: ans */
public final class ans implements adq {
    /* renamed from: a */
    private final Context f10095a;

    public ans(Context context) {
        this.f10095a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ agn mo101a(Object obj, int i, int i2, adp adp) {
        return m6853a((Uri) obj);
    }

    /* renamed from: a */
    public final agn m6853a(Uri uri) {
        Context context;
        int b = m6852b(uri);
        String authority = uri.getAuthority();
        if (authority.equals(this.f10095a.getPackageName())) {
            context = this.f10095a;
        } else {
            context = m6851a(uri, authority);
        }
        return anr.m14671a(anp.m515a(this.f10095a, context, b, null));
    }

    /* renamed from: a */
    private final Context m6851a(Uri uri, String str) {
        try {
            return this.f10095a.createPackageContext(str, 0);
        } catch (Throwable e) {
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
            stringBuilder.append("Failed to obtain context or unrecognized Uri format for: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo102a(Object obj, adp adp) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* renamed from: b */
    private final int m6852b(Uri uri) {
        Integer valueOf;
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            valueOf = Integer.valueOf(this.f10095a.getResources().getIdentifier(str2, str, uri.getAuthority()));
        } else if (pathSegments.size() != 1) {
            valueOf = null;
        } else {
            try {
                valueOf = Integer.valueOf((String) pathSegments.get(0));
            } catch (NumberFormatException e) {
                valueOf = null;
            }
        }
        StringBuilder stringBuilder;
        if (valueOf == null) {
            str2 = String.valueOf(uri);
            stringBuilder = new StringBuilder(String.valueOf(str2).length() + 25);
            stringBuilder.append("Unrecognized Uri format: ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (valueOf.intValue() != 0) {
            return valueOf.intValue();
        } else {
            str2 = String.valueOf(uri);
            stringBuilder = new StringBuilder(String.valueOf(str2).length() + 34);
            stringBuilder.append("Failed to obtain resource id for: ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
