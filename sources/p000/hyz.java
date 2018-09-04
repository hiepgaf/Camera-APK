package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* renamed from: hyz */
public final class hyz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int a = htl.m3392a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    intent = (Intent) htl.m3397a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OverflowMenuItem(i, str, intent);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
