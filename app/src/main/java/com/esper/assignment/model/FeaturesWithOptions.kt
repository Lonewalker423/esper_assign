package com.esper.assignment.model

import androidx.room.Embedded
import androidx.room.Relation

class FeaturesWithOptions {
    @Embedded
    var feature: Features? = null

    @Relation(parentColumn = "id", entityColumn = "feature_id")
    var options: List<Options>? = null
}