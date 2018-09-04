package p000;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: ibz */
public abstract class ibz {
    /* renamed from: a */
    static /* synthetic */ Status m3661a(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }

    /* renamed from: a */
    public abstract void mo1804a(Status status);

    /* renamed from: a */
    public abstract void mo1805a(icx icx, boolean z);

    /* renamed from: a */
    public abstract void mo1806a(ief ief);
}
