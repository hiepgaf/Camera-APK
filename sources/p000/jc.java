package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: jc */
final class jc implements ClassLoaderCreator {
    jc() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return jc.m4392a(parcel, null);
    }

    /* renamed from: a */
    private static jb m4392a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return jb.f7630d;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return jc.m4392a(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jb[i];
    }
}
