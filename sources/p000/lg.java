package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: lg */
final class lg implements ClassLoaderCreator {
    lg() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new lf(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new lf(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new lf[i];
    }
}
