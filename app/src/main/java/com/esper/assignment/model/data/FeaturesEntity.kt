package com.esper.assignment.model.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.esper.assignment.model.Features

@Entity(tableName = "features")
data class FeaturesEntity(
    @PrimaryKey val id: Int,
    val name: String
) {
    companion object {
        fun from(features: Features): FeaturesEntity {
            return FeaturesEntity(features.id, features.name)
        }
    }

    fun toFeatures(): Features {
        return Features(id, name)
    }
}