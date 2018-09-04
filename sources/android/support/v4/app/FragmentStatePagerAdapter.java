package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.jl;

/* compiled from: PG */
public abstract class FragmentStatePagerAdapter extends jl {
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentStatePagerAdapt";
    public FragmentTransaction mCurTransaction = null;
    public Fragment mCurrentPrimaryItem = null;
    public final FragmentManager mFragmentManager;
    public ArrayList mFragments = new ArrayList();
    public ArrayList mSavedState = new ArrayList();

    public FragmentStatePagerAdapter(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    public abstract Fragment getItem(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object saveFragmentInstanceState;
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        ArrayList arrayList = this.mSavedState;
        if (fragment.isAdded()) {
            saveFragmentInstanceState = this.mFragmentManager.saveFragmentInstanceState(fragment);
        } else {
            saveFragmentInstanceState = null;
        }
        arrayList.set(i, saveFragmentInstanceState);
        this.mFragments.set(i, null);
        this.mCurTransaction.remove(fragment);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.mCurTransaction;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.mCurTransaction = null;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mFragments.size() > i) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i) {
            SavedState savedState = (SavedState) this.mSavedState.get(i);
            if (savedState != null) {
                item.setInitialSavedState(savedState);
            }
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(i, item);
        this.mCurTransaction.add(viewGroup.getId(), item);
        return item;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.mFragments.set(parseInt, fragment);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Bad fragment at key ");
                        stringBuilder.append(str);
                        Log.w(TAG, stringBuilder.toString());
                    }
                }
            }
        }
    }

    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
        } else {
            bundle = null;
        }
        Parcelable parcelable = bundle;
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (parcelable == null) {
                    parcelable = new Bundle();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("f");
                stringBuilder.append(i);
                this.mFragmentManager.putFragment(parcelable, stringBuilder.toString(), fragment);
            }
        }
        return parcelable;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
