package p000;

import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: bmd */
public final /* synthetic */ class bmd implements OnPreferenceClickListener {
    /* renamed from: a */
    private final bvx f1309a;

    public bmd(bvx bvx) {
        this.f1309a = bvx;
    }

    public final boolean onPreferenceClick(Preference preference) {
        bvx bvx = this.f1309a;
        int preferenceCount = bvx.f11344b.getPreferenceCount();
        Editor edit = bvx.f11343a.edit();
        for (int i = 0; i < preferenceCount; i++) {
            edit.remove(bvx.f11344b.getPreference(i).getKey());
        }
        edit.commit();
        bvx.f11344b.removeAll();
        bvx.m7813a(bvx.f11344b);
        return true;
    }
}
