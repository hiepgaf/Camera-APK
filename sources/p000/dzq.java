package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.GoogleCamera.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* renamed from: dzq */
final class dzq implements OnPreferenceClickListener {
    /* renamed from: a */
    private final /* synthetic */ Activity f3406a;

    dzq(Activity activity) {
        this.f3406a = activity;
    }

    public final boolean onPreferenceClick(Preference preference) {
        axi axi = new axi(this.f3406a);
        Parcelable googleHelp = new GoogleHelp("android_default");
        googleHelp.f20583b = axi.f1002b;
        googleHelp.m15113a(0, axi.f1006f.getResources().getString(R.string.privacy_policy), new Intent("android.intent.action.VIEW", axi.f1003c));
        googleHelp.m15113a(1, axi.f1006f.getResources().getString(R.string.open_source_licenses), new Intent(axi.f1006f, LicenseMenuActivity.class));
        googleHelp.m15113a(2, axi.f1006f.getResources().getString(R.string.terms_of_service), new Intent("android.intent.action.VIEW", axi.f1004d));
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        hyi hyi = new hyi(axi.f1007g);
        if (putExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") && putExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
            int b = hud.m11988b(hyi.f6822a);
            if (b != 0) {
                hyi.m3586a(b, putExtra);
            } else {
                GoogleHelp googleHelp2 = (GoogleHelp) putExtra.getParcelableExtra("EXTRA_GOOGLE_HELP");
                googleHelp2.f20585d = hua.f18118b;
                putExtra.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
                hzj.m3592a(hyi.f6823b, new hyj(hyi, putExtra, null));
            }
            return true;
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
