package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzat;
import com.google.android.gms.wearable.internal.zzo;
import java.util.List;

/* renamed from: ihb */
public final class ihb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    list = htl.m3438c(parcel, readInt, zzo.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzat(i, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzat[i];
    }
}
