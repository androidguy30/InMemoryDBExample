package com.razorpay.bebettatest

import java.sql.RowId

data class TableRow(
    val rowId: Int,
    val columnData: Map<String,Entity>
)