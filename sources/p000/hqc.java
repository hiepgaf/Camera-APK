package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: hqc */
public final class hqc implements Parcelable {
    public static final Creator CREATOR = new hqd();
    /* renamed from: a */
    private final Parcelable f6445a;

    public hqc(Parcelable parcelable) {
        if (parcelable.getClass().getName().startsWith("android.os.")) {
            this.f6445a = parcelable;
            return;
        }
        throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6445a, i);
    }
}
