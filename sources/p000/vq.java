package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: vq */
final class vq implements ClassLoaderCreator {
    vq() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vp(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new vp(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new vp[i];
    }
}
