package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: ut */
final class ut implements ClassLoaderCreator {
    ut() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new us(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new us(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new us[i];
    }
}
