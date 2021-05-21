package com.esper.assignment.db

import androidx.room.*
import com.esper.assignment.model.FeaturesWithOptions
import com.esper.assignment.model.Options
import com.esper.assignment.model.data.ExclusionsEntity

@Dao
interface ProductDao {

    @Transaction
    @Query("SELECT * FROM features")
    fun getUsersAndLibraries(): List<FeaturesWithOptions?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllOption(options: List<Options>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllFeature(features: List<Options>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExclusion(exclusionsEntity: ExclusionsEntity)

}