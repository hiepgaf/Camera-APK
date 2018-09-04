package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzo;
import java.util.List;

/* renamed from: iix */
public final class iix implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int a = htl.m3392a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    list = htl.m3438c(parcel, readInt, zzcc.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzo(str, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
