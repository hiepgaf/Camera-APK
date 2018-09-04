package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzax;

/* renamed from: ihd */
public final class ihd implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            ParcelFileDescriptor parcelFileDescriptor2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    readInt = htl.m3445h(parcel, readInt);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    break;
                case '\u0003':
                    int i2 = i;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) htl.m3397a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    readInt = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    break;
            }
            parcelFileDescriptor = parcelFileDescriptor2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzax(i, parcelFileDescriptor);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzax[i];
    }
}
