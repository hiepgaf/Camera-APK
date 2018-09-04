package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import p000.ao;

/* compiled from: PG */
final class FragmentState implements Parcelable {
    public static final Creator CREATOR = new C00111();
    public final Bundle mArguments;
    public final String mClassName;
    public final int mContainerId;
    public final boolean mDetached;
    public final int mFragmentId;
    public final boolean mFromLayout;
    public final boolean mHidden;
    public final int mIndex;
    public Fragment mInstance;
    public final boolean mRetainInstance;
    public Bundle mSavedFragmentState;
    public final String mTag;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentState$1 */
    final class C00111 implements Creator {
        C00111() {
        }

        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.mClassName = parcel.readString();
        this.mIndex = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromLayout = z;
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mRetainInstance = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mDetached = z;
        this.mArguments = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.mHidden = z2;
        this.mSavedFragmentState = parcel.readBundle();
    }

    FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mIndex = fragment.mIndex;
        this.mFromLayout = fragment.mFromLayout;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mDetached = fragment.mDetached;
        this.mArguments = fragment.mArguments;
        this.mHidden = fragment.mHidden;
    }

    public final int describeContents() {
        return 0;
    }

    public final Fragment instantiate(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment, FragmentManagerNonConfig fragmentManagerNonConfig, ao aoVar) {
        Fragment fragment2;
        if (this.mInstance == null) {
            Context context = fragmentHostCallback.getContext();
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (fragmentContainer != null) {
                this.mInstance = fragmentContainer.instantiate(context, this.mClassName, this.mArguments);
            } else {
                this.mInstance = Fragment.instantiate(context, this.mClassName, this.mArguments);
            }
            bundle = this.mSavedFragmentState;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
                this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
            }
            this.mInstance.setIndex(this.mIndex, fragment);
            fragment2 = this.mInstance;
            fragment2.mFromLayout = this.mFromLayout;
            fragment2.mRestored = true;
            fragment2.mFragmentId = this.mFragmentId;
            fragment2.mContainerId = this.mContainerId;
            fragment2.mTag = this.mTag;
            fragment2.mRetainInstance = this.mRetainInstance;
            fragment2.mDetached = this.mDetached;
            fragment2.mHidden = this.mHidden;
            fragment2.mFragmentManager = fragmentHostCallback.mFragmentManager;
            if (FragmentManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiated fragment ");
                stringBuilder.append(this.mInstance);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
        fragment2 = this.mInstance;
        fragment2.mChildNonConfig = fragmentManagerNonConfig;
        fragment2.mViewModelStore = aoVar;
        return fragment2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClassName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mFromLayout);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.mRetainInstance);
        parcel.writeInt(this.mDetached);
        parcel.writeBundle(this.mArguments);
        parcel.writeInt(this.mHidden);
        parcel.writeBundle(this.mSavedFragmentState);
    }
}
