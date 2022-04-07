package id.walt.webwallet.backend.context

import com.google.common.cache.CacheLoader
import id.walt.services.context.Context
import id.walt.services.hkvstore.InMemoryHKVStore
import id.walt.services.keystore.HKVKeyStoreService
import id.walt.services.vcstore.HKVVcStoreService

object UserContextLoader : CacheLoader<String, Context>() {
  override fun load(key: String): UserContext {
    //TODO: get user context preferences from user database
//    return UserContext(key, HKVKeyStoreService(), HKVVcStoreService(), FileSystemHKVStore(FilesystemStoreConfig("${WALTID_DATA_ROOT}/data/${key}")))
    return UserContext(key, HKVKeyStoreService(), HKVVcStoreService(), InMemoryHKVStore())
  }
}
