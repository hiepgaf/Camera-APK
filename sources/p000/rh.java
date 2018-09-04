package p000;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: PG */
/* renamed from: rh */
final class rh implements ListAdapter, SpinnerAdapter {
    /* renamed from: a */
    private SpinnerAdapter f9111a;
    /* renamed from: b */
    private ListAdapter f9112b;

    public rh(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.f9111a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f9112b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof vg) {
            vg vgVar = (vg) spinnerAdapter;
            if (vgVar.m6042a() == null) {
                vgVar.m6043b();
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f9112b;
        return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        return spinnerAdapter != null ? spinnerAdapter.getCount() : 0;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        return spinnerAdapter != null ? spinnerAdapter.getDropDownView(i, view, viewGroup) : null;
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        return spinnerAdapter != null ? spinnerAdapter.getItem(i) : null;
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        return spinnerAdapter != null ? spinnerAdapter.getItemId(i) : -1;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f9112b;
        return listAdapter != null ? listAdapter.isEnabled(i) : true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9111a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
