package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: hqd */
final class hqd implements Creator {
    hqd() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new hqc(parcel.readParcelable(null));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new hqc[i];
    }
}
