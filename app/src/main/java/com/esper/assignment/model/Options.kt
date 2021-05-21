package com.esper.assignment.model

import com.google.gson.annotations.SerializedName

data class Options (

	@SerializedName("feature_id") val feature_id : Int,
	@SerializedName("name") val name : String,
	@SerializedName("icon") val icon : String,
	@SerializedName("id") val id : Int
)