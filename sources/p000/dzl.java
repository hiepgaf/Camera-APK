package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dzl */
public final class dzl extends PreferenceFragment implements OnSharedPreferenceChangeListener {
    /* renamed from: c */
    private static final String f3393c = bli.m862a("SettingsFragment");
    /* renamed from: a */
    public dzt f3394a;
    /* renamed from: b */
    public ManagedSwitchPreference f3395b;
    /* renamed from: d */
    private String[] f3396d;
    /* renamed from: e */
    private String f3397e;
    /* renamed from: f */
    private boolean f3398f;
    /* renamed from: g */
    private ManagedSwitchPreference f3399g;
    /* renamed from: h */
    private ead f3400h;
    /* renamed from: i */
    private ikb f3401i;

    /* renamed from: a */
    private final void m1701a(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                m1701a((PreferenceGroup) preference);
            }
            if (preference instanceof ListPreference) {
                ListPreference listPreference = (ListPreference) preference;
                if (listPreference.getKey().equals("pref_camera_picturesize_back_key")) {
                    m1704a(this.f3400h.f3440a, listPreference);
                } else if (listPreference.getKey().equals("pref_camera_picturesize_front_key")) {
                    m1704a(this.f3400h.f3441b, listPreference);
                } else if (listPreference.getKey().equals("pref_video_quality_back_key")) {
                    m1702a((eao) this.f3400h.f3442c.mo2085c(), listPreference);
                } else if (listPreference.getKey().equals("pref_video_quality_front_key")) {
                    m1702a((eao) this.f3400h.f3443d.mo2085c(), listPreference);
                }
            }
        }
    }

    /* renamed from: a */
    private final PreferenceScreen m1700a(PreferenceGroup preferenceGroup, String str) {
        int i;
        if (!(preferenceGroup instanceof PreferenceScreen)) {
            i = 0;
        } else if (str.equals(preferenceGroup.getKey())) {
            return (PreferenceScreen) preferenceGroup;
        } else {
            i = 0;
        }
        while (i < preferenceGroup.getPreferenceCount()) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup a = m1700a((PreferenceGroup) preference, str);
                if (a != null) {
                    return a;
                }
            }
            i++;
        }
        return null;
    }

    public final PreferenceScreen getPreferenceScreen() {
        PreferenceScreen a;
        PreferenceGroup preferenceScreen = super.getPreferenceScreen();
        String str = this.f3397e;
        if (!(str == null || preferenceScreen == null)) {
            a = m1700a(preferenceScreen, str);
            if (a == null) {
                str = this.f3397e;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
                stringBuilder.append("key ");
                stringBuilder.append(str);
                stringBuilder.append(" not found");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return a;
    }

    /* renamed from: c */
    private final void m1707c() {
        if (this.f3399g != null) {
            boolean z;
            if (((ListPreference) findPreference("pref_video_quality_back_key")).getEntry().toString().equals(getResources().getString(R.string.pref_video_quality_entry_2160p))) {
                hjf hjf = this.f3394a.f3409a;
                ivy ivy = hjf.f6267b;
                if (ivy.f7508d) {
                    z = true;
                } else if (ivy.f7509e) {
                    z = true;
                } else if (hjf.m3195c()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                this.f3399g.setEnabled(true);
            } else {
                this.f3399g.setEnabled(false);
            }
        }
    }

    /* renamed from: a */
    final boolean m1708a() {
        if (getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        eac eac = this.f3394a.f3410b;
        this.f3400h = new ead(eac.m1722a(iut.BACK), eac.m1722a(iut.FRONT), eac.m1723b(iut.BACK), eac.m1723b(iut.FRONT));
        m1701a((PreferenceCategory) findPreference("pref_category_resolution_camera"));
        m1701a((PreferenceCategory) findPreference("pref_category_resolution_video"));
        ((ListView) getView().findViewById(16908298)).setDivider(null);
        super.onActivityCreated(bundle);
    }

    public final void onCreate(Bundle bundle) {
        String valueOf;
        super.onCreate(bundle);
        this.f3401i = new ikb();
        this.f3394a = dzw.m9574b().m1715a(cbw.m1102a(getActivity().getApplication())).m1714a().mo1205a();
        this.f3394a.m1711a(getContext());
        List<String> a = this.f3394a.m1710a();
        this.f3398f = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f3397e = arguments.getString("pref_screen_extra");
            this.f3398f = a.contains("pref_category_smartburst") ^ 1;
        }
        addPreferencesFromResource(R.xml.camera_preferences);
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
        for (ax axVar : this.f3394a.f3414f) {
            Preference dzm = new dzm(preferenceScreen.getContext());
            dzm.setTitle(axVar.m7125g());
            dzm.setKey(axVar.m7123e());
            dzm.setOrder(axVar.m7124f());
            dzm.setLayoutResource(R.layout.preference_category_first_layout);
            dzm.setOrderingAsAdded(true);
            preferenceScreen.addPreference(dzm);
            if (axVar.m7124f() < 0) {
                findPreference("pref_category_general").setLayoutResource(R.layout.preference_category_layout);
            }
            int size = axVar.m7120b().size() - 1;
            int i = 0;
            for (gpb gpb : axVar.m7120b()) {
                Preference dzn = new dzn(dzm.getContext(), i, size);
                i++;
                dzn.setTitle(gpb.m2699e());
                dzn.setKey(gpb.m2697c());
                dzn.setSummary(gpb.m2698d());
                dzn.setIcon(gpb.m2695a());
                dzn.setIntent(gpb.m2696b());
                dzn.setLayoutResource(R.layout.preference_with_margin);
                dzm.addPreference(dzn);
            }
        }
        for (iqo a2 : (List) jri.m13139a(this.f3394a.f3416h, (Object) "Call initialize before getting closeablesToAdd")) {
            this.f3401i.mo1879a(a2);
        }
        this.f3395b = (ManagedSwitchPreference) findPreference("pref_camera_recordlocation_key");
        this.f3395b.setOnPreferenceChangeListener(new dzo(this));
        for (String valueOf2 : a) {
            m1703a(valueOf2);
        }
        if (!a.contains("pref_category_developer")) {
            this.f3394a.f3412d.m7813a((PreferenceScreen) findPreference("pref_category_developer"));
        }
        if (((PreferenceScreen) findPreference("pref_category_advanced")).getPreferenceCount() <= 0) {
            m1703a("pref_category_advanced");
        }
        if (!a.contains("pref_video_stabilization_key")) {
            this.f3399g = (ManagedSwitchPreference) findPreference("pref_video_stabilization_key");
        }
        this.f3396d = getResources().getStringArray(R.array.camcorder_profile_names);
        if (arguments != null) {
            CharSequence string = arguments.getString("pref_open_setting_page", null);
            if (string != null) {
                preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
                Preference findPreference = findPreference(string);
                if (findPreference != null) {
                    preferenceScreen.onItemClick(null, null, findPreference.getOrder(), 0);
                }
            }
        }
        kfr b = this.f3394a.m1712b();
        for (String valueOf22 : b.mo2104n()) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(valueOf22);
            for (Preference preference : b.mo3199a(valueOf22)) {
                String str;
                StringBuilder stringBuilder;
                if (preferenceGroup.addPreference(preference)) {
                    str = f3393c;
                    valueOf22 = String.valueOf(preference.getTitle());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf22).length() + 6);
                    stringBuilder.append("Added ");
                    stringBuilder.append(valueOf22);
                    bli.m871d(str, stringBuilder.toString());
                } else {
                    str = f3393c;
                    valueOf22 = String.valueOf(preference.getTitle());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf22).length() + 14);
                    stringBuilder.append("Could not add ");
                    stringBuilder.append(valueOf22);
                    bli.m873e(str, stringBuilder.toString());
                }
            }
        }
        CameraSettingsActivity.m1286b(this.f3394a.f3415g, getPreferenceScreen());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3401i.close();
    }

    public final void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("pref_category_resolution_camera");
        if (this.f3400h.f3440a.isEmpty()) {
            m1705a(preferenceGroup, findPreference("pref_camera_picturesize_back_key"));
            m1705a(preferenceGroup, findPreference("pref_video_quality_back_key"));
        }
        if (this.f3400h.f3441b.isEmpty()) {
            m1705a(preferenceGroup, findPreference("pref_camera_picturesize_front_key"));
            m1705a(preferenceGroup, findPreference("pref_video_quality_front_key"));
        }
        m1706b("pref_category_advanced");
        m1706b("pref_category_gestures");
        m1706b("pref_category_developer");
        if (this.f3398f) {
            m1706b("pref_category_smartburst");
        }
        findPreference("pref_category_gestures").setSummary(getResources().getString(R.string.pref_gestures_summary, new Object[]{getResources().getString(R.string.pref_camera_volume_key_action_title), getResources().getString(R.string.pref_camera_double_tap_action_title)}));
        ListPreference listPreference = (ListPreference) findPreference("pref_camera_grid_lines_mode");
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        listPreference.setOnPreferenceChangeListener(new dzp(this));
        findPreference("pref_launch_help").setOnPreferenceClickListener(new dzq(activity));
        findPreference("pref_launch_feedback").setOnPreferenceClickListener(new dzr(activity));
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (!m1708a()) {
            m1709b();
        }
        m1707c();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("pref_video_quality_back_key")) {
            m1707c();
        }
    }

    /* renamed from: a */
    private final boolean m1705a(PreferenceGroup preferenceGroup, Preference preference) {
        if (preferenceGroup == null) {
            bli.m863a(f3393c, "attempting to delete from null preference group");
            return false;
        } else if (preference == null) {
            bli.m863a(f3393c, "attempting to delete null preference");
            return false;
        } else if (preferenceGroup.removePreference(preference)) {
            return true;
        } else {
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                Preference preference2 = preferenceGroup.getPreference(i);
                if ((preference2 instanceof PreferenceGroup) && m1705a((PreferenceGroup) preference2, preference)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m1703a(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference == null) {
            bli.m863a(f3393c, String.format("%s doesn't exist in current pref tree, perhaps it's parent was removed?", new Object[]{str}));
            return;
        }
        PreferenceGroup parent = findPreference.getParent();
        if (parent == null) {
            bli.m873e(f3393c, "Parent of preference 'pref_smartburst_classicburst' is already null, maybe this pref was already removed?");
        } else if (!parent.removePreference(findPreference)) {
            bli.m873e(f3393c, "Failed to remove preference :pref_smartburst_classicburst");
        }
    }

    /* renamed from: a */
    private final void m1702a(eao eao, ListPreference listPreference) {
        if (eao != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f3396d[eao.f3463a]);
            int i = eao.f3464b;
            if (i != eao.f3463a) {
                arrayList.add(this.f3396d[i]);
            }
            i = eao.f3465c;
            if (i != eao.f3464b) {
                arrayList.add(this.f3396d[i]);
            }
            listPreference.setEntries((CharSequence[]) arrayList.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    private final void m1704a(List list, ListPreference listPreference) {
        if (list != null) {
            CharSequence[] charSequenceArr = new String[list.size()];
            CharSequence[] charSequenceArr2 = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iqp iqp = (iqp) list.get(i);
                iqp c = eag.m1730c(iqp);
                String format = this.f3394a.f3411c.format(((double) (iqp.f7329a * iqp.f7330b)) / 1000000.0d);
                int b = eag.m1729b(c);
                int a = eag.m1726a(c);
                charSequenceArr[i] = getResources().getString(R.string.setting_summary_aspect_ratio_and_megapixels, new Object[]{Integer.valueOf(b), Integer.valueOf(a), format});
                charSequenceArr2[i] = ion.m3962b(iqp);
            }
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
        }
    }

    /* renamed from: b */
    private final void m1706b(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null && (findPreference instanceof PreferenceScreen)) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference;
            Intent intent = new Intent(getActivity(), CameraSettingsActivity.class);
            intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
            intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
            preferenceScreen.setIntent(intent);
        }
    }

    /* renamed from: b */
    public final void m1709b() {
        this.f3395b.persistBoolean(false);
        this.f3395b.setChecked(false);
    }
}
