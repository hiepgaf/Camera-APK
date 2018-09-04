package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbgo;

/* renamed from: ibc */
public final class ibc implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        zzad zzad = null;
        while (parcel.dataPosition() < a) {
            zzad zzad2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    readInt = htl.m3445h(parcel, readInt);
                    zzad2 = zzad;
                    break;
                case '\u0002':
                    int i2 = i;
                    zzad2 = (zzad) htl.m3397a(parcel, readInt, zzad.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    readInt = i;
                    zzad2 = zzad;
                    break;
            }
            zzad = zzad2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbgo(i, zzad);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgo[i];
    }
}
