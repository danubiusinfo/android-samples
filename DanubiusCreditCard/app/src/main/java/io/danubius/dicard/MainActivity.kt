package io.danubius.dicard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.danubius.dicard.ui.CreditCard
import io.danubius.dicard.ui.model.CardInfo
import io.danubius.dicard.ui.theme.DanubiusCreditCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiCardApp()
        }
    }
}

@Composable
fun DiCardApp() {
    val cards = listOf(
        CardInfo(
            backgroundDrawable = R.drawable.card_mesh,
            providerDrawable = R.drawable.mc,
            cardNumber = "8547 9658 6325 4521",
            cardHolder = "John Fluffy"
        ),
        CardInfo(
            backgroundDrawable = R.drawable.card_mesh_2,
            providerDrawable = R.drawable.visa,
            cardNumber = "6582 4521 3256 8522",
            cardHolder = "Elisa Silverstone"
        ),
        CardInfo(
            backgroundDrawable = R.drawable.card_mesh_3,
            providerDrawable = R.drawable.visa,
            cardNumber = "9856 7452 2569 7413",
            cardHolder = "Salvador Dali"
        )
    )
    DanubiusCreditCardTheme {
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(cards) { card ->
                CreditCard(cardInfo = card)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DiCardApp()
}