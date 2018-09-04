package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbge;

/* renamed from: iax */
public final class iax implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = htl.m3392a(parcel);
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            Intent intent2;
            int readInt = parcel.readInt();
            int h;
            switch ((char) readInt) {
                case '\u0001':
                    readInt = htl.m3445h(parcel, readInt);
                    i2 = i;
                    intent2 = intent;
                    break;
                case '\u0002':
                    intent2 = intent;
                    h = htl.m3445h(parcel, readInt);
                    readInt = i2;
                    i2 = h;
                    break;
                case '\u0003':
                    h = i2;
                    i2 = i;
                    intent2 = (Intent) htl.m3397a(parcel, readInt, Intent.CREATOR);
                    readInt = h;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    readInt = i2;
                    i2 = i;
                    intent2 = intent;
                    break;
            }
            intent = intent2;
            i = i2;
            i2 = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbge(i2, i, intent);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbge[i];
    }
}
