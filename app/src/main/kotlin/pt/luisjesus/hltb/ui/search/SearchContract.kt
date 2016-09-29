package pt.luisjesus.hltb.ui.search

import pt.luisjesus.hltb.ui.BasePresenter
import pt.luisjesus.hltb.ui.BaseView

/**
 * Created by luisj on 26/09/2016.
 */

interface SearchContract {

    interface View: BaseView {

        fun showNoResultsMessage()
        fun showNetworkError()
        fun showResults()

    }

    interface Presenter: BasePresenter<BaseView> {

        fun searchGame(game: String)

    }

}
