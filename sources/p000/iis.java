package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzc;

/* renamed from: iis */
public final class iis implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IntentFilter[] intentFilterArr = null;
        int a = htl.m3392a(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            String str3;
            IntentFilter[] intentFilterArr2;
            int readInt = parcel.readInt();
            IntentFilter[] intentFilterArr3;
            switch ((char) readInt) {
                case '\u0002':
                    iBinder = htl.m3448k(parcel, readInt);
                    intentFilterArr3 = intentFilterArr;
                    str3 = str;
                    str = str2;
                    intentFilterArr2 = intentFilterArr3;
                    break;
                case '\u0003':
                    str3 = str;
                    str = str2;
                    intentFilterArr2 = (IntentFilter[]) htl.m3437b(parcel, readInt, IntentFilter.CREATOR);
                    break;
                case '\u0004':
                    intentFilterArr3 = intentFilterArr;
                    str3 = str;
                    str = htl.m3447j(parcel, readInt);
                    intentFilterArr2 = intentFilterArr3;
                    break;
                case '\u0005':
                    intentFilterArr3 = intentFilterArr;
                    str3 = htl.m3447j(parcel, readInt);
                    str = str2;
                    intentFilterArr2 = intentFilterArr3;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    intentFilterArr3 = intentFilterArr;
                    str3 = str;
                    str = str2;
                    intentFilterArr2 = intentFilterArr3;
                    break;
            }
            String str4 = str3;
            intentFilterArr = intentFilterArr2;
            str2 = str;
            str = str4;
        }
        if (parcel.dataPosition() == a) {
            return new zzc(iBinder, intentFilterArr, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
