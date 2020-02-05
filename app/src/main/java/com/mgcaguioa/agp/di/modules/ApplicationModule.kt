package com.mgcaguioa.agp.di.modules

import android.app.Application
import android.content.Context
import com.mgcaguioa.agp.di.DatabaseInfo
import com.mgcaguioa.agp.di.context.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Provide application-level dependencies.
 */
@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return mApplication
    }

    @Provides
    internal fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @DatabaseInfo
    internal fun provideDatabaseName(): String {
        return "${mApplication.packageName}.db"
    }

    @Provides
    @DatabaseInfo
    internal fun provideDatabaseVersion(): Int? {
        return 2
    }
}
