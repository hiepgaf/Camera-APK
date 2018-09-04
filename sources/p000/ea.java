package p000;

/* compiled from: PG */
/* renamed from: ea */
class ea {
    /* renamed from: n */
    public qt[] f3433n = null;
    /* renamed from: o */
    public String f3434o;
    /* renamed from: p */
    public int f3435p;

    public ea(ea eaVar) {
        this.f3434o = eaVar.f3434o;
        this.f3435p = eaVar.f3435p;
        this.f3433n = qr.m5737a(eaVar.f3433n);
    }

    /* renamed from: getPathData$50KLMJ31DPI74RR9CGNN6TBGE1NN4T1FEOQ2UPRIC5O6GQB3ECNL0OBKD1862SJJCLP28K31EHK48OBKC576UP357C______0 */
    public qt[] m1720xea56d990() {
        return this.f3433n;
    }

    public String getPathName() {
        return this.f3434o;
    }

    /* renamed from: a */
    public boolean mo1200a() {
        return false;
    }

    /* renamed from: setPathData$51DKOOBECHP6UQB45TPNAS3GDTP78BRM6GNMESJ1E1K6IORJ5T862T38A1GN4SR5E8I50OBKD1262T319PNM8P9R55B0____0 */
    public void m1721xe86a3a9b(qt[] qtVarArr) {
        if (qr.m5734a(this.f3433n, qtVarArr)) {
            qt[] qtVarArr2 = this.f3433n;
            for (int i = 0; i < qtVarArr.length; i++) {
                qtVarArr2[i].f9083a = qtVarArr[i].f9083a;
                int i2 = 0;
                while (true) {
                    float[] fArr = qtVarArr[i].f9084b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    qtVarArr2[i].f9084b[i2] = fArr[i2];
                    i2++;
                }
            }
            return;
        }
        this.f3433n = qr.m5737a(qtVarArr);
    }
}
