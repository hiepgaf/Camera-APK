package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: axh */
public final class axh {
    /* renamed from: a */
    private static final int f1000a = R.string.all_photos;

    /* renamed from: a */
    public static kbg m731a(Context context, Menu menu, kbg kbg) {
        jri.m13152b((Object) context);
        jri.m13152b((Object) menu);
        if (!kbg.mo2084b()) {
            return kau.f19138a;
        }
        CharSequence charSequence;
        ComponentName component = ((Intent) kbg.mo2081a()).getComponent();
        if (component == null) {
            charSequence = null;
        } else if ("com.google.android.apps.photos".equals(component.getPackageName())) {
            charSequence = context.getResources().getString(f1000a);
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return kau.f19138a;
        }
        MenuItem add = menu.add(charSequence);
        add.setShowAsAction(2);
        Intent intent = (Intent) kbg.mo2081a();
        intent.setFlags(65536);
        add.setIntent(intent);
        return kbg.m4745c(add);
    }

    /* renamed from: a */
    public static kbg m730a(Context context) {
        kbg b = kbg.m4744b(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
        if (!b.mo2084b()) {
            return kau.f19138a;
        }
        if (context.getPackageManager().queryIntentActivities((Intent) b.mo2081a(), 65536).size() != 0) {
            return b;
        }
        return kau.f19138a;
    }
}
