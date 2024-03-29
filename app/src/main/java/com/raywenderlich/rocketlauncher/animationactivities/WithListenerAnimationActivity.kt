package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListenerAnimationActivity : BaseAnimationActivity() {

  override fun onStartAnimation() {
      val animator = ValueAnimator.ofFloat(0f, -screenHeight)
      animator.addUpdateListener {
          val value = it.animatedValue as Float
          rocket.translationY = value
          doge.translationY = value
      }

      animator.addListener(object : Animator.AnimatorListener {

          override fun onAnimationStart(p0: Animator?) {
              Toast.makeText(applicationContext, "Doge took off", Toast.LENGTH_SHORT)
                      .show()

          }

          override fun onAnimationEnd(p0: Animator?) {
              Toast.makeText(applicationContext, "Doge is on the moon", Toast.LENGTH_SHORT)
                      .show()

          }

          override fun onAnimationCancel(p0: Animator?) {

          }

          override fun onAnimationRepeat(p0: Animator?) {

          }

      })

      animator.duration = DEFAULT_ANIMATION_DURATION
      animator.start()
  }

}
