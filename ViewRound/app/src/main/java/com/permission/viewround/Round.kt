package com.permission.viewround
import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.GradientDrawable
import android.util.TypedValue
import android.view.View
import androidx.core.content.ContextCompat

fun View.sharp() {

    val gradientDrawable = GradientDrawable()
    gradientDrawable.cornerRadius = 20f.dp()
    gradientDrawable.setColor(ContextCompat.getColor(context, R.color.black))
    gradientDrawable.setStroke(5f.dp().toInt(), ContextCompat.getColor(context, R.color.purple_200))
    background = gradientDrawable

}

fun Float.dp(): Float {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this,
        Resources.getSystem().displayMetrics
    )
}

