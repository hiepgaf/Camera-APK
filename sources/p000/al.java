package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: al */
public final class al extends Fragment {
    /* renamed from: a */
    private final void m329a(C0129v c0129v) {
        Activity activity = getActivity();
        if (activity instanceof aa) {
            ((aa) activity).m6275a().m14619b(c0129v);
        } else if (activity instanceof C0132y) {
            C0128u lifecycle = ((C0132y) activity).getLifecycle();
            if (lifecycle instanceof C0160z) {
                ((C0160z) lifecycle).m14619b(c0129v);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m329a(C0129v.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        m329a(C0129v.ON_DESTROY);
    }

    public final void onPause() {
        super.onPause();
        m329a(C0129v.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        m329a(C0129v.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        m329a(C0129v.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m329a(C0129v.ON_STOP);
    }
}
