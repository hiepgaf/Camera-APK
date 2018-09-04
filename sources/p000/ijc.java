package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ijc */
public final class ijc implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = htl.m3392a(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str4 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0005':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0006':
                    z3 = htl.m3443f(parcel, readInt);
                    break;
                case '\u0007':
                    z2 = htl.m3443f(parcel, readInt);
                    break;
                case '\b':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\t':
                    z = htl.m3443f(parcel, readInt);
                    break;
                case '\n':
                    str = htl.m3447j(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ConnectionConfiguration(str4, str3, i2, i, z3, z2, str2, z, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
