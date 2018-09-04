package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: cx */
public final class cx {
    /* renamed from: a */
    public final Map f2830a;
    /* renamed from: b */
    public final Map f2831b;

    public cx(Map map) {
        this.f2831b = map;
        this.f2830a = new HashMap();
        for (Entry entry : map.entrySet()) {
            C0129v c0129v = (C0129v) entry.getValue();
            List list = (List) this.f2830a.get(c0129v);
            if (list == null) {
                list = new ArrayList();
                this.f2830a.put(c0129v, list);
            }
            list.add(entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1550a(List list, C0132y c0132y, C0129v c0129v, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0126o c0126o = (C0126o) list.get(size);
                try {
                    switch (c0126o.f8991a) {
                        case 0:
                            c0126o.f8992b.invoke(obj, new Object[0]);
                            break;
                        case 1:
                            c0126o.f8992b.invoke(obj, new Object[]{c0132y});
                            break;
                        case 2:
                            c0126o.f8992b.invoke(obj, new Object[]{c0132y, c0129v});
                            break;
                        default:
                            break;
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
