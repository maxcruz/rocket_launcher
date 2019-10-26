package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ObjectAnimator
import android.view.View

class LaunchRocketObjectAnimatorAnimationActivity : BaseAnimationActivity() {

  override fun onStartAnimation() {
    val objectAnimator = ObjectAnimator.ofFloat(rocket, View.TRANSLATION_Y, 0f, -screenHeight)

    objectAnimator.duration = DEFAULT_ANIMATION_DURATION
    objectAnimator.start()
  }

}
