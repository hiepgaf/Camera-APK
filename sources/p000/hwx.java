package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hwx */
public final class hwx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a = htl.m3392a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            String str2;
            PendingIntent pendingIntent2;
            int readInt = parcel.readInt();
            PendingIntent pendingIntent3;
            switch ((char) readInt) {
                case '\u0001':
                    i2 = htl.m3445h(parcel, readInt);
                    pendingIntent3 = pendingIntent;
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case '\u0002':
                    i = htl.m3445h(parcel, readInt);
                    pendingIntent3 = pendingIntent;
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case '\u0003':
                    str2 = str;
                    pendingIntent2 = (PendingIntent) htl.m3397a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case '\u0004':
                    pendingIntent3 = pendingIntent;
                    str2 = htl.m3447j(parcel, readInt);
                    pendingIntent2 = pendingIntent3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    pendingIntent3 = pendingIntent;
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
            }
            String str3 = str2;
            pendingIntent = pendingIntent2;
            str = str3;
        }
        if (parcel.dataPosition() == a) {
            return new ConnectionResult(i2, i, pendingIntent, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
