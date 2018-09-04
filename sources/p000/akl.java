package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* renamed from: akl */
public final class akl implements ajz {
    /* renamed from: a */
    private final ajz f9855a;
    /* renamed from: b */
    private final Resources f9856b;

    public akl(Resources resources, ajz ajz) {
        this.f9856b = resources;
        this.f9855a = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        Uri a = m6562a((Integer) obj);
        return a != null ? this.f9855a.mo88a(a, i, i2, adp) : null;
    }

    /* renamed from: a */
    private final Uri m6562a(Integer num) {
        String resourceTypeName;
        try {
            String resourcePackageName = this.f9856b.getResourcePackageName(num.intValue());
            resourceTypeName = this.f9856b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.f9856b.getResourceEntryName(num.intValue());
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(resourcePackageName).length() + 21) + String.valueOf(resourceTypeName).length()) + String.valueOf(resourceEntryName).length());
            stringBuilder.append("android.resource://");
            stringBuilder.append(resourcePackageName);
            stringBuilder.append('/');
            stringBuilder.append(resourceTypeName);
            stringBuilder.append('/');
            stringBuilder.append(resourceEntryName);
            return Uri.parse(stringBuilder.toString());
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                resourceTypeName = String.valueOf(num);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(resourceTypeName).length() + 30);
                stringBuilder2.append("Received invalid resource id: ");
                stringBuilder2.append(resourceTypeName);
                Log.w("ResourceLoader", stringBuilder2.toString(), e);
            }
            return null;
        }
    }
}
