package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.Asset;

/* renamed from: ijb */
public final class ijb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            Uri uri2;
            ParcelFileDescriptor parcelFileDescriptor2;
            String str2;
            byte[] bArr2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    bArr = htl.m3450m(parcel, readInt);
                    uri2 = uri;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    str2 = str;
                    bArr2 = bArr;
                    break;
                case '\u0003':
                    str = htl.m3447j(parcel, readInt);
                    uri2 = uri;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    str2 = str;
                    bArr2 = bArr;
                    break;
                case '\u0004':
                    str2 = str;
                    bArr2 = bArr;
                    ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) htl.m3397a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    uri2 = uri;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                case '\u0005':
                    uri2 = (Uri) htl.m3397a(parcel, readInt, Uri.CREATOR);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    str2 = str;
                    bArr2 = bArr;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    uri2 = uri;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    str2 = str;
                    bArr2 = bArr;
                    break;
            }
            bArr = bArr2;
            str = str2;
            parcelFileDescriptor = parcelFileDescriptor2;
            uri = uri2;
        }
        if (parcel.dataPosition() == a) {
            return new Asset(bArr, str, parcelFileDescriptor, uri);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
