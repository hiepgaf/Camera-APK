package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.zzc;
import com.google.android.gms.location.internal.zzo;
import java.util.List;

/* renamed from: ifg */
public final class ifg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = htl.m3392a(parcel);
        List list = zzo.f20637a;
        boolean z2 = false;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    locationRequest = (LocationRequest) htl.m3397a(parcel, readInt, LocationRequest.CREATOR);
                    break;
                case '\u0005':
                    list = htl.m3438c(parcel, readInt, zzc.CREATOR);
                    break;
                case '\u0006':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0007':
                    z2 = htl.m3443f(parcel, readInt);
                    break;
                case '\b':
                    z = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzo(locationRequest, list, str, z2, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
