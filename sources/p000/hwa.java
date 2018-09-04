package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: hwa */
public class hwa implements OnClickListener {
    /* renamed from: a */
    public final /* synthetic */ Intent f6760a;
    /* renamed from: b */
    public final /* synthetic */ Activity f6761b;
    /* renamed from: c */
    public final /* synthetic */ int f6762c;

    /* renamed from: a */
    public void m3545a() {
        Intent intent = this.f6760a;
        if (intent != null) {
            this.f6761b.startActivityForResult(intent, this.f6762c);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            m3545a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    public hwa(Intent intent, Activity activity, int i) {
        this.f6760a = intent;
        this.f6761b = activity;
        this.f6762c = i;
        this();
    }
}
