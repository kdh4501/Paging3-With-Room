// Generated by Dagger (https://dagger.dev).
package com.demo.paging3withroom.di;

import com.demo.paging3withroom.db.AppDao;
import com.demo.paging3withroom.db.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_AppDaoFactory implements Factory<AppDao> {
  private final AppModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_AppDaoFactory(AppModule module, Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDao get() {
    return appDao(module, appDatabaseProvider.get());
  }

  public static AppModule_AppDaoFactory create(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_AppDaoFactory(module, appDatabaseProvider);
  }

  public static AppDao appDao(AppModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.appDao(appDatabase));
  }
}