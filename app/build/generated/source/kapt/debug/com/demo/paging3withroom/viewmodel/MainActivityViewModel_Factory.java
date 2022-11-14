// Generated by Dagger (https://dagger.dev).
package com.demo.paging3withroom.viewmodel;

import com.demo.paging3withroom.db.RoomRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<RoomRepository> repositoryProvider;

  public MainActivityViewModel_Factory(Provider<RoomRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MainActivityViewModel_Factory create(Provider<RoomRepository> repositoryProvider) {
    return new MainActivityViewModel_Factory(repositoryProvider);
  }

  public static MainActivityViewModel newInstance(RoomRepository repository) {
    return new MainActivityViewModel(repository);
  }
}