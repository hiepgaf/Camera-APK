package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: hpx */
public final class hpx extends asc implements hpw {
    public hpx(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    /* renamed from: a */
    public final hpy mo1767a(String str, hqa hqa) {
        hpy hpy = null;
        Parcel a = m670a();
        a.writeString(str);
        ase.m675a(a, (IInterface) hqa);
        a.writeByteArray(null);
        a = m671a(a);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
            if (queryLocalInterface instanceof hpy) {
                hpy = (hpy) queryLocalInterface;
            } else {
                hpy = new hpz(readStrongBinder);
            }
        }
        a.recycle();
        return hpy;
    }
}
