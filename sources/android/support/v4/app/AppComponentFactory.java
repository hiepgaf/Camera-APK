package android.support.v4.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
public class AppComponentFactory extends android.app.AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(classLoader, str, intent));
    }

    public Activity instantiateActivityCompat(ClassLoader classLoader, String str, Intent intent) {
        Throwable e;
        try {
            return (Activity) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException("Couldn't call constructor", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(classLoader, str));
    }

    public Application instantiateApplicationCompat(ClassLoader classLoader, String str) {
        Throwable e;
        try {
            return (Application) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException("Couldn't call constructor", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(classLoader, str));
    }

    public ContentProvider instantiateProviderCompat(ClassLoader classLoader, String str) {
        Throwable e;
        try {
            return (ContentProvider) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException("Couldn't call constructor", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(classLoader, str, intent));
    }

    public BroadcastReceiver instantiateReceiverCompat(ClassLoader classLoader, String str, Intent intent) {
        Throwable e;
        try {
            return (BroadcastReceiver) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException("Couldn't call constructor", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(classLoader, str, intent));
    }

    public Service instantiateServiceCompat(ClassLoader classLoader, String str, Intent intent) {
        Throwable e;
        try {
            return (Service) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException("Couldn't call constructor", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
