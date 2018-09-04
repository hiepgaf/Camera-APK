package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: hza */
public final class hza implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = htl.m3392a(parcel);
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    str = htl.m3447j(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new TogglingData(str3, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TogglingData[i];
    }
}
