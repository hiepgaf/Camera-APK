package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;

/* renamed from: ibd */
public final class ibd implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zzaf zzaf = null;
        while (parcel.dataPosition() < a) {
            zzaf zzaf2;
            ConnectionResult connectionResult2;
            int i2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    zzaf2 = zzaf;
                    connectionResult2 = connectionResult;
                    i2 = i;
                    break;
                case '\u0002':
                    i2 = i;
                    ConnectionResult connectionResult3 = (ConnectionResult) htl.m3397a(parcel, readInt, ConnectionResult.CREATOR);
                    zzaf2 = zzaf;
                    connectionResult2 = connectionResult3;
                    break;
                case '\u0003':
                    zzaf2 = (zzaf) htl.m3397a(parcel, readInt, zzaf.CREATOR);
                    connectionResult2 = connectionResult;
                    i2 = i;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    zzaf2 = zzaf;
                    connectionResult2 = connectionResult;
                    i2 = i;
                    break;
            }
            i = i2;
            connectionResult = connectionResult2;
            zzaf = zzaf2;
        }
        if (parcel.dataPosition() == a) {
            return new zzbgq(i, connectionResult, zzaf);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgq[i];
    }
}
