package pt.luisjesus.hltb.ui.search

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pt.luisjesus.hltb.R

class MainActivity : AppCompatActivity(), SearchContract.View {

    private var mPresenter : SearchContract.Presenter? = null

    override fun showNoResultsMessage() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNetworkError() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showResults() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLoading(loading: Boolean) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var mSearchPresenter: SearchContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = SearchPresenter(this)
    }

}
