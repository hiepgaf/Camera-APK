package p000;

import android.content.Context;
import android.preference.PreferenceManager;
import android.support.v8.renderscript.RenderScript;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hse */
public final class hse {
    /* renamed from: a */
    public static final ReentrantLock f6566a = new ReentrantLock();
    /* renamed from: b */
    private static RenderScript f6567b = null;
    /* renamed from: c */
    private static String f6568c = "camera.renderscript";
    /* renamed from: d */
    private static String f6569d = "1";
    /* renamed from: e */
    private static final String f6570e = bli.m862a("RenderScriptPool");

    /* renamed from: a */
    public static RenderScript m3336a(Context context) {
        boolean equals;
        bkw bkw = new bkw(context.getContentResolver(), hjf.m3193a(), PreferenceManager.getDefaultSharedPreferences(context));
        String a = iwd.f7518a.m4274a(f6568c);
        if ((kbi.m4752a(a) ^ 1) != 0) {
            equals = f6569d.equals(a);
        } else {
            equals = bkw.m849a(bkw.f1255a, "camera:use_renderscript", hjf.f6264a);
        }
        if (!equals) {
            bli.m863a(f6570e, "RenderScript not configured");
            return null;
        } else if (f6566a.tryLock()) {
            if (f6567b == null) {
                f6567b = RenderScript.create(context.getApplicationContext());
            }
            bli.m863a(f6570e, "RenderScript acquired");
            return f6567b;
        } else {
            bli.m863a(f6570e, "RenderScript already used");
            return null;
        }
    }
}
