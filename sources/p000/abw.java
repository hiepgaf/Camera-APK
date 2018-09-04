package p000;

import android.graphics.Point;
import android.hardware.Camera.Size;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: abw */
public final class abw {
    /* renamed from: a */
    public final Point f178a;

    public abw(int i, int i2) {
        this.f178a = new Point(i, i2);
    }

    public abw(Size size) {
        if (size == null) {
            this.f178a = new Point(0, 0);
        } else {
            this.f178a = new Point(size.width, size.height);
        }
    }

    private abw(android.util.Size size) {
        if (size == null) {
            this.f178a = new Point(0, 0);
        } else {
            this.f178a = new Point(size.getWidth(), size.getHeight());
        }
    }

    public abw(abw abw) {
        if (abw == null) {
            this.f178a = new Point(0, 0);
            return;
        }
        Point point = abw.f178a;
        this.f178a = new Point(point.x, point.y);
    }

    /* renamed from: a */
    public static List m83a(List list) {
        List arrayList = new ArrayList(list.size());
        for (android.util.Size abw : list) {
            arrayList.add(new abw(abw));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abw)) {
            return false;
        }
        return this.f178a.equals(((abw) obj).f178a);
    }

    public final int hashCode() {
        return this.f178a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size: (");
        stringBuilder.append(this.f178a.x);
        stringBuilder.append(" x ");
        stringBuilder.append(this.f178a.y);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
