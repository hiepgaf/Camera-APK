package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.jqk;
import p000.kaj;
import p000.kal;
import p000.md;

/* compiled from: PG */
public final class LicenseActivity extends md {
    public final void onCreate(Bundle bundle) {
        CharSequence a;
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_activity);
        kaj kaj = (kaj) getIntent().getParcelableExtra("license");
        m17821a().mo2342c().mo2372a(kaj.f8169a);
        m17821a().mo2342c().mo2388j();
        m17821a().mo2342c().mo2380c(true);
        m17821a().mo2342c().mo2389k();
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = kaj.f8170b;
        int i = kaj.f8171c;
        String str = kaj.f8172d;
        if (str.isEmpty()) {
            a = jqk.m13080a((Context) this, "third_party_licenses", j, i);
        } else {
            a = jqk.m13083a("res/raw/third_party_licenses", str, j, i);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
                stringBuilder.append(str);
                stringBuilder.append(" does not contain ");
                stringBuilder.append("res/raw/");
                stringBuilder.append("third_party_licenses");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        scrollView.post(new kal(this, bundle.getInt("scroll_pos"), scrollView));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        bundle.putInt("scroll_pos", textView.getLayout().getLineStart(textView.getLayout().getLineForVertical(((ScrollView) findViewById(R.id.license_activity_scrollview)).getScrollY())));
    }
}
