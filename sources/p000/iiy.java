package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzs;
import com.google.android.gms.wearable.internal.zzu;

/* renamed from: iiy */
public final class iiy implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        int i2 = 0;
        zzu zzu = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int i4;
            zzu zzu2;
            int readInt = parcel.readInt();
            zzu zzu3;
            switch ((char) readInt) {
                case '\u0002':
                    i4 = i3;
                    i3 = i;
                    i = i2;
                    zzu2 = (zzu) htl.m3397a(parcel, readInt, zzu.CREATOR);
                    break;
                case '\u0003':
                    zzu3 = zzu;
                    i4 = i3;
                    i3 = i;
                    i = htl.m3445h(parcel, readInt);
                    zzu2 = zzu3;
                    break;
                case '\u0004':
                    zzu3 = zzu;
                    i4 = i3;
                    i3 = htl.m3445h(parcel, readInt);
                    i = i2;
                    zzu2 = zzu3;
                    break;
                case '\u0005':
                    zzu3 = zzu;
                    i4 = htl.m3445h(parcel, readInt);
                    i3 = i;
                    i = i2;
                    zzu2 = zzu3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    zzu3 = zzu;
                    i4 = i3;
                    i3 = i;
                    i = i2;
                    zzu2 = zzu3;
                    break;
            }
            int i5 = i4;
            zzu = zzu2;
            i2 = i;
            i = i3;
            i3 = i5;
        }
        if (parcel.dataPosition() == a) {
            return new zzs(zzu, i2, i, i3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
