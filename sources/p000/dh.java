package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: dh */
final class dh implements ClassLoaderCreator {
    dh() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dg(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new dg(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dg[i];
    }
}
