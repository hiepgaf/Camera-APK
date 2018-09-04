package com.google.android.apps.refocus.processing;

import java.util.ArrayList;

/* compiled from: PG */
public class Tiler {
    public static final Options DEFAULT_OPTIONS = new Options(1024, 1024, 25, 16);

    /* compiled from: PG */
    public class Options {
        public final int alignment;
        public final int apron;
        public final int maxHeight;
        public final int maxWidth;

        public Options(int i, int i2, int i3, int i4) {
            this.maxWidth = i;
            this.maxHeight = i2;
            this.apron = i3;
            this.alignment = i4;
        }
    }

    /* compiled from: PG */
    public class Tile {
        public final int height;
        public final int left;
        public final int top;
        public final int width;

        public Tile(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    private static int alignmentDelta(Options options, int i) {
        int i2 = options.alignment;
        return (i2 - (i % i2)) % i2;
    }

    public static ArrayList computeTiling(Options options, int i, int i2) {
        int i3;
        int max = Math.max(0, (i - options.apron) - 1);
        int i4 = options.maxWidth;
        int i5 = options.apron;
        max = (max / (i4 - i5)) + 1;
        i4 = Math.max(0, (i2 - i5) - 1);
        i5 = options.maxHeight;
        int i6 = options.apron;
        i5 = (i4 / (i5 - i6)) + 1;
        i4 = i6 + i6;
        i6 = (((max - 1) * i4) + i) / max;
        i4 = ((i4 * (i5 - 1)) + i2) / i5;
        int alignmentDelta = i6 + alignmentDelta(options, i6);
        i4 += alignmentDelta(options, i4);
        if (max >= 2) {
            max = options.apron;
            i3 = alignmentDelta - (max + max);
        } else {
            i3 = alignmentDelta;
        }
        if (i5 >= 2) {
            max = options.apron;
            max = i4 - (max + max);
        } else {
            max = i4;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < (i2 + max) - i4; i7 += max) {
            for (int i8 = 0; i8 < (i + i3) - alignmentDelta; i8 += i3) {
                int i9;
                i6 = Math.min(alignmentDelta, i - i8);
                i5 = Math.min(i4, i2 - i7);
                int alignmentDelta2 = alignmentDelta(options, i6);
                int alignmentDelta3 = alignmentDelta(options, i5);
                if (alignmentDelta2 <= 0) {
                    i9 = i6;
                    alignmentDelta2 = i8;
                } else if (alignmentDelta2 <= i8) {
                    i6 += alignmentDelta2;
                    alignmentDelta2 = i8 - alignmentDelta2;
                    i9 = i6;
                } else {
                    i9 = i6;
                    alignmentDelta2 = i8;
                }
                if (alignmentDelta3 <= 0) {
                    i6 = i7;
                } else if (alignmentDelta3 <= i7) {
                    i6 = i7 - alignmentDelta3;
                    i5 += alignmentDelta3;
                } else {
                    i6 = i7;
                }
                arrayList.add(new Tile(alignmentDelta2, i6, i9, i5));
            }
        }
        return arrayList;
    }
}
