package android.support.v4.app;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.C0132y;
import p000.ah;
import p000.ai;
import p000.an;
import p000.ao;
import p000.df;
import p000.ew;
import p000.gf;
import p000.gg;
import p000.ha;
import p000.il;
import p000.ja;

/* compiled from: PG */
class LoaderManagerImpl extends LoaderManager {
    public static boolean DEBUG = false;
    public static final String TAG = "LoaderManager";
    public final C0132y mLifecycleOwner;
    public final LoaderViewModel mLoaderViewModel;

    /* compiled from: PG */
    class LoaderObserver implements ai {
        public final LoaderCallbacks mCallback;
        public boolean mDeliveredData = false;
        public final gf mLoader;

        LoaderObserver(gf gfVar, LoaderCallbacks loaderCallbacks) {
            this.mLoader = gfVar;
            this.mCallback = loaderCallbacks;
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.mDeliveredData);
        }

        boolean hasDeliveredData() {
            return this.mDeliveredData;
        }

        public void onChanged(Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.mLoader);
                stringBuilder.append(": ");
                stringBuilder.append(gf.m2521a(obj));
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            this.mCallback.onLoadFinished(this.mLoader, obj);
            this.mDeliveredData = true;
        }

        void reset() {
            if (this.mDeliveredData) {
                if (LoaderManagerImpl.DEBUG) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.mLoader);
                    Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
                }
                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public String toString() {
            return this.mCallback.toString();
        }
    }

    /* compiled from: PG */
    class LoaderViewModel extends df {
        public static final an FACTORY = new C01381();
        public boolean mCreatingLoader = false;
        public ja mLoaders = new ja();

        /* compiled from: PG */
        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$1 */
        final class C01381 implements an {
            C01381() {
            }

            /* renamed from: create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0 */
            public final df mo261xd9ac3ecc(Class cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.mLoaders.m4374b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(GraphFactorySource.INDENT);
                String stringBuilder2 = stringBuilder.toString();
                for (int i = 0; i < this.mLoaders.m4374b(); i++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m4375b(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.mLoaders.m4371a(i));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        static LoaderViewModel getInstance(ao aoVar) {
            ew ewVar = new ew(aoVar, FACTORY);
            Class cls = LoaderViewModel.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(canonicalName);
            String stringBuilder2 = stringBuilder.toString();
            df dfVar = (df) ewVar.f4293b.f797a.get(stringBuilder2);
            if (!cls.isInstance(dfVar)) {
                df create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0 = ewVar.f4292a.mo261xd9ac3ecc(cls);
                ao aoVar2 = ewVar.f4293b;
                dfVar = (df) aoVar2.f797a.get(stringBuilder2);
                if (dfVar != null) {
                    dfVar.onCleared();
                }
                aoVar2.f797a.put(stringBuilder2, create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0);
                dfVar = create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0;
            }
            return (LoaderViewModel) dfVar;
        }

        LoaderInfo getLoader(int i) {
            Object obj = null;
            ja jaVar = this.mLoaders;
            int a = il.m3809a(jaVar.f7599c, jaVar.f7601e, i);
            if (a >= 0 && jaVar.f7600d[a] != ja.f7597a) {
                obj = jaVar.f7600d[a];
            }
            return (LoaderInfo) obj;
        }

        boolean hasRunningLoaders() {
            int b = this.mLoaders.m4374b();
            for (int i = 0; i < b; i++) {
                if (((LoaderInfo) this.mLoaders.m4375b(i)).isCallbackWaitingForData()) {
                    return true;
                }
            }
            return false;
        }

        boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        void markForRedelivery() {
            int b = this.mLoaders.m4374b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.mLoaders.m4375b(i)).markForRedelivery();
            }
        }

        protected void onCleared() {
            super.onCleared();
            int b = this.mLoaders.m4374b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.mLoaders.m4375b(i)).destroy(true);
            }
            ja jaVar = this.mLoaders;
            b = jaVar.f7601e;
            Object[] objArr = jaVar.f7600d;
            for (int i2 = 0; i2 < b; i2++) {
                objArr[i2] = null;
            }
            jaVar.f7601e = 0;
            jaVar.f7598b = false;
        }

        void putLoader(int i, LoaderInfo loaderInfo) {
            this.mLoaders.m4373a(i, loaderInfo);
        }

        void removeLoader(int i) {
            ja jaVar = this.mLoaders;
            int a = il.m3809a(jaVar.f7599c, jaVar.f7601e, i);
            if (a >= 0 && jaVar.f7600d[a] != ja.f7597a) {
                jaVar.f7600d[a] = ja.f7597a;
                jaVar.f7598b = true;
            }
        }

        void startCreatingLoader() {
            this.mCreatingLoader = true;
        }
    }

    /* compiled from: PG */
    public class LoaderInfo extends ah implements gg {
        public final Bundle mArgs;
        public final int mId;
        public C0132y mLifecycleOwner;
        public final gf mLoader;
        public LoaderObserver mObserver;
        public gf mPriorLoader;

        LoaderInfo(int i, Bundle bundle, gf gfVar, gf gfVar2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = gfVar;
            this.mPriorLoader = gfVar2;
            gf gfVar3 = this.mLoader;
            if (gfVar3.f5125c != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            gfVar3.f5125c = this;
            gfVar3.f5124b = i;
        }

        gf destroy(boolean z) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Destroying: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            this.mLoader.mo1439c();
            this.mLoader.f5128f = true;
            LoaderObserver loaderObserver = this.mObserver;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z) {
                    loaderObserver.reset();
                }
            }
            gf gfVar = this.mLoader;
            Object obj = gfVar.f5125c;
            if (obj == null) {
                throw new IllegalStateException("No listener register");
            } else if (obj != this) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            } else {
                gfVar.f5125c = null;
                if ((loaderObserver == null || loaderObserver.hasDeliveredData()) && !z) {
                    return this.mLoader;
                }
                this.mLoader.m2528g();
                return this.mPriorLoader;
            }
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            gf gfVar = this.mLoader;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            gfVar.mo1438a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                LoaderObserver loaderObserver = this.mObserver;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("  ");
                loaderObserver.dump(stringBuilder.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            getLoader();
            printWriter.println(gf.m2521a(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        gf getLoader() {
            return this.mLoader;
        }

        boolean isCallbackWaitingForData() {
            if (!hasActiveObservers()) {
                return false;
            }
            LoaderObserver loaderObserver = this.mObserver;
            if (loaderObserver == null || loaderObserver.hasDeliveredData()) {
                return false;
            }
            return true;
        }

        void markForRedelivery() {
            C0132y c0132y = this.mLifecycleOwner;
            ai aiVar = this.mObserver;
            if (c0132y != null && aiVar != null) {
                super.removeObserver(aiVar);
                observe(c0132y, aiVar);
            }
        }

        protected void onActive() {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            gf gfVar = this.mLoader;
            gfVar.f5127e = true;
            gfVar.f5129g = false;
            gfVar.f5128f = false;
            gfVar.mo3194e();
        }

        protected void onInactive() {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            gf gfVar = this.mLoader;
            gfVar.f5127e = false;
            gfVar.mo3195f();
        }

        public void onLoadComplete(gf gfVar, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onLoadComplete: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(obj);
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                Log.w(LoaderManagerImpl.TAG, "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(obj);
        }

        public void removeObserver(ai aiVar) {
            super.removeObserver(aiVar);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        gf setCallback(C0132y c0132y, LoaderCallbacks loaderCallbacks) {
            Object loaderObserver = new LoaderObserver(this.mLoader, loaderCallbacks);
            observe(c0132y, loaderObserver);
            ai aiVar = this.mObserver;
            if (aiVar != null) {
                removeObserver(aiVar);
            }
            this.mLifecycleOwner = c0132y;
            this.mObserver = loaderObserver;
            return this.mLoader;
        }

        public void setValue(Object obj) {
            super.setValue(obj);
            gf gfVar = this.mPriorLoader;
            if (gfVar != null) {
                gfVar.m2528g();
                this.mPriorLoader = null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.mId);
            stringBuilder.append(" : ");
            ha.m2972a(this.mLoader, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    LoaderManagerImpl(C0132y c0132y, ao aoVar) {
        this.mLifecycleOwner = c0132y;
        this.mLoaderViewModel = LoaderViewModel.getInstance(aoVar);
    }

    private gf createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks, gf gfVar) {
        LoaderInfo loaderInfo;
        try {
            this.mLoaderViewModel.startCreatingLoader();
            gf onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } else if (!onCreateLoader.getClass().isMemberClass() || Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                loaderInfo = new LoaderInfo(i, bundle, onCreateLoader, gfVar);
                if (DEBUG) {
                    String str = TAG;
                    r2 = new StringBuilder();
                    r2.append("  Created new loader ");
                    r2.append(loaderInfo);
                    Log.v(str, r2.toString());
                }
                this.mLoaderViewModel.putLoader(i, loaderInfo);
                return loaderInfo.setCallback(this.mLifecycleOwner, loaderCallbacks);
            } else {
                r2 = new StringBuilder();
                r2.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                r2.append(onCreateLoader);
                throw new IllegalArgumentException(r2.toString());
            }
        } finally {
            loaderInfo = this.mLoaderViewModel;
            loaderInfo.finishCreatingLoader();
        }
    }

    public void destroyLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        } else {
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("destroyLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(" of ");
                stringBuilder.append(i);
                Log.v(TAG, stringBuilder.toString());
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                loader.destroy(true);
                this.mLoaderViewModel.removeLoader(i);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mLoaderViewModel.dump(str, fileDescriptor, printWriter, strArr);
    }

    public gf getLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
        return loader != null ? loader.getLoader() : null;
    }

    public boolean hasRunningLoaders() {
        return this.mLoaderViewModel.hasRunningLoaders();
    }

    public gf initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        } else {
            StringBuilder stringBuilder;
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (DEBUG) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("initLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v(TAG, stringBuilder.toString());
            }
            if (loader == null) {
                return createAndInstallLoader(i, bundle, loaderCallbacks, null);
            }
            if (DEBUG) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("  Re-using existing loader ");
                stringBuilder.append(loader);
                Log.v(TAG, stringBuilder.toString());
            }
            return loader.setCallback(this.mLifecycleOwner, loaderCallbacks);
        }
    }

    public void markForRedelivery() {
        this.mLoaderViewModel.markForRedelivery();
    }

    public gf restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        } else {
            gf destroy;
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("restartLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v(TAG, stringBuilder.toString());
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                destroy = loader.destroy(false);
            } else {
                destroy = null;
            }
            return createAndInstallLoader(i, bundle, loaderCallbacks, destroy);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        ha.m2972a(this.mLifecycleOwner, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
