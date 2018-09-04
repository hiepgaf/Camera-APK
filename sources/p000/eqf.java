package p000;

import android.net.Uri;
import android.provider.MediaStore.Files;

/* compiled from: PG */
/* renamed from: eqf */
public final class eqf implements kwk {
    /* renamed from: a */
    public static final eqf f15382a = new eqf();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return eqf.m9823b();
    }

    /* renamed from: b */
    public static Uri m9823b() {
        return (Uri) ktm.m13963a(Files.getContentUri("external"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
