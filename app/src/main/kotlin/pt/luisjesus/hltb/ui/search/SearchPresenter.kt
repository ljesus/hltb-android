package pt.luisjesus.hltb.ui.search

/**
 * Created by luisj on 26/09/2016.
 */

class SearchPresenter : SearchContract.Presenter {

    private var mView : SearchContract.View? = null

    constructor(view: SearchContract.View?) {
        this.mView = view
    }

    override fun searchGame(game: String) {
        throw UnsupportedOperationException("not implemented")
    }

}