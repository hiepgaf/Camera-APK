package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* renamed from: htf */
public final class htf implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    i = htl.m3445h(parcel, readInt);
                    break;
                case '\u0002':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0004':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0005':
                    str4 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0006':
                    uri = (Uri) htl.m3397a(parcel, readInt, Uri.CREATOR);
                    break;
                case '\u0007':
                    str5 = htl.m3447j(parcel, readInt);
                    break;
                case '\b':
                    j = htl.m3446i(parcel, readInt);
                    break;
                case '\t':
                    str6 = htl.m3447j(parcel, readInt);
                    break;
                case '\n':
                    list = htl.m3438c(parcel, readInt, Scope.CREATOR);
                    break;
                case '\u000b':
                    str7 = htl.m3447j(parcel, readInt);
                    break;
                case '\f':
                    str8 = htl.m3447j(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
