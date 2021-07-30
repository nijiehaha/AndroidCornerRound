package com.permission.viewround

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class CustomButton(context: Context, attrs: AttributeSet): AppCompatButton(context, attrs) {

    var radius = 0F
    var normalColor: Int = 0

    lateinit var gradientDrawable: GradientDrawable

    init {

        if (attrs != null) {

            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomButton)
            radius = typedArray.getDimension(R.styleable.CustomButton_radius,
                resources.getDimension(R.dimen.x6))
            val defaultColor = ContextCompat.getColor(context, R.color.purple_200)
            normalColor = typedArray.getColor(R.styleable.CustomButton_normal_color, defaultColor)
            typedArray.recycle()

        }

        gravity.and(Gravity.CENTER)

        gradientDrawable = GradientDrawable()
        gradientDrawable.cornerRadius = radius
        gradientDrawable.setColor(normalColor)
        background = gradientDrawable

    }

}