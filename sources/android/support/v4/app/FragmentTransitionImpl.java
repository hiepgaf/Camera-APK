package android.support.v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p000.jm;

/* compiled from: PG */
public abstract class FragmentTransitionImpl {
    public abstract void addTarget(Object obj, View view);

    public abstract void addTargets(Object obj, ArrayList arrayList);

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public abstract Object cloneTransition(Object obj);

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3);

    public abstract void removeTarget(Object obj, View view);

    public abstract void replaceTargets(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList arrayList);

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setEpicenter(Object obj, View view);

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);

    public static void bfsAddViewChildren(List list, View view) {
        int size = list.size();
        if (!containedBeforeIndex(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!containedBeforeIndex(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    void captureTransitioningViews(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                captureTransitioningViews(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    private static boolean containedBeforeIndex(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    static String findKeyForValue(Map map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    void findNamedViews(Map map, View view) {
        if (view.getVisibility() == 0) {
            String p = jm.m4582p(view);
            if (p != null) {
                map.put(p, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    findNamedViews(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void getBoundsOnScreen(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    ArrayList prepareSetNameOverridesReordered(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(jm.m4582p(view));
            jm.m4558a(view, null);
        }
        return arrayList2;
    }

    void scheduleNameReset(ViewGroup viewGroup, final ArrayList arrayList, final Map map) {
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    jm.m4558a(view, (String) map.get(jm.m4582p(view)));
                }
            }
        });
    }

    void setNameOverridesOrdered(View view, final ArrayList arrayList, final Map map) {
        OneShotPreDrawListener.add(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String p = jm.m4582p(view);
                    if (p != null) {
                        jm.m4558a(view, FragmentTransitionImpl.findKeyForValue(map, p));
                    }
                }
            }
        });
    }

    void setNameOverridesReordered(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String p = jm.m4582p(view2);
            arrayList4.add(p);
            if (p != null) {
                jm.m4558a(view2, null);
                String str = (String) map.get(p);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        jm.m4558a((View) arrayList2.get(i2), p);
                        break;
                    }
                }
            }
        }
        final ArrayList arrayList5 = arrayList2;
        final ArrayList arrayList6 = arrayList3;
        final ArrayList arrayList7 = arrayList;
        OneShotPreDrawListener.add(view, new Runnable() {
            public void run() {
                for (int i = 0; i < size; i++) {
                    jm.m4558a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    jm.m4558a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }
}
