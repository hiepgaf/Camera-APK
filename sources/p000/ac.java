package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ac */
public class ac {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount = 0;
    public volatile Object mData = NOT_SET;
    public final Object mDataLock = new Object();
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public C0121g mObservers = new C0121g();
    public volatile Object mPendingData = NOT_SET;
    public final Runnable mPostValueRunnable = new ad(this);
    public int mVersion = -1;

    private static void assertMainThread(String str) {
        if (!C0133a.m6271a().f9600a.mo3b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background");
            stringBuilder.append(" thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void considerNotify(ag agVar) {
        if (!agVar.f427b) {
            return;
        }
        if (agVar.mo28a()) {
            int i = agVar.f428c;
            int i2 = this.mVersion;
            if (i < i2) {
                agVar.f428c = i2;
                agVar.f426a.onChanged(this.mData);
                return;
            }
            return;
        }
        agVar.m226a(false);
    }

    private void dispatchingValue(ag agVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (agVar == null) {
                Iterator a = this.mObservers.m2448a();
                while (a.hasNext()) {
                    considerNotify((ag) ((Entry) a.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
            considerNotify(agVar);
            agVar = null;
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f4948e > 0;
    }

    public void observe(C0132y c0132y, ai aiVar) {
        if (c0132y.getLifecycle().mo2581a() != C0130w.DESTROYED) {
            C0131x afVar = new af(this, c0132y, aiVar);
            ag agVar = (ag) this.mObservers.mo1331a(aiVar, afVar);
            if (agVar != null && !agVar.mo2589a(c0132y)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (agVar == null) {
                c0132y.getLifecycle().mo2582a(afVar);
            }
        }
    }

    public void observeForever(ai aiVar) {
        ae aeVar = new ae(this, aiVar);
        ag agVar = (ag) this.mObservers.mo1331a(aiVar, aeVar);
        if (agVar != null && (agVar instanceof af)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (agVar == null) {
            aeVar.m226a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    protected void postValue(Object obj) {
        synchronized (this.mDataLock) {
            Object obj2 = this.mPendingData;
            Object obj3 = NOT_SET;
            this.mPendingData = obj;
        }
        if (obj2 == obj3) {
            C0133a.m6271a().mo2b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(ai aiVar) {
        ac.assertMainThread("removeObserver");
        ag agVar = (ag) this.mObservers.mo1333c(aiVar);
        if (agVar != null) {
            agVar.mo2590b();
            agVar.m226a(false);
        }
    }

    public void removeObservers(C0132y c0132y) {
        ac.assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((ag) entry.getValue()).mo2589a(c0132y)) {
                removeObserver((ai) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        ac.assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }
}
