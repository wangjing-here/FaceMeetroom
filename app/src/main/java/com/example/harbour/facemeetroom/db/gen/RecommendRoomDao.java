package com.example.harbour.facemeetroom.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.harbour.facemeetroom.db.entity.RecommendRoom;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECOMMEND_ROOM".
*/
public class RecommendRoomDao extends AbstractDao<RecommendRoom, Long> {

    public static final String TABLENAME = "RECOMMEND_ROOM";

    /**
     * Properties of entity RecommendRoom.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Roomid = new Property(1, String.class, "roomid", false, "ROOMID");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
    }


    public RecommendRoomDao(DaoConfig config) {
        super(config);
    }
    
    public RecommendRoomDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECOMMEND_ROOM\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"ROOMID\" TEXT NOT NULL ," + // 1: roomid
                "\"CONTENT\" TEXT NOT NULL );"); // 2: content
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECOMMEND_ROOM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RecommendRoom entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRoomid());
        stmt.bindString(3, entity.getContent());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RecommendRoom entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRoomid());
        stmt.bindString(3, entity.getContent());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public RecommendRoom readEntity(Cursor cursor, int offset) {
        RecommendRoom entity = new RecommendRoom( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // roomid
            cursor.getString(offset + 2) // content
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RecommendRoom entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRoomid(cursor.getString(offset + 1));
        entity.setContent(cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RecommendRoom entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RecommendRoom entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RecommendRoom entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
