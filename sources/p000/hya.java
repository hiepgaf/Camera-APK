package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ThemeSettings;

/* renamed from: hya */
public final class hya implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = htl.m3392a(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    i = htl.m3445h(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ThemeSettings(i2, i);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ThemeSettings[i];
    }
}
