package com.abreu.mcommerce.domain

class NavMenuItem(val label: String, val iconId: Int = DEFAULT_ICON_ID) {

    companion object {
        const val  DEFAULT_ICON_ID = -1
    }
}