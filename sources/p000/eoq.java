package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: eoq */
public class eoq extends Activity {
    /* renamed from: a */
    private final eon f3989a = new eon();
    /* renamed from: b */
    private int f3990b;
    /* renamed from: t */
    public final ena f3991t = new ena();

    /* renamed from: a */
    private final void mo657a() {
        int i = this.f3990b;
        this.f3990b = i + 1;
        if (i == 0) {
            ena ena = this.f3991t;
            for (int i2 = 0; i2 < ena.e.size(); i2++) {
                eol eol = (eol) ena.e.get(i2);
                if (eol instanceof emz) {
                    ((emz) eol).m1895a();
                }
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if ((eol instanceof emg) && ((emg) eol).m1876a()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj = null;
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if ((eol instanceof emh) && ((emh) eol).mo1069a(motionEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private final void mo658b() {
        this.f3990b--;
    }

    public void finish() {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emi) {
                ((emi) eol).mo1491a();
            }
        }
        super.finish();
    }

    public void onActionModeFinished(ActionMode actionMode) {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emj) {
                ((emj) eol).m1879a();
            }
        }
        super.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emk) {
                ((emk) eol).m1880a();
            }
        }
        super.onActionModeStarted(actionMode);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        enr enr = this.f3991t;
        for (int i3 = 0; i3 < enr.f3980e.size(); i3++) {
            eol eol = (eol) enr.f3980e.get(i3);
            if (eol instanceof enx) {
                ((enx) eol).m1911a();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onAttachedToWindow() {
        ena ena = this.f3991t;
        ena.f15294d = ena.m1905a(new ene());
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        Object obj = null;
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if ((eol instanceof emm) && ((emm) eol).mo1208J()) {
                obj = 1;
                break;
            }
        }
        if (obj == null) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emn) {
                ((emn) eol).mo1144a(configuration);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z = false;
        for (eol eol : this.f3991t.f3980e) {
            if (eol instanceof eny) {
                z = ((eny) eol).mo2747a(menuItem) | z;
            }
        }
        return z;
    }

    public void onCreate(Bundle bundle) {
        this.f3989a.m1927b();
        enr enr = this.f3991t;
        enr.f3981f = enr.m1905a(new ens(enr, bundle));
        super.onCreate(bundle);
        this.f3989a.m1926a();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        for (eol eol : this.f3991t.f3980e) {
            if (eol instanceof eoa) {
                ((eoa) eol).mo2740a(contextMenu);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 0;
        for (eol eol : this.f3991t.f3980e) {
            if (eol instanceof eob) {
                i = ((eob) eol).mo2746a(menu) | i;
            }
        }
        if (i != 0) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.f3989a.m1929d();
        this.f3991t.mo1234a();
        super.onDestroy();
        this.f3989a.m1928c();
    }

    public void onDetachedFromWindow() {
        ena ena = this.f3991t;
        ena.m1909b(ena.f15294d);
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emo) {
                ((emo) eol).m1884a();
            }
        }
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f3991t;
        for (int i2 = 0; i2 < ena.e.size(); i2++) {
            eol eol = (eol) ena.e.get(i2);
            if ((eol instanceof emp) && ((emp) eol).mo1748a(i, keyEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f3991t;
        for (int i2 = 0; i2 < ena.e.size(); i2++) {
            eol eol = (eol) ena.e.get(i2);
            if ((eol instanceof emq) && ((emq) eol).mo1749b(i, keyEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        for (eol eol : this.f3991t.f3980e) {
            if (eol instanceof eod) {
                ((eod) eol).m1917a();
            }
        }
        super.onLowMemory();
    }

    protected void onNewIntent(Intent intent) {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emr) {
                ((emr) eol).mo2753c(intent);
            }
        }
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object obj;
        for (eol eol : this.f3991t.f3980e) {
            if ((eol instanceof eoe) && ((eoe) eol).mo2751b(menuItem)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        this.f3989a.m1931f();
        this.f3991t.mo1235b();
        super.onPause();
        this.f3989a.m1930e();
    }

    protected void onPostCreate(Bundle bundle) {
        ena ena = this.f3991t;
        ena.f15291a = ena.m1905a(new enb(ena, bundle));
        super.onPostCreate(bundle);
    }

    protected void onPostResume() {
        ena ena = this.f3991t;
        ena.f15293c = ena.m1905a(new end());
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int i = 0;
        for (eol eol : this.f3991t.f3980e) {
            if (eol instanceof eog) {
                i = ((eog) eol).mo2732L() | i;
            }
        }
        if (i != 0) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ena ena = this.f3991t;
        for (int i2 = 0; i2 < ena.e.size(); i2++) {
            eol eol = (eol) ena.e.get(i2);
            if (eol instanceof emu) {
                ((emu) eol).mo384a(i, strArr, iArr);
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        ena ena = this.f3991t;
        ena.f15292b = ena.m1905a(new enc(ena, bundle));
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        this.f3989a.m1933h();
        enr enr = this.f3991t;
        enr.f3983h = enr.m1905a(new enu());
        super.onResume();
        this.f3989a.m1932g();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        enr enr = this.f3991t;
        enr.f3984i = enr.m1905a(new env(enr, bundle));
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f3989a.m1935j();
        enr enr = this.f3991t;
        enr.f3982g = enr.m1905a(new ent());
        super.onStart();
        this.f3989a.m1934i();
    }

    public void onStop() {
        this.f3989a.m1937l();
        enr enr = this.f3991t;
        enr.m1909b(enr.f3982g);
        for (int i = 0; i < enr.f3980e.size(); i++) {
            eol eol = (eol) enr.f3980e.get(i);
            if (eol instanceof eok) {
                ((eok) eol).mo382j();
            }
        }
        super.onStop();
        this.f3989a.m1936k();
    }

    public void onUserInteraction() {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emw) {
                ((emw) eol).mo1699a();
            }
        }
        super.onUserInteraction();
    }

    protected void onUserLeaveHint() {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emx) {
                ((emx) eol).m1893a();
            }
        }
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z) {
        ena ena = this.f3991t;
        for (int i = 0; i < ena.e.size(); i++) {
            eol eol = (eol) ena.e.get(i);
            if (eol instanceof emy) {
                ((emy) eol).mo1652a(z);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void startActivity(Intent intent) {
        mo657a();
        super.startActivity(intent);
        mo658b();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        mo657a();
        super.startActivity(intent, bundle);
        mo658b();
    }

    public void startActivityForResult(Intent intent, int i) {
        mo657a();
        super.startActivityForResult(intent, i);
        mo658b();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        mo657a();
        super.startActivityForResult(intent, i, bundle);
        mo658b();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        mo657a();
        super.startActivityFromFragment(fragment, intent, i);
        mo658b();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        mo657a();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo658b();
    }
}
