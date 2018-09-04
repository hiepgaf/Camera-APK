package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: bog */
public final class bog {
    /* renamed from: a */
    public final Context f1357a;
    /* renamed from: b */
    public final Object f1358b;
    /* renamed from: c */
    public final ServiceConnection f1359c;
    /* renamed from: d */
    public final kas f1360d;
    /* renamed from: e */
    public kaq f1361e;
    /* renamed from: f */
    public boi f1362f;
    /* renamed from: g */
    public final IBinder f1363g = new Binder();
    /* renamed from: h */
    public boolean f1364h;

    public bog(Context context) {
        this.f1357a = context;
        this.f1358b = new Object();
        this.f1360d = new kat(this);
        this.f1359c = new boh(this);
    }
}
