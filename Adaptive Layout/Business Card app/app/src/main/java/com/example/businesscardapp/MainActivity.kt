package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableInfoCard()
                }
            }
        }
    }
}

@Composable
fun ComposableInfoCard() {
    BoxWithConstraints() {
        if (maxWidth < 840.dp)
        {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFc3e6c6))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.android_logo
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .height(128.dp)
                            .width(128.dp)
                            .background(Color(0xFF073042))
                    )
                    Text(
                        text = stringResource(id = R.string.my_name),
                        fontSize = 40.sp
                    )
                    Text(
                        text = stringResource(id = R.string.job_desc),
                        color = Color(0xFF006d3b),
                        fontWeight = FontWeight.Bold
                    )

                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
                )

                {
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Phone,
                            contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                            tint = Color(0xFF006d3b)
                        )
                        Text(text = stringResource(id = R.string.phone))
                    }
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Share, contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                            tint = Color(0xFF006d3b)
                        )
                        Text(text = stringResource(id = R.string.mail))
                    }
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Email, contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                            tint = Color(0xFF006d3b)
                        )
                        Text(text = stringResource(id = R.string.mail))
                    }
                }

            }
        }
        else{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFc3e6c6))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .weight(1f),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.android_logo
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .height(128.dp)
                            .width(128.dp)
                            .background(Color(0xFF073042))
                    )
                    Column (
                        Modifier.padding(start = 16.dp)
                            ){
                        Text(
                            text = stringResource(id = R.string.my_name),
                            fontSize = 56.sp
                        )
                        Text(
                            text = stringResource(id = R.string.job_desc),
                            color = Color(0xFF006d3b),
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                    }

                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
                )

                {
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Phone,
                            contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp).size(32.dp),
                            tint = Color(0xFF006d3b)
                        )
                        Text(text = stringResource(id = R.string.phone), fontSize = 24.sp)
                    }
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Share, contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp).size(32.dp),
                            tint = Color(0xFF006d3b)
                        )
                        Text(text = stringResource(id = R.string.mail), fontSize = 24.sp)
                    }
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.Email, contentDescription = null,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp).size(32.dp),
                            tint = Color(0xFF006d3b),

                        )
                        Text(text = stringResource(id = R.string.mail), fontSize = 24.sp)
                    }
                }

            }
        }
    }
}

@Preview(device = Devices.PHONE,showBackground = true)
@Preview(device = Devices.FOLDABLE,showBackground = true)
@Preview(device = Devices.TABLET,showBackground = true)
@Composable
fun InfoCardPreview() {
    BusinessCardAppTheme {
        ComposableInfoCard()
    }
}