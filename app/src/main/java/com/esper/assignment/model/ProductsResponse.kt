package com.esper.assignment.model

import com.google.gson.annotations.SerializedName

data class ProductsResponse(@SerializedName("features") val features : List<Features>?,
                            @SerializedName("exclusions") val exclusions: List<List<Exclusions>>?)