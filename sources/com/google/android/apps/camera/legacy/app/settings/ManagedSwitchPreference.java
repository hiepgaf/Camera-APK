package com.google.android.apps.camera.legacy.app.settings;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import p000.cgt;
import p000.gos;

/* compiled from: PG */
public class ManagedSwitchPreference extends SwitchPreference {
    /* renamed from: a */
    public gos f2371a;

    public ManagedSwitchPreference(Context context) {
        super(context);
        ((cgt) context.getApplicationContext()).mo751a().mo3392a(this);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((cgt) context.getApplicationContext()).mo751a().mo3392a(this);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((cgt) context.getApplicationContext()).mo751a().mo3392a(this);
    }

    /* renamed from: a */
    public static ManagedSwitchPreference m1287a(Context context, SwitchPreference switchPreference) {
        ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
        managedSwitchPreference.setDefaultValue(Boolean.valueOf(true));
        managedSwitchPreference.setKey(switchPreference.getKey());
        managedSwitchPreference.setSummary(switchPreference.getSummary());
        managedSwitchPreference.setTitle(switchPreference.getTitle());
        managedSwitchPreference.setIcon(switchPreference.getIcon());
        managedSwitchPreference.setOnPreferenceChangeListener(switchPreference.getOnPreferenceChangeListener());
        managedSwitchPreference.setOrder(switchPreference.getOrder());
        return managedSwitchPreference;
    }

    public boolean getPersistedBoolean(boolean z) {
        return this.f2371a.mo1535a("default_scope", getKey());
    }

    public boolean persistBoolean(boolean z) {
        this.f2371a.mo1540b("default_scope", getKey(), z);
        return true;
    }
}
