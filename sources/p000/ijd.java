package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: ijd */
public final class ijd implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a = htl.m3392a(parcel);
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    uri = (Uri) htl.m3397a(parcel, readInt, Uri.CREATOR);
                    break;
                case '\u0004':
                    bundle = htl.m3449l(parcel, readInt);
                    break;
                case '\u0005':
                    bArr = htl.m3450m(parcel, readInt);
                    break;
                case '\u0006':
                    j = htl.m3446i(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PutDataRequest(uri, bundle, bArr, j);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
