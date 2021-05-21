package com.esper.assignment.model.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.esper.assignment.model.Exclusions

@Entity(tableName = "exclusions")
data class ExclusionsEntity(
    @PrimaryKey val id: Int,
    @Embedded val exclusions: List<List<Exclusions>>
) {


    companion object {
        fun from(data : List<List<Exclusions>>): ExclusionsEntity {
            return ExclusionsEntity(id = data.hashCode(),exclusions = data )
        }
    }

    fun toExclusions(): List<List<Exclusions>>  {
        return exclusions
    }
}