package p000;

import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: ccw */
public final class ccw implements kwk {
    /* renamed from: a */
    private final kwk f11675a;
    /* renamed from: b */
    private final kwk f11676b;

    private ccw(kwk kwk, kwk kwk2) {
        this.f11675a = kwk;
        this.f11676b = kwk2;
    }

    /* renamed from: a */
    public static ccw m8021a(kwk kwk, kwk kwk2) {
        return new ccw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f11675a;
        hjf hjf = (hjf) this.f11676b.mo345a();
        iut c = ((ffc) kwk.mo345a()).mo1921c();
        iut iut = iut.BACK;
        if (!hjf.m3195c()) {
            obj = null;
        } else if (c == iut) {
            int i = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = Integer.valueOf(-1);
        } else {
            if (!hjf.m3195c()) {
                i = -1;
            } else if (!hjf.m3195c()) {
                i = 1;
            } else if (ExperimentalKeys.getLibraryVersion() <= 2) {
                i = 0;
            } else {
                i = 1;
            }
            obj = Integer.valueOf(i);
        }
        return (Integer) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
