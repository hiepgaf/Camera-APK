package p000;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: nm */
public final class nm {
    /* renamed from: a */
    public Context f8934a;

    private nm(Context context) {
        this.f8934a = context;
    }

    /* renamed from: a */
    public static nm m5621a(Context context) {
        return new nm(context);
    }

    /* renamed from: a */
    public final int m5622a() {
        Configuration configuration = this.f8934a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i > 960) {
                if (i2 <= 720) {
                }
            }
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i > 640) {
                        if (i2 <= 480) {
                        }
                    }
                    if (i <= 480 || i2 <= 640) {
                        if (i >= 360) {
                            return 3;
                        }
                        return 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    /* renamed from: b */
    public final boolean m5623b() {
        return this.f8934a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
