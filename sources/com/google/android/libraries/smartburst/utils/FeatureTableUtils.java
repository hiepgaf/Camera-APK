package com.google.android.libraries.smartburst.utils;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.Collection;
import java.util.List;
import p000.jky;
import p000.jkz;
import p000.jza;
import p000.khb;
import p000.khx;

/* compiled from: PG */
public class FeatureTableUtils {
    public static FloatArray getAllValidFeatureValue(FeatureTable featureTable, jza jza) {
        if (jza.f8127A != 1) {
            throw new IllegalArgumentException("Can not apply on features with more than 1 value!");
        }
        FloatArray floatArray = new FloatArray();
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        while (rowIterator.m4528a()) {
            floatArray.add(((jky) rowIterator.next()).m4525a(jza).getValue());
        }
        return floatArray;
    }

    public static long[] getAllValidTimestamps(FeatureTable featureTable) {
        Collection b = khb.m4885b();
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        while (rowIterator.m4528a()) {
            b.add(Long.valueOf(((jky) rowIterator.next()).m4527b()));
        }
        return khx.m4943a(b);
    }

    public static FloatArray getFeatureInRange(FeatureTable featureTable, jza jza, long j, long j2) {
        if (jza.f8127A != 1) {
            throw new IllegalArgumentException("Can not apply on features with more than 1 value!");
        }
        FloatArray floatArray = new FloatArray();
        jkz rowIterator = featureTable.getRowIterator(j);
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.m4527b() > j2) {
                break;
            }
            floatArray.add(jky.m4525a(jza).getValue());
        }
        return floatArray;
    }

    public static List getTimestampsInRange(FeatureTable featureTable, long j, long j2) {
        List b = khb.m4885b();
        jkz rowIterator = featureTable.getRowIterator(j);
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.m4527b() > j2) {
                break;
            }
            b.add(Long.valueOf(jky.m4527b()));
        }
        return b;
    }
}
