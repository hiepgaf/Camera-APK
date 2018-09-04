package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ace */
public final class ace extends ContextWrapper {
    /* renamed from: a */
    public static final acq f208a = new acq((byte) 0);
    /* renamed from: b */
    public final Handler f209b = new Handler(Looper.getMainLooper());
    /* renamed from: c */
    public final agu f210c;
    /* renamed from: d */
    public final ach f211d;
    /* renamed from: e */
    public final aqg f212e;
    /* renamed from: f */
    public final Map f213f;
    /* renamed from: g */
    public final afs f214g;
    /* renamed from: h */
    public final int f215h;

    public ace(Context context, agu agu, ach ach, aqg aqg, Map map, afs afs, int i) {
        super(context.getApplicationContext());
        this.f210c = agu;
        this.f211d = ach;
        this.f212e = aqg;
        this.f213f = map;
        this.f214g = afs;
        this.f215h = i;
    }
}
