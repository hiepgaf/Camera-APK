package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.app.TaskStackBuilder.SupportParentable;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: md */
public class md extends FragmentActivity implements SupportParentable, me {
    /* renamed from: a */
    private mf f23443a;
    /* renamed from: b */
    private int f23444b = 0;

    public void addContentView(View view, LayoutParams layoutParams) {
        m17821a().mo2334a(view, layoutParams);
    }

    public void closeOptionsMenu() {
        lt c = m17821a().mo2342c();
        if (getWindow().hasFeature(0)) {
            if (c != null) {
                c.mo2374a();
            }
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        lt c = m17821a().mo2342c();
        if (keyCode == 82 && c != null) {
            c.mo2386h();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public View findViewById(int i) {
        return m17821a().mo2331a(i);
    }

    /* renamed from: a */
    public final mf m17821a() {
        if (this.f23443a == null) {
            this.f23443a = new mg(this, getWindow(), this);
        }
        return this.f23443a;
    }

    public MenuInflater getMenuInflater() {
        return m17821a().mo2338b();
    }

    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu() {
        m17821a().mo2345e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m17821a().mo2346f();
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        mf a = m17821a();
        a.mo2344d();
        a.mo2332a(bundle);
        if (a.mo2336a() && this.f23444b != 0) {
            onApplyThemeResource(getTheme(), this.f23444b, false);
        }
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        m17821a().mo2347g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        lt c = m17821a().mo2342c();
        return (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME || c == null || (c.mo2379c() & 4) == 0) ? false : m17820e();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m17821a().mo2348h();
    }

    protected void onPostResume() {
        super.onPostResume();
        m17821a().mo2349i();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m17821a().mo2339b(bundle);
    }

    protected void onStart() {
        super.onStart();
        m17821a().mo2350j();
    }

    protected void onStop() {
        super.onStop();
        m17821a().mo2351k();
    }

    /* renamed from: b */
    public final void mo2369b() {
    }

    /* renamed from: c */
    public final void mo2370c() {
    }

    /* renamed from: e */
    private final boolean m17820e() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (NavUtils.shouldUpRecreateTask(this, supportParentActivityIntent)) {
            TaskStackBuilder create = TaskStackBuilder.create(this);
            create.addParentStack((Activity) this);
            create.startActivities();
            try {
                ActivityCompat.finishAffinity(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            NavUtils.navigateUpTo(this, supportParentActivityIntent);
        }
        return true;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m17821a().mo2335a(charSequence);
    }

    /* renamed from: d */
    public final nn mo2371d() {
        return null;
    }

    public void openOptionsMenu() {
        lt c = m17821a().mo2342c();
        if (getWindow().hasFeature(0)) {
            if (c != null) {
                c.mo2387i();
            }
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m17821a().mo2343c(i);
    }

    public void setContentView(View view) {
        m17821a().mo2333a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m17821a().mo2340b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f23444b = i;
    }

    public void supportInvalidateOptionsMenu() {
        m17821a().mo2345e();
    }
}
