package p000;

import android.app.Activity;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzr */
final class dzr implements OnPreferenceClickListener {
    /* renamed from: a */
    private final /* synthetic */ Activity f3407a;

    dzr(Activity activity) {
        this.f3407a = activity;
    }

    public final boolean onPreferenceClick(Preference preference) {
        new axi(this.f3407a).m732a(R.string.feedback_description_empty, new dzs());
        return true;
    }
}
