package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.LogOptions;

/* renamed from: hxz */
public final class hxz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    z = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LogOptions(str, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }
}
