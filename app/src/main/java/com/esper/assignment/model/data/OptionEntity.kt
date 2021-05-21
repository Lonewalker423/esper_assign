package com.esper.assignment.model.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.esper.assignment.model.Options

@Entity(tableName = "options")
data class OptionEntity(
    val feature_id: Int,
    val name: String,
    val icon: String,
    @PrimaryKey
    val id: Int
) {
    companion object {
        fun from(options: Options): OptionEntity {
            return OptionEntity(options.feature_id, options.name, options.icon, options.id)
        }
    }

    fun toOptions(): Options {
        return Options(feature_id, name, icon, id)
    }
}