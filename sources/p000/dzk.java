package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: dzk */
public final class dzk implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ irs f3391a;
    /* renamed from: b */
    private final /* synthetic */ Object f3392b;

    public dzk(irs irs, Object obj) {
        this.f3391a = irs;
        this.f3392b = obj;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f3391a.mo1588a(preference.getKey(), this.f3392b, obj);
        return true;
    }
}
