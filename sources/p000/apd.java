package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* compiled from: PG */
/* renamed from: apd */
public final class apd extends Fragment {
    /* renamed from: a */
    public final aos f820a;
    /* renamed from: b */
    public final aph f821b;
    /* renamed from: c */
    public acm f822c;
    /* renamed from: d */
    public Fragment f823d;
    /* renamed from: e */
    private final Set f824e;
    /* renamed from: f */
    private apd f825f;

    public apd() {
        this(new aos());
    }

    @SuppressLint({"ValidFragment"})
    private apd(aos aos) {
        this.f821b = new ape(this);
        this.f824e = new HashSet();
        this.f820a = aos;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m536a();
            this.f825f = acc.m98a((Context) activity).f192f.m540a(activity.getFragmentManager(), apf.m538b(activity));
            if (!equals(this.f825f)) {
                this.f825f.f824e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f820a.m6881a();
        m536a();
    }

    public final void onDetach() {
        super.onDetach();
        m536a();
    }

    public final void onStart() {
        super.onStart();
        this.f820a.m6883b();
    }

    public final void onStop() {
        super.onStop();
        this.f820a.m6885c();
    }

    public final String toString() {
        String fragment = super.toString();
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(fragment).length() + 9) + String.valueOf(valueOf).length());
        stringBuilder.append(fragment);
        stringBuilder.append("{parent=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final void m536a() {
        apd apd = this.f825f;
        if (apd != null) {
            apd.f824e.remove(this);
            this.f825f = null;
        }
    }
}
