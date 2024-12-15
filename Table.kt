package com.razorpay.bebettatest

data class Table(
    private var table: LinkedHashMap<Int, TableRow> = linkedMapOf()
) {
    fun insertRow(rowData: TableRow) {
        table.putIfAbsent(rowData.rowId, rowData)
    }

    fun deleteRow(rowId: Int) {
        table.remove(rowId)
    }


}