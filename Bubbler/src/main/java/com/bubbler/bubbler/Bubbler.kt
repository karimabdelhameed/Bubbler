package com.bubbler.bubbler

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes

/**
 * @author karim abdelhameed
 * @param bubblerBgShape: Determine the bg shape for the bubbler (i.e. circle, square, ... etc)
 * @param bubblerBgColor: Determine the bg color for the bubbler (i.e. red, green, blue, ... etc)
 * @param bubblerSrc: Determine the inner icon for the bubbler (i.e. chat icon, call icon, ... etc)
 */
class Bubbler(@DrawableRes val bubblerBgShape : Int? = 0,
              @ColorRes val bubblerBgColor: Int? = 0,
              @DrawableRes val bubblerSrc: Int? = 0,
)
