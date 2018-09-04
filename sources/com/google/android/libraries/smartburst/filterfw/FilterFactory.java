package com.google.android.libraries.smartburst.filterfw;

import android.util.Log;
import java.util.HashSet;

/* compiled from: PG */
public class FilterFactory {
    public static final String TAG = "FilterFactory";
    public static final Object mClassLoaderGuard = new Object();
    public static ClassLoader mCurrentClassLoader = FilterFactory.class.getClassLoader();
    public static HashSet mLibraries = new HashSet();
    public static boolean mLogVerbose = Log.isLoggable(TAG, 2);
    public static FilterFactory mSharedFactory;
    public HashSet mPackages = new HashSet();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void addFilterLibrary(java.lang.String r3) {
        /*
        r0 = mLogVerbose;
        if (r0 == 0) goto L_0x001a;
    L_0x0004:
        r0 = java.lang.String.valueOf(r3);
        r1 = "Adding filter library ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0045;
    L_0x0010:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x0015:
        r1 = "FilterFactory";
        android.util.Log.v(r1, r0);
    L_0x001a:
        r1 = mClassLoaderGuard;
        monitor-enter(r1);
        r0 = mLibraries;	 Catch:{ all -> 0x0042 }
        r0 = r0.contains(r3);	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0032;
    L_0x0025:
        r0 = mLogVerbose;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0030;
    L_0x0029:
        r0 = "FilterFactory";
        r2 = "Library already added";
        android.util.Log.v(r0, r2);	 Catch:{ all -> 0x0042 }
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
    L_0x0031:
        return;
    L_0x0032:
        r0 = mLibraries;	 Catch:{ all -> 0x0042 }
        r0.add(r3);	 Catch:{ all -> 0x0042 }
        r0 = new dalvik.system.PathClassLoader;	 Catch:{ all -> 0x0042 }
        r2 = mCurrentClassLoader;	 Catch:{ all -> 0x0042 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0042 }
        mCurrentClassLoader = r0;	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        goto L_0x0031;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        r0 = r1.concat(r0);
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.FilterFactory.addFilterLibrary(java.lang.String):void");
    }

    public void addPackage(String str) {
        if (mLogVerbose) {
            String valueOf = String.valueOf(str);
            String str2 = "Adding package ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            Log.v(TAG, valueOf);
        }
        this.mPackages.add(str);
    }

    public Filter createFilterByClass(Class cls, String str, MffContext mffContext) {
        StringBuilder stringBuilder;
        try {
            try {
                return (Filter) cls.getConstructor(new Class[]{MffContext.class, String.class}).newInstance(new Object[]{mffContext, str});
            } catch (Throwable th) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
                stringBuilder.append("Error creating filter ");
                stringBuilder.append(str);
                stringBuilder.append("!");
                RuntimeException runtimeException = new RuntimeException(stringBuilder.toString(), th);
            }
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(cls);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 87);
            stringBuilder.append("The filter class '");
            stringBuilder.append(valueOf);
            stringBuilder.append("' does not have a constructor of the form <init>(MffContext, String)!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public Filter createFilterByClassName(String str, String str2, MffContext mffContext) {
        if (mLogVerbose) {
            String valueOf = String.valueOf(str);
            String str3 = "Looking up class ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            Log.v(TAG, valueOf);
        }
        Class filterClass = getFilterClass(str);
        if (filterClass != null) {
            return createFilterByClass(filterClass, str2, mffContext);
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 24);
        stringBuilder.append("Unknown filter class '");
        stringBuilder.append(str);
        stringBuilder.append("'!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Class getFilterClass(java.lang.String r10) {
        /*
        r9 = this;
        r2 = 0;
        r0 = r9.mPackages;
        r3 = r0.iterator();
        r1 = r2;
    L_0x0008:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0087;
    L_0x000e:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = mLogVerbose;	 Catch:{ ClassNotFoundException -> 0x0099 }
        if (r4 == 0) goto L_0x0049;
    L_0x0018:
        r4 = "FilterFactory";
        r5 = java.lang.String.valueOf(r0);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = r5.length();	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = r5 + 8;
        r6 = java.lang.String.valueOf(r10);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r6 = r6.length();	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0099 }
        r6.<init>(r5);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = "Trying ";
        r6.append(r5);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r6.append(r0);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = ".";
        r6.append(r5);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r6.append(r10);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = r6.toString();	 Catch:{ ClassNotFoundException -> 0x0099 }
        android.util.Log.v(r4, r5);	 Catch:{ ClassNotFoundException -> 0x0099 }
    L_0x0049:
        r4 = mClassLoaderGuard;	 Catch:{ ClassNotFoundException -> 0x0099 }
        monitor-enter(r4);	 Catch:{ ClassNotFoundException -> 0x0099 }
        r5 = mCurrentClassLoader;	 Catch:{ all -> 0x0089 }
        r6 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0089 }
        r6 = r6.length();	 Catch:{ all -> 0x0089 }
        r6 = r6 + 1;
        r7 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0089 }
        r7 = r7.length();	 Catch:{ all -> 0x0089 }
        r6 = r6 + r7;
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0089 }
        r7.<init>(r6);	 Catch:{ all -> 0x0089 }
        r7.append(r0);	 Catch:{ all -> 0x0089 }
        r0 = ".";
        r7.append(r0);	 Catch:{ all -> 0x0089 }
        r7.append(r10);	 Catch:{ all -> 0x0089 }
        r0 = r7.toString();	 Catch:{ all -> 0x0089 }
        r0 = r5.loadClass(r0);	 Catch:{ all -> 0x0089 }
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0085;
    L_0x007c:
        if (r0 == 0) goto L_0x0084;
    L_0x007e:
        r1 = com.google.android.libraries.smartburst.filterfw.Filter.class;
        r2 = r0.asSubclass(r1);	 Catch:{ ClassCastException -> 0x0097 }
    L_0x0084:
        return r2;
    L_0x0085:
        r1 = r0;
        goto L_0x0008;
    L_0x0087:
        r0 = r1;
        goto L_0x007c;
    L_0x0089:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x008d:
        monitor-exit(r4);	 Catch:{ all -> 0x0095 }
        throw r1;	 Catch:{ ClassNotFoundException -> 0x008f }
    L_0x008f:
        r1 = move-exception;
        r1 = r0;
        goto L_0x0008;
    L_0x0093:
        r1 = move-exception;
        goto L_0x008d;
    L_0x0095:
        r1 = move-exception;
        goto L_0x008d;
    L_0x0097:
        r0 = move-exception;
        goto L_0x0084;
    L_0x0099:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.FilterFactory.getFilterClass(java.lang.String):java.lang.Class");
    }

    public boolean isFilterAvailable(String str) {
        return getFilterClass(str) != null;
    }

    public static FilterFactory sharedFactory() {
        if (mSharedFactory == null) {
            mSharedFactory = new FilterFactory();
        }
        return mSharedFactory;
    }
}
