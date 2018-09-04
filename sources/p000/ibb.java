package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbgo;
import com.google.android.gms.internal.zzbgq;

/* renamed from: ibb */
public final class ibb extends hwc implements iau {
    /* renamed from: l */
    private final boolean f23340l;
    /* renamed from: m */
    private final hvx f23341m;
    /* renamed from: n */
    private final Bundle f23342n;
    /* renamed from: o */
    private Integer f23343o;

    public ibb(Context context, Looper looper, hvx hvx, hus hus, hut hut) {
        iav iav = hvx.f6751g;
        Integer num = hvx.f6752h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hvx.f6745a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (iav != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", iav.f6883b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", iav.f6884c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", iav.f6885d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", iav.f6886e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", iav.f6887f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", iav.f6888g);
            Long l = iav.f6889h;
            Long l2 = iav.f6890i;
        }
        this(context, looper, hvx, bundle, hus, hut);
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: f */
    public final boolean mo3476f() {
        return this.f23340l;
    }

    /* renamed from: i */
    public final void mo3477i() {
        mo3481a(new hvu(this));
    }

    private ibb(Context context, Looper looper, hvx hvx, Bundle bundle, hus hus, hut hut) {
        super(context, looper, 44, hvx, hus, hut);
        this.f23340l = true;
        this.f23341m = hvx;
        this.f23342n = bundle;
        this.f23343o = hvx.f6752h;
    }

    public final void A_() {
        Parcel obtain;
        Parcel obtain2;
        try {
            iba iba = (iba) m3526p();
            int intValue = this.f23343o.intValue();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeInt(intValue);
            iba.f6893a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo3474a(hwk hwk, boolean z) {
        Parcel obtain;
        Parcel obtain2;
        try {
            iba iba = (iba) m3526p();
            int intValue = this.f23343o.intValue();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeStrongBinder(hwk != null ? hwk.asBinder() : null);
            obtain.writeInt(intValue);
            obtain.writeInt(z);
            iba.f6893a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo3475a(iay iay) {
        IBinder iBinder = null;
        htl.m3432b((Object) iay, (Object) "Expecting a valid ISignInCallbacks");
        Parcel obtain;
        Parcel obtain2;
        try {
            GoogleSignInAccount a;
            Account account = this.f23341m.f6745a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                hte a2 = hte.m3369a(this.f6718c);
                a = a2.m3371a(a2.m3373c("defaultGoogleSignInAccount"));
            } else {
                a = null;
            }
            zzad zzad = new zzad(account, this.f23343o.intValue(), a);
            iba iba = (iba) m3526p();
            zzbgo zzbgo = new zzbgo(zzad);
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeInt(1);
            zzbgo.writeToParcel(obtain, 0);
            if (iay != null) {
                iBinder = iay.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            iba.f6893a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                iay.mo1799a(new zzbgq());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof iba)) ? new iba(iBinder) : (iba) queryLocalInterface;
    }

    /* renamed from: k */
    protected final Bundle mo3478k() {
        if (!this.f6718c.getPackageName().equals(this.f23341m.f6749e)) {
            this.f23342n.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f23341m.f6749e);
        }
        return this.f23342n;
    }
}
