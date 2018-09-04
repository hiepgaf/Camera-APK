package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: iao */
public final class iao extends ich {
    /* renamed from: a */
    private final /* synthetic */ Uri f23339a;

    private iao(huq huq) {
        super(ifq.f6986a, huq);
    }

    private iao(huq huq, byte b) {
        this(huq);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo3123a(Object obj) {
        super.m12065a((hux) obj);
    }

    public iao(huq huq, Uri uri) {
        this.f23339a = uri;
        this(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        iap iap = (iap) hul;
        Context context = iap.f6718c;
        ial ial = (ial) iap.m3526p();
        iaj ian = new ian(this);
        Uri uri = this.f23339a;
        context.grantUriPermission("com.google.android.gms", uri, 1);
        iaj iam = new iam(context, uri, ian);
        Parcel obtain;
        try {
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
            obtain.writeStrongBinder(iam.asBinder());
            if (uri == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            }
            obtain.writeInt(0);
            obtain.writeInt(1);
            ial.f6874a.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            context.revokeUriPermission(uri, 1);
            throw e;
        } catch (RuntimeException e2) {
            context.revokeUriPermission(uri, 1);
            throw e2;
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ hux mo3119a(Status status) {
        return new ift(status, null);
    }
}
