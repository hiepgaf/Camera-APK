package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zzad;

/* renamed from: hvj */
public final class hvj implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            GoogleSignInAccount googleSignInAccount2;
            int i3;
            Account account2;
            int i4;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i2 = htl.m3445h(parcel, readInt);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    i4 = i2;
                    break;
                case '\u0002':
                    i4 = i2;
                    Account account3 = (Account) htl.m3397a(parcel, readInt, Account.CREATOR);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account3;
                    break;
                case '\u0003':
                    i = htl.m3445h(parcel, readInt);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    i4 = i2;
                    break;
                case '\u0004':
                    googleSignInAccount2 = (GoogleSignInAccount) htl.m3397a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    i3 = i;
                    account2 = account;
                    i4 = i2;
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    i4 = i2;
                    break;
            }
            i2 = i4;
            account = account2;
            i = i3;
            googleSignInAccount = googleSignInAccount2;
        }
        if (parcel.dataPosition() == a) {
            return new zzad(i2, account, i, googleSignInAccount);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
