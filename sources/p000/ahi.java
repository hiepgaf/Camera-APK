package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ahi */
public final class ahi implements ahg {
    /* renamed from: a */
    private static final Config[] f9794a;
    /* renamed from: b */
    private static final Config[] f9795b;
    /* renamed from: c */
    private static final Config[] f9796c = new Config[]{Config.RGB_565};
    /* renamed from: d */
    private static final Config[] f9797d = new Config[]{Config.ARGB_4444};
    /* renamed from: e */
    private static final Config[] f9798e = new Config[]{Config.ALPHA_8};
    /* renamed from: f */
    private final ahl f9799f = new ahl();
    /* renamed from: g */
    private final agz f9800g = new agz();
    /* renamed from: h */
    private final Map f9801h = new HashMap();

    static {
        Config[] configArr = (Config[]) Arrays.copyOf(new Config[]{Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Config.RGBA_F16;
        f9794a = configArr;
        f9795b = configArr;
    }

    /* renamed from: a */
    private final void m6458a(Integer num, Bitmap bitmap) {
        NavigableMap a = m6457a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String b = mo77b(bitmap);
            String valueOf2 = String.valueOf(this);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 56) + String.valueOf(b).length()) + String.valueOf(valueOf2).length());
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", removed: ");
            stringBuilder.append(b);
            stringBuilder.append(", this: ");
            stringBuilder.append(valueOf2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    public final Bitmap mo75a(int i, int i2, Config config) {
        Config[] configArr;
        ahh ahh;
        Bitmap bitmap;
        int i3 = 0;
        int a = arq.m646a(i, i2, config);
        ahh a2 = this.f9799f.m6467a(a, config);
        if (!Config.RGBA_F16.equals(config)) {
            switch (ahj.f458a[config.ordinal()]) {
                case 1:
                    configArr = f9794a;
                    break;
                case 2:
                    configArr = f9796c;
                    break;
                case 3:
                    configArr = f9797d;
                    break;
                case 4:
                    configArr = f9798e;
                    break;
                default:
                    configArr = new Config[]{config};
                    break;
            }
        }
        configArr = f9795b;
        int length = configArr.length;
        while (i3 < length) {
            Config config2;
            Config config3 = configArr[i3];
            Integer num = (Integer) m6457a(config3).ceilingKey(Integer.valueOf(a));
            if (num == null || num.intValue() > (a << 3)) {
                i3++;
            } else {
                if (num.intValue() == a) {
                    if (config3 == null) {
                        if (config == null) {
                            ahh = a2;
                            bitmap = (Bitmap) this.f9800g.m275a(ahh);
                            if (bitmap != null) {
                                m6458a(Integer.valueOf(ahh.f9802a), bitmap);
                                if (bitmap.getConfig() != null) {
                                    config2 = Config.ARGB_8888;
                                } else {
                                    config2 = bitmap.getConfig();
                                }
                                bitmap.reconfigure(i, i2, config2);
                            }
                            return bitmap;
                        }
                    } else if (config3.equals(config)) {
                        ahh = a2;
                        bitmap = (Bitmap) this.f9800g.m275a(ahh);
                        if (bitmap != null) {
                            m6458a(Integer.valueOf(ahh.f9802a), bitmap);
                            if (bitmap.getConfig() != null) {
                                config2 = bitmap.getConfig();
                            } else {
                                config2 = Config.ARGB_8888;
                            }
                            bitmap.reconfigure(i, i2, config2);
                        }
                        return bitmap;
                    }
                }
                this.f9799f.m264a(a2);
                ahh = this.f9799f.m6467a(num.intValue(), config3);
                bitmap = (Bitmap) this.f9800g.m275a(ahh);
                if (bitmap != null) {
                    m6458a(Integer.valueOf(ahh.f9802a), bitmap);
                    if (bitmap.getConfig() != null) {
                        config2 = Config.ARGB_8888;
                    } else {
                        config2 = bitmap.getConfig();
                    }
                    bitmap.reconfigure(i, i2, config2);
                }
                return bitmap;
            }
        }
        ahh = a2;
        bitmap = (Bitmap) this.f9800g.m275a(ahh);
        if (bitmap != null) {
            m6458a(Integer.valueOf(ahh.f9802a), bitmap);
            if (bitmap.getConfig() != null) {
                config2 = bitmap.getConfig();
            } else {
                config2 = Config.ARGB_8888;
            }
            bitmap.reconfigure(i, i2, config2);
        }
        return bitmap;
    }

    /* renamed from: a */
    static String m6456a(int i, Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final int mo73a(Bitmap bitmap) {
        return arq.m647a(bitmap);
    }

    /* renamed from: a */
    private final NavigableMap m6457a(Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f9801h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        navigableMap = new TreeMap();
        this.f9801h.put(config, navigableMap);
        return navigableMap;
    }

    /* renamed from: b */
    public final String mo76b(int i, int i2, Config config) {
        return ahi.m6456a(arq.m646a(i, i2, config), config);
    }

    /* renamed from: b */
    public final String mo77b(Bitmap bitmap) {
        return ahi.m6456a(arq.m647a(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public final void mo78c(Bitmap bitmap) {
        int intValue;
        ahk a = this.f9799f.m6467a(arq.m647a(bitmap), bitmap.getConfig());
        this.f9800g.m276a(a, bitmap);
        NavigableMap a2 = m6457a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f9802a));
        Integer valueOf = Integer.valueOf(a.f9802a);
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 1;
        }
        a2.put(valueOf, Integer.valueOf(intValue));
    }

    /* renamed from: a */
    public final Bitmap mo74a() {
        Bitmap bitmap = (Bitmap) this.f9800g.m274a();
        if (bitmap != null) {
            m6458a(Integer.valueOf(arq.m647a(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f9800g);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.f9801h.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.f9801h.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
