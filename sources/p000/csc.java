package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csc */
final class csc implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2637a;

    csc(crw crw) {
        this.f2637a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2637a.f2614c;
        if (crx != null) {
            cre a = crx.m1450a();
            if (a != cre.f2587c) {
                Intent intent;
                err e = a.mo1066e();
                crx.f2631a.f20266Q.mo1584a(cfk.m14951c(a), 3, cfk.m14944b(a));
                Parcelable parcelable = e.mo1033g().f4155h;
                CharSequence string = crx.f2631a.f20279e.getResources().getString(R.string.share_to);
                if (e.mo1037k().f4114b.f4121g && !e.mo1033g().f4155h.equals(Uri.EMPTY)) {
                    intent = new Intent("android.intent.action.SEND");
                    intent.setType(ixx.PHOTOSPHERE.f7545i);
                    intent.putExtra("android.intent.extra.STREAM", parcelable);
                } else if (e.mo1032f().m2073b()) {
                    String str = e.mo1033g().f4151d;
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    if (str.startsWith("video/")) {
                        intent2.setType("video/*");
                    } else if (str.startsWith("image/")) {
                        intent2.setType("image/*");
                    } else {
                        String str2 = cfk.f20249a;
                        str = String.valueOf(str);
                        String str3 = "unsupported mimeType ";
                        if (str.length() == 0) {
                            str = new String(str3);
                        } else {
                            str = str3.concat(str);
                        }
                        bli.m873e(str2, str);
                    }
                    intent2.putExtra("android.intent.extra.STREAM", parcelable);
                    intent2.addFlags(1);
                    intent = Intent.createChooser(intent2, string);
                } else {
                    intent = null;
                }
                if (intent != null) {
                    try {
                        crx.f2631a.mo2749b(intent);
                        crx.f2631a.f20300z.m1448e(false);
                        return;
                    } catch (ActivityNotFoundException e2) {
                        return;
                    }
                }
                return;
            }
            bli.m873e(cfk.f20249a, "Cannot share INVALID node.");
        }
    }
}
