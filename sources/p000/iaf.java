package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: iaf */
public final class iaf implements IInterface {
    /* renamed from: a */
    private IBinder f6873a;

    iaf(IBinder iBinder) {
        this.f6873a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6873a;
    }

    /* renamed from: a */
    public final boolean m3602a(ErrorReport errorReport) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            }
            this.f6873a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public final boolean m3603b(ErrorReport errorReport) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            }
            this.f6873a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
