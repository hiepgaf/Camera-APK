package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: hpz */
public final class hpz extends asc implements hpy {
    hpz(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    /* renamed from: a */
    public final void mo1768a(byte[] bArr) {
        Parcel a = m670a();
        a.writeByteArray(bArr);
        m672a(1, a);
    }

    /* renamed from: a */
    public final void mo1769a(byte[] bArr, hqc hqc) {
        Parcel a = m670a();
        a.writeByteArray(bArr);
        ase.m676a(a, (Parcelable) hqc);
        m672a(2, a);
    }
}
