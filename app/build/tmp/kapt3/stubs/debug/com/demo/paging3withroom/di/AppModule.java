package com.demo.paging3withroom.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/demo/paging3withroom/di/AppModule;", "", "()V", "appDao", "Lcom/demo/paging3withroom/db/AppDao;", "appDatabase", "Lcom/demo/paging3withroom/db/AppDatabase;", "getAppDatabase", "context", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.demo.paging3withroom.db.AppDatabase getAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.demo.paging3withroom.db.AppDao appDao(@org.jetbrains.annotations.NotNull()
    com.demo.paging3withroom.db.AppDatabase appDatabase) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}