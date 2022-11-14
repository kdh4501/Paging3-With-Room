package com.demo.paging3withroom.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/demo/paging3withroom/db/RoomRepository;", "", "appDao", "Lcom/demo/paging3withroom/db/AppDao;", "(Lcom/demo/paging3withroom/db/AppDao;)V", "getAllRecords", "Landroidx/paging/PagingSource;", "", "Lcom/demo/paging3withroom/db/CharacterData;", "insertRecord", "", "characterData", "app_debug"})
public final class RoomRepository {
    private final com.demo.paging3withroom.db.AppDao appDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.PagingSource<java.lang.Integer, com.demo.paging3withroom.db.CharacterData> getAllRecords() {
        return null;
    }
    
    public final void insertRecord(@org.jetbrains.annotations.NotNull()
    com.demo.paging3withroom.db.CharacterData characterData) {
    }
    
    @javax.inject.Inject()
    public RoomRepository(@org.jetbrains.annotations.NotNull()
    com.demo.paging3withroom.db.AppDao appDao) {
        super();
    }
}