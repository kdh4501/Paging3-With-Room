package com.demo.paging3withroom.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/demo/paging3withroom/db/AppDao;", "", "getAllRecords", "Landroidx/paging/PagingSource;", "", "Lcom/demo/paging3withroom/db/CharacterData;", "insertRecord", "", "characterData", "app_debug"})
public abstract interface AppDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM character ORDER BY id DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.demo.paging3withroom.db.CharacterData> getAllRecords();
    
    @androidx.room.Insert()
    public abstract void insertRecord(@org.jetbrains.annotations.NotNull()
    com.demo.paging3withroom.db.CharacterData characterData);
}