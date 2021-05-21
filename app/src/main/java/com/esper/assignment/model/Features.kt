package com.esper.assignment.model

import com.google.gson.annotations.SerializedName

data class Features (
	@SerializedName("feature_id") val id : Int,
	@SerializedName("name") val name : String,
	@SerializedName("options") val options : List<Options>? = null
)