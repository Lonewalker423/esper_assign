package com.esper.assignment.model

import com.google.gson.annotations.SerializedName

data class Exclusions (

	@SerializedName("feature_id") val feature_id : Int,
	@SerializedName("options_id") val options_id : Int
)