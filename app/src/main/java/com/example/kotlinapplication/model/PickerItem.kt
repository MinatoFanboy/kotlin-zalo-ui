package com.example.kotlinapplication.model

class PickerItem {
    var value: Any = ""
    var label: Any = ""

    constructor(
        value: Int,
        label: Any,
    ) {
        this.value = value
        this.label = label
    }

    constructor(
        value: String,
        label: Any,
    ) {
        this.value = value
        this.label = label
    }
}