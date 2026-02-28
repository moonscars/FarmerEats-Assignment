package com.example.petspace.Assignment_Code.UI.Splash


import androidx.compose.material3.Text
import androidx.compose.runtime.asIntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.petspace.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {


    private val LabelList = listOf<String>("Quality", "Convenient", "Local")

    private val TextList = listOf<String>(
        "Sell you farm fresh products directly to consumers, cutting out the middleman and reducing emissions of the global supply chain.",
        "Our team of delivery drivers will make sure your orders are picked up on time and promptly delivered to your customers.",
        "We love the earth and know you do too! Join us in reducing our local carbon footprint one order at a time.",
    )
    private val ColorList = listOf<Color>(
        Color(0xff5ea25f),
        Color(0xffd5715b),
        Color(0xfff8c569)
    )
    private val ImagesList = listOf<Int>(
        R.drawable.green,
        R.drawable.red,
        R.drawable.yellow
    )

    var count = MutableStateFlow(0)


    private val _BackgroundImage = MutableStateFlow(ImagesList[0])
    val BackgroundImage = _BackgroundImage.asStateFlow()

    private val _Label = MutableStateFlow(LabelList[0])
    val Label = _Label.asStateFlow()

    private val _Text = MutableStateFlow(TextList[0])
    val Text = _Text.asStateFlow()

    private val _Color = MutableStateFlow<Color>(ColorList[0])
    val Color: StateFlow<Color> = _Color.asStateFlow()

    init {
        viewModelScope.launch {
            while (true) {
                delay(4000)
                count.value = 1
                _BackgroundImage.value = ImagesList[1]
                _Label.value = LabelList[1]
                _Color.value = ColorList[1]
                _Text.value = TextList[1]
                delay(4000)
                count.value = 2

                _BackgroundImage.value = ImagesList[2]
                _Label.value = LabelList[2]
                _Color.value = ColorList[2]
                _Text.value = TextList[2]
                delay(4000)
                count.value = 0

                _BackgroundImage.value = ImagesList[0]
                _Label.value = LabelList[0]
                _Color.value = ColorList[0]
                _Text.value = TextList[0]

            }
        }
    }


}