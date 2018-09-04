package p000;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: hqb */
public abstract class hqb extends asd implements hqa {
    public hqb() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    /* renamed from: a */
    protected final boolean mo1770a(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        ase.m674a(parcel, hqc.CREATOR);
        mo3099a(createByteArray);
        return true;
    }
}
