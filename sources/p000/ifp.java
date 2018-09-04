package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

/* renamed from: ifp */
public final class ifp implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = LfuScheduler.MAX_PRIORITY;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0002':
                    j = htl.m3446i(parcel, readInt);
                    break;
                case '\u0003':
                    j2 = htl.m3446i(parcel, readInt);
                    break;
                case '\u0004':
                    z = htl.m3443f(parcel, readInt);
                    break;
                case '\u0005':
                    j3 = htl.m3446i(parcel, readInt);
                    break;
                case '\u0006':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0007':
                    htl.m3407a(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case '\b':
                    j4 = htl.m3446i(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
