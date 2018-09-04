package p000;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: kar */
public final class kar extends asc implements kaq {
    public kar(IBinder iBinder) {
        super(iBinder, "com.google.android.systemui.elmyra.IElmyraService");
    }

    /* renamed from: a */
    public final void mo2080a(IBinder iBinder, IBinder iBinder2) {
        Parcel a = m670a();
        a.writeStrongBinder(iBinder);
        a.writeStrongBinder(iBinder2);
        m672a(1, a);
    }
}
