@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

inline fun <reified T : Fragment> FragmentManager.find(tag: String): T = findFragmentByTag(tag) as T
inline fun <reified T : Fragment> FragmentManager.find(id: Int): T = findFragmentById(id) as T

inline fun <reified T : Fragment> FragmentManager.findOrNull(tag: String): T? = findFragmentByTag(tag) as? T
inline fun <reified T : Fragment> FragmentManager.findOrNull(id: Int): T? = findFragmentById(id) as? T

@JvmOverloads
inline fun FragmentManager.add(
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(fragment, tag)
        .commit()

@JvmOverloads
inline fun FragmentManager.add(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.add(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment, tag)
        .commit()

@JvmOverloads
inline fun FragmentManager.addNow(
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(fragment, tag)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.addNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.addNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment, tag)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.replace(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.replace(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commit()

@JvmOverloads
inline fun FragmentManager.replaceNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.replaceNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.remove(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .remove(fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.removeNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .remove(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.hide(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .hide(fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.hideNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .hide(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.show(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .show(fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.showNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .show(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.detach(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .detach(fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.detachNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .detach(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.attach(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .attach(fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.attachNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .attach(fragment)
        .commitNow()