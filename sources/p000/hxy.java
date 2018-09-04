package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FileTeleporter;

/* renamed from: hxy */
public final class hxy implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        int a = htl.m3392a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            String str3;
            ParcelFileDescriptor parcelFileDescriptor2;
            int readInt = parcel.readInt();
            ParcelFileDescriptor parcelFileDescriptor3;
            switch ((char) readInt) {
                case '\u0002':
                    str3 = str;
                    str = str2;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) htl.m3397a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case '\u0003':
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    str3 = str;
                    str = htl.m3447j(parcel, readInt);
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                case '\u0004':
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    str3 = htl.m3447j(parcel, readInt);
                    str = str2;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    parcelFileDescriptor3 = parcelFileDescriptor;
                    str3 = str;
                    str = str2;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
            }
            String str4 = str3;
            parcelFileDescriptor = parcelFileDescriptor2;
            str2 = str;
            str = str4;
        }
        if (parcel.dataPosition() == a) {
            return new FileTeleporter(parcelFileDescriptor, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
