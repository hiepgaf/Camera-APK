package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import java.io.File;

@TargetApi(8)
/* compiled from: PG */
/* renamed from: gtu */
public final class gtu {
    static {
        bli.m862a("StorageModule");
    }

    /* renamed from: a */
    public static kbg m2824a(Context context) {
        return kbg.m4744b(context.getExternalCacheDir());
    }

    /* renamed from: a */
    public static gsx m2823a() {
        return new gsy(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
    }
}
