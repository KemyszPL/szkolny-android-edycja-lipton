/*
 * Copyright (c) Kacper Ziubryniewicz 2019-11-4
 */

package pl.szczodrzynski.edziennik.ui.modules.homework

import pl.szczodrzynski.edziennik.App
import pl.szczodrzynski.edziennik.ui.base.BaseView

interface HomeworkView : BaseView {

    var app: App

    val markAsReadSuccessString: String

    fun initView()

    fun closeBottomSheet()

    fun showAddHomeworkDialog()

    fun setPageSelection(position: Int)
}
