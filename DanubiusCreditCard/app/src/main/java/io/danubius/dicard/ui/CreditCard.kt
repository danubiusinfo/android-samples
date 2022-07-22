package io.danubius.dicard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.danubius.dicard.R
import io.danubius.dicard.ui.model.CardInfo
import io.danubius.dicard.ui.theme.SpaceGrotesk
import io.danubius.dicard.ui.theme.SpaceMono

@Composable
fun CreditCard(cardInfo: CardInfo) {

    Card(
        modifier = Modifier
            .height(200.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp
    ) {
        Image(
            painter = painterResource(id = cardInfo.backgroundDrawable),
            contentDescription = "Card Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Box(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = cardInfo.providerDrawable),
                contentDescription = "Visa",
                modifier = Modifier
                    .width(86.dp)
                    .align(Alignment.TopStart)
            )
            Column(modifier = Modifier.align(Alignment.BottomStart)) {
                Text(
                    text = cardInfo.cardNumber,
                    fontFamily = SpaceMono,
                    letterSpacing = 1.2.sp,
                    fontSize = 16.sp
                )
                Text(
                    text = cardInfo.cardHolder,
                    fontFamily = SpaceGrotesk,
                    letterSpacing = 1.1.sp,
                    fontSize = 16.sp
                )
            }
        }

    }

}

@Composable
@Preview(showBackground = true)
fun CreditCardPreview() {
    CreditCard(
        cardInfo = CardInfo(
            providerDrawable = R.drawable.mc,
            backgroundDrawable = R.drawable.card_mesh_3,
            cardNumber = "5784 6549 8521 7896",
            cardHolder = "John Fluffy"
        )
    )
}