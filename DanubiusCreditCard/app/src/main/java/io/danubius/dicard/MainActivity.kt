package io.danubius.dicard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
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
    DanubiusCreditCardTheme {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CreditCard(
                cardInfo = CardInfo(
                    backgroundDrawable = R.drawable.card_mesh,
                    providerDrawable = R.drawable.mc,
                    cardNumber = "8547 9658 6325 4521",
                    cardHolder = "John Fluffy"
                )
            )
            CreditCard(
                cardInfo = CardInfo(
                    backgroundDrawable = R.drawable.card_mesh_2,
                    providerDrawable = R.drawable.visa,
                    cardNumber = "6582 4521 3256 8522",
                    cardHolder = "Elisa Silverstone"
                )
            )
            CreditCard(
                cardInfo = CardInfo(
                    backgroundDrawable = R.drawable.card_mesh_3,
                    providerDrawable = R.drawable.visa,
                    cardNumber = "9856 7452 2569 7413",
                    cardHolder = "Salvador Dali"
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DiCardApp()
}