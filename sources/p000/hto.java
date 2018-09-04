package p000;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: hto */
final class hto extends ich {
    /* renamed from: a */
    private final LogEventParcelable f23333a;

    hto(LogEventParcelable logEventParcelable, huq huq) {
        super(hth.f6640a, huq);
        this.f23333a = logEventParcelable;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        htq htq = (htq) hul;
        htr htp = new htp(this);
        try {
            LogEventParcelable logEventParcelable = this.f23333a;
            htk htk = logEventParcelable.f20441d;
            if (htk != null) {
                ibw ibw = logEventParcelable.f20440c;
                if (ibw.f21679c.length == 0) {
                    ibw.f21679c = htk.m3391a();
                }
            }
            htk = logEventParcelable.f20442e;
            logEventParcelable.f20439b = ibr.m3656a(logEventParcelable.f20440c);
            LogEventParcelable logEventParcelable2 = this.f23333a;
            htt htt = (htt) htq.m3526p();
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                obtain.writeStrongBinder(htp.asBinder());
                if (logEventParcelable2 == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    logEventParcelable2.writeToParcel(obtain, 0);
                }
                htt.f6655a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (Throwable e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            m16019b(new Status(10, "MessageProducer"));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo3123a(Object obj) {
        super.m12065a((hux) (Status) obj);
    }

    /* renamed from: a */
    protected final /* synthetic */ hux mo3119a(Status status) {
        return status;
    }
}
