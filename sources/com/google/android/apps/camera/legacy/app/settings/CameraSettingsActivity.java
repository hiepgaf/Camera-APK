package com.google.android.apps.camera.legacy.app.settings;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.TwoStatePreference;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.GoogleCamera.R;
import p000.bli;
import p000.dzk;
import p000.dzl;
import p000.irs;
import p000.jri;

/* compiled from: PG */
public class CameraSettingsActivity extends Activity {
    /* renamed from: a */
    private static final String f2369a = bli.m862a("SettingsActivity");
    /* renamed from: b */
    private dzl f2370b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.settings_activity_layout);
        CharSequence stringExtra = getIntent().getStringExtra("pref_screen_title");
        ActionBar actionBar = (ActionBar) jri.m13152b(getActionBar());
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (stringExtra == null) {
            actionBar.setTitle(R.string.mode_settings);
        } else {
            actionBar.setTitle(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("pref_screen_extra");
        String stringExtra3 = getIntent().getStringExtra("pref_open_setting_page");
        this.f2370b = new dzl();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("pref_screen_extra", stringExtra2);
        bundle2.putString("pref_open_setting_page", stringExtra3);
        this.f2370b.setArguments(bundle2);
        getFragmentManager().beginTransaction().replace(R.id.settings_activity_content, this.f2370b).commit();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (menuItem.getItemId() == ActionBarDrawerToggle.ID_HOME) {
            finish();
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr[0] != 0) {
            this.f2370b.m1709b();
        }
    }

    /* renamed from: b */
    private static void m1286b(irs irs, Preference preference) {
        if (!preference.getKey().equals("pref_category_developer")) {
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                    m1286b(irs, preferenceGroup.getPreference(i));
                }
            } else if (preference.getOnPreferenceChangeListener() == null) {
                Object obj;
                if (preference instanceof TwoStatePreference) {
                    if (((TwoStatePreference) preference).isChecked()) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = Boolean.FALSE;
                    }
                } else if (preference instanceof ListPreference) {
                    obj = ((ListPreference) preference).getValue();
                } else {
                    String str = f2369a;
                    String valueOf = String.valueOf(preference);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("Preference not settable, skipping: ");
                    stringBuilder.append(valueOf);
                    bli.m863a(str, stringBuilder.toString());
                    return;
                }
                preference.setOnPreferenceChangeListener(new dzk(irs, obj));
            }
        }
    }
}
