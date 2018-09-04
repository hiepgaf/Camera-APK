package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: bl */
final class bl implements ClassLoaderCreator {
    bl() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bk(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new bk(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bk[i];
    }
}
