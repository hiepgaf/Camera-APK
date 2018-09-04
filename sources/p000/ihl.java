package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zzbn;

/* renamed from: ihl */
public final class ihl implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        zzao zzao = null;
        while (parcel.dataPosition() < a) {
            zzao zzao2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    readInt = htl.m3445h(parcel, readInt);
                    zzao2 = zzao;
                    break;
                case '\u0003':
                    int i2 = i;
                    zzao2 = (zzao) htl.m3397a(parcel, readInt, zzao.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    readInt = i;
                    zzao2 = zzao;
                    break;
            }
            zzao = zzao2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbn(i, zzao);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbn[i];
    }
}
