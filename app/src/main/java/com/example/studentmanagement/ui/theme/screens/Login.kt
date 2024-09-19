package com.example.studentmanagement.ui.theme.screens

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Login(){
    Column(modifier = Modifier
        .padding(horizontal = 16.dp)
        .fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Spacer(modifier = Modifier.height(50.dp))
        SimpleFilledTextFieldSample("Enter Username",KeyboardType.Email)
        Spacer(modifier = Modifier.height(20.dp))
        SimpleFilledTextFieldSample("Enter Password",KeyboardType.Password)
        Spacer(modifier = Modifier.height(20.dp))

        ValidateButton()
    }

}
@Composable
fun SimpleFilledTextFieldSample(label :String,keyboardType: KeyboardType) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
    )
}
@Composable
fun ValidateButton(){
    Button(onClick = {

    },shape = RoundedCornerShape(5.dp), modifier = Modifier.fillMaxWidth()){
Text(text = "Login")
    }
}
@Composable
@Preview(showSystemUi = true)
fun LoginPreview(){
    Login()
}