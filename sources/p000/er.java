package p000;

import android.graphics.Rect;
import android.support.v4.app.FragmentTransitionImpl;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: er */
public class er extends FragmentTransitionImpl {
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((ex) obj).mo1365a(view);
        }
    }

    public void addTargets(Object obj, ArrayList arrayList) {
        int i = 0;
        ex exVar = (ex) obj;
        if (exVar != null) {
            int size;
            if (exVar instanceof fh) {
                fh fhVar = (fh) exVar;
                size = fhVar.f16005p.size();
                while (i < size) {
                    addTargets(fhVar.m10348a(i), arrayList);
                    i++;
                }
            } else if (!er.m9847a(exVar) && FragmentTransitionImpl.isNullOrEmpty(exVar.f4307e)) {
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    exVar.mo1365a((View) arrayList.get(size));
                }
            }
        }
    }

    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        obj = (ex) obj;
        if (!fe.f4494b.contains(viewGroup) && jm.m4590x(viewGroup)) {
            fe.f4494b.add(viewGroup);
            if (obj == null) {
                obj = fe.f4493a;
            }
            ex b = obj.mo1372b();
            ArrayList arrayList = (ArrayList) fe.m2266a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    ((ex) arrayList.get(i)).mo1375c((View) viewGroup);
                    i = i2;
                }
            }
            if (b != null) {
                b.m2156a(viewGroup, true);
            }
            if (((ew) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                fe.m2267a(viewGroup, b);
                return;
            }
            throw new NoSuchMethodError();
        }
    }

    public boolean canHandle(Object obj) {
        return obj instanceof ex;
    }

    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((ex) obj).mo1372b();
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m9847a(ex exVar) {
        return (FragmentTransitionImpl.isNullOrEmpty(exVar.f4306d) && FragmentTransitionImpl.isNullOrEmpty(null) && FragmentTransitionImpl.isNullOrEmpty(null)) ? false : true;
    }

    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        ex exVar;
        ex exVar2 = (ex) obj;
        ex exVar3 = (ex) obj2;
        ex exVar4 = (ex) obj3;
        if (exVar2 == null || exVar3 == null) {
            exVar = exVar2 == null ? exVar3 != null ? exVar3 : null : exVar2;
        } else {
            exVar = new fh().m10353a(exVar2).m10353a(exVar3);
            exVar.f16006q = false;
        }
        if (exVar4 == null) {
            return exVar;
        }
        fh fhVar = new fh();
        if (exVar != null) {
            fhVar.m10353a(exVar);
        }
        fhVar.m10353a(exVar4);
        return fhVar;
    }

    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        fh fhVar = new fh();
        if (obj != null) {
            fhVar.m10353a((ex) obj);
        }
        if (obj2 != null) {
            fhVar.m10353a((ex) obj2);
        }
        if (obj3 != null) {
            fhVar.m10353a((ex) obj3);
        }
        return fhVar;
    }

    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((ex) obj).mo1378d(view);
        }
    }

    public void replaceTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        ex exVar = (ex) obj;
        if (exVar instanceof fh) {
            fh fhVar = (fh) exVar;
            int size = fhVar.f16005p.size();
            while (i < size) {
                replaceTargets(fhVar.m10348a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!er.m9847a(exVar)) {
            List list = exVar.f4307e;
            if (list.size() == arrayList.size() && list.containsAll(arrayList)) {
                int size2;
                if (arrayList2 != null) {
                    size2 = arrayList2.size();
                } else {
                    size2 = 0;
                }
                while (i < size2) {
                    exVar.mo1365a((View) arrayList2.get(i));
                    i++;
                }
                for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    exVar.mo1378d((View) arrayList.get(size2));
                }
            }
        }
    }

    public void scheduleHideFragmentView(Object obj, View view, ArrayList arrayList) {
        ((ex) obj).mo1366a(new es(view, arrayList));
    }

    public void scheduleRemoveTargets(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((ex) obj).mo1366a(new et(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((ex) obj).mo1371a(new fb('\u0000'));
        }
    }

    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            ex exVar = (ex) obj;
            getBoundsOnScreen(view, new Rect());
            exVar.mo1371a(new fb((byte) 0));
        }
    }

    public void setSharedElementTargets(Object obj, View view, ArrayList arrayList) {
        fh fhVar = (fh) obj;
        List list = fhVar.f4307e;
        list.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.bfsAddViewChildren(list, (View) arrayList.get(i));
        }
        list.add(view);
        arrayList.add(view);
        addTargets(fhVar, arrayList);
    }

    public void swapSharedElementTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        fh fhVar = (fh) obj;
        if (fhVar != null) {
            fhVar.f4307e.clear();
            fhVar.f4307e.addAll(arrayList2);
            replaceTargets(fhVar, arrayList, arrayList2);
        }
    }

    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        Object fhVar = new fh();
        fhVar.m10353a((ex) obj);
        return fhVar;
    }
}
