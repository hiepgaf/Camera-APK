package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzbc;

/* renamed from: ihf */
public final class ihf implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = htl.m3392a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    z = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzbc(i, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbc[i];
    }
}
