package com.hmj.kotlin

interface Clickable {
    fun click()
    fun showOff() = println("I am clickable!")
}

interface Focusable {
    fun setFocus(focused:Boolean) =
        println("I ${if (focused) "got" else "lost"} focus")

    fun showOff() = println("I am focusable!")
}

// All classes are final by default
class Button : Clickable, Focusable {
    override fun click() = println("A button was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

open class RichButton : Clickable {
    fun disable() {} // Final

    open fun animate() {} // Open

    final override fun click() = println("A rich button has been clicked!!!") // Child classes cannot override this method
}

fun main() {
    val button = Button()
    button.click()
    button.setFocus(true)
    button.setFocus(false)
    button.showOff()
}