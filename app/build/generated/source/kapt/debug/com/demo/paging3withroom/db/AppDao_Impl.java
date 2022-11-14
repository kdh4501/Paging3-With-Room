package com.demo.paging3withroom.db;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CharacterData> __insertionAdapterOfCharacterData;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCharacterData = new EntityInsertionAdapter<CharacterData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `character` (`id`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CharacterData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void insertRecord(final CharacterData characterData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCharacterData.insert(characterData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public PagingSource<Integer, CharacterData> getAllRecords() {
    final String _sql = "SELECT * FROM character ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, CharacterData>() {
      @Override
      public LimitOffsetDataSource<CharacterData> create() {
        return new LimitOffsetDataSource<CharacterData>(__db, _statement, false, false , "character") {
          @Override
          protected List<CharacterData> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final List<CharacterData> _res = new ArrayList<CharacterData>(cursor.getCount());
            while(cursor.moveToNext()) {
              final CharacterData _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              _item = new CharacterData(_tmpId,_tmpName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
