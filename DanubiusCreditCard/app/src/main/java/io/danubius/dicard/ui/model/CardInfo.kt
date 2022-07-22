package io.danubius.dicard.ui.model

data class CardInfo(
    val cardNumber: String,
    val cardHolder: String,
    val providerDrawable: Int,
    val backgroundDrawable: Int
)