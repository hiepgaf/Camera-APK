package p000;

import android.app.Activity;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: hyp */
final class hyp extends hym {
    /* renamed from: a */
    private final /* synthetic */ hyo f21629a;

    hyp(hyo hyo) {
        this.f21629a = hyo;
        super((byte) 0);
    }

    /* renamed from: a */
    public final void mo3116a(GoogleHelp googleHelp) {
        long nanoTime = System.nanoTime();
        hyo hyo = this.f21629a;
        if (!(hyo.f23525b == null && hyo.f23526c == null)) {
            hyo.m17933a(hyo, googleHelp, nanoTime);
        }
        TogglingData togglingData = googleHelp.f20584c;
        if (togglingData != null) {
            String str;
            Activity activity = this.f21629a.f23527d;
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(identifier);
                if (viewGroup == null) {
                    str = charSequence;
                } else {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof TextView) {
                            str = ((TextView) childAt).getText().toString();
                            break;
                        }
                    }
                    str = charSequence;
                }
            } else {
                str = charSequence;
            }
            togglingData.f20615a = str;
        }
        this.f21629a.f23524a.putExtra("EXTRA_GOOGLE_HELP", googleHelp).putExtra("EXTRA_START_TICK", nanoTime);
        hyo = this.f21629a;
        hyo.f23527d.startActivityForResult(hyo.f23524a, ScriptIntrinsicBLAS.RsBlas_dtrmm);
        this.f21629a.m12065a(Status.f20464a);
    }
}
