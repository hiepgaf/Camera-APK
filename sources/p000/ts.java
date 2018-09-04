package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ts */
public final class ts {
    /* renamed from: a */
    public final ArrayList f9285a;
    /* renamed from: b */
    public final ArrayList f9286b;
    /* renamed from: c */
    public final qi f9287c;
    /* renamed from: d */
    public final tr f9288d;
    /* renamed from: e */
    private iw f9289e;

    public ts(qi qiVar) {
        this(qiVar, (byte) 0);
    }

    private ts(qi qiVar, byte b) {
        this.f9289e = new ix(30);
        this.f9285a = new ArrayList();
        this.f9286b = new ArrayList();
        this.f9287c = qiVar;
        this.f9288d = new tr(this);
    }

    /* renamed from: a */
    public final boolean m5846a(int i) {
        int size = this.f9286b.size();
        for (int i2 = 0; i2 < size; i2++) {
            qj qjVar = (qj) this.f9286b.get(i2);
            int i3 = qjVar.f9043a;
            if (i3 == 8) {
                if (m5842a(qjVar.f9046d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                i3 = qjVar.f9044b;
                int i4 = i3 + qjVar.f9046d;
                for (int i5 = i3; i5 < i4; i5++) {
                    if (m5842a(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m5844a() {
        int i;
        int i2 = 0;
        int size = this.f9286b.size();
        for (i = 0; i < size; i++) {
            this.f9287c.m5709a((qj) this.f9286b.get(i));
        }
        m5839a(this.f9286b);
        i = this.f9285a.size();
        while (i2 < i) {
            qj qjVar = (qj) this.f9285a.get(i2);
            switch (qjVar.f9043a) {
                case 1:
                    this.f9287c.m5709a(qjVar);
                    this.f9287c.m5707a(qjVar.f9044b, qjVar.f9046d);
                    break;
                case 2:
                    this.f9287c.m5709a(qjVar);
                    this.f9287c.m5711c(qjVar.f9044b, qjVar.f9046d);
                    break;
                case 4:
                    this.f9287c.m5709a(qjVar);
                    this.f9287c.m5708a(qjVar.f9044b, qjVar.f9046d, qjVar.f9045c);
                    break;
                case 8:
                    this.f9287c.m5709a(qjVar);
                    this.f9287c.m5710b(qjVar.f9044b, qjVar.f9046d);
                    break;
                default:
                    break;
            }
            i2++;
        }
        m5839a(this.f9285a);
    }

    /* renamed from: a */
    public final void m5845a(qj qjVar) {
        int i = qjVar.f9043a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m5841b(qjVar.f9044b, i);
        int i2 = qjVar.f9044b;
        switch (qjVar.f9043a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("op should be remove or update.");
                stringBuilder.append(qjVar);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = 1;
        int i4 = b;
        b = i2;
        for (i2 = 1; i2 < qjVar.f9046d; i2++) {
            Object obj;
            int b2 = m5841b(qjVar.f9044b + (i * i2), qjVar.f9043a);
            int i5 = qjVar.f9043a;
            int i6;
            switch (i5) {
                case 2:
                    if (b2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i6 = 1;
                        break;
                    }
                case 4:
                    if (b2 != i4 + 1) {
                        obj = null;
                        break;
                    } else {
                        i6 = 1;
                        break;
                    }
                default:
                    obj = null;
                    break;
            }
            if (obj != null) {
                i3++;
            } else {
                qj a = m5843a(i5, i4, i3, qjVar.f9045c);
                m5840a(a, b);
                m5850c(a);
                if (qjVar.f9043a == 4) {
                    b += i3;
                }
                i3 = 1;
                i4 = b2;
            }
        }
        Object obj2 = qjVar.f9045c;
        m5850c(qjVar);
        if (i3 > 0) {
            qj a2 = m5843a(qjVar.f9043a, i4, i3, obj2);
            m5840a(a2, b);
            m5850c(a2);
        }
    }

    /* renamed from: a */
    private final void m5840a(qj qjVar, int i) {
        this.f9287c.m5709a(qjVar);
        switch (qjVar.f9043a) {
            case 2:
                this.f9287c.m5711c(i, qjVar.f9046d);
                return;
            case 4:
                this.f9287c.m5708a(i, qjVar.f9046d, qjVar.f9045c);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: a */
    final int m5842a(int i, int i2) {
        int size = this.f9286b.size();
        int i3 = i;
        while (i2 < size) {
            qj qjVar = (qj) this.f9286b.get(i2);
            int i4 = qjVar.f9043a;
            if (i4 == 8) {
                i4 = qjVar.f9044b;
                if (i4 == i3) {
                    i3 = qjVar.f9046d;
                } else {
                    if (i4 < i3) {
                        i3--;
                    }
                    if (qjVar.f9046d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i5 = qjVar.f9044b;
                if (i5 > i3) {
                    continue;
                } else if (i4 == 2) {
                    int i6 = qjVar.f9046d;
                    if (i3 < i5 + i6) {
                        return -1;
                    }
                    i3 -= i6;
                } else if (i4 == 1) {
                    i3 += qjVar.f9046d;
                }
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: b */
    public final boolean m5848b() {
        return this.f9285a.size() > 0;
    }

    /* renamed from: a */
    public final qj m5843a(int i, int i2, int i3, Object obj) {
        qj qjVar = (qj) this.f9289e.mo341a();
        if (qjVar == null) {
            return new qj(i, i2, i3, obj);
        }
        qjVar.f9043a = i;
        qjVar.f9044b = i2;
        qjVar.f9046d = i3;
        qjVar.f9045c = obj;
        return qjVar;
    }

    /* renamed from: b */
    public final void m5847b(qj qjVar) {
        this.f9286b.add(qjVar);
        switch (qjVar.f9043a) {
            case 1:
                this.f9287c.m5707a(qjVar.f9044b, qjVar.f9046d);
                return;
            case 2:
                qi qiVar = this.f9287c;
                qiVar.f9042a.m447a(qjVar.f9044b, qjVar.f9046d, false);
                qiVar.f9042a.f658C = true;
                return;
            case 4:
                this.f9287c.m5708a(qjVar.f9044b, qjVar.f9046d, qjVar.f9045c);
                return;
            case 8:
                this.f9287c.m5710b(qjVar.f9044b, qjVar.f9046d);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown update op type for ");
                stringBuilder.append(qjVar);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public final void m5850c(qj qjVar) {
        qjVar.f9045c = null;
        this.f9289e.mo342a(qjVar);
    }

    /* renamed from: a */
    private final void m5839a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m5850c((qj) list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    public final void m5849c() {
        m5839a(this.f9285a);
        m5839a(this.f9286b);
    }

    /* renamed from: b */
    private final int m5841b(int i, int i2) {
        int size = this.f9286b.size() - 1;
        int i3 = i;
        while (size >= 0) {
            int i4;
            int i5;
            qj qjVar = (qj) this.f9286b.get(size);
            int i6 = qjVar.f9043a;
            if (i6 == 8) {
                i4 = qjVar.f9044b;
                int i7 = qjVar.f9046d;
                int i8;
                if (i4 < i7) {
                    i8 = i7;
                } else {
                    i8 = i4;
                }
                if (i4 < i7) {
                    i6 = i4;
                } else {
                    i6 = i7;
                }
                if (i3 < i6 || i3 > r5) {
                    if (i3 >= i4) {
                        i5 = i3;
                    } else if (i2 == 1) {
                        qjVar.f9044b = i4 + 1;
                        qjVar.f9046d = i7 + 1;
                        i5 = i3;
                    } else if (i2 == 2) {
                        qjVar.f9044b = i4 - 1;
                        qjVar.f9046d = i7 - 1;
                        i5 = i3;
                    } else {
                        i5 = i3;
                    }
                } else if (i6 == i4) {
                    if (i2 == 1) {
                        qjVar.f9046d = i7 + 1;
                    } else if (i2 == 2) {
                        qjVar.f9046d = i7 - 1;
                    }
                    i5 = i3 + 1;
                } else {
                    if (i2 == 1) {
                        qjVar.f9044b = i4 + 1;
                    } else if (i2 == 2) {
                        qjVar.f9044b = i4 - 1;
                    }
                    i5 = i3 - 1;
                }
            } else {
                i4 = qjVar.f9044b;
                if (i4 <= i3) {
                    i5 = i6 == 1 ? i3 - qjVar.f9046d : i6 == 2 ? qjVar.f9046d + i3 : i3;
                } else if (i2 == 1) {
                    qjVar.f9044b = i4 + 1;
                    i5 = i3;
                } else if (i2 == 2) {
                    qjVar.f9044b = i4 - 1;
                    i5 = i3;
                } else {
                    i5 = i3;
                }
            }
            size--;
            i3 = i5;
        }
        for (i6 = this.f9286b.size() - 1; i6 >= 0; i6--) {
            qjVar = (qj) this.f9286b.get(i6);
            if (qjVar.f9043a == 8) {
                i4 = qjVar.f9046d;
                if (i4 == qjVar.f9044b || i4 < 0) {
                    this.f9286b.remove(i6);
                    m5850c(qjVar);
                }
            } else if (qjVar.f9046d <= 0) {
                this.f9286b.remove(i6);
                m5850c(qjVar);
            }
        }
        return i3;
    }
}
