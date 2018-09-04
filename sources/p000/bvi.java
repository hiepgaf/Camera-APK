package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* renamed from: bvi */
final class bvi implements kaw {
    /* renamed from: a */
    private final /* synthetic */ ContentValues f11323a;

    bvi(ContentValues contentValues) {
        this.f11323a = contentValues;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        ((SQLiteDatabase) jri.m13152b((SQLiteDatabase) obj)).replace("type_uri", null, this.f11323a);
        return null;
    }
}
