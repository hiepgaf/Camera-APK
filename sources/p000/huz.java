package p000;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: huz */
public final class huz extends Exception {
    /* renamed from: a */
    public final ih f6697a;

    public huz(ih ihVar) {
        this.f6697a = ihVar;
    }

    public final String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (icd icd : this.f6697a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f6697a.get(icd);
            if (connectionResult.m15094b()) {
                obj = null;
            }
            String valueOf = String.valueOf(icd.f6922a.f6675a);
            String valueOf2 = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf2);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        if (obj == null) {
            stringBuilder2.append("Some of the queried APIs are unavailable. ");
        } else {
            stringBuilder2.append("None of the queried APIs are available. ");
        }
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }
}
