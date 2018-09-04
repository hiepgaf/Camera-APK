package p000;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: kat */
public final class kat extends asd implements kas {
    /* renamed from: a */
    private final /* synthetic */ bog f19137a;

    public kat() {
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
    }

    public kat(bog bog) {
        this.f19137a = bog;
        this();
    }

    /* renamed from: a */
    protected final boolean mo1770a(int i, Parcel parcel) {
        boi boi;
        switch (i) {
            case 1:
                parcel.readFloat();
                parcel.readInt();
                synchronized (this.f19137a.f1358b) {
                    boi = this.f19137a.f1362f;
                    if (boi != null) {
                        boi.mo558b();
                    }
                }
            case 2:
                synchronized (this.f19137a.f1358b) {
                    boi = this.f19137a.f1362f;
                    if (boi != null) {
                        boi.mo557a();
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }
}
