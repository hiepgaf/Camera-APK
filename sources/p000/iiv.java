package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzk;

/* renamed from: iiv */
public final class iiv implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b = (byte) 0;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0005':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0006':
                    str4 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0007':
                    str5 = htl.m3447j(parcel, readInt);
                    break;
                case '\b':
                    str6 = htl.m3447j(parcel, readInt);
                    break;
                case '\t':
                    b = htl.m3444g(parcel, readInt);
                    break;
                case '\n':
                    b2 = htl.m3444g(parcel, readInt);
                    break;
                case '\u000b':
                    b3 = htl.m3444g(parcel, readInt);
                    break;
                case '\f':
                    b4 = htl.m3444g(parcel, readInt);
                    break;
                case '\r':
                    str7 = htl.m3447j(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzk(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
