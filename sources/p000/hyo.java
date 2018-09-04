package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hyo */
final class hyo extends hyw {
    /* renamed from: a */
    public final /* synthetic */ Intent f23524a;
    /* renamed from: b */
    public final /* synthetic */ htl f23525b = null;
    /* renamed from: c */
    public final /* synthetic */ htl f23526c = null;
    /* renamed from: d */
    public final /* synthetic */ Activity f23527d;
    /* renamed from: i */
    private final /* synthetic */ Bitmap f23528i = null;
    /* renamed from: j */
    private final /* synthetic */ List f23529j;
    /* renamed from: k */
    private final /* synthetic */ WeakReference f23530k;
    /* renamed from: l */
    private final /* synthetic */ File f23531l;

    hyo(hyn hyn, huq huq, Intent intent, Bitmap bitmap, htl htl, htl htl2, Activity activity, List list, WeakReference weakReference, File file) {
        this.f23524a = intent;
        this.f23527d = activity;
        this.f23529j = list;
        this.f23530k = weakReference;
        this.f23531l = file;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    static /* synthetic */ void m17933a(hyo hyo, GoogleHelp googleHelp, long j) {
        List list = hyo.f23529j;
        huq huq = (huq) hyo.f23530k.get();
        if (huq == null) {
            Pair create = Pair.create("gms:googlehelp:async_help_psd_failure", "null_api_client");
            Pair create2 = Pair.create("gms:feedback:async_feedback_psd_failure", "null_api_client");
            Pair create3 = Pair.create("gms:feedback:async_feedback_psbd_failure", "null_api_client");
            if (list == null) {
                list = new ArrayList(3);
            }
            list.add(create);
            list.add(create2);
            list.add(create3);
        } else {
            hyn.m12029a(huq, googleHelp, hyo.f23525b, hyo.f23526c, hyo.f23531l, j);
        }
        googleHelp.f20582a = htl.m3396a(list);
        if (hyo.f23525b != null) {
            googleHelp.f20586e = true;
        }
        if (hyo.f23526c != null) {
            googleHelp.f20587f = true;
        }
    }

    /* renamed from: a */
    protected final void mo3573a(hyy hyy) {
        Parcel obtain;
        Parcel obtain2;
        try {
            GoogleHelp googleHelp = (GoogleHelp) this.f23524a.getParcelableExtra("EXTRA_GOOGLE_HELP");
            Bitmap bitmap = this.f23528i;
            hyl hyp = new hyp(this);
            obtain2 = Parcel.obtain();
            obtain = Parcel.obtain();
            obtain2.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp == null) {
                obtain2.writeInt(0);
            } else {
                obtain2.writeInt(1);
                googleHelp.writeToParcel(obtain2, 0);
            }
            if (bitmap == null) {
                obtain2.writeInt(0);
            } else {
                obtain2.writeInt(1);
                bitmap.writeToParcel(obtain2, 0);
            }
            obtain2.writeStrongBinder(hyp.asBinder());
            hyy.f6826a.transact(2, obtain2, obtain, 0);
            obtain.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            m12069c(hyn.f18139a);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
