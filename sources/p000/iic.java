package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzcc;

/* renamed from: iic */
public final class iic implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = htl.m3392a(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
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
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0005':
                    z = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzcc(str2, str, i, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcc[i];
    }
}
