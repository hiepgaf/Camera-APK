package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: dzo */
final class dzo implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ dzl f3404a;

    dzo(dzl dzl) {
        this.f3404a = dzl;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        Object obj2;
        irs irs = this.f3404a.f3394a.f3415g;
        String key = preference.getKey();
        if (this.f3404a.f3395b.isChecked()) {
            obj2 = Boolean.TRUE;
        } else {
            obj2 = Boolean.FALSE;
        }
        irs.mo1588a(key, obj2, obj);
        if (((Boolean) obj).booleanValue()) {
            dzl dzl = this.f3404a;
            if (!dzl.m1708a()) {
                dzl.getActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
            }
        }
        return true;
    }
}
