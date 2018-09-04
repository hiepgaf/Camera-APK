package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: hve */
public final class hve implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a = htl.m3392a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0002':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    pendingIntent = (PendingIntent) htl.m3397a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 'Ϩ':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Status(i2, i, str, pendingIntent);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
