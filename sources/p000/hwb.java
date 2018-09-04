package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;

/* renamed from: hwb */
public final class hwb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        zzc[] zzcArr = null;
        int a = htl.m3392a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i3 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0002':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0003':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0004':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0005':
                    iBinder = htl.m3448k(parcel, readInt);
                    break;
                case '\u0006':
                    scopeArr = (Scope[]) htl.m3437b(parcel, readInt, Scope.CREATOR);
                    break;
                case '\u0007':
                    bundle = htl.m3449l(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) htl.m3397a(parcel, readInt, Account.CREATOR);
                    break;
                case '\n':
                    zzcArr = (zzc[]) htl.m3437b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzj(i3, i2, i, str, iBinder, scopeArr, bundle, account, zzcArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
