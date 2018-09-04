package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* renamed from: hzi */
public final class hzi implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        Uri uri = null;
        List list2 = null;
        int i4 = 0;
        ThemeSettings themeSettings = null;
        List list3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
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
                    account = (Account) htl.m3397a(parcel, readInt, Account.CREATOR);
                    break;
                case '\u0004':
                    bundle = htl.m3449l(parcel, readInt);
                    break;
                case '\u0005':
                    z = htl.m3443f(parcel, readInt);
                    break;
                case '\u0006':
                    z2 = htl.m3443f(parcel, readInt);
                    break;
                case '\u0007':
                    readInt = htl.m3441d(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt == 0) {
                        list = null;
                        break;
                    }
                    list = parcel.createStringArrayList();
                    parcel.setDataPosition(readInt + dataPosition);
                    break;
                case '\n':
                    bundle2 = htl.m3449l(parcel, readInt);
                    break;
                case '\u000b':
                    bitmap2 = (Bitmap) htl.m3397a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case '\u000e':
                    str4 = htl.m3447j(parcel, readInt);
                    break;
                case '\u000f':
                    uri = (Uri) htl.m3397a(parcel, readInt, Uri.CREATOR);
                    break;
                case '\u0010':
                    list2 = htl.m3438c(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case '\u0011':
                    i4 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0012':
                    list3 = htl.m3438c(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case '\u0013':
                    bArr = htl.m3450m(parcel, readInt);
                    break;
                case '\u0014':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0015':
                    i3 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0016':
                    z3 = htl.m3443f(parcel, readInt);
                    break;
                case '\u0017':
                    errorReport = (ErrorReport) htl.m3397a(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case '\u0019':
                    themeSettings = (ThemeSettings) htl.m3397a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case '\u001c':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\u001f':
                    togglingData = (TogglingData) htl.m3397a(parcel, readInt, TogglingData.CREATOR);
                    break;
                case ' ':
                    i5 = htl.m3445h(parcel, readInt);
                    break;
                case '!':
                    pendingIntent = (PendingIntent) htl.m3397a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case '\"':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '#':
                    bitmap = (Bitmap) htl.m3397a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case '$':
                    i6 = htl.m3445h(parcel, readInt);
                    break;
                case '%':
                    z4 = htl.m3443f(parcel, readInt);
                    break;
                case '&':
                    z5 = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
