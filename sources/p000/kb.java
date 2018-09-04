package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: kb */
final class kb implements ClassLoaderCreator {
    kb() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ka(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ka(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ka[i];
    }
}
