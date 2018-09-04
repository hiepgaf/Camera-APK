package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: hyi */
public final class hyi {
    /* renamed from: a */
    public final Activity f6822a;
    /* renamed from: b */
    public final huq f6823b;
    /* renamed from: c */
    public final File f6824c;

    public hyi(Activity activity) {
        this(activity, new hur(activity).m3486a(hzj.f6839a).m3485a());
    }

    private hyi(Activity activity, huq huq) {
        this.f6824c = activity.getCacheDir();
        this.f6822a = activity;
        this.f6823b = huq;
    }

    /* renamed from: a */
    public final void m3586a(int i, Intent intent) {
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).f20583b);
        if (i == 7 || this.f6822a.getPackageManager().queryIntentActivities(data, 0).size() <= 0) {
            hud.m11989b(i, this.f6822a);
        } else {
            this.f6822a.startActivity(data);
        }
    }
}
