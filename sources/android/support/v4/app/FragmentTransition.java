package android.support.v4.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.ih;
import p000.ip;
import p000.jm;

/* compiled from: PG */
class FragmentTransition {
    public static final int[] INVERSE_OPS = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    public static final FragmentTransitionImpl PLATFORM_IMPL = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentTransition$1 */
    final class C00131 implements Runnable {
        public final /* synthetic */ ArrayList val$exitingViews;

        C00131(ArrayList arrayList) {
            this.val$exitingViews = arrayList;
        }

        public final void run() {
            FragmentTransition.setViewVisibility(this.val$exitingViews, 4);
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentTransition$2 */
    final class C00142 implements Runnable {
        public final /* synthetic */ Object val$enterTransition;
        public final /* synthetic */ ArrayList val$enteringViews;
        public final /* synthetic */ Object val$exitTransition;
        public final /* synthetic */ ArrayList val$exitingViews;
        public final /* synthetic */ FragmentTransitionImpl val$impl;
        public final /* synthetic */ Fragment val$inFragment;
        public final /* synthetic */ View val$nonExistentView;
        public final /* synthetic */ ArrayList val$sharedElementsIn;

        C00142(Object obj, FragmentTransitionImpl fragmentTransitionImpl, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.val$enterTransition = obj;
            this.val$impl = fragmentTransitionImpl;
            this.val$nonExistentView = view;
            this.val$inFragment = fragment;
            this.val$sharedElementsIn = arrayList;
            this.val$enteringViews = arrayList2;
            this.val$exitingViews = arrayList3;
            this.val$exitTransition = obj2;
        }

        public final void run() {
            Object obj = this.val$enterTransition;
            if (obj != null) {
                this.val$impl.removeTarget(obj, this.val$nonExistentView);
                this.val$enteringViews.addAll(FragmentTransition.configureEnteringExitingViews(this.val$impl, this.val$enterTransition, this.val$inFragment, this.val$sharedElementsIn, this.val$nonExistentView));
            }
            if (this.val$exitingViews != null) {
                if (this.val$exitTransition != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.val$nonExistentView);
                    this.val$impl.replaceTargets(this.val$exitTransition, this.val$exitingViews, arrayList);
                }
                this.val$exitingViews.clear();
                this.val$exitingViews.add(this.val$nonExistentView);
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentTransition$3 */
    final class C00153 implements Runnable {
        public final /* synthetic */ Rect val$epicenter;
        public final /* synthetic */ View val$epicenterView;
        public final /* synthetic */ FragmentTransitionImpl val$impl;
        public final /* synthetic */ Fragment val$inFragment;
        public final /* synthetic */ boolean val$inIsPop;
        public final /* synthetic */ ih val$inSharedElements;
        public final /* synthetic */ Fragment val$outFragment;

        C00153(Fragment fragment, Fragment fragment2, boolean z, ih ihVar, View view, FragmentTransitionImpl fragmentTransitionImpl, Rect rect) {
            this.val$inFragment = fragment;
            this.val$outFragment = fragment2;
            this.val$inIsPop = z;
            this.val$inSharedElements = ihVar;
            this.val$epicenterView = view;
            this.val$impl = fragmentTransitionImpl;
            this.val$epicenter = rect;
        }

        public final void run() {
            FragmentTransition.callSharedElementStartEnd(this.val$inFragment, this.val$outFragment, this.val$inIsPop, this.val$inSharedElements, false);
            View view = this.val$epicenterView;
            if (view != null) {
                this.val$impl.getBoundsOnScreen(view, this.val$epicenter);
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentTransition$4 */
    final class C00164 implements Runnable {
        public final /* synthetic */ Object val$enterTransition;
        public final /* synthetic */ Object val$finalSharedElementTransition;
        public final /* synthetic */ FragmentContainerTransition val$fragments;
        public final /* synthetic */ FragmentTransitionImpl val$impl;
        public final /* synthetic */ Rect val$inEpicenter;
        public final /* synthetic */ Fragment val$inFragment;
        public final /* synthetic */ boolean val$inIsPop;
        public final /* synthetic */ ih val$nameOverrides;
        public final /* synthetic */ View val$nonExistentView;
        public final /* synthetic */ Fragment val$outFragment;
        public final /* synthetic */ ArrayList val$sharedElementsIn;
        public final /* synthetic */ ArrayList val$sharedElementsOut;

        C00164(FragmentTransitionImpl fragmentTransitionImpl, ih ihVar, Object obj, FragmentContainerTransition fragmentContainerTransition, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.val$impl = fragmentTransitionImpl;
            this.val$nameOverrides = ihVar;
            this.val$finalSharedElementTransition = obj;
            this.val$fragments = fragmentContainerTransition;
            this.val$sharedElementsIn = arrayList;
            this.val$nonExistentView = view;
            this.val$inFragment = fragment;
            this.val$outFragment = fragment2;
            this.val$inIsPop = z;
            this.val$sharedElementsOut = arrayList2;
            this.val$enterTransition = obj2;
            this.val$inEpicenter = rect;
        }

        public final void run() {
            ih access$300 = FragmentTransition.captureInSharedElements(this.val$impl, this.val$nameOverrides, this.val$finalSharedElementTransition, this.val$fragments);
            if (access$300 != null) {
                this.val$sharedElementsIn.addAll(access$300.values());
                this.val$sharedElementsIn.add(this.val$nonExistentView);
            }
            FragmentTransition.callSharedElementStartEnd(this.val$inFragment, this.val$outFragment, this.val$inIsPop, access$300, false);
            Object obj = this.val$finalSharedElementTransition;
            if (obj != null) {
                this.val$impl.swapSharedElementTargets(obj, this.val$sharedElementsOut, this.val$sharedElementsIn);
                View access$400 = FragmentTransition.getInEpicenterView(access$300, this.val$fragments, this.val$enterTransition, this.val$inIsPop);
                if (access$400 != null) {
                    this.val$impl.getBoundsOnScreen(access$400, this.val$inEpicenter);
                }
            }
        }
    }

    /* compiled from: PG */
    class FragmentContainerTransition {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public BackStackRecord firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
        }
    }

    private FragmentTransition() {
    }

    private static void addSharedElementsWithMatchingNames(ArrayList arrayList, ih ihVar, Collection collection) {
        for (int size = ihVar.size() - 1; size >= 0; size--) {
            View view = (View) ihVar.m4358d(size);
            if (collection.contains(jm.m4582p(view))) {
                arrayList.add(view);
            }
        }
    }

    private static void addToFirstInLastOut(BackStackRecord backStackRecord, Op op, SparseArray sparseArray, boolean z, boolean z2) {
        Fragment fragment = op.fragment;
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                int i2;
                int i3;
                int i4;
                FragmentContainerTransition ensureContainer;
                if (z) {
                    i2 = INVERSE_OPS[op.cmd];
                } else {
                    i2 = op.cmd;
                }
                boolean z3;
                int i5;
                int i6;
                boolean z4;
                switch (i2) {
                    case 1:
                    case 7:
                        if (z2) {
                            z3 = fragment.mIsNewlyAdded;
                        } else if (fragment.mAdded) {
                            z3 = false;
                        } else if (fragment.mHidden) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        i3 = 0;
                        i5 = 0;
                        i6 = 1;
                        z4 = z3;
                        break;
                    case 3:
                    case 6:
                        if (!z2) {
                            i2 = fragment.mAdded ? !fragment.mHidden ? 1 : 0 : 0;
                        } else if (fragment.mAdded) {
                            i2 = 0;
                        } else {
                            View view = fragment.mView;
                            i2 = view != null ? view.getVisibility() == 0 ? fragment.mPostponedAlpha >= 0.0f ? 1 : 0 : 0 : 0;
                        }
                        i3 = i2;
                        i5 = 1;
                        i6 = 0;
                        i4 = 0;
                        break;
                    case 4:
                        i2 = z2 ? fragment.mHiddenChanged ? fragment.mAdded ? fragment.mHidden ? 1 : 0 : 0 : 0 : fragment.mAdded ? !fragment.mHidden ? 1 : 0 : 0;
                        i3 = i2;
                        i5 = 1;
                        i6 = 0;
                        i4 = 0;
                        break;
                    case 5:
                        if (!z2) {
                            z3 = fragment.mHidden;
                        } else if (!fragment.mHiddenChanged) {
                            z3 = false;
                        } else if (fragment.mHidden) {
                            z3 = false;
                        } else if (fragment.mAdded) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i3 = 0;
                        i5 = 0;
                        i6 = 1;
                        z4 = z3;
                        break;
                    default:
                        i3 = 0;
                        i5 = 0;
                        i6 = 0;
                        i4 = 0;
                        break;
                }
                FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.get(i);
                if (i4 != 0) {
                    ensureContainer = ensureContainer(fragmentContainerTransition, sparseArray, i);
                    ensureContainer.lastIn = fragment;
                    ensureContainer.lastInIsPop = z;
                    ensureContainer.lastInTransaction = backStackRecord;
                } else {
                    ensureContainer = fragmentContainerTransition;
                }
                if (!(z2 || r4 == 0)) {
                    if (ensureContainer != null && ensureContainer.firstOut == fragment) {
                        ensureContainer.firstOut = null;
                    }
                    FragmentManagerImpl fragmentManagerImpl = backStackRecord.mManager;
                    if (fragment.mState <= 0 && fragmentManagerImpl.mCurState > 0 && !backStackRecord.mReorderingAllowed) {
                        fragmentManagerImpl.makeActive(fragment);
                        fragmentManagerImpl.moveToState(fragment, 1, 0, 0, false);
                    }
                }
                if (i3 == 0) {
                    fragmentContainerTransition = ensureContainer;
                } else if (ensureContainer == null || ensureContainer.firstOut == null) {
                    fragmentContainerTransition = ensureContainer(ensureContainer, sparseArray, i);
                    fragmentContainerTransition.firstOut = fragment;
                    fragmentContainerTransition.firstOutIsPop = z;
                    fragmentContainerTransition.firstOutTransaction = backStackRecord;
                } else {
                    fragmentContainerTransition = ensureContainer;
                }
                if (!z2 && r7 != 0 && fragmentContainerTransition != null && fragmentContainerTransition.lastIn == fragment) {
                    fragmentContainerTransition.lastIn = null;
                }
            }
        }
    }

    public static void calculateFragments(BackStackRecord backStackRecord, SparseArray sparseArray, boolean z) {
        int size = backStackRecord.mOps.size();
        for (int i = 0; i < size; i++) {
            addToFirstInLastOut(backStackRecord, (Op) backStackRecord.mOps.get(i), sparseArray, false, z);
        }
    }

    private static ih calculateNameOverrides(int i, ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ih ihVar = new ih();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i4);
            if (backStackRecord.interactsWith(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList arrayList3 = backStackRecord.mSharedElementSourceNames;
                if (arrayList3 != null) {
                    ArrayList arrayList4;
                    ArrayList arrayList5;
                    int size = arrayList3.size();
                    if (booleanValue) {
                        arrayList4 = backStackRecord.mSharedElementSourceNames;
                        arrayList5 = backStackRecord.mSharedElementTargetNames;
                    } else {
                        ArrayList arrayList6 = backStackRecord.mSharedElementSourceNames;
                        arrayList4 = backStackRecord.mSharedElementTargetNames;
                        arrayList5 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList5.get(i5);
                        String str2 = (String) arrayList4.get(i5);
                        String str3 = (String) ihVar.remove(str2);
                        if (str3 != null) {
                            ihVar.put(str, str3);
                        } else {
                            ihVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return ihVar;
    }

    public static void calculatePopFragments(BackStackRecord backStackRecord, SparseArray sparseArray, boolean z) {
        if (backStackRecord.mManager.mContainer.onHasView()) {
            for (int size = backStackRecord.mOps.size() - 1; size >= 0; size--) {
                addToFirstInLastOut(backStackRecord, (Op) backStackRecord.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, ih ihVar, boolean z2) {
        SharedElementCallback enterTransitionCallback;
        int i = 0;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            int size;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            if (ihVar != null) {
                size = ihVar.size();
            } else {
                size = 0;
            }
            while (i < size) {
                arrayList2.add(ihVar.m4356b(i));
                arrayList.add(ihVar.m4358d(i));
                i++;
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean canHandleAll(FragmentTransitionImpl fragmentTransitionImpl, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!fragmentTransitionImpl.canHandle(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static ih captureInSharedElements(FragmentTransitionImpl fragmentTransitionImpl, ih ihVar, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        View view = fragment.getView();
        if (ihVar.isEmpty() || obj == null || view == null) {
            ihVar.clear();
            return null;
        }
        SharedElementCallback sharedElementCallback;
        Map ihVar2 = new ih();
        fragmentTransitionImpl.findNamedViews(ihVar2, view);
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        SharedElementCallback exitTransitionCallback;
        if (fragmentContainerTransition.lastInIsPop) {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            Collection collection = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = exitTransitionCallback;
        } else {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            Object obj2 = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = exitTransitionCallback;
        }
        if (collection != null) {
            ip.m3973a(ihVar2, collection);
            ip.m3973a(ihVar2, ihVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection, ihVar2);
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                view = (View) ihVar2.get(str);
                if (view == null) {
                    str = findKeyForValue(ihVar, str);
                    if (str != null) {
                        ihVar.remove(str);
                    }
                } else if (!str.equals(jm.m4582p(view))) {
                    str = findKeyForValue(ihVar, str);
                    if (str != null) {
                        ihVar.put(str, jm.m4582p(view));
                    }
                }
            }
        } else {
            retainValues(ihVar, ihVar2);
        }
        return ihVar2;
    }

    private static ih captureOutSharedElements(FragmentTransitionImpl fragmentTransitionImpl, ih ihVar, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        if (ihVar.isEmpty() || obj == null) {
            ihVar.clear();
            return null;
        }
        Collection collection;
        SharedElementCallback sharedElementCallback;
        Fragment fragment = fragmentContainerTransition.firstOut;
        Map ihVar2 = new ih();
        fragmentTransitionImpl.findNamedViews(ihVar2, fragment.getView());
        BackStackRecord backStackRecord = fragmentContainerTransition.firstOutTransaction;
        SharedElementCallback enterTransitionCallback;
        if (fragmentContainerTransition.firstOutIsPop) {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            collection = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = enterTransitionCallback;
        } else {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            Object obj2 = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = enterTransitionCallback;
        }
        ip.m3973a(ihVar2, collection);
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection, ihVar2);
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                View view = (View) ihVar2.get(str);
                if (view == null) {
                    ihVar.remove(str);
                } else if (!str.equals(jm.m4582p(view))) {
                    ihVar.put(jm.m4582p(view), (String) ihVar.remove(str));
                }
            }
        } else {
            ip.m3973a((Map) ihVar, ihVar2.keySet());
        }
        return ihVar2;
    }

    private static FragmentTransitionImpl chooseImpl(Fragment fragment, Fragment fragment2) {
        Object exitTransition;
        List arrayList = new ArrayList();
        if (fragment != null) {
            exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getSharedElementReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
        }
        if (fragment2 != null) {
            exitTransition = fragment2.getEnterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment2.getReenterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment2.getSharedElementEnterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (PLATFORM_IMPL != null && canHandleAll(PLATFORM_IMPL, arrayList)) {
            return PLATFORM_IMPL;
        }
        if (SUPPORT_IMPL != null && canHandleAll(SUPPORT_IMPL, arrayList)) {
            return SUPPORT_IMPL;
        }
        if (PLATFORM_IMPL == null && SUPPORT_IMPL == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static ArrayList configureEnteringExitingViews(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fragment.getView();
        if (view2 != null) {
            fragmentTransitionImpl.captureTransitioningViews(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        fragmentTransitionImpl.addTargets(obj, arrayList2);
        return arrayList2;
    }

    private static Object configureSharedElementsOrdered(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, View view, ih ihVar, FragmentContainerTransition fragmentContainerTransition, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        boolean z = fragmentContainerTransition.lastInIsPop;
        if (ihVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        }
        ih captureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, ihVar, obj3, fragmentContainerTransition);
        if (ihVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(captureOutSharedElements.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj4 != null) {
            rect = new Rect();
            fragmentTransitionImpl.setSharedElementTargets(obj4, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, obj4, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            if (obj != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        OneShotPreDrawListener.add(viewGroup, new C00164(fragmentTransitionImpl, ihVar, obj4, fragmentContainerTransition, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object configureSharedElementsReordered(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, View view, ih ihVar, FragmentContainerTransition fragmentContainerTransition, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        boolean z = fragmentContainerTransition.lastInIsPop;
        if (ihVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        }
        ih captureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, ihVar, obj3, fragmentContainerTransition);
        ih captureInSharedElements = captureInSharedElements(fragmentTransitionImpl, ihVar, obj3, fragmentContainerTransition);
        if (ihVar.isEmpty()) {
            if (captureOutSharedElements != null) {
                captureOutSharedElements.clear();
            }
            if (captureInSharedElements != null) {
                captureInSharedElements.clear();
                obj4 = null;
            } else {
                obj4 = null;
            }
        } else {
            addSharedElementsWithMatchingNames(arrayList, captureOutSharedElements, ihVar.keySet());
            addSharedElementsWithMatchingNames(arrayList2, captureInSharedElements, ihVar.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        View inEpicenterView;
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj4 != null) {
            arrayList2.add(view);
            fragmentTransitionImpl.setSharedElementTargets(obj4, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, obj4, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            rect = new Rect();
            inEpicenterView = getInEpicenterView(captureInSharedElements, fragmentContainerTransition, obj, z);
            if (inEpicenterView != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
            inEpicenterView = null;
        }
        OneShotPreDrawListener.add(viewGroup, new C00153(fragment, fragment2, z, captureInSharedElements, inEpicenterView, fragmentTransitionImpl, rect));
        return obj4;
    }

    private static void configureTransitionsOrdered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, ih ihVar) {
        View view2;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            FragmentTransitionImpl chooseImpl = chooseImpl(fragment2, fragment);
            if (chooseImpl != null) {
                boolean z = fragmentContainerTransition.lastInIsPop;
                boolean z2 = fragmentContainerTransition.firstOutIsPop;
                Object enterTransition = getEnterTransition(chooseImpl, fragment, z);
                Object exitTransition = getExitTransition(chooseImpl, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object configureSharedElementsOrdered = configureSharedElementsOrdered(chooseImpl, view2, view, ihVar, fragmentContainerTransition, arrayList, arrayList2, enterTransition, exitTransition);
                if (enterTransition != null || configureSharedElementsOrdered != null || exitTransition != null) {
                    Object obj;
                    ArrayList configureEnteringExitingViews = configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList, view);
                    if (configureEnteringExitingViews == null) {
                        obj = null;
                    } else if (configureEnteringExitingViews.isEmpty()) {
                        obj = null;
                    } else {
                        obj = exitTransition;
                    }
                    chooseImpl.addTarget(enterTransition, view);
                    Object mergeTransitions = mergeTransitions(chooseImpl, enterTransition, obj, configureSharedElementsOrdered, fragment, fragmentContainerTransition.lastInIsPop);
                    if (mergeTransitions != null) {
                        ArrayList arrayList3 = new ArrayList();
                        chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, arrayList3, obj, configureEnteringExitingViews, configureSharedElementsOrdered, arrayList2);
                        scheduleTargetChange(chooseImpl, view2, fragment, view, arrayList2, enterTransition, arrayList3, obj, configureEnteringExitingViews);
                        chooseImpl.setNameOverridesOrdered(view2, arrayList2, ihVar);
                        chooseImpl.beginDelayedTransition(view2, mergeTransitions);
                        chooseImpl.scheduleNameReset(view2, arrayList2, ihVar);
                    }
                }
            }
        }
    }

    private static void configureTransitionsReordered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, ih ihVar) {
        View view2;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            FragmentTransitionImpl chooseImpl = chooseImpl(fragment2, fragment);
            if (chooseImpl != null) {
                boolean z = fragmentContainerTransition.lastInIsPop;
                boolean z2 = fragmentContainerTransition.firstOutIsPop;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object enterTransition = getEnterTransition(chooseImpl, fragment, z);
                Object exitTransition = getExitTransition(chooseImpl, fragment2, z2);
                Object configureSharedElementsReordered = configureSharedElementsReordered(chooseImpl, view2, view, ihVar, fragmentContainerTransition, arrayList2, arrayList, enterTransition, exitTransition);
                if (enterTransition != null || configureSharedElementsReordered != null || exitTransition != null) {
                    ArrayList configureEnteringExitingViews = configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList2, view);
                    ArrayList configureEnteringExitingViews2 = configureEnteringExitingViews(chooseImpl, enterTransition, fragment, arrayList, view);
                    setViewVisibility(configureEnteringExitingViews2, 4);
                    Object mergeTransitions = mergeTransitions(chooseImpl, enterTransition, exitTransition, configureSharedElementsReordered, fragment, z);
                    if (mergeTransitions != null) {
                        replaceHide(chooseImpl, exitTransition, fragment2, configureEnteringExitingViews);
                        ArrayList prepareSetNameOverridesReordered = chooseImpl.prepareSetNameOverridesReordered(arrayList);
                        chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, configureEnteringExitingViews2, exitTransition, configureEnteringExitingViews, configureSharedElementsReordered, arrayList);
                        chooseImpl.beginDelayedTransition(view2, mergeTransitions);
                        chooseImpl.setNameOverridesReordered(view2, arrayList2, arrayList, prepareSetNameOverridesReordered, ihVar);
                        setViewVisibility(configureEnteringExitingViews2, 0);
                        chooseImpl.swapSharedElementTargets(configureSharedElementsReordered, arrayList2, arrayList);
                    }
                }
            }
        }
    }

    private static FragmentContainerTransition ensureContainer(FragmentContainerTransition fragmentContainerTransition, SparseArray sparseArray, int i) {
        if (fragmentContainerTransition != null) {
            return fragmentContainerTransition;
        }
        fragmentContainerTransition = new FragmentContainerTransition();
        sparseArray.put(i, fragmentContainerTransition);
        return fragmentContainerTransition;
    }

    private static String findKeyForValue(ih ihVar, String str) {
        int size = ihVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(ihVar.m4358d(i))) {
                return (String) ihVar.m4356b(i);
            }
        }
        return null;
    }

    private static Object getEnterTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object reenterTransition;
        if (z) {
            reenterTransition = fragment.getReenterTransition();
        } else {
            reenterTransition = fragment.getEnterTransition();
        }
        return fragmentTransitionImpl.cloneTransition(reenterTransition);
    }

    private static Object getExitTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object returnTransition;
        if (z) {
            returnTransition = fragment.getReturnTransition();
        } else {
            returnTransition = fragment.getExitTransition();
        }
        return fragmentTransitionImpl.cloneTransition(returnTransition);
    }

    private static View getInEpicenterView(ih ihVar, FragmentContainerTransition fragmentContainerTransition, Object obj, boolean z) {
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (!(obj == null || ihVar == null)) {
            ArrayList arrayList = backStackRecord.mSharedElementSourceNames;
            if (!(arrayList == null || arrayList.isEmpty())) {
                Object obj2;
                if (z) {
                    obj2 = (String) backStackRecord.mSharedElementSourceNames.get(0);
                } else {
                    String str = (String) backStackRecord.mSharedElementTargetNames.get(0);
                }
                return (View) ihVar.get(obj2);
            }
        }
        return null;
    }

    private static Object getSharedElementTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object sharedElementReturnTransition;
        if (z) {
            sharedElementReturnTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementReturnTransition = fragment.getSharedElementEnterTransition();
        }
        return fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(sharedElementReturnTransition));
    }

    private static Object mergeTransitions(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj, obj3);
        }
        return fragmentTransitionImpl.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    private static void replaceHide(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            fragmentTransitionImpl.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            OneShotPreDrawListener.add(fragment.mContainer, new C00131(arrayList));
        }
    }

    private static FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (FragmentTransitionImpl) Class.forName("er").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    private static void retainValues(ih ihVar, ih ihVar2) {
        for (int size = ihVar.size() - 1; size >= 0; size--) {
            if (!ihVar2.containsKey((String) ihVar.m4358d(size))) {
                ihVar.mo2635c(size);
            }
        }
    }

    private static void scheduleTargetChange(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        OneShotPreDrawListener.add(viewGroup, new C00142(obj, fragmentTransitionImpl, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void setOutEpicenter(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, ih ihVar, boolean z, BackStackRecord backStackRecord) {
        ArrayList arrayList = backStackRecord.mSharedElementSourceNames;
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) backStackRecord.mSharedElementTargetNames.get(0);
            } else {
                String str = (String) backStackRecord.mSharedElementSourceNames.get(0);
            }
            View view = (View) ihVar.get(obj3);
            fragmentTransitionImpl.setEpicenter(obj, view);
            if (obj2 != null) {
                fragmentTransitionImpl.setEpicenter(obj2, view);
            }
        }
    }

    private static void setViewVisibility(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    static void startTransitions(FragmentManagerImpl fragmentManagerImpl, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        if (fragmentManagerImpl.mCurState > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    calculatePopFragments(backStackRecord, sparseArray, z);
                } else {
                    calculateFragments(backStackRecord, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManagerImpl.mHost.getContext());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    ih calculateNameOverrides = calculateNameOverrides(keyAt, arrayList, arrayList2, i, i2);
                    FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.valueAt(i4);
                    if (z) {
                        configureTransitionsReordered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    } else {
                        configureTransitionsOrdered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    }
                }
            }
        }
    }

    static boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
