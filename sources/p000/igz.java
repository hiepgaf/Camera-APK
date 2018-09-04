package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzao;

/* renamed from: igz */
public final class igz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a = htl.m3392a(parcel);
        byte[] bArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            byte[] bArr2;
            Bundle bundle2;
            Uri uri2;
            int readInt = parcel.readInt();
            Uri uri3;
            switch ((char) readInt) {
                case '\u0002':
                    bArr2 = bArr;
                    bundle2 = bundle;
                    uri2 = (Uri) htl.m3397a(parcel, readInt, Uri.CREATOR);
                    break;
                case '\u0004':
                    uri3 = uri;
                    bArr2 = bArr;
                    bundle2 = htl.m3449l(parcel, readInt);
                    uri2 = uri3;
                    break;
                case '\u0005':
                    uri3 = uri;
                    bArr2 = htl.m3450m(parcel, readInt);
                    bundle2 = bundle;
                    uri2 = uri3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    uri3 = uri;
                    bArr2 = bArr;
                    bundle2 = bundle;
                    uri2 = uri3;
                    break;
            }
            byte[] bArr3 = bArr2;
            uri = uri2;
            bundle = bundle2;
            bArr = bArr3;
        }
        if (parcel.dataPosition() == a) {
            return new zzao(uri, bundle, bArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
