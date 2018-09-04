package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzh;

/* renamed from: iiu */
public final class iiu implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte b = (byte) 0;
        int a = htl.m3392a(parcel);
        String str = null;
        byte b2 = (byte) 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    b2 = htl.m3444g(parcel, readInt);
                    break;
                case '\u0003':
                    b = htl.m3444g(parcel, readInt);
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
            return new zzh(b2, b, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
