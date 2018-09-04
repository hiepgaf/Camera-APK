package android.support.v4.app;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import p000.C0128u;
import p000.C0130w;
import p000.C0132y;
import p000.C0160z;
import p000.al;
import p000.iz;

/* compiled from: PG */
public class SupportActivity extends Activity implements C0132y {
    public iz mExtraDataMap = new iz();
    public C0160z mLifecycleRegistry = new C0160z(this);

    /* compiled from: PG */
    public class ExtraData {
    }

    public ExtraData getExtraData(Class cls) {
        return (ExtraData) this.mExtraDataMap.get(cls);
    }

    public C0128u getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new al(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m14617a(C0130w.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }
}
