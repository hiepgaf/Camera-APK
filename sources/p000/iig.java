package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzcj;

/* renamed from: iig */
public final class iig implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0002':
                    iBinder = htl.m3448k(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzcj(i, iBinder);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcj[i];
    }
}
