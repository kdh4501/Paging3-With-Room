// Generated by Dagger (https://dagger.dev).
package com.demo.paging3withroom.di;

import android.app.Application;
import com.demo.paging3withroom.db.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Application> contextProvider;

  public AppModule_GetAppDatabaseFactory(AppModule module, Provider<Application> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return getAppDatabase(module, contextProvider.get());
  }

  public static AppModule_GetAppDatabaseFactory create(AppModule module,
      Provider<Application> contextProvider) {
    return new AppModule_GetAppDatabaseFactory(module, contextProvider);
  }

  public static AppDatabase getAppDatabase(AppModule instance, Application context) {
    return Preconditions.checkNotNullFromProvides(instance.getAppDatabase(context));
  }
}