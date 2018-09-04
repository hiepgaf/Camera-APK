package p000;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: hwf */
public abstract class hwf {
    /* renamed from: a */
    private static final Object f6772a = new Object();
    /* renamed from: b */
    private static hwf f6773b;

    /* renamed from: a */
    public static hwf m3551a(Context context) {
        synchronized (f6772a) {
            if (f6773b == null) {
                f6773b = new hwh(context.getApplicationContext());
            }
        }
        return f6773b;
    }

    /* renamed from: a */
    public final void m3552a(String str, String str2, ServiceConnection serviceConnection) {
        mo1783b(new hwg(str, str2), serviceConnection);
    }

    /* renamed from: a */
    protected abstract boolean mo1782a(hwg hwg, ServiceConnection serviceConnection);

    /* renamed from: b */
    protected abstract void mo1783b(hwg hwg, ServiceConnection serviceConnection);
}
