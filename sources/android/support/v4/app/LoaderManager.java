package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C0132y;
import p000.ap;
import p000.gf;

/* compiled from: PG */
public abstract class LoaderManager {

    /* compiled from: PG */
    public interface LoaderCallbacks {
        gf onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(gf gfVar, Object obj);

        void onLoaderReset(gf gfVar);
    }

    public abstract void destroyLoader(int i);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract gf getLoader(int i);

    public abstract gf initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public abstract void markForRedelivery();

    public abstract gf restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public static LoaderManager getInstance(C0132y c0132y) {
        return new LoaderManagerImpl(c0132y, ((ap) c0132y).getViewModelStore());
    }

    public boolean hasRunningLoaders() {
        return false;
    }
}
