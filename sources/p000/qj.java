package p000;

/* compiled from: PG */
/* renamed from: qj */
public final class qj {
    /* renamed from: a */
    public int f9043a;
    /* renamed from: b */
    public int f9044b;
    /* renamed from: c */
    public Object f9045c;
    /* renamed from: d */
    public int f9046d;

    qj(int i, int i2, int i3, Object obj) {
        this.f9043a = i;
        this.f9044b = i2;
        this.f9046d = i3;
        this.f9045c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qj qjVar = (qj) obj;
        int i = this.f9043a;
        if (i != qjVar.f9043a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f9046d - this.f9044b) == 1 && this.f9046d == qjVar.f9044b && this.f9044b == qjVar.f9046d) {
            return true;
        }
        if (this.f9046d != qjVar.f9046d) {
            return false;
        }
        if (this.f9044b != qjVar.f9044b) {
            return false;
        }
        Object obj2 = this.f9045c;
        if (obj2 != null) {
            if (obj2.equals(qjVar.f9045c)) {
                return true;
            }
            return false;
        } else if (qjVar.f9045c != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return (((this.f9043a * 31) + this.f9044b) * 31) + this.f9046d;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[");
        switch (this.f9043a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
            default:
                str = "??";
                break;
        }
        stringBuilder.append(str);
        stringBuilder.append(",s:");
        stringBuilder.append(this.f9044b);
        stringBuilder.append("c:");
        stringBuilder.append(this.f9046d);
        stringBuilder.append(",p:");
        stringBuilder.append(this.f9045c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
