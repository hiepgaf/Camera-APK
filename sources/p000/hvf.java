package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: hvf */
public final class hvf implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int i3;
            ParcelFileDescriptor parcelFileDescriptor2;
            int readInt = parcel.readInt();
            ParcelFileDescriptor parcelFileDescriptor3;
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    i3 = i2;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                case '\u0002':
                    i3 = i2;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) htl.m3397a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case '\u0003':
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    i3 = htl.m3445h(parcel, readInt);
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    i3 = i2;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
            }
            int i4 = i3;
            parcelFileDescriptor = parcelFileDescriptor2;
            i2 = i4;
        }
        if (parcel.dataPosition() == a) {
            return new BitmapTeleporter(i, parcelFileDescriptor, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
