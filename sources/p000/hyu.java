package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: hyu */
final class hyu extends hyw {
    /* renamed from: a */
    private final /* synthetic */ FeedbackOptions f23538a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f23539b;
    /* renamed from: c */
    private final /* synthetic */ long f23540c;
    /* renamed from: d */
    private final /* synthetic */ GoogleHelp f23541d;

    hyu(huq huq, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f23538a = feedbackOptions;
        this.f23539b = bundle;
        this.f23540c = j;
        this.f23541d = googleHelp;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final void mo3573a(hyy hyy) {
        Parcel obtain;
        try {
            FeedbackOptions feedbackOptions = this.f23538a;
            Bundle bundle = this.f23539b;
            long j = this.f23540c;
            GoogleHelp googleHelp = this.f23541d;
            hyl hyv = new hyv(this);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (feedbackOptions == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                feedbackOptions.writeToParcel(obtain, 0);
            }
            if (bundle == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            }
            obtain.writeLong(j);
            if (googleHelp == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            }
            obtain.writeStrongBinder(hyv.asBinder());
            hyy.f6826a.transact(10, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            m12069c(hyn.f18139a);
        } catch (Throwable th) {
            obtain.recycle();
        }
    }
}
