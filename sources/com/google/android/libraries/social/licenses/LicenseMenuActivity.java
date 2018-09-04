package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;
import com.google.android.GoogleCamera.R;
import p000.kaj;
import p000.kan;
import p000.kap;
import p000.md;

/* compiled from: PG */
public final class LicenseMenuActivity extends md implements kap {
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_menu_activity);
        if (m17821a().mo2342c() != null) {
            m17821a().mo2342c().mo2380c(true);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!(supportFragmentManager.findFragmentById(R.id.license_menu_fragment_container) instanceof kan)) {
            Fragment kan = new kan();
            if (getIntent().hasExtra("pluginLicensePaths")) {
                kan.setArguments(getIntent().getBundleExtra("pluginLicensePaths"));
            }
            supportFragmentManager.beginTransaction().add((int) R.id.license_menu_fragment_container, kan).commitNow();
        }
    }

    /* renamed from: a */
    public final void mo3556a(kaj kaj) {
        Intent intent = new Intent(this, LicenseActivity.class);
        intent.putExtra("license", kaj);
        startActivity(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
