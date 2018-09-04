package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: az */
final class az implements ClassLoaderCreator {
    az() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ay(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ay(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ay[i];
    }
}
