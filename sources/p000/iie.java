package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.PackageStorageInfo;

/* renamed from: iie */
public final class iie implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = htl.m3392a(parcel);
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    j = htl.m3446i(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PackageStorageInfo(str2, str, j);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PackageStorageInfo[i];
    }
}
